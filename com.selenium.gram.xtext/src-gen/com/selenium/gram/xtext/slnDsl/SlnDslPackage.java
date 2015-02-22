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
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BODY = 1;

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
   * The feature id for the '<em><b>Body</b></em>' containment reference.
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
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.BodyImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBody()
   * @generated
   */
  int BODY = 2;

  /**
   * The feature id for the '<em><b>Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__DEFS = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__INSTRUCTIONS = 1;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.HeadImpl <em>Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.HeadImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getHead()
   * @generated
   */
  int HEAD = 3;

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
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionReference()
   * @generated
   */
  int FUNCTION_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE__FUNCTION_NAME = 0;

  /**
   * The number of structural features of the '<em>Function Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionNameImpl <em>Function Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.FunctionNameImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionName()
   * @generated
   */
  int FUNCTION_NAME = 5;

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
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.InstructionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 20;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.FunctionCallImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 6;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__REF = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.VariableReferenceImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Var ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VAR_ID = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.VariableNameImpl <em>Variable Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.VariableNameImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVariableName()
   * @generated
   */
  int VARIABLE_NAME = 8;

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
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.NumLiteralExpressionImpl <em>Num Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.NumLiteralExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getNumLiteralExpression()
   * @generated
   */
  int NUM_LITERAL_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_LITERAL_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Num Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ListExpressionImpl <em>List Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ListExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getListExpression()
   * @generated
   */
  int LIST_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.BooleanListExpressionImpl <em>Boolean List Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.BooleanListExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBooleanListExpression()
   * @generated
   */
  int BOOLEAN_LIST_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LIST_EXPRESSION__OP = 0;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LIST_EXPRESSION__VAR_NAME = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LIST_EXPRESSION__EXP = 2;

  /**
   * The number of structural features of the '<em>Boolean List Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LIST_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.BooleanExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.BooleanValueImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.VerifyActionImpl <em>Verify Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.VerifyActionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVerifyAction()
   * @generated
   */
  int VERIFY_ACTION = 15;

  /**
   * The feature id for the '<em><b>Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_ACTION__NAME_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_ACTION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Verify Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ExistActionImpl <em>Exist Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ExistActionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getExistAction()
   * @generated
   */
  int EXIST_ACTION = 16;

  /**
   * The feature id for the '<em><b>Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIST_ACTION__NAME_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Exist Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIST_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.BinaryBooleanExpressionImpl <em>Binary Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.BinaryBooleanExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBinaryBooleanExpression()
   * @generated
   */
  int BINARY_BOOLEAN_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_BOOLEAN_EXPRESSION__OP = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_BOOLEAN_EXPRESSION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_BOOLEAN_EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Binary Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_BOOLEAN_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.BinaryLogicalExpressionImpl <em>Binary Logical Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.BinaryLogicalExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBinaryLogicalExpression()
   * @generated
   */
  int BINARY_LOGICAL_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_LOGICAL_EXPRESSION__OP = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_LOGICAL_EXPRESSION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_LOGICAL_EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Binary Logical Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_LOGICAL_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.NegationExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getNegationExpression()
   * @generated
   */
  int NEGATION_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Negation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_EXPRESSION__NEGATION = 0;

  /**
   * The number of structural features of the '<em>Negation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 21;

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
  int ASSIGNATION = 22;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__VAR = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__EXP = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 23;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__EXP = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>True Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__TRUE_INS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>False Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__FALSE_INS = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.LoopImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 24;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__INS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.WhileImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 25;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__INS = LOOP__INS;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__COND = LOOP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = LOOP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ForeachImpl <em>Foreach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ForeachImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getForeach()
   * @generated
   */
  int FOREACH = 26;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__INS = LOOP__INS;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__VAR = LOOP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__EXP = LOOP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Foreach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FEATURE_COUNT = LOOP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl <em>Action Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionInstruction()
   * @generated
   */
  int ACTION_INSTRUCTION = 27;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION__ACTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionClickImpl <em>Action Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionClickImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionClick()
   * @generated
   */
  int ACTION_CLICK = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLICK__TYPE = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLICK__ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Action Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CLICK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionOpenImpl <em>Action Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionOpenImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionOpen()
   * @generated
   */
  int ACTION_OPEN = 29;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OPEN__URL = 0;

  /**
   * The number of structural features of the '<em>Action Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OPEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionCheckImpl <em>Action Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionCheckImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionCheck()
   * @generated
   */
  int ACTION_CHECK = 30;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CHECK__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CHECK__VALUE = 1;

  /**
   * The number of structural features of the '<em>Action Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CHECK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionTypeImpl <em>Action Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionTypeImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionType()
   * @generated
   */
  int ACTION_TYPE = 31;

  /**
   * The feature id for the '<em><b>Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__NAME_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Action Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionSelectExpressionImpl <em>Action Select Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.selenium.gram.xtext.slnDsl.impl.ActionSelectExpressionImpl
   * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionSelectExpression()
   * @generated
   */
  int ACTION_SELECT_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SELECT_EXPRESSION__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Select Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SELECT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Model#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Model#getBody()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Body();

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
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.Subprocedure#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Subprocedure#getBody()
   * @see #getSubprocedure()
   * @generated
   */
  EReference getSubprocedure_Body();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Body#getDefs <em>Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defs</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Body#getDefs()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Defs();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Body#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Body#getInstructions()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Instructions();

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
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.FunctionCall#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionCall#getRef()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.FunctionCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see com.selenium.gram.xtext.slnDsl.FunctionCall#getArgs()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Args();

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
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.NumLiteralExpression <em>Num Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Literal Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.NumLiteralExpression
   * @generated
   */
  EClass getNumLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.NumLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.selenium.gram.xtext.slnDsl.NumLiteralExpression#getValue()
   * @see #getNumLiteralExpression()
   * @generated
   */
  EAttribute getNumLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ListExpression
   * @generated
   */
  EClass getListExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ListExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ListExpression#getExp()
   * @see #getListExpression()
   * @generated
   */
  EReference getListExpression_Exp();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression <em>Boolean List Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean List Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanListExpression
   * @generated
   */
  EClass getBooleanListExpression();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanListExpression#getOp()
   * @see #getBooleanListExpression()
   * @generated
   */
  EAttribute getBooleanListExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Name</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanListExpression#getVarName()
   * @see #getBooleanListExpression()
   * @generated
   */
  EReference getBooleanListExpression_VarName();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanListExpression#getExp()
   * @see #getBooleanListExpression()
   * @generated
   */
  EReference getBooleanListExpression_Exp();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.BooleanExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanExpression#getExp()
   * @see #getBooleanExpression()
   * @generated
   */
  EReference getBooleanExpression_Exp();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.VerifyAction <em>Verify Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verify Action</em>'.
   * @see com.selenium.gram.xtext.slnDsl.VerifyAction
   * @generated
   */
  EClass getVerifyAction();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getNameElement <em>Name Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.VerifyAction#getNameElement()
   * @see #getVerifyAction()
   * @generated
   */
  EAttribute getVerifyAction_NameElement();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.selenium.gram.xtext.slnDsl.VerifyAction#getValue()
   * @see #getVerifyAction()
   * @generated
   */
  EReference getVerifyAction_Value();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ExistAction <em>Exist Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exist Action</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ExistAction
   * @generated
   */
  EClass getExistAction();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.ExistAction#getNameElement <em>Name Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ExistAction#getNameElement()
   * @see #getExistAction()
   * @generated
   */
  EAttribute getExistAction_NameElement();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression <em>Binary Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Boolean Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression
   * @generated
   */
  EClass getBinaryBooleanExpression();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression#getOp()
   * @see #getBinaryBooleanExpression()
   * @generated
   */
  EAttribute getBinaryBooleanExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression#getLeft()
   * @see #getBinaryBooleanExpression()
   * @generated
   */
  EReference getBinaryBooleanExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression#getRight()
   * @see #getBinaryBooleanExpression()
   * @generated
   */
  EReference getBinaryBooleanExpression_Right();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression <em>Binary Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Logical Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression
   * @generated
   */
  EClass getBinaryLogicalExpression();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression#getOp()
   * @see #getBinaryLogicalExpression()
   * @generated
   */
  EAttribute getBinaryLogicalExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression#getLeft()
   * @see #getBinaryLogicalExpression()
   * @generated
   */
  EReference getBinaryLogicalExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression#getRight()
   * @see #getBinaryLogicalExpression()
   * @generated
   */
  EReference getBinaryLogicalExpression_Right();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.NegationExpression
   * @generated
   */
  EClass getNegationExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.NegationExpression#getNegation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Negation</em>'.
   * @see com.selenium.gram.xtext.slnDsl.NegationExpression#getNegation()
   * @see #getNegationExpression()
   * @generated
   */
  EReference getNegationExpression_Negation();

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
   * Returns the meta object for the containment reference list '{@link com.selenium.gram.xtext.slnDsl.Loop#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see com.selenium.gram.xtext.slnDsl.Loop#getIns()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Ins();

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
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionInstruction <em>Action Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Instruction</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionInstruction
   * @generated
   */
  EClass getActionInstruction();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionInstruction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionInstruction#getAction()
   * @see #getActionInstruction()
   * @generated
   */
  EReference getActionInstruction_Action();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionClick <em>Action Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Click</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionClick
   * @generated
   */
  EClass getActionClick();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.ActionClick#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionClick#getType()
   * @see #getActionClick()
   * @generated
   */
  EAttribute getActionClick_Type();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.ActionClick#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionClick#getElement()
   * @see #getActionClick()
   * @generated
   */
  EAttribute getActionClick_Element();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionOpen <em>Action Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Open</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionOpen
   * @generated
   */
  EClass getActionOpen();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.ActionOpen#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionOpen#getUrl()
   * @see #getActionOpen()
   * @generated
   */
  EAttribute getActionOpen_Url();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionCheck <em>Action Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Check</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionCheck
   * @generated
   */
  EClass getActionCheck();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionCheck#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionCheck#getElement()
   * @see #getActionCheck()
   * @generated
   */
  EReference getActionCheck_Element();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionCheck#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionCheck#getValue()
   * @see #getActionCheck()
   * @generated
   */
  EReference getActionCheck_Value();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Type</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionType
   * @generated
   */
  EClass getActionType();

  /**
   * Returns the meta object for the attribute '{@link com.selenium.gram.xtext.slnDsl.ActionType#getNameElement <em>Name Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionType#getNameElement()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_NameElement();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionType#getValue()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Value();

  /**
   * Returns the meta object for class '{@link com.selenium.gram.xtext.slnDsl.ActionSelectExpression <em>Action Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Select Expression</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionSelectExpression
   * @generated
   */
  EClass getActionSelectExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.selenium.gram.xtext.slnDsl.ActionSelectExpression#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.selenium.gram.xtext.slnDsl.ActionSelectExpression#getElement()
   * @see #getActionSelectExpression()
   * @generated
   */
  EReference getActionSelectExpression_Element();

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
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BODY = eINSTANCE.getModel_Body();

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
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBPROCEDURE__BODY = eINSTANCE.getSubprocedure_Body();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.BodyImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__DEFS = eINSTANCE.getBody_Defs();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__INSTRUCTIONS = eINSTANCE.getBody_Instructions();

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
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__REF = eINSTANCE.getFunctionCall_Ref();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

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
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.NumLiteralExpressionImpl <em>Num Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.NumLiteralExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getNumLiteralExpression()
     * @generated
     */
    EClass NUM_LITERAL_EXPRESSION = eINSTANCE.getNumLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_LITERAL_EXPRESSION__VALUE = eINSTANCE.getNumLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ListExpressionImpl <em>List Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ListExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getListExpression()
     * @generated
     */
    EClass LIST_EXPRESSION = eINSTANCE.getListExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_EXPRESSION__EXP = eINSTANCE.getListExpression_Exp();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.BooleanListExpressionImpl <em>Boolean List Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.BooleanListExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBooleanListExpression()
     * @generated
     */
    EClass BOOLEAN_LIST_EXPRESSION = eINSTANCE.getBooleanListExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LIST_EXPRESSION__OP = eINSTANCE.getBooleanListExpression_Op();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_LIST_EXPRESSION__VAR_NAME = eINSTANCE.getBooleanListExpression_VarName();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_LIST_EXPRESSION__EXP = eINSTANCE.getBooleanListExpression_Exp();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.BooleanExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__EXP = eINSTANCE.getBooleanExpression_Exp();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.BooleanValueImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.VerifyActionImpl <em>Verify Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.VerifyActionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getVerifyAction()
     * @generated
     */
    EClass VERIFY_ACTION = eINSTANCE.getVerifyAction();

    /**
     * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFY_ACTION__NAME_ELEMENT = eINSTANCE.getVerifyAction_NameElement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY_ACTION__VALUE = eINSTANCE.getVerifyAction_Value();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ExistActionImpl <em>Exist Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ExistActionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getExistAction()
     * @generated
     */
    EClass EXIST_ACTION = eINSTANCE.getExistAction();

    /**
     * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXIST_ACTION__NAME_ELEMENT = eINSTANCE.getExistAction_NameElement();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.BinaryBooleanExpressionImpl <em>Binary Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.BinaryBooleanExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBinaryBooleanExpression()
     * @generated
     */
    EClass BINARY_BOOLEAN_EXPRESSION = eINSTANCE.getBinaryBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_BOOLEAN_EXPRESSION__OP = eINSTANCE.getBinaryBooleanExpression_Op();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_BOOLEAN_EXPRESSION__LEFT = eINSTANCE.getBinaryBooleanExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_BOOLEAN_EXPRESSION__RIGHT = eINSTANCE.getBinaryBooleanExpression_Right();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.BinaryLogicalExpressionImpl <em>Binary Logical Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.BinaryLogicalExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getBinaryLogicalExpression()
     * @generated
     */
    EClass BINARY_LOGICAL_EXPRESSION = eINSTANCE.getBinaryLogicalExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_LOGICAL_EXPRESSION__OP = eINSTANCE.getBinaryLogicalExpression_Op();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_LOGICAL_EXPRESSION__LEFT = eINSTANCE.getBinaryLogicalExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_LOGICAL_EXPRESSION__RIGHT = eINSTANCE.getBinaryLogicalExpression_Right();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.NegationExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getNegationExpression()
     * @generated
     */
    EClass NEGATION_EXPRESSION = eINSTANCE.getNegationExpression();

    /**
     * The meta object literal for the '<em><b>Negation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION_EXPRESSION__NEGATION = eINSTANCE.getNegationExpression_Negation();

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
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__INS = eINSTANCE.getLoop_Ins();

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
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl <em>Action Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionInstructionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionInstruction()
     * @generated
     */
    EClass ACTION_INSTRUCTION = eINSTANCE.getActionInstruction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_INSTRUCTION__ACTION = eINSTANCE.getActionInstruction_Action();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionClickImpl <em>Action Click</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionClickImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionClick()
     * @generated
     */
    EClass ACTION_CLICK = eINSTANCE.getActionClick();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLICK__TYPE = eINSTANCE.getActionClick_Type();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_CLICK__ELEMENT = eINSTANCE.getActionClick_Element();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionOpenImpl <em>Action Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionOpenImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionOpen()
     * @generated
     */
    EClass ACTION_OPEN = eINSTANCE.getActionOpen();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_OPEN__URL = eINSTANCE.getActionOpen_Url();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionCheckImpl <em>Action Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionCheckImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionCheck()
     * @generated
     */
    EClass ACTION_CHECK = eINSTANCE.getActionCheck();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_CHECK__ELEMENT = eINSTANCE.getActionCheck_Element();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_CHECK__VALUE = eINSTANCE.getActionCheck_Value();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionTypeImpl <em>Action Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionTypeImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionType()
     * @generated
     */
    EClass ACTION_TYPE = eINSTANCE.getActionType();

    /**
     * The meta object literal for the '<em><b>Name Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_TYPE__NAME_ELEMENT = eINSTANCE.getActionType_NameElement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_TYPE__VALUE = eINSTANCE.getActionType_Value();

    /**
     * The meta object literal for the '{@link com.selenium.gram.xtext.slnDsl.impl.ActionSelectExpressionImpl <em>Action Select Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.selenium.gram.xtext.slnDsl.impl.ActionSelectExpressionImpl
     * @see com.selenium.gram.xtext.slnDsl.impl.SlnDslPackageImpl#getActionSelectExpression()
     * @generated
     */
    EClass ACTION_SELECT_EXPRESSION = eINSTANCE.getActionSelectExpression();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SELECT_EXPRESSION__ELEMENT = eINSTANCE.getActionSelectExpression_Element();

  }

} //SlnDslPackage
