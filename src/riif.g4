/* ***************************************************************************

    ANTLR3 Grammer

    Reliability Information Interchange Format v1.0

   *************************************************************************** */

/* ***************************************************************************
   File Revision History:

   v0.1 15-FEB-12 : adevans : Initial version sent to iRoC.

   v0.2 23-FEB-12 : adevans : Added instance name for child_component.
                              Seperated hier_ident (using '.' separator) and
                                  attr_ident (terminated with tick (')).
                              Added parser rules (ident, hier_ident, attr_ident)
                                  which wrap corresponding lexer rules.
                              Changed function call to support vector arguments.
                              Changed vector seperator to be ':' instead of '..'.

   *************************************************************************** */

grammar RIIF;

options
{
    output			= AST;
}

/* **************** Component Declaration ***************** */
tokens {
   COMPONENT       = 'component' ;
   CHILD_COMPONENT = 'child_component' ;
   EXTENDS         = 'extends' ;
   END_COMPONENT   = 'endcomponent' ;

   ENVIRONMENT     = 'environment' ;
   END_ENVIRONMENT = 'endenvironment' ;

   REQUIREMENT     = 'requirement' ;
   END_REQUIREMENT = 'endrequirement' ;

   PARAMETER       = 'parameter' ;
   FAIL_MODE       = 'fail_mode' ;
   ASSIGN          = 'assign'    ;
   CONSTANT        = 'constant'  ;
   ASSERT          = 'assert' ;
   INPUT           = 'input'     ;
   OUTPUT          = 'output'    ;

   TYPE_FLOAT      = 'float'   ;
   TYPE_INTEGER    = 'integer' ;
   TYPE_STRING     = 'string'  ;
   TYPE_ENUM       = 'enum'    ;

   UNIT_VOLTS      = 'volts' ;
   UNIT_FITS       = 'FITS' ;

   FUNC_AGG_SINGLE = 'agg_single_fail' ;
   FUNC_GT_N_FAIL  = 'agg_gt_n_fail' ;

   FUNC_LOG        = 'LOG'   ;
   FUNC_EXP        = 'EXP'   ;
}

/* **************** Program Rule  ***************** */

program
    :   declaration+
    ;

declaration
    : component_decl
    | environment_decl
    | requirement_decl
    ;

/* ************ Component Declaration ************ */

component_decl
    :   COMPONENT ident ( EXTENDS ident ) ? ';' component_body_element *  END_COMPONENT
        -> ^( COMPONENT ident ^( EXTENDS )?  component_body_element* )
    ;

component_body_element
   : parameter_decl
   | constant_decl
   | child_component_decl
   | fail_mode_decl
   | assignment
   | assertion  ;

/* ********** Environment Declaration ************ */

environment_decl
    : ENVIRONMENT ident ';' environment_body_element * END_ENVIRONMENT
    ;

environment_body_element
/* Dan: Not compiling in C
    : ( env_parameter_decl | assignment ) ;
*/
    : assignment ;

/* **************** Requirement Declaration ************* */
requirement_decl
    : REQUIREMENT ident ';' assertion * END_REQUIREMENT ;


/* ************* Parameter Declaration ***************** */
parameter_decl
    : PARAMETER ident ':' complex_type ( ':=' expression ) ? ';'
      -> ^( PARAMETER ident );

env_parameter_decl
    : ( INPUT | OUTPUT ) PARAMETER ident ':' complex_type ( ':=' expression ) ? ';' ;

/* ************** Constant Declaration ***************** */
constant_decl
   : CONSTANT ident ':' primitive_type ( ':=' expression ) ? ';'
      -> ^( CONSTANT ident );

/* ***************** Child Component ****************** */

child_component_decl
   : CHILD_COMPONENT ident ident vector ? ';'
      -> ^( CHILD_COMPONENT ident );

/* ************ Failure Mode Declaration ***************** */

fail_mode_decl
   : FAIL_MODE ident ';'
      -> ^( FAIL_MODE ident );

/* ************** Assignment ***************** */

assignment
   : ASSIGN ( ident | hier_ident | attr_ident ) vector ? '=' expression ';'
    -> ^( ASSIGN ident* hier_ident* attr_ident* vector ? ^( expression ) ) ;

/* ************** Assertions ***************** */

