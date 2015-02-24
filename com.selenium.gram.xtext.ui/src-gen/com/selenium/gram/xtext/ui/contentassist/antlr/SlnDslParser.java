/*
* generated by Xtext
*/
package com.selenium.gram.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.selenium.gram.xtext.services.SlnDslGrammarAccess;

public class SlnDslParser extends AbstractContentAssistParser {
	
	@Inject
	private SlnDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.selenium.gram.xtext.ui.contentassist.antlr.internal.InternalSlnDslParser createParser() {
		com.selenium.gram.xtext.ui.contentassist.antlr.internal.InternalSlnDslParser result = new com.selenium.gram.xtext.ui.contentassist.antlr.internal.InternalSlnDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBROWSERAccess().getAlternatives(), "rule__BROWSER__Alternatives");
					put(grammarAccess.getHeadAccess().getAlternatives(), "rule__Head__Alternatives");
					put(grammarAccess.getFunctionCallAccess().getAlternatives(), "rule__FunctionCall__Alternatives");
					put(grammarAccess.getNumberLiteralAccess().getAlternatives(), "rule__NumberLiteral__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getBooleanListOperatorAccess().getAlternatives(), "rule__BooleanListOperator__Alternatives");
					put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
					put(grammarAccess.getLogicalOperatorAccess().getAlternatives(), "rule__LogicalOperator__Alternatives");
					put(grammarAccess.getBooleanOperatorAccess().getAlternatives(), "rule__BooleanOperator__Alternatives");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getLoopAccess().getAlternatives(), "rule__Loop__Alternatives");
					put(grammarAccess.getActionInstructionAccess().getAlternatives(), "rule__ActionInstruction__Alternatives");
					put(grammarAccess.getSelectableElementAccess().getAlternatives(), "rule__SelectableElement__Alternatives");
					put(grammarAccess.getClickableElementAccess().getAlternatives(), "rule__ClickableElement__Alternatives");
					put(grammarAccess.getVerifiableElementAccess().getAlternatives(), "rule__VerifiableElement__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getSelectBrowserAccess().getGroup(), "rule__SelectBrowser__Group__0");
					put(grammarAccess.getSubprocedureAccess().getGroup(), "rule__Subprocedure__Group__0");
					put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(grammarAccess.getHeadAccess().getGroup_0(), "rule__Head__Group_0__0");
					put(grammarAccess.getHeadAccess().getGroup_1(), "rule__Head__Group_1__0");
					put(grammarAccess.getHeadAccess().getGroup_1_4(), "rule__Head__Group_1_4__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_0(), "rule__FunctionCall__Group_0__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1(), "rule__FunctionCall__Group_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1_3(), "rule__FunctionCall__Group_1_3__0");
					put(grammarAccess.getSizeOfExpressionAccess().getGroup(), "rule__SizeOfExpression__Group__0");
					put(grammarAccess.getBooleanListExpressionAccess().getGroup(), "rule__BooleanListExpression__Group__0");
					put(grammarAccess.getVerifyActionAccess().getGroup(), "rule__VerifyAction__Group__0");
					put(grammarAccess.getExistActionAccess().getGroup(), "rule__ExistAction__Group__0");
					put(grammarAccess.getSelectActionAccess().getGroup(), "rule__SelectAction__Group__0");
					put(grammarAccess.getBinaryBooleanExpressionAccess().getGroup(), "rule__BinaryBooleanExpression__Group__0");
					put(grammarAccess.getBinaryLogicalExpressionAccess().getGroup(), "rule__BinaryLogicalExpression__Group__0");
					put(grammarAccess.getNegationExpressionAccess().getGroup(), "rule__NegationExpression__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getAssignationAccess().getGroup(), "rule__Assignation__Group__0");
					put(grammarAccess.getConditionalAccess().getGroup(), "rule__Conditional__Group__0");
					put(grammarAccess.getConditionalAccess().getGroup_4(), "rule__Conditional__Group_4__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getForeachAccess().getGroup(), "rule__Foreach__Group__0");
					put(grammarAccess.getActionClickAccess().getGroup(), "rule__ActionClick__Group__0");
					put(grammarAccess.getActionOpenAccess().getGroup(), "rule__ActionOpen__Group__0");
					put(grammarAccess.getActionCheckAccess().getGroup(), "rule__ActionCheck__Group__0");
					put(grammarAccess.getActionTypeAccess().getGroup(), "rule__ActionType__Group__0");
					put(grammarAccess.getModelAccess().getNavigatorAssignment_0(), "rule__Model__NavigatorAssignment_0");
					put(grammarAccess.getModelAccess().getSubsAssignment_1(), "rule__Model__SubsAssignment_1");
					put(grammarAccess.getModelAccess().getBodyAssignment_3(), "rule__Model__BodyAssignment_3");
					put(grammarAccess.getSelectBrowserAccess().getBrowserAssignment_1(), "rule__SelectBrowser__BrowserAssignment_1");
					put(grammarAccess.getSubprocedureAccess().getHeadAssignment_1(), "rule__Subprocedure__HeadAssignment_1");
					put(grammarAccess.getSubprocedureAccess().getBodyAssignment_2(), "rule__Subprocedure__BodyAssignment_2");
					put(grammarAccess.getBodyAccess().getDefsAssignment_0(), "rule__Body__DefsAssignment_0");
					put(grammarAccess.getBodyAccess().getInstructionsAssignment_1(), "rule__Body__InstructionsAssignment_1");
					put(grammarAccess.getHeadAccess().getNameAssignment_0_0(), "rule__Head__NameAssignment_0_0");
					put(grammarAccess.getHeadAccess().getNameAssignment_1_0(), "rule__Head__NameAssignment_1_0");
					put(grammarAccess.getHeadAccess().getArgsIDAssignment_1_3(), "rule__Head__ArgsIDAssignment_1_3");
					put(grammarAccess.getHeadAccess().getArgsIDAssignment_1_4_2(), "rule__Head__ArgsIDAssignment_1_4_2");
					put(grammarAccess.getFunctionReferenceAccess().getFunctionNameAssignment(), "rule__FunctionReference__FunctionNameAssignment");
					put(grammarAccess.getFunctionNameAccess().getNameAssignment(), "rule__FunctionName__NameAssignment");
					put(grammarAccess.getFunctionCallAccess().getRefAssignment_0_0(), "rule__FunctionCall__RefAssignment_0_0");
					put(grammarAccess.getFunctionCallAccess().getRefAssignment_1_0(), "rule__FunctionCall__RefAssignment_1_0");
					put(grammarAccess.getFunctionCallAccess().getArgsAssignment_1_2(), "rule__FunctionCall__ArgsAssignment_1_2");
					put(grammarAccess.getFunctionCallAccess().getArgsAssignment_1_3_1(), "rule__FunctionCall__ArgsAssignment_1_3_1");
					put(grammarAccess.getVariableReferenceAccess().getVarIDAssignment(), "rule__VariableReference__VarIDAssignment");
					put(grammarAccess.getVariableNameAccess().getNameAssignment(), "rule__VariableName__NameAssignment");
					put(grammarAccess.getUriAccess().getUrlAssignment(), "rule__Uri__UrlAssignment");
					put(grammarAccess.getNumLiteralExpressionAccess().getValueAssignment(), "rule__NumLiteralExpression__ValueAssignment");
					put(grammarAccess.getSizeOfExpressionAccess().getExpAssignment_2(), "rule__SizeOfExpression__ExpAssignment_2");
					put(grammarAccess.getBooleanListExpressionAccess().getOpAssignment_0(), "rule__BooleanListExpression__OpAssignment_0");
					put(grammarAccess.getBooleanListExpressionAccess().getVarNameAssignment_3(), "rule__BooleanListExpression__VarNameAssignment_3");
					put(grammarAccess.getBooleanListExpressionAccess().getExpAssignment_5(), "rule__BooleanListExpression__ExpAssignment_5");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_0(), "rule__BooleanExpression__ExpAssignment_0");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_1(), "rule__BooleanExpression__ExpAssignment_1");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_2(), "rule__BooleanExpression__ExpAssignment_2");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_3(), "rule__BooleanExpression__ExpAssignment_3");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_4(), "rule__BooleanExpression__ExpAssignment_4");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_5(), "rule__BooleanExpression__ExpAssignment_5");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_6(), "rule__BooleanExpression__ExpAssignment_6");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_7(), "rule__BooleanExpression__ExpAssignment_7");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
					put(grammarAccess.getVerifyActionAccess().getVerifyTypeAssignment_2(), "rule__VerifyAction__VerifyTypeAssignment_2");
					put(grammarAccess.getVerifyActionAccess().getNameElementAssignment_4(), "rule__VerifyAction__NameElementAssignment_4");
					put(grammarAccess.getVerifyActionAccess().getValueAssignment_6(), "rule__VerifyAction__ValueAssignment_6");
					put(grammarAccess.getExistActionAccess().getSelectAssignment_2(), "rule__ExistAction__SelectAssignment_2");
					put(grammarAccess.getExistActionAccess().getNameElementAssignment_4(), "rule__ExistAction__NameElementAssignment_4");
					put(grammarAccess.getSelectActionAccess().getTypeAssignment_2(), "rule__SelectAction__TypeAssignment_2");
					put(grammarAccess.getSelectActionAccess().getNameElementAssignment_4(), "rule__SelectAction__NameElementAssignment_4");
					put(grammarAccess.getBinaryBooleanExpressionAccess().getOpAssignment_0(), "rule__BinaryBooleanExpression__OpAssignment_0");
					put(grammarAccess.getBinaryBooleanExpressionAccess().getLeftAssignment_1(), "rule__BinaryBooleanExpression__LeftAssignment_1");
					put(grammarAccess.getBinaryBooleanExpressionAccess().getRightAssignment_2(), "rule__BinaryBooleanExpression__RightAssignment_2");
					put(grammarAccess.getBinaryLogicalExpressionAccess().getOpAssignment_0(), "rule__BinaryLogicalExpression__OpAssignment_0");
					put(grammarAccess.getBinaryLogicalExpressionAccess().getLeftAssignment_1(), "rule__BinaryLogicalExpression__LeftAssignment_1");
					put(grammarAccess.getBinaryLogicalExpressionAccess().getRightAssignment_2(), "rule__BinaryLogicalExpression__RightAssignment_2");
					put(grammarAccess.getNegationExpressionAccess().getNegationAssignment_1(), "rule__NegationExpression__NegationAssignment_1");
					put(grammarAccess.getDefinitionAccess().getVarIDAssignment_1(), "rule__Definition__VarIDAssignment_1");
					put(grammarAccess.getDefinitionAccess().getExpAssignment_3(), "rule__Definition__ExpAssignment_3");
					put(grammarAccess.getAssignationAccess().getVarAssignment_0(), "rule__Assignation__VarAssignment_0");
					put(grammarAccess.getAssignationAccess().getExpAssignment_2(), "rule__Assignation__ExpAssignment_2");
					put(grammarAccess.getConditionalAccess().getExpAssignment_1(), "rule__Conditional__ExpAssignment_1");
					put(grammarAccess.getConditionalAccess().getTrueInsAssignment_3(), "rule__Conditional__TrueInsAssignment_3");
					put(grammarAccess.getConditionalAccess().getFalseInsAssignment_4_1(), "rule__Conditional__FalseInsAssignment_4_1");
					put(grammarAccess.getWhileAccess().getCondAssignment_2(), "rule__While__CondAssignment_2");
					put(grammarAccess.getWhileAccess().getInsAssignment_5(), "rule__While__InsAssignment_5");
					put(grammarAccess.getForeachAccess().getVarAssignment_2(), "rule__Foreach__VarAssignment_2");
					put(grammarAccess.getForeachAccess().getExpAssignment_4(), "rule__Foreach__ExpAssignment_4");
					put(grammarAccess.getForeachAccess().getInsAssignment_7(), "rule__Foreach__InsAssignment_7");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_0(), "rule__ActionInstruction__ActionAssignment_0");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_1(), "rule__ActionInstruction__ActionAssignment_1");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_2(), "rule__ActionInstruction__ActionAssignment_2");
					put(grammarAccess.getActionInstructionAccess().getActionAssignment_3(), "rule__ActionInstruction__ActionAssignment_3");
					put(grammarAccess.getActionClickAccess().getTypeAssignment_2(), "rule__ActionClick__TypeAssignment_2");
					put(grammarAccess.getActionClickAccess().getElementAssignment_4(), "rule__ActionClick__ElementAssignment_4");
					put(grammarAccess.getActionOpenAccess().getUrlAssignment_2(), "rule__ActionOpen__UrlAssignment_2");
					put(grammarAccess.getActionCheckAccess().getElementAssignment_2(), "rule__ActionCheck__ElementAssignment_2");
					put(grammarAccess.getActionCheckAccess().getValueAssignment_4(), "rule__ActionCheck__ValueAssignment_4");
					put(grammarAccess.getActionTypeAccess().getNameElementAssignment_2(), "rule__ActionType__NameElementAssignment_2");
					put(grammarAccess.getActionTypeAccess().getValueAssignment_4(), "rule__ActionType__ValueAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.selenium.gram.xtext.ui.contentassist.antlr.internal.InternalSlnDslParser typedParser = (com.selenium.gram.xtext.ui.contentassist.antlr.internal.InternalSlnDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SlnDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SlnDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
