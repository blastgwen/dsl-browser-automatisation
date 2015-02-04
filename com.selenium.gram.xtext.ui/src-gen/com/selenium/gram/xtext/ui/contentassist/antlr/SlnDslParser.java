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
					put(grammarAccess.getExpressionAccess().getAlternatives_2_0(), "rule__Expression__Alternatives_2_0");
					put(grammarAccess.getExpressionAccess().getAlternatives_3_0(), "rule__Expression__Alternatives_3_0");
					put(grammarAccess.getExpressionAccess().getAlternatives_3_2(), "rule__Expression__Alternatives_3_2");
					put(grammarAccess.getExpressionAccess().getAlternatives_4_0(), "rule__Expression__Alternatives_4_0");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getLoopAccess().getAlternatives(), "rule__Loop__Alternatives");
					put(grammarAccess.getActionInstructionAccess().getAlternatives(), "rule__ActionInstruction__Alternatives");
					put(grammarAccess.getActionInstructionAccess().getAlternatives_1_0(), "rule__ActionInstruction__Alternatives_1_0");
					put(grammarAccess.getActionExpressionAccess().getAlternatives_0(), "rule__ActionExpression__Alternatives_0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getSubprocedureAccess().getGroup(), "rule__Subprocedure__Group__0");
					put(grammarAccess.getHeadAccess().getGroup_0(), "rule__Head__Group_0__0");
					put(grammarAccess.getHeadAccess().getGroup_1(), "rule__Head__Group_1__0");
					put(grammarAccess.getHeadAccess().getGroup_1_4(), "rule__Head__Group_1_4__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_0(), "rule__FunctionCall__Group_0__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1(), "rule__FunctionCall__Group_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1_3(), "rule__FunctionCall__Group_1_3__0");
					put(grammarAccess.getExpressionAccess().getGroup_2(), "rule__Expression__Group_2__0");
					put(grammarAccess.getExpressionAccess().getGroup_3(), "rule__Expression__Group_3__0");
					put(grammarAccess.getExpressionAccess().getGroup_4(), "rule__Expression__Group_4__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getAssignationAccess().getGroup(), "rule__Assignation__Group__0");
					put(grammarAccess.getConditionalAccess().getGroup(), "rule__Conditional__Group__0");
					put(grammarAccess.getConditionalAccess().getGroup_4(), "rule__Conditional__Group_4__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getForeachAccess().getGroup(), "rule__Foreach__Group__0");
					put(grammarAccess.getActionInstructionAccess().getGroup_0(), "rule__ActionInstruction__Group_0__0");
					put(grammarAccess.getActionInstructionAccess().getGroup_1(), "rule__ActionInstruction__Group_1__0");
					put(grammarAccess.getActionInstructionAccess().getGroup_2(), "rule__ActionInstruction__Group_2__0");
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
					put(grammarAccess.getExpressionAccess().getVarAssignment_0(), "rule__Expression__VarAssignment_0");
					put(grammarAccess.getExpressionAccess().getExpAssignment_2_2(), "rule__Expression__ExpAssignment_2_2");
					put(grammarAccess.getExpressionAccess().getExpAssignment_3_3(), "rule__Expression__ExpAssignment_3_3");
					put(grammarAccess.getExpressionAccess().getLeftAssignment_4_1(), "rule__Expression__LeftAssignment_4_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_4_2(), "rule__Expression__RightAssignment_4_2");
					put(grammarAccess.getExpressionAccess().getActAssignment_5(), "rule__Expression__ActAssignment_5");
					put(grammarAccess.getInstructionAccess().getDefAssignment_0(), "rule__Instruction__DefAssignment_0");
					put(grammarAccess.getInstructionAccess().getFuncAssignment_1(), "rule__Instruction__FuncAssignment_1");
					put(grammarAccess.getInstructionAccess().getCondAssignment_2(), "rule__Instruction__CondAssignment_2");
					put(grammarAccess.getInstructionAccess().getLoopAssignment_3(), "rule__Instruction__LoopAssignment_3");
					put(grammarAccess.getInstructionAccess().getActAssignment_4(), "rule__Instruction__ActAssignment_4");
					put(grammarAccess.getInstructionAccess().getAssAssignment_5(), "rule__Instruction__AssAssignment_5");
					put(grammarAccess.getDefinitionAccess().getVarIDAssignment_1(), "rule__Definition__VarIDAssignment_1");
					put(grammarAccess.getDefinitionAccess().getExpAssignment_3(), "rule__Definition__ExpAssignment_3");
					put(grammarAccess.getAssignationAccess().getVarAssignment_0(), "rule__Assignation__VarAssignment_0");
					put(grammarAccess.getAssignationAccess().getExpAssignment_2(), "rule__Assignation__ExpAssignment_2");
					put(grammarAccess.getConditionalAccess().getExpAssignment_1(), "rule__Conditional__ExpAssignment_1");
					put(grammarAccess.getConditionalAccess().getInsAssignment_3(), "rule__Conditional__InsAssignment_3");
					put(grammarAccess.getConditionalAccess().getInsAssignment_4_1(), "rule__Conditional__InsAssignment_4_1");
					put(grammarAccess.getLoopAccess().getWhileAssignment_0(), "rule__Loop__WhileAssignment_0");
					put(grammarAccess.getLoopAccess().getForAssignment_1(), "rule__Loop__ForAssignment_1");
					put(grammarAccess.getWhileAccess().getCondAssignment_2(), "rule__While__CondAssignment_2");
					put(grammarAccess.getWhileAccess().getInsAssignment_5(), "rule__While__InsAssignment_5");
					put(grammarAccess.getForeachAccess().getVarAssignment_2(), "rule__Foreach__VarAssignment_2");
					put(grammarAccess.getForeachAccess().getExpAssignment_4(), "rule__Foreach__ExpAssignment_4");
					put(grammarAccess.getForeachAccess().getInsAssignment_7(), "rule__Foreach__InsAssignment_7");
					put(grammarAccess.getActionInstructionAccess().getUrlAssignment_0_1(), "rule__ActionInstruction__UrlAssignment_0_1");
					put(grammarAccess.getActionInstructionAccess().getElementAssignment_1_2(), "rule__ActionInstruction__ElementAssignment_1_2");
					put(grammarAccess.getActionInstructionAccess().getElementAssignment_2_1(), "rule__ActionInstruction__ElementAssignment_2_1");
					put(grammarAccess.getActionInstructionAccess().getValueAssignment_2_3(), "rule__ActionInstruction__ValueAssignment_2_3");
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
