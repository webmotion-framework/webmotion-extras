package org.debux.webmotion.netbeans.hints;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.apache.commons.lang.StringUtils;
import org.debux.webmotion.netbeans.javacc.lexer.impl.LexerUtils;
import org.debux.webmotion.netbeans.javacc.parser.impl.WebMotionParserImpl.WebMotionParserResult;
import org.netbeans.modules.csl.api.Hint;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.RuleContext;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;

/**
 *
 * @author julien
 */
public class PatternRule extends AbstractRule {

    @Override
    public String getDisplayName() {
        return "Test pattern";
    }

    @Override
    public String getDescription() {
        return "Test valid pattern in variable";
    }

    @Override
    public void run(RuleContext context, List<Hint> hints) {
        WebMotionParserResult parserResult = (WebMotionParserResult) context.parserResult;
        
        Source source = parserResult.getSnapshot().getSource();
        Document document = source.getDocument(false);
        FileObject fileObject = source.getFileObject();
        
        List<OffsetRange> tokens = LexerUtils.getTokens(document, "ACTION_PATH_VARIABLE", "ACTION_PATH_PARAMETER_VALUE_VARIABLE");
        for (OffsetRange range : tokens) {
            try {
                String value = LexerUtils.getText(document, range);
                String regexp = StringUtils.substringBetween(value, ":", "}");
                if (regexp != null) {

                    try {
                        String pattern = regexp.replaceAll("\\\\\\{", "{");
                        pattern = pattern.replaceAll("\\\\\\}", "}");
                        Pattern.compile(pattern);

                    } catch (PatternSyntaxException pse) {
                        int end = range.getStart() + value.length() -1;
                        int start = end - regexp.length();
                        OffsetRange offsetRange = new OffsetRange(start, end);
                        hints.add(new Hint(this, "Invalid pattern", fileObject, offsetRange, WebMotionHintsProvider.NO_FIXES, 100));
                    }
                }
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}
