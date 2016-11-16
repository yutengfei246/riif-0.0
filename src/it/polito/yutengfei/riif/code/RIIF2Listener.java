// Generated from /usr/Intellij/ANtlr4WorkSpace/riif-0.0/src/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.riif.code;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RIIF2Parser}.
 */
public interface RIIF2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(RIIF2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(RIIF2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#component_decl}.
	 * @param ctx the parse tree
	 */
	void enterComponent_decl(RIIF2Parser.Component_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#component_decl}.
	 * @param ctx the parse tree
	 */
	void exitComponent_decl(RIIF2Parser.Component_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#component_body_element}.
	 * @param ctx the parse tree
	 */
	void enterComponent_body_element(RIIF2Parser.Component_body_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#component_body_element}.
	 * @param ctx the parse tree
	 */
	void exitComponent_body_element(RIIF2Parser.Component_body_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environment_decl}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment_decl(RIIF2Parser.Environment_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environment_decl}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment_decl(RIIF2Parser.Environment_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environment_body_element}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment_body_element(RIIF2Parser.Environment_body_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environment_body_element}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment_body_element(RIIF2Parser.Environment_body_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#requirement_decl}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_decl(RIIF2Parser.Requirement_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#requirement_decl}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_decl(RIIF2Parser.Requirement_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void enterParameter_decl(RIIF2Parser.Parameter_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void exitParameter_decl(RIIF2Parser.Parameter_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#env_parameter_decl}.
	 * @param ctx the parse tree
	 */
	void enterEnv_parameter_decl(RIIF2Parser.Env_parameter_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#env_parameter_decl}.
	 * @param ctx the parse tree
	 */
	void exitEnv_parameter_decl(RIIF2Parser.Env_parameter_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#constance_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstance_decl(RIIF2Parser.Constance_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#constance_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstance_decl(RIIF2Parser.Constance_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#child_component_decl}.
	 * @param ctx the parse tree
	 */
	void enterChild_component_decl(RIIF2Parser.Child_component_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#child_component_decl}.
	 * @param ctx the parse tree
	 */
	void exitChild_component_decl(RIIF2Parser.Child_component_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fail_mode_decl}.
	 * @param ctx the parse tree
	 */
	void enterFail_mode_decl(RIIF2Parser.Fail_mode_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fail_mode_decl}.
	 * @param ctx the parse tree
	 */
	void exitFail_mode_decl(RIIF2Parser.Fail_mode_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(RIIF2Parser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(RIIF2Parser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#enum_type}.
	 * @param ctx the parse tree
	 */
	void enterEnum_type(RIIF2Parser.Enum_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#enum_type}.
	 * @param ctx the parse tree
	 */
	void exitEnum_type(RIIF2Parser.Enum_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#user_type}.
	 * @param ctx the parse tree
	 */
	void enterUser_type(RIIF2Parser.User_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#user_type}.
	 * @param ctx the parse tree
	 */
	void exitUser_type(RIIF2Parser.User_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#complex_type}.
	 * @param ctx the parse tree
	 */
	void enterComplex_type(RIIF2Parser.Complex_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#complex_type}.
	 * @param ctx the parse tree
	 */
	void exitComplex_type(RIIF2Parser.Complex_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(RIIF2Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(RIIF2Parser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(RIIF2Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(RIIF2Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#hier_ident}.
	 * @param ctx the parse tree
	 */
	void enterHier_ident(RIIF2Parser.Hier_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#hier_ident}.
	 * @param ctx the parse tree
	 */
	void exitHier_ident(RIIF2Parser.Hier_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#attr_ident}.
	 * @param ctx the parse tree
	 */
	void enterAttr_ident(RIIF2Parser.Attr_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#attr_ident}.
	 * @param ctx the parse tree
	 */
	void exitAttr_ident(RIIF2Parser.Attr_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(RIIF2Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(RIIF2Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#unitLiteral}.
	 * @param ctx the parse tree
	 */
	void enterUnitLiteral(RIIF2Parser.UnitLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#unitLiteral}.
	 * @param ctx the parse tree
	 */
	void exitUnitLiteral(RIIF2Parser.UnitLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#units}.
	 * @param ctx the parse tree
	 */
	void enterUnits(RIIF2Parser.UnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#units}.
	 * @param ctx the parse tree
	 */
	void exitUnits(RIIF2Parser.UnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(RIIF2Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(RIIF2Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(RIIF2Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(RIIF2Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(RIIF2Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(RIIF2Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(RIIF2Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(RIIF2Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(RIIF2Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(RIIF2Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(RIIF2Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(RIIF2Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(RIIF2Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(RIIF2Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(RIIF2Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(RIIF2Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(RIIF2Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(RIIF2Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(RIIF2Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(RIIF2Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(RIIF2Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(RIIF2Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(RIIF2Parser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(RIIF2Parser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(RIIF2Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(RIIF2Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(RIIF2Parser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(RIIF2Parser.RelationalOpContext ctx);
}