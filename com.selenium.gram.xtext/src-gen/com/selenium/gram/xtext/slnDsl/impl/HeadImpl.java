/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.FunctionName;
import com.selenium.gram.xtext.slnDsl.Head;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;
import com.selenium.gram.xtext.slnDsl.VariableName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.HeadImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.HeadImpl#getVarId <em>Var Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadImpl extends MinimalEObjectImpl.Container implements Head
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected FunctionName name;

  /**
   * The cached value of the '{@link #getVarId() <em>Var Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarId()
   * @generated
   * @ordered
   */
  protected VariableName varId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeadImpl()
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
    return SlnDslPackage.Literals.HEAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(FunctionName newName, NotificationChain msgs)
  {
    FunctionName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.HEAD__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(FunctionName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.HEAD__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.HEAD__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.HEAD__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName getVarId()
  {
    return varId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarId(VariableName newVarId, NotificationChain msgs)
  {
    VariableName oldVarId = varId;
    varId = newVarId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.HEAD__VAR_ID, oldVarId, newVarId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarId(VariableName newVarId)
  {
    if (newVarId != varId)
    {
      NotificationChain msgs = null;
      if (varId != null)
        msgs = ((InternalEObject)varId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.HEAD__VAR_ID, null, msgs);
      if (newVarId != null)
        msgs = ((InternalEObject)newVarId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.HEAD__VAR_ID, null, msgs);
      msgs = basicSetVarId(newVarId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.HEAD__VAR_ID, newVarId, newVarId));
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
      case SlnDslPackage.HEAD__NAME:
        return basicSetName(null, msgs);
      case SlnDslPackage.HEAD__VAR_ID:
        return basicSetVarId(null, msgs);
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
      case SlnDslPackage.HEAD__NAME:
        return getName();
      case SlnDslPackage.HEAD__VAR_ID:
        return getVarId();
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
      case SlnDslPackage.HEAD__NAME:
        setName((FunctionName)newValue);
        return;
      case SlnDslPackage.HEAD__VAR_ID:
        setVarId((VariableName)newValue);
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
      case SlnDslPackage.HEAD__NAME:
        setName((FunctionName)null);
        return;
      case SlnDslPackage.HEAD__VAR_ID:
        setVarId((VariableName)null);
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
      case SlnDslPackage.HEAD__NAME:
        return name != null;
      case SlnDslPackage.HEAD__VAR_ID:
        return varId != null;
    }
    return super.eIsSet(featureID);
  }

} //HeadImpl
