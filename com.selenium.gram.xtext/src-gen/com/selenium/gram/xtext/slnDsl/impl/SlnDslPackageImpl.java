/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.ActionCheck;
import com.selenium.gram.xtext.slnDsl.ActionClick;
import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.ActionOpen;
import com.selenium.gram.xtext.slnDsl.ActionSelectExpression;
import com.selenium.gram.xtext.slnDsl.ActionType;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.BinaryBooleanExpression;
import com.selenium.gram.xtext.slnDsl.BinaryLogicalExpression;
import com.selenium.gram.xtext.slnDsl.Body;
import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.BooleanListExpression;
import com.selenium.gram.xtext.slnDsl.BooleanValue;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.ExistAction;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.Foreach;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.FunctionName;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.Head;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.ListExpression;
import com.selenium.gram.xtext.slnDsl.Loop;
import com.selenium.gram.xtext.slnDsl.Model;
import com.selenium.gram.xtext.slnDsl.NegationExpression;
import com.selenium.gram.xtext.slnDsl.NumLiteralExpression;
import com.selenium.gram.xtext.slnDsl.SlnDslFactory;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;
import com.selenium.gram.xtext.slnDsl.Subprocedure;
import com.selenium.gram.xtext.slnDsl.VariableName;
import com.selenium.gram.xtext.slnDsl.VariableReference;
import com.selenium.gram.xtext.slnDsl.VerifyAction;
import com.selenium.gram.xtext.slnDsl.While;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlnDslPackageImpl extends EPackageImpl implements SlnDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subprocedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanListExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verifyActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryBooleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryLogicalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionClickEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionOpenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionSelectExpressionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SlnDslPackageImpl()
  {
    super(eNS_URI, SlnDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SlnDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SlnDslPackage init()
  {
    if (isInited) return (SlnDslPackage)EPackage.Registry.INSTANCE.getEPackage(SlnDslPackage.eNS_URI);

    // Obtain or create and register package
    SlnDslPackageImpl theSlnDslPackage = (SlnDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SlnDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SlnDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSlnDslPackage.createPackageContents();

    // Initialize created meta-data
    theSlnDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSlnDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SlnDslPackage.eNS_URI, theSlnDslPackage);
    return theSlnDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Subs()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Body()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubprocedure()
  {
    return subprocedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubprocedure_Head()
  {
    return (EReference)subprocedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubprocedure_Body()
  {
    return (EReference)subprocedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Defs()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Instructions()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHead()
  {
    return headEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHead_Name()
  {
    return (EReference)headEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHead_ArgsID()
  {
    return (EReference)headEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionReference()
  {
    return functionReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionReference_FunctionName()
  {
    return (EReference)functionReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionName()
  {
    return functionNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionName_Name()
  {
    return (EAttribute)functionNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionCall()
  {
    return functionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCall_Ref()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCall_Args()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableReference()
  {
    return variableReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableReference_VarID()
  {
    return (EReference)variableReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableName()
  {
    return variableNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableName_Name()
  {
    return (EAttribute)variableNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumLiteralExpression()
  {
    return numLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumLiteralExpression_Value()
  {
    return (EAttribute)numLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListExpression()
  {
    return listExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListExpression_Exp()
  {
    return (EReference)listExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanListExpression()
  {
    return booleanListExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanListExpression_Op()
  {
    return (EAttribute)booleanListExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanListExpression_VarName()
  {
    return (EReference)booleanListExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanListExpression_Exp()
  {
    return (EReference)booleanListExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression()
  {
    return booleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpression_Exp()
  {
    return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanValue()
  {
    return booleanValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanValue_Value()
  {
    return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerifyAction()
  {
    return verifyActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerifyAction_NameElement()
  {
    return (EAttribute)verifyActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerifyAction_Value()
  {
    return (EReference)verifyActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExistAction()
  {
    return existActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExistAction_NameElement()
  {
    return (EAttribute)existActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryBooleanExpression()
  {
    return binaryBooleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryBooleanExpression_Op()
  {
    return (EAttribute)binaryBooleanExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryBooleanExpression_Left()
  {
    return (EReference)binaryBooleanExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryBooleanExpression_Right()
  {
    return (EReference)binaryBooleanExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryLogicalExpression()
  {
    return binaryLogicalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryLogicalExpression_Op()
  {
    return (EAttribute)binaryLogicalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryLogicalExpression_Left()
  {
    return (EReference)binaryLogicalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryLogicalExpression_Right()
  {
    return (EReference)binaryLogicalExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegationExpression()
  {
    return negationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegationExpression_Negation()
  {
    return (EReference)negationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_VarID()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Exp()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignation()
  {
    return assignationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignation_Var()
  {
    return (EReference)assignationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignation_Exp()
  {
    return (EReference)assignationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional()
  {
    return conditionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_Exp()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_TrueIns()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_FalseIns()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoop()
  {
    return loopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoop_Ins()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile()
  {
    return whileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Cond()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeach()
  {
    return foreachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeach_Var()
  {
    return (EReference)foreachEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeach_Exp()
  {
    return (EReference)foreachEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionInstruction()
  {
    return actionInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionInstruction_Action()
  {
    return (EReference)actionInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionClick()
  {
    return actionClickEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionClick_Type()
  {
    return (EAttribute)actionClickEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionClick_Element()
  {
    return (EAttribute)actionClickEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionOpen()
  {
    return actionOpenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionOpen_Url()
  {
    return (EAttribute)actionOpenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionCheck()
  {
    return actionCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionCheck_Element()
  {
    return (EReference)actionCheckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionCheck_Value()
  {
    return (EReference)actionCheckEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionType()
  {
    return actionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionType_NameElement()
  {
    return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_Value()
  {
    return (EReference)actionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionSelectExpression()
  {
    return actionSelectExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionSelectExpression_Element()
  {
    return (EReference)actionSelectExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlnDslFactory getSlnDslFactory()
  {
    return (SlnDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__SUBS);
    createEReference(modelEClass, MODEL__BODY);

    subprocedureEClass = createEClass(SUBPROCEDURE);
    createEReference(subprocedureEClass, SUBPROCEDURE__HEAD);
    createEReference(subprocedureEClass, SUBPROCEDURE__BODY);

    bodyEClass = createEClass(BODY);
    createEReference(bodyEClass, BODY__DEFS);
    createEReference(bodyEClass, BODY__INSTRUCTIONS);

    headEClass = createEClass(HEAD);
    createEReference(headEClass, HEAD__NAME);
    createEReference(headEClass, HEAD__ARGS_ID);

    functionReferenceEClass = createEClass(FUNCTION_REFERENCE);
    createEReference(functionReferenceEClass, FUNCTION_REFERENCE__FUNCTION_NAME);

    functionNameEClass = createEClass(FUNCTION_NAME);
    createEAttribute(functionNameEClass, FUNCTION_NAME__NAME);

    functionCallEClass = createEClass(FUNCTION_CALL);
    createEReference(functionCallEClass, FUNCTION_CALL__REF);
    createEReference(functionCallEClass, FUNCTION_CALL__ARGS);

    variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
    createEReference(variableReferenceEClass, VARIABLE_REFERENCE__VAR_ID);

    variableNameEClass = createEClass(VARIABLE_NAME);
    createEAttribute(variableNameEClass, VARIABLE_NAME__NAME);

    expressionEClass = createEClass(EXPRESSION);

    numLiteralExpressionEClass = createEClass(NUM_LITERAL_EXPRESSION);
    createEAttribute(numLiteralExpressionEClass, NUM_LITERAL_EXPRESSION__VALUE);

    listExpressionEClass = createEClass(LIST_EXPRESSION);
    createEReference(listExpressionEClass, LIST_EXPRESSION__EXP);

    booleanListExpressionEClass = createEClass(BOOLEAN_LIST_EXPRESSION);
    createEAttribute(booleanListExpressionEClass, BOOLEAN_LIST_EXPRESSION__OP);
    createEReference(booleanListExpressionEClass, BOOLEAN_LIST_EXPRESSION__VAR_NAME);
    createEReference(booleanListExpressionEClass, BOOLEAN_LIST_EXPRESSION__EXP);

    booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
    createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__EXP);

    booleanValueEClass = createEClass(BOOLEAN_VALUE);
    createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

    verifyActionEClass = createEClass(VERIFY_ACTION);
    createEAttribute(verifyActionEClass, VERIFY_ACTION__NAME_ELEMENT);
    createEReference(verifyActionEClass, VERIFY_ACTION__VALUE);

    existActionEClass = createEClass(EXIST_ACTION);
    createEAttribute(existActionEClass, EXIST_ACTION__NAME_ELEMENT);

    binaryBooleanExpressionEClass = createEClass(BINARY_BOOLEAN_EXPRESSION);
    createEAttribute(binaryBooleanExpressionEClass, BINARY_BOOLEAN_EXPRESSION__OP);
    createEReference(binaryBooleanExpressionEClass, BINARY_BOOLEAN_EXPRESSION__LEFT);
    createEReference(binaryBooleanExpressionEClass, BINARY_BOOLEAN_EXPRESSION__RIGHT);

    binaryLogicalExpressionEClass = createEClass(BINARY_LOGICAL_EXPRESSION);
    createEAttribute(binaryLogicalExpressionEClass, BINARY_LOGICAL_EXPRESSION__OP);
    createEReference(binaryLogicalExpressionEClass, BINARY_LOGICAL_EXPRESSION__LEFT);
    createEReference(binaryLogicalExpressionEClass, BINARY_LOGICAL_EXPRESSION__RIGHT);

    negationExpressionEClass = createEClass(NEGATION_EXPRESSION);
    createEReference(negationExpressionEClass, NEGATION_EXPRESSION__NEGATION);

    instructionEClass = createEClass(INSTRUCTION);

    definitionEClass = createEClass(DEFINITION);
    createEReference(definitionEClass, DEFINITION__VAR_ID);
    createEReference(definitionEClass, DEFINITION__EXP);

    assignationEClass = createEClass(ASSIGNATION);
    createEReference(assignationEClass, ASSIGNATION__VAR);
    createEReference(assignationEClass, ASSIGNATION__EXP);

    conditionalEClass = createEClass(CONDITIONAL);
    createEReference(conditionalEClass, CONDITIONAL__EXP);
    createEReference(conditionalEClass, CONDITIONAL__TRUE_INS);
    createEReference(conditionalEClass, CONDITIONAL__FALSE_INS);

    loopEClass = createEClass(LOOP);
    createEReference(loopEClass, LOOP__INS);

    whileEClass = createEClass(WHILE);
    createEReference(whileEClass, WHILE__COND);

    foreachEClass = createEClass(FOREACH);
    createEReference(foreachEClass, FOREACH__VAR);
    createEReference(foreachEClass, FOREACH__EXP);

    actionInstructionEClass = createEClass(ACTION_INSTRUCTION);
    createEReference(actionInstructionEClass, ACTION_INSTRUCTION__ACTION);

    actionClickEClass = createEClass(ACTION_CLICK);
    createEAttribute(actionClickEClass, ACTION_CLICK__TYPE);
    createEAttribute(actionClickEClass, ACTION_CLICK__ELEMENT);

    actionOpenEClass = createEClass(ACTION_OPEN);
    createEAttribute(actionOpenEClass, ACTION_OPEN__URL);

    actionCheckEClass = createEClass(ACTION_CHECK);
    createEReference(actionCheckEClass, ACTION_CHECK__ELEMENT);
    createEReference(actionCheckEClass, ACTION_CHECK__VALUE);

    actionTypeEClass = createEClass(ACTION_TYPE);
    createEAttribute(actionTypeEClass, ACTION_TYPE__NAME_ELEMENT);
    createEReference(actionTypeEClass, ACTION_TYPE__VALUE);

    actionSelectExpressionEClass = createEClass(ACTION_SELECT_EXPRESSION);
    createEReference(actionSelectExpressionEClass, ACTION_SELECT_EXPRESSION__ELEMENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    functionCallEClass.getESuperTypes().add(this.getInstruction());
    variableReferenceEClass.getESuperTypes().add(this.getExpression());
    numLiteralExpressionEClass.getESuperTypes().add(this.getExpression());
    listExpressionEClass.getESuperTypes().add(this.getExpression());
    booleanExpressionEClass.getESuperTypes().add(this.getExpression());
    assignationEClass.getESuperTypes().add(this.getInstruction());
    conditionalEClass.getESuperTypes().add(this.getInstruction());
    loopEClass.getESuperTypes().add(this.getInstruction());
    whileEClass.getESuperTypes().add(this.getLoop());
    foreachEClass.getESuperTypes().add(this.getLoop());
    actionInstructionEClass.getESuperTypes().add(this.getInstruction());
    actionSelectExpressionEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Subs(), this.getSubprocedure(), null, "subs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Body(), this.getBody(), null, "body", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subprocedureEClass, Subprocedure.class, "Subprocedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubprocedure_Head(), this.getHead(), null, "head", null, 0, 1, Subprocedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubprocedure_Body(), this.getBody(), null, "body", null, 0, 1, Subprocedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBody_Defs(), this.getDefinition(), null, "defs", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHead_Name(), this.getFunctionName(), null, "name", null, 0, 1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHead_ArgsID(), this.getVariableName(), null, "argsID", null, 0, -1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionReferenceEClass, FunctionReference.class, "FunctionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionReference_FunctionName(), this.getFunctionName(), null, "functionName", null, 0, 1, FunctionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionNameEClass, FunctionName.class, "FunctionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionName_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionCall_Ref(), this.getFunctionReference(), null, "ref", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionCall_Args(), this.getExpression(), null, "args", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableReference_VarID(), this.getVariableName(), null, "varID", null, 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableNameEClass, VariableName.class, "VariableName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableName_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numLiteralExpressionEClass, NumLiteralExpression.class, "NumLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumLiteralExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, NumLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listExpressionEClass, ListExpression.class, "ListExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListExpression_Exp(), this.getExpression(), null, "exp", null, 0, 1, ListExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanListExpressionEClass, BooleanListExpression.class, "BooleanListExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanListExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, BooleanListExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanListExpression_VarName(), this.getVariableName(), null, "varName", null, 0, 1, BooleanListExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanListExpression_Exp(), this.getExpression(), null, "exp", null, 0, 1, BooleanListExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanExpression_Exp(), ecorePackage.getEObject(), null, "exp", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verifyActionEClass, VerifyAction.class, "VerifyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVerifyAction_NameElement(), ecorePackage.getEString(), "nameElement", null, 0, 1, VerifyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerifyAction_Value(), this.getExpression(), null, "value", null, 0, 1, VerifyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(existActionEClass, ExistAction.class, "ExistAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExistAction_NameElement(), ecorePackage.getEString(), "nameElement", null, 0, 1, ExistAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryBooleanExpressionEClass, BinaryBooleanExpression.class, "BinaryBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryBooleanExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, BinaryBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryBooleanExpression_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryBooleanExpression_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryLogicalExpressionEClass, BinaryLogicalExpression.class, "BinaryLogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryLogicalExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, BinaryLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryLogicalExpression_Left(), this.getBooleanExpression(), null, "left", null, 0, 1, BinaryLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryLogicalExpression_Right(), this.getBooleanExpression(), null, "right", null, 0, 1, BinaryLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negationExpressionEClass, NegationExpression.class, "NegationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegationExpression_Negation(), this.getBooleanExpression(), null, "negation", null, 0, 1, NegationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinition_VarID(), this.getVariableName(), null, "varID", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinition_Exp(), this.getExpression(), null, "exp", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignationEClass, Assignation.class, "Assignation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignation_Var(), this.getVariableReference(), null, "var", null, 0, 1, Assignation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignation_Exp(), this.getExpression(), null, "exp", null, 0, 1, Assignation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditional_Exp(), this.getBooleanExpression(), null, "exp", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_TrueIns(), this.getInstruction(), null, "trueIns", null, 0, -1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_FalseIns(), this.getInstruction(), null, "falseIns", null, 0, -1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoop_Ins(), this.getInstruction(), null, "ins", null, 0, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhile_Cond(), this.getBooleanExpression(), null, "cond", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreachEClass, Foreach.class, "Foreach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForeach_Var(), this.getVariableName(), null, "var", null, 0, 1, Foreach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeach_Exp(), this.getExpression(), null, "exp", null, 0, 1, Foreach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionInstructionEClass, ActionInstruction.class, "ActionInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionInstruction_Action(), ecorePackage.getEObject(), null, "action", null, 0, 1, ActionInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionClickEClass, ActionClick.class, "ActionClick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionClick_Type(), ecorePackage.getEString(), "type", null, 0, 1, ActionClick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionClick_Element(), ecorePackage.getEString(), "element", null, 0, 1, ActionClick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionOpenEClass, ActionOpen.class, "ActionOpen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionOpen_Url(), ecorePackage.getEString(), "url", null, 0, 1, ActionOpen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionCheckEClass, ActionCheck.class, "ActionCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionCheck_Element(), this.getExpression(), null, "element", null, 0, 1, ActionCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionCheck_Value(), this.getBooleanExpression(), null, "value", null, 0, 1, ActionCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionType_NameElement(), ecorePackage.getEString(), "nameElement", null, 0, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionType_Value(), this.getExpression(), null, "value", null, 0, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionSelectExpressionEClass, ActionSelectExpression.class, "ActionSelectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionSelectExpression_Element(), this.getExpression(), null, "element", null, 0, 1, ActionSelectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SlnDslPackageImpl