assertion
   : ASSERT ( attr_ident ) relationalOp expression ';'
     -> ^( ASSERT attr_ident );

/* **************** Types ***************** */
primitive_type
   : TYPE_FLOAT | TYPE_INTEGER | TYPE_STRING ;

enum_type
   : TYPE_ENUM '{' ident ( ',' ident ) * '}' ;

user_type
    : Ident ;

complex_type
    : primitive_type | enum_type | user_type ;

/* **************** Unit Rules ***************** */

units
   : UNIT_VOLTS | UNIT_FITS ;

/* **************** Lexer Rules ***************** */
fragment DIGIT : '0'..'9' ;
fragment LETTER : ( 'a'..'z' | 'A'..'Z' ) ;
fragment UNDERSCORE: '_' ;


StringLiteral
    :  '"' ( ~('\\'|'"') )* '"'
    ;

/* " */

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

/* " */

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;


FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ FloatTypeSuffix
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

/* **************** Parser Rules ***************** */

literal
   : StringLiteral
   | integerLiteral
   | FloatingPointLiteral
   | units ;

integerLiteral
   : DecimalLiteral;

unitLiteral
   : (integerLiteral|FloatingPointLiteral) '_' units;

DecimalLiteral : (DIGIT)+;

/* --------------------------------------------------------------------------- */
/*                         Expressions                                         */
/* --------------------------------------------------------------------------- */

primary
   :   parExpression
   |   funcCall
   |   literal
   |   ident
   |   hier_ident
   |   attr_ident;

Ident              : (LETTER)(LETTER|DIGIT|UNDERSCORE)+;

ident : Ident ;

Hier_ident     : (Ident) ('.' Ident)+ ;

hier_ident     : Hier_ident ;

Attr_ident     : (Ident|Hier_ident) '\'' (Ident) ;

attr_ident     : Attr_ident ;

vector             : '[' (DecimalLiteral|ident) ':' (DecimalLiteral|ident) ']' ;


parExpression
    :   '(' expression ')'
    ;

funcArg
    : ( ident | hier_ident | attr_ident ) vector |
        expression ;

funcCall
    : funcname '(' funcArg ( ',' funcArg ) ? ')'
     ;

funcname
    : FUNC_LOG
    | FUNC_EXP
    | FUNC_AGG_SINGLE
    | FUNC_GT_N_FAIL ;

unaryExpressionNotPlusMinus
    :   '~' unaryExpression
    |   '!' unaryExpression
    | primary
    ;

unaryExpression
    :   '+' unaryExpression
    |   '-' unaryExpression
    |   unaryExpressionNotPlusMinus
    ;

additiveExpression
    :   multiplicativeExpression ( ('+' | '-') multiplicativeExpression )*
    ;

multiplicativeExpression
    :   unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
    ;

expression
    : conditionalExpression ;

conditionalExpression
    :   conditionalOrExpression ( '?' conditionalExpression ':' conditionalExpression )?
    ;

conditionalOrExpression
    :   conditionalAndExpression ( '||' conditionalAndExpression )*
    ;

conditionalAndExpression
    :   inclusiveOrExpression ( '&&' inclusiveOrExpression )*
    ;

inclusiveOrExpression
    :   exclusiveOrExpression ( '|' exclusiveOrExpression )*
    ;

exclusiveOrExpression
    :   andExpression ( '^' andExpression )*
    ;

andExpression
    :   equalityExpression ( '&' equalityExpression )*
    ;

equalityExpression
    :   instanceOfExpression ( ('==' | '!=') instanceOfExpression )*
    ;

instanceOfExpression
    :   relationalExpression
    ;

relationalExpression
    :   additiveExpression ( relationalOp additiveExpression )*
    ;

relationalOp
    : '<'
		| '>'
		;

/* Dan: Commented-out. Not compiling in C for now. To fix
    :   ('<' '=')=> t1='<' t2='='
        { $t1.getLine() == $t2.getLine() &&
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   ('>' '=')=> t1='>' t2='='
        { $t1.getLine() == $t2.getLine() &&
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   '<'
    |   '>'
    ;
*/

/* --------------------------------------------------------------------------- */
/*                   White Space and Comments                                  */
/* --------------------------------------------------------------------------- */

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;


