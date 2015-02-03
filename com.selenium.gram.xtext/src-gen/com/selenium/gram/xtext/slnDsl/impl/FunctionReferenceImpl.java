/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.FunctionName;
import com.selenium.gram.xtext.slnDsl.FunctionReference;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.FunctionReferenceImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionReferenceImpl extends FunctionCallImpl implements FunctionReference
{
  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected FunctionName functionName;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Expression var;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SlnDslPackage.Literals.FUNCTION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName getFunctionName()
  {
    if (functionName != null && functionName.eIsProxy())
    {
      InternalEObject oldFunctionName = (InternalEObject)functionName;
      functionName = (FunctionName)eResolveProxy(oldFunctionName);
      if (functionName != oldFunctionName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlnDslPackage.FUNCTION_REFERENCE__FUNCTION_NAME, oldFunctionName, functionName));
      }
    }
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName basicGetFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionName(FunctionName newFunctionName)
  {
    FunctionName oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.FUNCTION_REFERENCE__FUNCTION_NAME, oldFunctionName, functionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Expression newVar, NotificationChain msgs)
  {
    Expression oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.FUNCTION_REFERENCE__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Expression newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.FUNCTION_REFERENCE__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.FUNCTION_REFERENCE__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.FUNCTION_REFERENCE__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SlnDslPackage.FUNCTION_REFERENCE__VAR:
        return basicSetVar(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SlnDslPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
        if (resolve) return getFunctionName();
        return basicGetFunctionName();
      case SlnDslPackage.FUNCTION_REFERENCE__VAR:
        return getVar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SlnDslPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
        setFunctionName((FunctionName)newValue);
        return;
      case SlnDslPackage.FUNCTION_REFERENCE__VAR:
        setVar((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SlnDslPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
        setFunctionName((FunctionName)null);
        return;
      case SlnDslPackage.FUNCTION_REFERENCE__VAR:
        setVar((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SlnDslPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
        return functionName != null;
      case SlnDslPackage.FUNCTION_REFERENCE__VAR:
        return var != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionReferenceImpl
