package com.selenium.gram.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.selenium.gram.xtext.services.SlnDslGrammarAccess;
import com.selenium.gram.xtext.slnDsl.ActionExpression;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.Foreach;
import com.selenium.gram.xtext.slnDsl.FunctionName;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.Head;
import com.selenium.gram.xtext.slnDsl.ListExpression;
import com.selenium.gram.xtext.slnDsl.Loop;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;
import com.selenium.gram.xtext.slnDsl.Subprocedure;
import com.selenium.gram.xtext.slnDsl.VariableName;
import com.selenium.gram.xtext.slnDsl.VariableReference;
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
			case SlnDslPackage.ACTION_EXPRESSION:
				if(context == grammarAccess.getActionExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_ActionExpression(context, (ActionExpression) semanticObject); 
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
			case SlnDslPackage.ASSIGNATION:
				if(context == grammarAccess.getAssignationRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Assignation(context, (Assignation) semanticObject); 
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
			case SlnDslPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.FOREACH:
				if(context == grammarAccess.getForeachRule()) {
					sequence_Foreach(context, (Foreach) semanticObject); 
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
				if(context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getFunctionReferenceRule() ||
				   context == grammarAccess.getInstructionRule()) {
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
			case SlnDslPackage.LOOP:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoopRule()) {
					sequence_Loop(context, (Loop) semanticObject); 
					return; 
				}
				else break;
			case SlnDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
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
			case SlnDslPackage.WHILE:
				if(context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     element=Expression
	 */
	protected void sequence_ActionExpression(EObject context, ActionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SlnDslPackage.Literals.ACTION_EXPRESSION__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SlnDslPackage.Literals.ACTION_EXPRESSION__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionExpressionAccess().getElementExpressionParserRuleCall_2_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (url=URL | element=Expression | (element=Expression value=Expression))
	 */
	protected void sequence_ActionInstruction(EObject context, ActionInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ((left=Expression right=Expression) | exp=Expression)
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=Expression trueIns+=Instruction+ falseIns+=Instruction*)
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
	 *     (var=VariableName exp=Expression ins+=Instruction+)
	 */
	protected void sequence_Foreach(EObject context, Foreach semanticObject) {
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
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ((varName=VariableName exp=Expression) | exp=Expression)
	 */
	protected void sequence_ListExpression(EObject context, ListExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (while=While | for=Foreach)
	 */
	protected void sequence_Loop(EObject context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subs+=Subprocedure* main+=Instruction+)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=Head body+=Instruction+)
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
	 *     (cond=Expression ins+=Instruction+)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
