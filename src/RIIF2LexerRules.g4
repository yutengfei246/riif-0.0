/**
   *
   * This file is a RII2 lexer file which includes all of those that needed in RIIF2 combined-parser file
   *
   **/

lexer grammar RIIF2LexerRules;
//options {tokenVocab = KEYWORDS; tokenVocab = GENERALTOKENS;}

/*Literal Tokens */
StringLiteral
    : '"' ( ~('\\' | '"') )* '"'
    ;
FloatingPointLiteral
    : DIGIT+ '.' DIGIT* Exponent? FloatTypeSuffix?
    | '.' DIGIT+ Exponent? FloatTypeSuffix?
    | DIGIT+ Exponent FloatTypeSuffix?
    ;
DecimalLiteral
    : DIGIT+
    ;
/*Identification */
Ident
    : (LETTER) (LETTER|DIGIT|UNDERSCORE)*
    ;
Hier_ident
    : (Ident)( '.' Ident)+
    ;
Attr_ident
    : (Ident|Hier_ident) '\''(Ident)
    ;

fragment
DIGIT: '0'..'9';
fragment
LETTER: ( 'a'..'z' | 'A'..'Z' );
fragment
UNDERSCORE: '_';
fragment
EscapeSequence
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    | UnicodeEscape
    | OctalEscape
    ;
fragment
OctalEscape
    : '\\' ('0'..'3')('0'..'7')('0'..'7')
    | '\\' ('0'..'7')('0'..'7')
    | '\\' ('0'..'7')
    ;
fragment
HexDigit
    : ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;
fragment
UnicodeEscape
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
Exponent
    : ('e'|'E')('+'|'-')?DIGIT+
    ;
fragment
FloatTypeSuffix
    : ('f'|'F'|'d'|'D')
    ;