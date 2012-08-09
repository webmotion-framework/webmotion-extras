/*
 * #%L
 * WebMotion plugin netbeans
 * 
 * $Id$
 * $HeadURL$
 * %%
 * Copyright (C) 2012 Debux
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
package org.debux.webmotion.netbeans.refactoring;

import com.sun.source.tree.Tree.Kind;
import java.io.IOException;
import java.util.List;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import javax.swing.text.StyledDocument;
import org.debux.webmotion.netbeans.Utils;
import org.debux.webmotion.netbeans.javacc.lexer.impl.LexerUtils;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.java.source.*;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.refactoring.api.Problem;
import org.netbeans.modules.refactoring.api.RenameRefactoring;
import org.netbeans.modules.refactoring.spi.RefactoringElementsBag;
import org.netbeans.modules.refactoring.spi.RefactoringPlugin;
import org.netbeans.modules.refactoring.spi.SimpleRefactoringElementImplementation;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.text.*;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

/**
 *
 * @author julien
 */
class WebMotionRenameRefactoringPlugin implements RefactoringPlugin {

    protected RenameRefactoring refactoring;
    
    public WebMotionRenameRefactoringPlugin(RenameRefactoring refactoring) {
        this.refactoring = refactoring;
    }

    @Override
    public Problem preCheck() {
        return null;
    }

    @Override
    public Problem checkParameters() {
        return null;
    }

    @Override
    public Problem fastCheckParameters() {
        return null;
    }

    @Override
    public void cancelRequest() {
    }

    @Override
    public Problem prepare(final RefactoringElementsBag refactoringElements) {
        final TreePathHandle treePathHandle = refactoring.getRefactoringSource().lookup(TreePathHandle.class);
        
        if (treePathHandle != null && (
                TreeUtilities.CLASS_TREE_KINDS.contains(treePathHandle.getKind()))
                || Kind.METHOD == treePathHandle.getKind()) {
            
            try {
                GlobalPathRegistry registry = GlobalPathRegistry.getDefault();
                final FileObject fo = registry.findResource("mapping");
                        
                ClassPath bootCp = ClassPath.getClassPath(fo, ClassPath.BOOT);
                ClassPath compileCp = ClassPath.getClassPath(fo, ClassPath.COMPILE);
                ClassPath sourcePath = ClassPath.getClassPath(fo, ClassPath.SOURCE);
                ClasspathInfo info = ClasspathInfo.create(bootCp, compileCp, sourcePath);
                JavaSource src = JavaSource.create(info);

                src.runUserActionTask(new CancellableTask<CompilationController>() {
                    @Override
                    public void cancel() {
                    }

                    @Override
                    public void run(CompilationController cu) throws Exception {
                        FileObject fileObject = treePathHandle.getFileObject();
                        
                        String className = fileObject.getName().toString();
                
                        String oldName = className;
                        String filter = className;
                        
                        if (Kind.METHOD == treePathHandle.getKind()) {
                            Element element = treePathHandle.resolveElement(cu);
                            oldName = element.getSimpleName().toString();
                            filter = className + "." + oldName;
                        }
                        
                        DataObject dob = DataObject.find(fo);
                        EditorCookie editor = dob.getLookup().lookup(EditorCookie.class);
                        StyledDocument doc = editor.getDocument();

                        List<OffsetRange> tokens = LexerUtils.getTokens(doc, "FILTER_ACTION",
                                "ERROR_ACTION_JAVA", "ACTION_ACTION_IDENTIFIER", "ACTION_ACTION_JAVA_IDENTIFIER",
                                "ACTION_ACTION_JAVA_QUALIFIED_IDENTIFIER", "ACTION_ACTION_JAVA_VARIABLE");

                        for (OffsetRange offsetRange : tokens) {
                            String text = LexerUtils.getText(doc, offsetRange);

                            if (text.contains(filter)) {
                                int start = offsetRange.getStart() + text.indexOf(oldName);
                                int end = start + oldName.length();
                                refactoringElements.add(refactoring, new MappingRenameRefactoringElement(dob, start, end));
                            }
                        }
                    }
                }, false);
                
                
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return null;
    }
    
    public class MappingRenameRefactoringElement extends SimpleRefactoringElementImplementation {

        protected DataObject dob;
        protected int start;
        protected int end;

        public MappingRenameRefactoringElement(DataObject dob, int start, int end) {
            this.dob = dob;
            this.start = start;
            this.end = end;
        }

        @Override
        public void performChange() {
            try {
                EditorCookie editor = dob.getLookup().lookup(EditorCookie.class);
                StyledDocument doc = editor.getDocument();
                
                doc.remove(start, end - start);
                doc.insertString(start, refactoring.getNewName(), null);
                
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }

        @Override
        public String getText() {
            return "getText";
        }

        @Override
        public String getDisplayText() {
            return "getDisplayText";
        }

        @Override
        public Lookup getLookup() {
            return Lookup.EMPTY;
        }

        @Override
        public FileObject getParentFile() {
            return dob.getPrimaryFile();
        }

        @Override
        public PositionBounds getPosition() {
            CloneableEditorSupport open = (CloneableEditorSupport) dob.getLookup().lookup(EditorCookie.class);
            
            PositionRef startPosition = open.createPositionRef(start, Position.Bias.Forward);
            PositionRef endPosition = open.createPositionRef(end, Position.Bias.Backward);
            PositionBounds positionBounds = new PositionBounds(startPosition, endPosition);
            return positionBounds;
        }
    }
    
}