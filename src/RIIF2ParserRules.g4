grammar RIIF2ParserRules;
import KEYWORDS, GENERALTOKENS, RIIF2LexerRules;

/*Expressions*/
primary
    : parExpression
    | funcCall
    | literal
    | ident
    | hier_ident
    | attr_ident
    ;
parExpression
    : '(' expression ')'
    ;
funcCall
    : funcName '(' funcArg ( ',' funcArg ) ? ')'
    ;
funcName
    : FUNC_LOG
    | FUNC_EXP
    | FUNC_AGG_SINGLE
    | FUNC_GT_N_FAIL
    ;
funcArg
    : ( ident | hier_ident | attr_ident ) vector
    | expression
    ;
/*Identification */
ident
    : Ident
    ;
hier_ident
    : Hier_ident
    ;
attr_ident
    : Attr_ident
    ;
/*Literal*/
literal
    : StringLiteral
    | integerLiteral
    | FloatingPointLiteral
    | units
    ;
integerLiteral
    : DecimalLiteral
    ;
unitLiteral
    : (integerLiteral | FloatingPointLiteral) '_' units
    ;
/*Vector Declaration*/
vector
    : '[' ( DecimalLiteral|ident) ':' (DecimalLiteral| ident) ']'
    ;
/*Unit Rules*/
units
    : UNIT_VOLTS
    | UNIT_FITS
    ;

unaryExpressionNotPlusMinus
    : '~' unaryExpression
    | '!' unaryExpression
    | primary
    ;
unaryExpression
    : '+' unaryExpression
    | '-' unaryExpression
    | unaryExpressionNotPlusMinus
    ;
additiveExpression
    : multiplicativeExpression ( ('+'|'-') multiplicativeExpression)*
    ;
multiplicativeExpression
    : unaryExpression ( ('*' | '/' | '%' ) unaryExpression )*
    ;
expression
    : conditionalExpression
    ;
conditionalExpression
    : conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )?
    ;
conditionalOrExpression
    : conditionalAndExpression( '||' conditionalAndExpression )*
    ;
conditionalAndExpression
    : inclusiveOrExpression ( '&&' inclusiveOrExpression )*
    ;
inclusiveOrExpression
    : exclusiveOrExpression ( '|' exclusiveOrExpression )*
    ;
exclusiveOrExpression
    : andExpression ('^' andExpression)*
    ;
andExpression
    : equalityExpression( '&' equalityExpression)*
    ;
equalityExpression
    : instanceOfExpression ( ('==' | '!=') instanceOfExpression)*
    ;
instanceOfExpression
    : relationalExpression
    ;
relationalExpression
    : additiveExpression ( relationalOp additiveExpression)*
    ;
relationalOp
    : '<'
    | '>'
    ;