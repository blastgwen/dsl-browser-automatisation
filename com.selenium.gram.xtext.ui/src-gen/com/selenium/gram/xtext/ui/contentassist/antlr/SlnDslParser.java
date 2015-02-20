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
					put(grammarAccess.getHeadAccess().getAlternatives(), "rule__Head__Alternatives");
					put(grammarAccess.getFunctionCallAccess().getAlternatives(), "rule__FunctionCall__Alternatives");
					put(grammarAccess.getNumberLiteralAccess().getAlternatives(), "rule__NumberLiteral__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getListExpressionAccess().getAlternatives(), "rule__ListExpression__Alternatives");
					put(grammarAccess.getListExpressionAccess().getAlternatives_0_0(), "rule__ListExpression__Alternatives_0_0");
					put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
					put(grammarAccess.getBooleanOperatorAccess().getAlternatives(), "rule__BooleanOperator__Alternatives");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getLoopAccess().getAlternatives(), "rule__Loop__Alternatives");
					put(grammarAccess.getActionInstructionAccess().getAlternatives(), "rule__ActionInstruction__Alternatives");
					put(grammarAccess.getActionExpressionAccess().getAlternatives_0(), "rule__ActionExpression__Alternatives_0");
					put(grammarAccess.getClickableElementAccess().getAlternatives(), "rule__ClickableElement__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getSubprocedureAccess().getGroup(), "rule__Subprocedure__Group__0");
					put(grammarAccess.getHeadAccess().getGroup_0(), "rule__Head__Group_0__0");
					put(grammarAccess.getHeadAccess().getGroup_1(), "rule__Head__Group_1__0");
					put(grammarAccess.getHeadAccess().getGroup_1_4(), "rule__Head__Group_1_4__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_0(), "rule__FunctionCall__Group_0__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1(), "rule__FunctionCall__Group_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1_3(), "rule__FunctionCall__Group_1_3__0");
					put(grammarAccess.getListExpressionAccess().getGroup_0(), "rule__ListExpression__Group_0__0");
					put(grammarAccess.getListExpressionAccess().getGroup_1(), "rule__ListExpression__Group_1__0");
					put(grammarAccess.getBooleanExpressionAccess().getGroup_0(), "rule__BooleanExpression__Group_0__0");
					put(grammarAccess.getBooleanExpressionAccess().getGroup_1(), "rule__BooleanExpression__Group_1__0");
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
					put(grammarAccess.getActionExpressionAccess().getGroup(), "rule__ActionExpression__Group__0");
					put(grammarAccess.getModelAccess().getSubsAssignment_0(), "rule__Model__SubsAssignment_0");
					put(grammarAccess.getModelAccess().getMainAssignment_2(), "rule__Model__MainAssignment_2");
					put(grammarAccess.getSubprocedureAccess().getHeadAssignment_1(), "rule__Subprocedure__HeadAssignment_1");
					put(grammarAccess.getSubprocedureAccess().getBodyAssignment_2(), "rule__Subprocedure__BodyAssignment_2");
					put(grammarAccess.getHeadAccess().getNameAssignment_0_0(), "rule__Head__NameAssignment_0_0");
					put(grammarAccess.getHeadAccess().getNameAssignment_1_0(), "rule__Head__NameAssignment_1_0");
					put(grammarAccess.getHeadAccess().getArgsIDAssignment_1_3(), "rule__Head__ArgsIDAssignment_1_3");
					put(grammarAccess.getHeadAccess().getArgsIDAssignment_1_4_2(), "rule__Head__ArgsIDAssignment_1_4_2");
					put(grammarAccess.getFunctionReferenceAccess().getFunctionNameAssignment(), "rule__FunctionReference__FunctionNameAssignment");
					put(grammarAccess.getFunctionNameAccess().getNameAssignment(), "rule__FunctionName__NameAssignment");
					put(grammarAccess.getFunctionCallAccess().getArgsAssignment_1_2(), "rule__FunctionCall__ArgsAssignment_1_2");
					put(grammarAccess.getFunctionCallAccess().getArgsAssignment_1_3_1(), "rule__FunctionCall__ArgsAssignment_1_3_1");
					put(grammarAccess.getVariableReferenceAccess().getVarIDAssignment(), "rule__VariableReference__VarIDAssignment");
					put(grammarAccess.getVariableNameAccess().getNameAssignment(), "rule__VariableName__NameAssignment");
					put(grammarAccess.getNumLiteralExpressionAccess().getValueAssignment(), "rule__NumLiteralExpression__ValueAssignment");
					put(grammarAccess.getListExpressionAccess().getVarNameAssignment_0_3(), "rule__ListExpression__VarNameAssignment_0_3");
					put(grammarAccess.getListExpressionAccess().getExpAssignment_0_5(), "rule__ListExpression__ExpAssignment_0_5");
					put(grammarAccess.getListExpressionAccess().getExpAssignment_1_2(), "rule__ListExpression__ExpAssignment_1_2");
					put(grammarAccess.getBooleanExpressionAccess().getLeftAssignment_0_1(), "rule__BooleanExpression__LeftAssignment_0_1");
					put(grammarAccess.getBooleanExpressionAccess().getRightAssignment_0_2(), "rule__BooleanExpression__RightAssignment_0_2");
					put(grammarAccess.getBooleanExpressionAccess().getExpAssignment_1_1(), "rule__BooleanExpression__ExpAssignment_1_1");
					put(grammarAccess.getDefinitionAccess().getVarIDAssignment_1(), "rule__Definition__VarIDAssignment_1");
					put(grammarAccess.getDefinitionAccess().getExpAssignment_3(), "rule__Definition__ExpAssignment_3");
					put(grammarAccess.getAssignationAccess().getVarAssignment_0(), "rule__Assignation__VarAssignment_0");
					put(grammarAccess.getAssignationAccess().getExpAssignment_2(), "rule__Assignation__ExpAssignment_2");
					put(grammarAccess.getConditionalAccess().getExpAssignment_1(), "rule__Conditional__ExpAssignment_1");
					put(grammarAccess.getConditionalAccess().getTrueInsAssignment_3(), "rule__Conditional__TrueInsAssignment_3");
					put(grammarAccess.getConditionalAccess().getFalseInsAssignment_4_1(), "rule__Conditional__FalseInsAssignment_4_1");
					put(grammarAccess.getLoopAccess().getWhileAssignment_0(), "rule__Loop__WhileAssignment_0");
					put(grammarAccess.getLoopAccess().getForAssignment_1(), "rule__Loop__ForAssignment_1");
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
					put(grammarAccess.getActionCheckAccess().getTypeAssignment_2(), "rule__ActionCheck__TypeAssignment_2");
					put(grammarAccess.getActionCheckAccess().getElementAssignment_4(), "rule__ActionCheck__ElementAssignment_4");
					put(grammarAccess.getActionTypeAccess().getNameElementAssignment_2(), "rule__ActionType__NameElementAssignment_2");
					put(grammarAccess.getActionTypeAccess().getValueAssignment_4(), "rule__ActionType__ValueAssignment_4");
					put(grammarAccess.getActionExpressionAccess().getElementAssignment_2(), "rule__ActionExpression__ElementAssignment_2");
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
