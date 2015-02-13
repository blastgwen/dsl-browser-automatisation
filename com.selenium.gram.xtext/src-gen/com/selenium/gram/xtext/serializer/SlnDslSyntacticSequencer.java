package com.selenium.gram.xtext.serializer;

import com.google.inject.Inject;
import com.selenium.gram.xtext.services.SlnDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SlnDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SlnDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActionExpression_SelectKeyword_0_1_or_VerifyKeyword_0_0;
	protected AbstractElementAlias match_ActionInstruction_CheckKeyword_1_0_0_or_ClickKeyword_1_0_1;
	protected AbstractElementAlias match_Expression_AllKeyword_3_0_0_or_AnyKeyword_3_0_1;
	protected AbstractElementAlias match_Expression_EqualsSignEqualsSignKeyword_4_0_0_or_GreaterThanSignKeyword_4_0_2_or_LessThanSignKeyword_4_0_1;
	protected AbstractElementAlias match_Expression_ExclamationMarkKeyword_2_0_0_or_SizeofKeyword_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SlnDslGrammarAccess) access;
		match_ActionExpression_SelectKeyword_0_1_or_VerifyKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getActionExpressionAccess().getSelectKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getActionExpressionAccess().getVerifyKeyword_0_0()));
		match_ActionInstruction_CheckKeyword_1_0_0_or_ClickKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getActionInstructionAccess().getCheckKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getActionInstructionAccess().getClickKeyword_1_0_1()));
		match_Expression_AllKeyword_3_0_0_or_AnyKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getAllKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getAnyKeyword_3_0_1()));
		match_Expression_EqualsSignEqualsSignKeyword_4_0_0_or_GreaterThanSignKeyword_4_0_2_or_LessThanSignKeyword_4_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getEqualsSignEqualsSignKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getGreaterThanSignKeyword_4_0_2()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getLessThanSignKeyword_4_0_1()));
		match_Expression_ExclamationMarkKeyword_2_0_0_or_SizeofKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpressionAccess().getExclamationMarkKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getExpressionAccess().getSizeofKeyword_2_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getNumberLiteralRule())
			return getNumberLiteralToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * NumberLiteral:
	 * 	INT | STRING
	 * ;
	 */
	protected String getNumberLiteralToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ActionExpression_SelectKeyword_0_1_or_VerifyKeyword_0_0.equals(syntax))
				emit_ActionExpression_SelectKeyword_0_1_or_VerifyKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ActionInstruction_CheckKeyword_1_0_0_or_ClickKeyword_1_0_1.equals(syntax))
				emit_ActionInstruction_CheckKeyword_1_0_0_or_ClickKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_AllKeyword_3_0_0_or_AnyKeyword_3_0_1.equals(syntax))
				emit_Expression_AllKeyword_3_0_0_or_AnyKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_EqualsSignEqualsSignKeyword_4_0_0_or_GreaterThanSignKeyword_4_0_2_or_LessThanSignKeyword_4_0_1.equals(syntax))
				emit_Expression_EqualsSignEqualsSignKeyword_4_0_0_or_GreaterThanSignKeyword_4_0_2_or_LessThanSignKeyword_4_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_ExclamationMarkKeyword_2_0_0_or_SizeofKeyword_2_0_1.equals(syntax))
				emit_Expression_ExclamationMarkKeyword_2_0_0_or_SizeofKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'verify' | 'select'
	 */
	protected void emit_ActionExpression_SelectKeyword_0_1_or_VerifyKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'check' | 'click'
	 */
	protected void emit_ActionInstruction_CheckKeyword_1_0_0_or_ClickKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'All' | 'Any'
	 */
	protected void emit_Expression_AllKeyword_3_0_0_or_AnyKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '==' | '<' | '>'
	 */
	protected void emit_Expression_EqualsSignEqualsSignKeyword_4_0_0_or_GreaterThanSignKeyword_4_0_2_or_LessThanSignKeyword_4_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!' | 'sizeof'
	 */
	protected void emit_Expression_ExclamationMarkKeyword_2_0_0_or_SizeofKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
