/**
  *
  * This file includes all the tokens that used in RIIF2.g4 except those already in KEYWORDS.g4
  *
  **/

lexer grammar GENERALTOKENS;

WS: (' ' | '\r' | '\t' |' \u000C' | '\n' ) ->channel(HIDDEN) ;

COMMENT
    : '/*' .*? '*/'  ->channel(HIDDEN)
    ;
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN)
    ;