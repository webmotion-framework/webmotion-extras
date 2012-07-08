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

/* Generated By:JavaCC: Do not edit this line. WebMotionParserConstants.java */
package org.debux.webmotion.netbeans.javacc.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface WebMotionParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMMENT = 1;
  /** RegularExpression Id. */
  int COMMENT_IN_CONFIG = 2;
  /** RegularExpression Id. */
  int COMMENT_IN_ACTIONS = 3;
  /** RegularExpression Id. */
  int COMMENT_IN_ERRORS = 4;
  /** RegularExpression Id. */
  int COMMENT_IN_FILTERS = 5;
  /** RegularExpression Id. */
  int COMMENT_IN_EXTENSIONS = 6;
  /** RegularExpression Id. */
  int COMMENT_IN_PROPERTIES = 7;
  /** RegularExpression Id. */
  int SECTION_CONFIG_NAME = 8;
  /** RegularExpression Id. */
  int SECTION_ACTIONS_NAME = 9;
  /** RegularExpression Id. */
  int SECTION_ERRORS_NAME = 10;
  /** RegularExpression Id. */
  int SECTION_FILTERS_NAME = 11;
  /** RegularExpression Id. */
  int SECTION_EXTENSIONS_NAME = 12;
  /** RegularExpression Id. */
  int SECTION_PROPERTIES_NAME = 13;
  /** RegularExpression Id. */
  int METHODS_HTTP = 14;
  /** RegularExpression Id. */
  int METHOD_HTTP = 15;
  /** RegularExpression Id. */
  int ACTION_BASIC_JAVA = 16;
  /** RegularExpression Id. */
  int ACTION_JAVA = 17;
  /** RegularExpression Id. */
  int ACTION_VIEW = 18;
  /** RegularExpression Id. */
  int ACTION_LINK = 19;
  /** RegularExpression Id. */
  int VARIABLE = 20;
  /** RegularExpression Id. */
  int PATTERN = 21;
  /** RegularExpression Id. */
  int IDENTIFIER = 22;
  /** RegularExpression Id. */
  int QUALIFIED_IDENTIFIER = 23;
  /** RegularExpression Id. */
  int NEW_LINE = 24;
  /** RegularExpression Id. */
  int WHITESPACE = 25;
  /** RegularExpression Id. */
  int DIGIT = 26;
  /** RegularExpression Id. */
  int LETTER = 27;
  /** RegularExpression Id. */
  int SECTION_CONFIG_NEXT_CONFIG = 28;
  /** RegularExpression Id. */
  int SECTION_CONFIG_NEXT_ACTIONS = 29;
  /** RegularExpression Id. */
  int SECTION_CONFIG_NEXT_ERRORS = 30;
  /** RegularExpression Id. */
  int SECTION_CONFIG_NEXT_FILTERS = 31;
  /** RegularExpression Id. */
  int SECTION_CONFIG_NEXT_EXTENSIONS = 32;
  /** RegularExpression Id. */
  int SECTION_CONFIG_NEXT_PROPERTIES = 33;
  /** RegularExpression Id. */
  int CONFIG_KEY = 34;
  /** RegularExpression Id. */
  int CONFIG_EQUALS = 35;
  /** RegularExpression Id. */
  int CONFIG_VALUE = 36;
  /** RegularExpression Id. */
  int CONFIG_END = 37;
  /** RegularExpression Id. */
  int SECTION_ACTIONS_NEXT_CONFIG = 38;
  /** RegularExpression Id. */
  int SECTION_ACTIONS_NEXT_ACTIONS = 39;
  /** RegularExpression Id. */
  int SECTION_ACTIONS_NEXT_ERRORS = 40;
  /** RegularExpression Id. */
  int SECTION_ACTIONS_NEXT_FILTERS = 41;
  /** RegularExpression Id. */
  int SECTION_ACTIONS_NEXT_EXTENSIONS = 42;
  /** RegularExpression Id. */
  int SECTION_ACTIONS_NEXT_PROPERTIES = 43;
  /** RegularExpression Id. */
  int ACTION_METHOD = 44;
  /** RegularExpression Id. */
  int ACTION_SEPARATOR = 45;
  /** RegularExpression Id. */
  int ACTION_ACTION_JAVA_BEGIN = 46;
  /** RegularExpression Id. */
  int ACTION_ACTION_VARIABLE = 47;
  /** RegularExpression Id. */
  int ACTION_ACTION_IDENTIFIER = 48;
  /** RegularExpression Id. */
  int ACTION_ACTION_VIEW = 49;
  /** RegularExpression Id. */
  int ACTION_ACTION_LINK = 50;
  /** RegularExpression Id. */
  int ACTION_PATH = 51;
  /** RegularExpression Id. */
  int ACTION_PATH_VALUE = 52;
  /** RegularExpression Id. */
  int ACTION_PATH_VARIABLE = 53;
  /** RegularExpression Id. */
  int ACTION_PARAMETERS_BEGIN = 54;
  /** RegularExpression Id. */
  int ACTION_PATH_END = 55;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_NAME = 56;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_EQUALS = 57;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_OTHER = 58;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_SEPARATOR = 59;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_VALUE = 60;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_VALUE_VARIABLE = 61;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_VALUE_OTHER = 62;
  /** RegularExpression Id. */
  int ACTION_PATH_PARAMETER_VALUE_SEPARATOR = 63;
  /** RegularExpression Id. */
  int ACTION_ACTION_JAVA_QUALIFIED_IDENTIFIER = 64;
  /** RegularExpression Id. */
  int ACTION_ACTION_JAVA_IDENTIFIER = 65;
  /** RegularExpression Id. */
  int ACTION_ACTION_JAVA_VARIABLE = 66;
  /** RegularExpression Id. */
  int ACTION_ACTION_JAVA_SEPARATOR = 67;
  /** RegularExpression Id. */
  int ACTION_ACTION_JAVA_END = 68;
  /** RegularExpression Id. */
  int ACTION_ACTION_VIEW_VALUE = 69;
  /** RegularExpression Id. */
  int ACTION_ACTION_VIEW_VARIABLE = 70;
  /** RegularExpression Id. */
  int ACTION_ACTION_VIEW_SEPARATOR = 71;
  /** RegularExpression Id. */
  int ACTION_ACTION_VIEW_END = 72;
  /** RegularExpression Id. */
  int ACTION_ACTION_LINK_VALUE = 73;
  /** RegularExpression Id. */
  int ACTION_ACTION_LINK_VARIABLE = 74;
  /** RegularExpression Id. */
  int ACTION_ACTION_LINK_SEPARATOR = 75;
  /** RegularExpression Id. */
  int ACTION_ACTION_LINK_END = 76;
  /** RegularExpression Id. */
  int ACTION_PARAMETERS_SEPARATOR = 77;
  /** RegularExpression Id. */
  int ACTION_PARAMETER_NAME = 78;
  /** RegularExpression Id. */
  int ACTION_PARAMETER_EQUALS = 79;
  /** RegularExpression Id. */
  int ACTION_PARAMETER_SEPARATOR = 80;
  /** RegularExpression Id. */
  int ACTION_END = 81;
  /** RegularExpression Id. */
  int ACTION_PARAMETER_VALUE = 82;
  /** RegularExpression Id. */
  int ACTION_PARAMETER_VALUE_SEPARATOR = 83;
  /** RegularExpression Id. */
  int ACTION_PARAMETER_VALUE_END = 84;
  /** RegularExpression Id. */
  int SECTION_ERRORS_NEXT_CONFIG = 85;
  /** RegularExpression Id. */
  int SECTION_ERRORS_NEXT_ACTIONS = 86;
  /** RegularExpression Id. */
  int SECTION_ERRORS_NEXT_ERRORS = 87;
  /** RegularExpression Id. */
  int SECTION_ERRORS_NEXT_FILTERS = 88;
  /** RegularExpression Id. */
  int SECTION_ERRORS_NEXT_EXTENSIONS = 89;
  /** RegularExpression Id. */
  int SECTION_ERRORS_NEXT_PROPERTIES = 90;
  /** RegularExpression Id. */
  int ERROR_CODE = 91;
  /** RegularExpression Id. */
  int ERROR_CODE_VALUE = 92;
  /** RegularExpression Id. */
  int ALL = 93;
  /** RegularExpression Id. */
  int EXCEPTION = 94;
  /** RegularExpression Id. */
  int ERROR_SEPARATOR = 95;
  /** RegularExpression Id. */
  int ERROR_ACTION_JAVA_BEGIN = 96;
  /** RegularExpression Id. */
  int ERROR_ACTION_VIEW_BEGIN = 97;
  /** RegularExpression Id. */
  int ERROR_ACTION_LINK_BEGIN = 98;
  /** RegularExpression Id. */
  int ERROR_ACTION_JAVA = 99;
  /** RegularExpression Id. */
  int ERROR_END = 100;
  /** RegularExpression Id. */
  int ERROR_ACTION_VALUE = 101;
  /** RegularExpression Id. */
  int ERROR_VALUE_END = 102;
  /** RegularExpression Id. */
  int SECTION_FILTERS_NEXT_CONFIG = 103;
  /** RegularExpression Id. */
  int SECTION_FILTERS_NEXT_ACTIONS = 104;
  /** RegularExpression Id. */
  int SECTION_FILTERS_NEXT_ERRORS = 105;
  /** RegularExpression Id. */
  int SECTION_FILTERS_NEXT_FILTERS = 106;
  /** RegularExpression Id. */
  int SECTION_FILTERS_NEXT_EXTENSIONS = 107;
  /** RegularExpression Id. */
  int SECTION_FILTERS_NEXT_PROPERTIES = 108;
  /** RegularExpression Id. */
  int FILTER_METHOD = 109;
  /** RegularExpression Id. */
  int FILTER_PATH = 110;
  /** RegularExpression Id. */
  int FILTER_PATH_ALL = 111;
  /** RegularExpression Id. */
  int FILTER_SEPARATOR = 112;
  /** RegularExpression Id. */
  int FILTER_ACTION_BEGIN = 113;
  /** RegularExpression Id. */
  int FILTER_ACTION = 114;
  /** RegularExpression Id. */
  int FILTER_PARAMETERS_SEPARATOR = 115;
  /** RegularExpression Id. */
  int FILTER_PARAMETER_NAME = 116;
  /** RegularExpression Id. */
  int FILTER_PARAMETER_EQUALS = 117;
  /** RegularExpression Id. */
  int FILTER_PARAMETER_SEPARATOR = 118;
  /** RegularExpression Id. */
  int FILTER_END = 119;
  /** RegularExpression Id. */
  int FILTER_PARAMETER_VALUE = 120;
  /** RegularExpression Id. */
  int FILTER_PARAMETER_VALUE_SEPARATOR = 121;
  /** RegularExpression Id. */
  int FILTER_PARAMETER_VALUE_END = 122;
  /** RegularExpression Id. */
  int SECTION_EXTENSIONS_NEXT_CONFIG = 123;
  /** RegularExpression Id. */
  int SECTION_EXTENSIONS_NEXT_ACTIONS = 124;
  /** RegularExpression Id. */
  int SECTION_EXTENSIONS_NEXT_ERRORS = 125;
  /** RegularExpression Id. */
  int SECTION_EXTENSIONS_NEXT_FILTERS = 126;
  /** RegularExpression Id. */
  int SECTION_EXTENSIONS_NEXT_EXTENSIONS = 127;
  /** RegularExpression Id. */
  int SECTION_EXTENSIONS_NEXT_PROPERTIES = 128;
  /** RegularExpression Id. */
  int EXTENSION_PATH = 129;
  /** RegularExpression Id. */
  int EXTENSION_SEPARATOR = 130;
  /** RegularExpression Id. */
  int EXTENSION_FILE = 131;
  /** RegularExpression Id. */
  int EXTENSION_END = 132;
  /** RegularExpression Id. */
  int SECTION_PROPERTIES_NEXT_CONFIG = 133;
  /** RegularExpression Id. */
  int SECTION_PROPERTIES_NEXT_ACTIONS = 134;
  /** RegularExpression Id. */
  int SECTION_PROPERTIES_NEXT_ERRORS = 135;
  /** RegularExpression Id. */
  int SECTION_PROPERTIES_NEXT_FILTERS = 136;
  /** RegularExpression Id. */
  int SECTION_PROPERTIES_NEXT_EXTENSIONS = 137;
  /** RegularExpression Id. */
  int SECTION_PROPERTIES_NEXT_PROPERTIES = 138;
  /** RegularExpression Id. */
  int PROPERTIE_NAME = 139;
  /** RegularExpression Id. */
  int PROPERTIE_EQUALS = 140;
  /** RegularExpression Id. */
  int PROPERTIE_VALUE = 141;
  /** RegularExpression Id. */
  int PROPERTIE_END = 142;
  /** RegularExpression Id. */
  int CHAR = 143;
  /** RegularExpression Id. */
  int CHAR_IN_CONFIG = 144;
  /** RegularExpression Id. */
  int CHAR_IN_CONFIG_VALUE = 145;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS = 146;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_PATH = 147;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_PATH_PARAMETERS = 148;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_PATH_PARAMETER_VALUE = 149;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_ACTION_JAVA = 150;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_ACTION_VIEW = 151;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_ACTION_LINK = 152;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_PARAMETERS = 153;
  /** RegularExpression Id. */
  int CHAR_IN_ACTIONS_PARAMETER_VALUE = 154;
  /** RegularExpression Id. */
  int CHAR_IN_ERRORS = 155;
  /** RegularExpression Id. */
  int CHAR_IN_ERRORS_ACTIONS = 156;
  /** RegularExpression Id. */
  int CHAR_IN_ERRORS_ACTIONS_VALUE = 157;
  /** RegularExpression Id. */
  int CHAR_IN_FILTERS = 158;
  /** RegularExpression Id. */
  int CHAR_IN_FILTERS_PARAMETERS = 159;
  /** RegularExpression Id. */
  int CHAR_IN_FILTERS_PARAMETER_VALUE = 160;
  /** RegularExpression Id. */
  int CHAR_IN_EXTENSIONS = 161;
  /** RegularExpression Id. */
  int CHAR_IN_EXTENSIONS_FILE = 162;
  /** RegularExpression Id. */
  int CHAR_IN_PROPERTIES = 163;
  /** RegularExpression Id. */
  int CHAR_IN_PROPERTIES_VALUE = 164;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int SECTION_CONFIG = 1;
  /** Lexical state. */
  int SECTION_ACTIONS = 2;
  /** Lexical state. */
  int SECTION_ERRORS = 3;
  /** Lexical state. */
  int SECTION_FILTERS = 4;
  /** Lexical state. */
  int SECTION_EXTENSIONS = 5;
  /** Lexical state. */
  int SECTION_PROPERTIES = 6;
  /** Lexical state. */
  int SECTION_CONFIG_VALUE = 7;
  /** Lexical state. */
  int SECTION_ACTIONS_PATH = 8;
  /** Lexical state. */
  int SECTION_ACTIONS_PATH_PARAMETERS = 9;
  /** Lexical state. */
  int SECTION_ACTIONS_PATH_PARAMETER_VALUE = 10;
  /** Lexical state. */
  int SECTION_ACTIONS_ACTION_JAVA = 11;
  /** Lexical state. */
  int SECTION_ACTIONS_ACTION_VIEW = 12;
  /** Lexical state. */
  int SECTION_ACTIONS_ACTION_LINK = 13;
  /** Lexical state. */
  int SECTION_ACTIONS_PARAMETERS = 14;
  /** Lexical state. */
  int SECTION_ACTIONS_PARAMETER_VALUE = 15;
  /** Lexical state. */
  int SECTION_ERRORS_ACTIONS = 16;
  /** Lexical state. */
  int SECTION_ERRORS_ACTIONS_VALUE = 17;
  /** Lexical state. */
  int SECTION_FILTERS_PARAMETERS = 18;
  /** Lexical state. */
  int SECTION_FILTERS_PARAMETER_VALUE = 19;
  /** Lexical state. */
  int SECTION_EXTENSIONS_FILE = 20;
  /** Lexical state. */
  int SECTION_PROPERTIES_VALUE = 21;

  /** Literal token values. */
  String[] tokenImage = {
    "EOF",
    "comment",
    "comment",
    "comment",
    "comment",
    "comment",
    "comment",
    "comment",
    "section config",
    "section actions",
    "section errors",
    "section filters",
    "section extensions",
    "section properties",
    "methods HTTP",
    "method HTTP>",
    "\"action:\"",
    "action keyword",
    "\"view:\"",
    "link keyword",
    "variable",
    "pattern",
    "identifier",
    "full qualifier identifier",
    "new line",
    "whitespace",
    "digit",
    "letter",
    "section config",
    "section actions",
    "section errors",
    "section filters",
    "section extensions",
    "section properties",
    "config key",
    "\"=\"",
    "config value",
    "new line",
    "section config",
    "section actions",
    "section errors",
    "section filters",
    "section extensions",
    "section properties",
    "method HTTP",
    "whitespace",
    "action keyword",
    "action variable",
    "identifier",
    "view keyword",
    "link keyword",
    "\"/\"",
    "path",
    "path variable",
    "\"?\"",
    "whitespace",
    "parameter name",
    "\"=\"",
    "\"&\"",
    "whitespace",
    "parameter value",
    "parameter variable",
    "\"&\"",
    "whitespace",
    "\".\"",
    "action identifier",
    "action variable",
    "whitespace",
    "new line",
    "view value",
    "view variable",
    "whitespace",
    "new line",
    "link value",
    "link variable",
    "whitespace",
    "new line",
    "whitespace",
    "parameter name",
    "\"=\"",
    "\",\"",
    "new line",
    "parameter value",
    "\",\"",
    "new line",
    "section config",
    "section actions",
    "section errors",
    "section filters",
    "section extensions",
    "section properties",
    "\"code:\"",
    "code HTTP",
    "\"*\"",
    "exception",
    "whitespace",
    "action keyword",
    "view keyword",
    "link keyword",
    "action value",
    "new line",
    "value",
    "new line",
    "section config",
    "section actions",
    "section errors",
    "section filters",
    "section extensions",
    "section properties",
    "methods HTTP",
    "path",
    "\"/*\"",
    "whitespace",
    "action keyword",
    "action value",
    "whitespace",
    "parameter name",
    "\"=\"",
    "\",\"",
    "new line",
    "parameter value",
    "\",\"",
    "new line",
    "section config",
    "section actions",
    "section errors",
    "section filters",
    "section extensions",
    "section properties",
    "path",
    "whitespace",
    "file name",
    "new line",
    "section config",
    "section actions",
    "section errors",
    "section filters",
    "section extensions",
    "section properties",
    "propertie name",
    "\"=\"",
    "propertie value",
    "new line",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
    "character",
  };

}
