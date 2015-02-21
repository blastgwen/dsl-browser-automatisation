package com.selenium.gram.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.selenium.gram.xtext.services.SlnDslGrammarAccess;
import com.selenium.gram.xtext.slnDsl.ActionCheck;
import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.ActionOpen;
import com.selenium.gram.xtext.slnDsl.ActionSelectExpression;
import com.selenium.gram.xtext.slnDsl.ActionType;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression;
import com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression;
import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.BooleanListExpression;
import com.selenium.gram.xtext.slnDsl.BooleanValue;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.ExistAction;
import com.selenium.gram.xtext.slnDsl.Foreach;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.FunctionName;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.Head;
import com.selenium.gram.xtext.slnDsl.ListExpression;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.NegationExpression;
import com.selenium.gram.xtext.slnDsl.NumLiteralExpression;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;
import com.selenium.gram.xtext.slnDsl.Subprocedure;
import com.selenium.gram.xtext.slnDsl.VariableName;
import com.selenium.gram.xtext.slnDsl.VariableReference;
import com.selenium.gram.xtext.slnDsl.VerifyAction;
import com.selenium.gram.xtext.slnDsl.While;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SlnDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SlnDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SlnDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SlnDslPackage.ACTION_CHECK:
				if(context == grammarAccess.getActionCheckRule()) {
					sequence_ActionCheck(context, (ActionCheck) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.ACTION_CLICK:
				if(context == grammarAccess.getActionClickRule()) {
					sequence_ActionClick(context, (ActionClick) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.ACTION_INSTRUCTION:
				if(context == grammarAccess.getActionInstructionRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ActionInstruction(context, (ActionInstruction) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.ACTION_OPEN:
				if(context == grammarAccess.getActionOpenRule()) {
					sequence_ActionOpen(context, (ActionOpen) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.ACTION_SELECT_EXPRESSION:
				if(context == grammarAccess.getActionSelectExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_ActionSelectExpression(context, (ActionSelectExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.ACTION_TYPE:
				if(context == grammarAccess.getActionTypeRule()) {
					sequence_ActionType(context, (ActionType) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.ASSIGNATION:
				if(context == grammarAccess.getAssignationRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Assignation(context, (Assignation) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.BINARY_BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getBinaryBooleanExpressionRule()) {
					sequence_BinaryBooleanExpression(context, (BinaryBooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.BINARY_LOGICAL_EXPRESSION:
				if(context == grammarAccess.getBinaryLogicalExpressionRule()) {
					sequence_BinaryLogicalExpression(context, (BinaryLogicalExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.BOOLEAN_LIST_EXPRESSION:
				if(context == grammarAccess.getBooleanListExpressionRule()) {
					sequence_BooleanListExpression(context, (BooleanListExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.EXIST_ACTION:
				if(context == grammarAccess.getExistActionRule()) {
					sequence_ExistAction(context, (ExistAction) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.FOREACH:
				if(context == grammarAccess.getForeachRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoopRule()) {
					sequence_Foreach(context, (Foreach) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.FUNCTION_CALL:
				if(context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.FUNCTION_NAME:
				if(context == grammarAccess.getFunctionNameRule()) {
					sequence_FunctionName(context, (FunctionName) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.FUNCTION_REFERENCE:
				if(context == grammarAccess.getFunctionReferenceRule()) {
					sequence_FunctionReference(context, (FunctionReference) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.HEAD:
				if(context == grammarAccess.getHeadRule()) {
					sequence_Head(context, (Head) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.LIST_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getListExpressionRule()) {
					sequence_ListExpression(context, (ListExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.NEGATION_EXPRESSION:
				if(context == grammarAccess.getNegationExpressionRule()) {
					sequence_NegationExpression(context, (NegationExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.NUM_LITERAL_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumLiteralExpressionRule()) {
					sequence_NumLiteralExpression(context, (NumLiteralExpression) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.SUBPROCEDURE:
				if(context == grammarAccess.getSubprocedureRule()) {
					sequence_Subprocedure(context, (Subprocedure) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.VARIABLE_NAME:
				if(context == grammarAccess.getVariableNameRule()) {
					sequence_VariableName(context, (VariableName) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.VERIFY_ACTION:
				if(context == grammarAccess.getVerifyActionRule()) {
					sequence_VerifyAction(context, (VerifyAction) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.WHILE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoopRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type=ClickableElement element=NumberLiteral)
	 */
	protected void sequence_ActionCheck(EObject context, ActionCheck semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_CHECK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_CHECK__TYPE));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_CHECK__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_CHECK__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionCheckAccess().getTypeClickableElementParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getActionCheckAccess().getElementNumberLiteralParserRuleCall_4_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ClickableElement element=NumberLiteral)
	 */
	protected void sequence_ActionClick(EObject context, ActionClick semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_CLICK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_CLICK__TYPE));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_CLICK__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_CLICK__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionClickAccess().getTypeClickableElementParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getActionClickAccess().getElementNumberLiteralParserRuleCall_4_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (action=ActionOpen | action=ActionClick | action=ActionCheck | action=ActionType)
	 */
	protected void sequence_ActionInstruction(EObject context, ActionInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=URL
	 */
	protected void sequence_ActionOpen(EObject context, ActionOpen semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_OPEN__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_OPEN__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionOpenAccess().getUrlURLTerminalRuleCall_2_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     element=Expression
	 */
	protected void sequence_ActionSelectExpression(EObject context, ActionSelectExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_SELECT_EXPRESSION__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_SELECT_EXPRESSION__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionSelectExpressionAccess().getElementExpressionParserRuleCall_2_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nameElement=NumberLiteral value=Expression)
	 */
	protected void sequence_ActionType(EObject context, ActionType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_TYPE__NAME_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_TYPE__NAME_ELEMENT));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionTypeAccess().getNameElementNumberLiteralParserRuleCall_2_0(), semanticObject.getNameElement());
		feeder.accept(grammarAccess.getActionTypeAccess().getValueExpressionParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=VariableReference exp=Expression)
	 */
	protected void sequence_Assignation(EObject context, Assignation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ASSIGNATION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ASSIGNATION__VAR));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ASSIGNATION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ASSIGNATION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignationAccess().getVarVariableReferenceParserRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssignationAccess().getExpExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=BooleanOperator left=Expression right=Expression)
	 */
	protected void sequence_BinaryBooleanExpression(EObject context, BinaryBooleanExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BINARY_BOOLEAN_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BINARY_BOOLEAN_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BINARY_BOOLEAN_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BINARY_BOOLEAN_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BINARY_BOOLEAN_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BINARY_BOOLEAN_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryBooleanExpressionAccess().getOpBooleanOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBinaryBooleanExpressionAccess().getLeftExpressionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryBooleanExpressionAccess().getRightExpressionParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=LogicalOperator right=BooleanExpression left=BooleanExpression)
	 */
	protected void sequence_BinaryLogicalExpression(EObject context, BinaryLogicalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BINARY_LOGICAL_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BINARY_LOGICAL_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BINARY_LOGICAL_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BINARY_LOGICAL_EXPRESSION__RIGHT));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BINARY_LOGICAL_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BINARY_LOGICAL_EXPRESSION__LEFT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryLogicalExpressionAccess().getOpLogicalOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBinaryLogicalExpressionAccess().getRightBooleanExpressionParserRuleCall_1_0(), semanticObject.getRight());
		feeder.accept(grammarAccess.getBinaryLogicalExpressionAccess().getLeftBooleanExpressionParserRuleCall_2_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         exp=BinaryBooleanExpression | 
	 *         exp=NegationExpression | 
	 *         exp=VerifyAction | 
	 *         exp=ExistAction | 
	 *         exp=BooleanListExpression | 
	 *         exp=BooleanValue | 
	 *         exp=BinaryLogicalExpression
	 *     )
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=BooleanListOperator varName=VariableName exp=Expression)
	 */
	protected void sequence_BooleanListExpression(EObject context, BooleanListExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BOOLEAN_LIST_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BOOLEAN_LIST_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BOOLEAN_LIST_EXPRESSION__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BOOLEAN_LIST_EXPRESSION__VAR_NAME));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BOOLEAN_LIST_EXPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BOOLEAN_LIST_EXPRESSION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanListExpressionAccess().getOpBooleanListOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBooleanListExpressionAccess().getVarNameVariableNameParserRuleCall_3_0(), semanticObject.getVarName());
		feeder.accept(grammarAccess.getBooleanListExpressionAccess().getExpExpressionParserRuleCall_5_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exp=BooleanExpression trueIns+=Instruction+ falseIns+=Instruction*)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varID=VariableName exp=Expression)
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.DEFINITION__VAR_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.DEFINITION__VAR_ID));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.DEFINITION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.DEFINITION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinitionAccess().getVarIDVariableNameParserRuleCall_1_0(), semanticObject.getVarID());
		feeder.accept(grammarAccess.getDefinitionAccess().getExpExpressionParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameElement=NumberLiteral
	 */
	protected void sequence_ExistAction(EObject context, ExistAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.EXIST_ACTION__NAME_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.EXIST_ACTION__NAME_ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExistActionAccess().getNameElementNumberLiteralParserRuleCall_2_0(), semanticObject.getNameElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=VariableName exp=Expression ins+=Instruction+)
	 */
	protected void sequence_Foreach(EObject context, Foreach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=FunctionReference | (ref=FunctionReference args+=Expression args+=Expression*))
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FunctionName(EObject context, FunctionName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.FUNCTION_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.FUNCTION_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     functionName=[FunctionName|ID]
	 */
	protected void sequence_FunctionReference(EObject context, FunctionReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.FUNCTION_REFERENCE__FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.FUNCTION_REFERENCE__FUNCTION_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionReferenceAccess().getFunctionNameFunctionNameIDTerminalRuleCall_0_1(), semanticObject.getFunctionName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=FunctionName | (name=FunctionName argsID+=VariableName argsID+=VariableName*))
	 */
	protected void sequence_Head(EObject context, Head semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_ListExpression(EObject context, ListExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.LIST_EXPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.LIST_EXPRESSION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListExpressionAccess().getExpExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (subs+=Subprocedure* defs+=Definition* main+=Instruction+)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     negation=BooleanExpression
	 */
	protected void sequence_NegationExpression(EObject context, NegationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.NEGATION_EXPRESSION__NEGATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.NEGATION_EXPRESSION__NEGATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegationExpressionAccess().getNegationBooleanExpressionParserRuleCall_1_0(), semanticObject.getNegation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=NumberLiteral
	 */
	protected void sequence_NumLiteralExpression(EObject context, NumLiteralExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.NUM_LITERAL_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.NUM_LITERAL_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumLiteralExpressionAccess().getValueNumberLiteralParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=Head defs+=Definition* body+=Instruction+)
	 */
	protected void sequence_Subprocedure(EObject context, Subprocedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VariableName(EObject context, VariableName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.VARIABLE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.VARIABLE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     varID=[VariableName|ID]
	 */
	protected void sequence_VariableReference(EObject context, VariableReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.VARIABLE_REFERENCE__VAR_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.VARIABLE_REFERENCE__VAR_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableReferenceAccess().getVarIDVariableNameIDTerminalRuleCall_0_1(), semanticObject.getVarID());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nameElement=NumberLiteral value=Expression)
	 */
	protected void sequence_VerifyAction(EObject context, VerifyAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.VERIFY_ACTION__NAME_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.VERIFY_ACTION__NAME_ELEMENT));
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.VERIFY_ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.VERIFY_ACTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVerifyActionAccess().getNameElementNumberLiteralParserRuleCall_2_0(), semanticObject.getNameElement());
		feeder.accept(grammarAccess.getVerifyActionAccess().getValueExpressionParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=BooleanExpression ins+=Instruction+)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
