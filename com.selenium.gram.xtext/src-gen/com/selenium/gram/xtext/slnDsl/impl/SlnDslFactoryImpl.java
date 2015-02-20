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
      case SlnDslPackage.SUBPROCEDURE: return createSubprocedure();
      case SlnDslPackage.HEAD: return createHead();
      case SlnDslPackage.FUNCTION_REFERENCE: return createFunctionReference();
      case SlnDslPackage.FUNCTION_NAME: return createFunctionName();
      case SlnDslPackage.FUNCTION_CALL: return createFunctionCall();
      case SlnDslPackage.VARIABLE_REFERENCE: return createVariableReference();
      case SlnDslPackage.VARIABLE_NAME: return createVariableName();
      case SlnDslPackage.EXPRESSION: return createExpression();
      case SlnDslPackage.NUM_LITERAL_EXPRESSION: return createNumLiteralExpression();
      case SlnDslPackage.LIST_EXPRESSION: return createListExpression();
      case SlnDslPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
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
      case SlnDslPackage.ACTION_TYPE: return createActionType();
      case SlnDslPackage.ACTION_EXPRESSION: return createActionExpression();
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
  public ListExpression createListExpression()
  {
    ListExpressionImpl listExpression = new ListExpressionImpl();
    return listExpression;
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
  public ActionExpression createActionExpression()
  {
    ActionExpressionImpl actionExpression = new ActionExpressionImpl();
    return actionExpression;
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
