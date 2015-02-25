/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlnDslFactoryImpl extends EFactoryImpl implements SlnDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SlnDslFactory init()
  {
    try
    {
      SlnDslFactory theSlnDslFactory = (SlnDslFactory)EPackage.Registry.INSTANCE.getEFactory(SlnDslPackage.eNS_URI);
      if (theSlnDslFactory != null)
      {
        return theSlnDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SlnDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlnDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SlnDslPackage.MODEL: return createModel();
      case SlnDslPackage.SELECT_BROWSER: return createSelectBrowser();
      case SlnDslPackage.SUBPROCEDURE: return createSubprocedure();
      case SlnDslPackage.BODY: return createBody();
      case SlnDslPackage.HEAD: return createHead();
      case SlnDslPackage.FUNCTION_REFERENCE: return createFunctionReference();
      case SlnDslPackage.FUNCTION_NAME: return createFunctionName();
      case SlnDslPackage.FUNCTION_CALL: return createFunctionCall();
      case SlnDslPackage.VARIABLE_REFERENCE: return createVariableReference();
      case SlnDslPackage.VARIABLE_NAME: return createVariableName();
      case SlnDslPackage.URI: return createUri();
      case SlnDslPackage.EXPRESSION: return createExpression();
      case SlnDslPackage.NUMERIC_OPERATION: return createNumericOperation();
      case SlnDslPackage.NUM_LITERAL_EXPRESSION: return createNumLiteralExpression();
      case SlnDslPackage.SIZE_OF_EXPRESSION: return createSizeOfExpression();
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION: return createBooleanListExpression();
      case SlnDslPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case SlnDslPackage.BOOLEAN_VALUE: return createBooleanValue();
      case SlnDslPackage.VERIFY_ACTION: return createVerifyAction();
      case SlnDslPackage.EXIST_ACTION: return createExistAction();
      case SlnDslPackage.GET_ACTION: return createGetAction();
      case SlnDslPackage.BINARY_BOOLEAN_EXPRESSION: return createBinaryBooleanExpression();
      case SlnDslPackage.BINARY_LOGICAL_EXPRESSION: return createBinaryLogicalExpression();
      case SlnDslPackage.NEGATION_EXPRESSION: return createNegationExpression();
      case SlnDslPackage.INSTRUCTION: return createInstruction();
      case SlnDslPackage.DEFINITION: return createDefinition();
      case SlnDslPackage.ASSIGNATION: return createAssignation();
      case SlnDslPackage.CONDITIONAL: return createConditional();
      case SlnDslPackage.LOOP: return createLoop();
      case SlnDslPackage.WHILE: return createWhile();
      case SlnDslPackage.FOREACH: return createForeach();
      case SlnDslPackage.ACTION_INSTRUCTION: return createActionInstruction();
      case SlnDslPackage.ACTION_CLICK: return createActionClick();
      case SlnDslPackage.ACTION_OPEN: return createActionOpen();
      case SlnDslPackage.ACTION_CHECK: return createActionCheck();
      case SlnDslPackage.SELECT_ACTION: return createSelectAction();
      case SlnDslPackage.ACTION_TYPE: return createActionType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectBrowser createSelectBrowser()
  {
    SelectBrowserImpl selectBrowser = new SelectBrowserImpl();
    return selectBrowser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subprocedure createSubprocedure()
  {
    SubprocedureImpl subprocedure = new SubprocedureImpl();
    return subprocedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionReference createFunctionReference()
  {
    FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
    return functionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName createFunctionName()
  {
    FunctionNameImpl functionName = new FunctionNameImpl();
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName createVariableName()
  {
    VariableNameImpl variableName = new VariableNameImpl();
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uri createUri()
  {
    UriImpl uri = new UriImpl();
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericOperation createNumericOperation()
  {
    NumericOperationImpl numericOperation = new NumericOperationImpl();
    return numericOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumLiteralExpression createNumLiteralExpression()
  {
    NumLiteralExpressionImpl numLiteralExpression = new NumLiteralExpressionImpl();
    return numLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeOfExpression createSizeOfExpression()
  {
    SizeOfExpressionImpl sizeOfExpression = new SizeOfExpressionImpl();
    return sizeOfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanListExpression createBooleanListExpression()
  {
    BooleanListExpressionImpl booleanListExpression = new BooleanListExpressionImpl();
    return booleanListExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerifyAction createVerifyAction()
  {
    VerifyActionImpl verifyAction = new VerifyActionImpl();
    return verifyAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistAction createExistAction()
  {
    ExistActionImpl existAction = new ExistActionImpl();
    return existAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetAction createGetAction()
  {
    GetActionImpl getAction = new GetActionImpl();
    return getAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryBooleanExpression createBinaryBooleanExpression()
  {
    BinaryBooleanExpressionImpl binaryBooleanExpression = new BinaryBooleanExpressionImpl();
    return binaryBooleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryLogicalExpression createBinaryLogicalExpression()
  {
    BinaryLogicalExpressionImpl binaryLogicalExpression = new BinaryLogicalExpressionImpl();
    return binaryLogicalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegationExpression createNegationExpression()
  {
    NegationExpressionImpl negationExpression = new NegationExpressionImpl();
    return negationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignation createAssignation()
  {
    AssignationImpl assignation = new AssignationImpl();
    return assignation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foreach createForeach()
  {
    ForeachImpl foreach = new ForeachImpl();
    return foreach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionInstruction createActionInstruction()
  {
    ActionInstructionImpl actionInstruction = new ActionInstructionImpl();
    return actionInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionClick createActionClick()
  {
    ActionClickImpl actionClick = new ActionClickImpl();
    return actionClick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionOpen createActionOpen()
  {
    ActionOpenImpl actionOpen = new ActionOpenImpl();
    return actionOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionCheck createActionCheck()
  {
    ActionCheckImpl actionCheck = new ActionCheckImpl();
    return actionCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAction createSelectAction()
  {
    SelectActionImpl selectAction = new SelectActionImpl();
    return selectAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionType createActionType()
  {
    ActionTypeImpl actionType = new ActionTypeImpl();
    return actionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlnDslPackage getSlnDslPackage()
  {
    return (SlnDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SlnDslPackage getPackage()
  {
    return SlnDslPackage.eINSTANCE;
  }

} //SlnDslFactoryImpl
