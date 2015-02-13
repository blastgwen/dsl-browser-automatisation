/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.selenium.gram.xtext.slnDsl.SlnDslFactory
 * @model kind="package"
 * @generated
 */
public interface SlnDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "slnDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.selenium.com/gram/xtext/SlnDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "slnDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SlnDslPackage eINSTANCE = com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ModelImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Subs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SUBS = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAIN = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.SubprocedureImpl <em>Subprocedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.SubprocedureImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getSubprocedure()
   * @generated
   */
  int SUBPROCEDURE = 1;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROCEDURE__HEAD = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROCEDURE__BODY = 1;

  /**
   * The number of structural features of the '<em>Subprocedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBPROCEDURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.HeadImpl <em>Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.HeadImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getHead()
   * @generated
   */
  int HEAD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__NAME = 0;

  /**
   * The feature id for the '<em><b>Args ID</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__ARGS_ID = 1;

  /**
   * The number of structural features of the '<em>Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.FunctionCallImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 5;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionReference()
   * @generated
   */
  int FUNCTION_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE__FUNCTION_NAME = FUNCTION_CALL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE__ARGS = FUNCTION_CALL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE_FEATURE_COUNT = FUNCTION_CALL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionNameImpl <em>Function Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.FunctionNameImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionName()
   * @generated
   */
  int FUNCTION_NAME = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Function Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.VariableReferenceImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Var ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VAR_ID = 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.VariableNameImpl <em>Variable Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.VariableNameImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVariableName()
   * @generated
   */
  int VARIABLE_NAME = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VAR = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP = 1;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VAR_NAME = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 4;

  /**
   * The feature id for the '<em><b>Act</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ACT = 5;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.InstructionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 9;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__DEF = 0;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__FUNC = 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__COND = 2;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__LOOP = 3;

  /**
   * The feature id for the '<em><b>Act</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ACT = 4;

  /**
   * The feature id for the '<em><b>Ass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ASS = 5;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Var ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__VAR_ID = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__EXP = 1;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.AssignationImpl <em>Assignation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.AssignationImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getAssignation()
   * @generated
   */
  int ASSIGNATION = 11;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__EXP = 1;

  /**
   * The number of structural features of the '<em>Assignation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 12;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__EXP = 0;

  /**
   * The feature id for the '<em><b>True Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__TRUE_INS = 1;

  /**
   * The feature id for the '<em><b>False Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__FALSE_INS = 2;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.LoopImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 13;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__WHILE = 0;

  /**
   * The feature id for the '<em><b>For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__FOR = 1;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.WhileImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 14;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__COND = 0;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__INS = 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ForeachImpl <em>Foreach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ForeachImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getForeach()
   * @generated
   */
  int FOREACH = 15;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__VAR = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__EXP = 1;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__INS = 2;

  /**
   * The number of structural features of the '<em>Foreach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl <em>Action Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionInstruction()
   * @generated
   */
  int ACTION_INSTRUCTION = 16;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION__URL = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION__ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Action Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionExpression()
   * @generated
   */
  int ACTION_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Action Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_EXPRESSION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Model#getSubs <em>Subs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subs</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Model#getSubs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Subs();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Model#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Main</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Model#getMain()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Main();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Subprocedure <em>Subprocedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subprocedure</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Subprocedure
   * @generated
   */
  EClass getSubprocedure();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Subprocedure#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Subprocedure#getHead()
   * @see #getSubprocedure()
   * @generated
   */
  EReference getSubprocedure_Head();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Subprocedure#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Subprocedure#getBody()
   * @see #getSubprocedure()
   * @generated
   */
  EReference getSubprocedure_Body();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Head</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Head
   * @generated
   */
  EClass getHead();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Head#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Head#getName()
   * @see #getHead()
   * @generated
   */
  EReference getHead_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Head#getArgsID <em>Args ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args ID</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Head#getArgsID()
   * @see #getHead()
   * @generated
   */
  EReference getHead_ArgsID();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.FunctionReference <em>Function Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Reference</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionReference
   * @generated
   */
  EClass getFunctionReference();

  /**
   * Returns the meta object for the reference '{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionReference#getFunctionName()
   * @see #getFunctionReference()
   * @generated
   */
  EReference getFunctionReference_FunctionName();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionReference#getArgs()
   * @see #getFunctionReference()
   * @generated
   */
  EReference getFunctionReference_Args();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.FunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionName
   * @generated
   */
  EClass getFunctionName();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.FunctionName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionName#getName()
   * @see #getFunctionName()
   * @generated
   */
  EAttribute getFunctionName_Name();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see com.selenium.gram.xtext.slnDsl.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link com.selenium.gram.xtext.slnDsl.VariableReference#getVarID <em>Var ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var ID</em>'.
   * @see com.selenium.gram.xtext.slnDsl.VariableReference#getVarID()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_VarID();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.VariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.VariableName
   * @generated
   */
  EClass getVariableName();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.VariableName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.VariableName#getName()
   * @see #getVariableName()
   * @generated
   */
  EAttribute getVariableName_Name();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Expression#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Expression#getVar()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Var();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Expression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Expression#getExp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Exp();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Expression#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Expression#getVarName()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_VarName();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Expression#getAct <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Act</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Expression#getAct()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Act();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Instruction#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Instruction#getDef()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Def();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Instruction#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Instruction#getFunc()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Func();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Instruction#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Instruction#getCond()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Cond();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Instruction#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Instruction#getLoop()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Loop();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Instruction#getAct <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Act</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Instruction#getAct()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Act();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Instruction#getAss <em>Ass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ass</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Instruction#getAss()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Ass();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Definition#getVarID <em>Var ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var ID</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Definition#getVarID()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_VarID();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Definition#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Definition#getExp()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Exp();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Assignation <em>Assignation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignation</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Assignation
   * @generated
   */
  EClass getAssignation();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Assignation#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Assignation#getVar()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Var();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Assignation#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Assignation#getExp()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Exp();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Conditional#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Conditional#getExp()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Conditional#getTrueIns <em>True Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>True Ins</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Conditional#getTrueIns()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_TrueIns();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Conditional#getFalseIns <em>False Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>False Ins</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Conditional#getFalseIns()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_FalseIns();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Loop#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Loop#getWhile()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_While();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Loop#getFor <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Loop#getFor()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_For();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see com.selenium.gram.xtext.slnDsl.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.While#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see com.selenium.gram.xtext.slnDsl.While#getCond()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.While#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see com.selenium.gram.xtext.slnDsl.While#getIns()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Ins();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Foreach <em>Foreach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreach</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Foreach
   * @generated
   */
  EClass getForeach();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Foreach#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Foreach#getVar()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Var();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Foreach#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Foreach#getExp()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Foreach#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Foreach#getIns()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Ins();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionInstruction <em>Action Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Instruction</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionInstruction
   * @generated
   */
  EClass getActionInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.ActionInstruction#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionInstruction#getUrl()
   * @see #getActionInstruction()
   * @generated
   */
  EAttribute getActionInstruction_Url();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionInstruction#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionInstruction#getElement()
   * @see #getActionInstruction()
   * @generated
   */
  EReference getActionInstruction_Element();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionInstruction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionInstruction#getValue()
   * @see #getActionInstruction()
   * @generated
   */
  EReference getActionInstruction_Value();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionExpression <em>Action Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionExpression
   * @generated
   */
  EClass getActionExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionExpression#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionExpression#getElement()
   * @see #getActionExpression()
   * @generated
   */
  EReference getActionExpression_Element();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SlnDslFactory getSlnDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ModelImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Subs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SUBS = eINSTANCE.getModel_Subs();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAIN = eINSTANCE.getModel_Main();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.SubprocedureImpl <em>Subprocedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.SubprocedureImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getSubprocedure()
     * @generated
     */
    EClass SUBPROCEDURE = eINSTANCE.getSubprocedure();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBPROCEDURE__HEAD = eINSTANCE.getSubprocedure_Head();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBPROCEDURE__BODY = eINSTANCE.getSubprocedure_Body();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.HeadImpl <em>Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.HeadImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getHead()
     * @generated
     */
    EClass HEAD = eINSTANCE.getHead();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEAD__NAME = eINSTANCE.getHead_Name();

    /**
     * The meta object literal for the '<em><b>Args ID</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEAD__ARGS_ID = eINSTANCE.getHead_ArgsID();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionReference()
     * @generated
     */
    EClass FUNCTION_REFERENCE = eINSTANCE.getFunctionReference();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_REFERENCE__FUNCTION_NAME = eINSTANCE.getFunctionReference_FunctionName();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_REFERENCE__ARGS = eINSTANCE.getFunctionReference_Args();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionNameImpl <em>Function Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.FunctionNameImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionName()
     * @generated
     */
    EClass FUNCTION_NAME = eINSTANCE.getFunctionName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_NAME__NAME = eINSTANCE.getFunctionName_Name();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.FunctionCallImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.VariableReferenceImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Var ID</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__VAR_ID = eINSTANCE.getVariableReference_VarID();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.VariableNameImpl <em>Variable Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.VariableNameImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVariableName()
     * @generated
     */
    EClass VARIABLE_NAME = eINSTANCE.getVariableName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_NAME__NAME = eINSTANCE.getVariableName_Name();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VAR = eINSTANCE.getExpression_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXP = eINSTANCE.getExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VAR_NAME = eINSTANCE.getExpression_VarName();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Act</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ACT = eINSTANCE.getExpression_Act();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.InstructionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__DEF = eINSTANCE.getInstruction_Def();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__FUNC = eINSTANCE.getInstruction_Func();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__COND = eINSTANCE.getInstruction_Cond();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__LOOP = eINSTANCE.getInstruction_Loop();

    /**
     * The meta object literal for the '<em><b>Act</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__ACT = eINSTANCE.getInstruction_Act();

    /**
     * The meta object literal for the '<em><b>Ass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__ASS = eINSTANCE.getInstruction_Ass();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Var ID</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__VAR_ID = eINSTANCE.getDefinition_VarID();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__EXP = eINSTANCE.getDefinition_Exp();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.AssignationImpl <em>Assignation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.AssignationImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getAssignation()
     * @generated
     */
    EClass ASSIGNATION = eINSTANCE.getAssignation();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__VAR = eINSTANCE.getAssignation_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__EXP = eINSTANCE.getAssignation_Exp();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__EXP = eINSTANCE.getConditional_Exp();

    /**
     * The meta object literal for the '<em><b>True Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__TRUE_INS = eINSTANCE.getConditional_TrueIns();

    /**
     * The meta object literal for the '<em><b>False Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__FALSE_INS = eINSTANCE.getConditional_FalseIns();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.LoopImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__WHILE = eINSTANCE.getLoop_While();

    /**
     * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__FOR = eINSTANCE.getLoop_For();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.WhileImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__COND = eINSTANCE.getWhile_Cond();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__INS = eINSTANCE.getWhile_Ins();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ForeachImpl <em>Foreach</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ForeachImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getForeach()
     * @generated
     */
    EClass FOREACH = eINSTANCE.getForeach();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__VAR = eINSTANCE.getForeach_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__EXP = eINSTANCE.getForeach_Exp();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__INS = eINSTANCE.getForeach_Ins();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl <em>Action Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionInstruction()
     * @generated
     */
    EClass ACTION_INSTRUCTION = eINSTANCE.getActionInstruction();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_INSTRUCTION__URL = eINSTANCE.getActionInstruction_Url();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_INSTRUCTION__ELEMENT = eINSTANCE.getActionInstruction_Element();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_INSTRUCTION__VALUE = eINSTANCE.getActionInstruction_Value();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionExpressionImpl <em>Action Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionExpression()
     * @generated
     */
    EClass ACTION_EXPRESSION = eINSTANCE.getActionExpression();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_EXPRESSION__ELEMENT = eINSTANCE.getActionExpression_Element();

  }

} //SlnDslPackage
