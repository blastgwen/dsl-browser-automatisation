/**
 */
package com.selenium.gram.xtext.slnDsl.util;

import com.selenium.gram.xtext.slnDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage
 * @generated
 */
public class SlnDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SlnDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlnDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SlnDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlnDslSwitch<Adapter> modelSwitch =
    new SlnDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSelectBrowser(SelectBrowser object)
      {
        return createSelectBrowserAdapter();
      }
      @Override
      public Adapter caseSubprocedure(Subprocedure object)
      {
        return createSubprocedureAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseHead(Head object)
      {
        return createHeadAdapter();
      }
      @Override
      public Adapter caseFunctionReference(FunctionReference object)
      {
        return createFunctionReferenceAdapter();
      }
      @Override
      public Adapter caseFunctionName(FunctionName object)
      {
        return createFunctionNameAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseVariableReference(VariableReference object)
      {
        return createVariableReferenceAdapter();
      }
      @Override
      public Adapter caseVariableName(VariableName object)
      {
        return createVariableNameAdapter();
      }
      @Override
      public Adapter caseUri(Uri object)
      {
        return createUriAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseNumericOperation(NumericOperation object)
      {
        return createNumericOperationAdapter();
      }
      @Override
      public Adapter caseNumLiteralExpression(NumLiteralExpression object)
      {
        return createNumLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseSizeOfExpression(SizeOfExpression object)
      {
        return createSizeOfExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanListExpression(BooleanListExpression object)
      {
        return createBooleanListExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanValue(BooleanValue object)
      {
        return createBooleanValueAdapter();
      }
      @Override
      public Adapter caseVerifyAction(VerifyAction object)
      {
        return createVerifyActionAdapter();
      }
      @Override
      public Adapter caseExistAction(ExistAction object)
      {
        return createExistActionAdapter();
      }
      @Override
      public Adapter caseGetAction(GetAction object)
      {
        return createGetActionAdapter();
      }
      @Override
      public Adapter caseBinaryBooleanExpression(BinaryBooleanExpression object)
      {
        return createBinaryBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseBinaryLogicalExpression(BinaryLogicalExpression object)
      {
        return createBinaryLogicalExpressionAdapter();
      }
      @Override
      public Adapter caseNegationExpression(NegationExpression object)
      {
        return createNegationExpressionAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseAssignation(Assignation object)
      {
        return createAssignationAdapter();
      }
      @Override
      public Adapter caseConditional(Conditional object)
      {
        return createConditionalAdapter();
      }
      @Override
      public Adapter caseLoop(Loop object)
      {
        return createLoopAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseForeach(Foreach object)
      {
        return createForeachAdapter();
      }
      @Override
      public Adapter caseActionInstruction(ActionInstruction object)
      {
        return createActionInstructionAdapter();
      }
      @Override
      public Adapter caseActionClick(ActionClick object)
      {
        return createActionClickAdapter();
      }
      @Override
      public Adapter caseActionOpen(ActionOpen object)
      {
        return createActionOpenAdapter();
      }
      @Override
      public Adapter caseActionCheck(ActionCheck object)
      {
        return createActionCheckAdapter();
      }
      @Override
      public Adapter caseSelectAction(SelectAction object)
      {
        return createSelectActionAdapter();
      }
      @Override
      public Adapter caseActionType(ActionType object)
      {
        return createActionTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.SelectBrowser <em>Select Browser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.SelectBrowser
   * @generated
   */
  public Adapter createSelectBrowserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Subprocedure <em>Subprocedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Subprocedure
   * @generated
   */
  public Adapter createSubprocedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Head
   * @generated
   */
  public Adapter createHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.FunctionReference <em>Function Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.FunctionReference
   * @generated
   */
  public Adapter createFunctionReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.FunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.FunctionName
   * @generated
   */
  public Adapter createFunctionNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.VariableReference
   * @generated
   */
  public Adapter createVariableReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.VariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.VariableName
   * @generated
   */
  public Adapter createVariableNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Uri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Uri
   * @generated
   */
  public Adapter createUriAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.NumericOperation <em>Numeric Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.NumericOperation
   * @generated
   */
  public Adapter createNumericOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.NumLiteralExpression <em>Num Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.NumLiteralExpression
   * @generated
   */
  public Adapter createNumLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.SizeOfExpression <em>Size Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.SizeOfExpression
   * @generated
   */
  public Adapter createSizeOfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression <em>Boolean List Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.BooleanListExpression
   * @generated
   */
  public Adapter createBooleanListExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.BooleanValue
   * @generated
   */
  public Adapter createBooleanValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.VerifyAction <em>Verify Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.VerifyAction
   * @generated
   */
  public Adapter createVerifyActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.ExistAction <em>Exist Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.ExistAction
   * @generated
   */
  public Adapter createExistActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.GetAction <em>Get Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.GetAction
   * @generated
   */
  public Adapter createGetActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression <em>Binary Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression
   * @generated
   */
  public Adapter createBinaryBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression <em>Binary Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression
   * @generated
   */
  public Adapter createBinaryLogicalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.NegationExpression
   * @generated
   */
  public Adapter createNegationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Assignation <em>Assignation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Assignation
   * @generated
   */
  public Adapter createAssignationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Conditional
   * @generated
   */
  public Adapter createConditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Loop
   * @generated
   */
  public Adapter createLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.Foreach <em>Foreach</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.Foreach
   * @generated
   */
  public Adapter createForeachAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.ActionInstruction <em>Action Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.ActionInstruction
   * @generated
   */
  public Adapter createActionInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.ActionClick <em>Action Click</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.ActionClick
   * @generated
   */
  public Adapter createActionClickAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.ActionOpen <em>Action Open</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.ActionOpen
   * @generated
   */
  public Adapter createActionOpenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.ActionCheck <em>Action Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.ActionCheck
   * @generated
   */
  public Adapter createActionCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.SelectAction <em>Select Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.SelectAction
   * @generated
   */
  public Adapter createSelectActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.selenium.gram.xtext.slnDsl.ActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.selenium.gram.xtext.slnDsl.ActionType
   * @generated
   */
  public Adapter createActionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SlnDslAdapterFactory
