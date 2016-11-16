/*
    ANTlr.4 for RIIF-2  language  First Try wih the starting point from RIIF-1

    */

grammar RIIF2 ;
import RIIF2ParserRules, KEYWORDS , RIIF2LexerRules, GENERALTOKENS;

/*Programmar File RIIF-2 */
program
    : declaration+ EOF
    ;
declaration
    : component_decl
    | environment_decl
    | requirement_decl
 // RIIF-2 : template declarartion
    ;
/*Component Declaration*/
component_decl  // RIIF-2 : implements feature
    : COMPONENT ident ( EXTENDS ident )? (IMPLEMENTS ident ( ',' ident )* )?  ';'
      component_body_element* END_COMPONENT
    ;
component_body_element
    : parameter_decl
    | constance_decl
    | child_component_decl
    | fail_mode_decl
    | assignment
 // RIIF-2: set implemeneted abstract paraments constants
    | assertion
    ;
/*Environment declaration*/
environment_decl
    : ENVIRONMENT ident ';' environment_body_element* END_ENVIRONMENT
    ;
environment_body_element
    : assignment
    | env_parameter_decl
    ;
/*Requirement Declaration*/
requirement_decl
    : REQUIREMENT ident ';' assertion* END_REQUIREMENT
    ;
/*Parameter Declaration*/
parameter_decl
    : PARAMETER ident ':' complex_type (':=' expression )? ';'
    ;
/*Environment Declaration*/
env_parameter_decl
    : (INPUT | OUTPUT ) PARAMETER ident ':' complex_type ( ':=' expression)? ';'
    ;
/*Constant Declaration*/
constance_decl
    : CONSTANT ident ':' primitive_type (':=' expression)? ';'
    ;
/*Child Component*/
child_component_decl
    : CHILD_COMPONENT ident ident vector? ';'
    ;
/*Failure Mode Declaration*/
fail_mode_decl
    : FAIL_MODE ident ';'
    ;
/*Assignment*/
assignment
    : ASSIGN ( ident | hier_ident | attr_ident ) vector? '=' expression ';'
    ;
/*Assertions*/
assertion
    : ASSERT (attr_ident) relationalOp expression ';'
    ;
/*Types*/
primitive_type
    : TYPE_FLOAT
    | TYPE_INTEGER
    | TYPE_STRING
    ;
enum_type
    : TYPE_ENUM '{' ident ( ',' ident)* '}'
    ;
user_type
    : Ident
    ;
complex_type
    : primitive_type
    | enum_type
    | user_type
    ;


