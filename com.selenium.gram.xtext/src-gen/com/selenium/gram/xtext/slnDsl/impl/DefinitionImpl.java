/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.Expression;
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
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl#getVarID <em>Var ID</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.DefinitionImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getVarID() <em>Var ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarID()
   * @generated
   * @ordered
   */
  protected VariableName varID;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expression exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return SlnDslPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName getVarID()
  {
    return varID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarID(VariableName newVarID, NotificationChain msgs)
  {
    VariableName oldVarID = varID;
    varID = newVarID;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.DEFINITION__VAR_ID, oldVarID, newVarID);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarID(VariableName newVarID)
  {
    if (newVarID != varID)
    {
      NotificationChain msgs = null;
      if (varID != null)
        msgs = ((InternalEObject)varID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.DEFINITION__VAR_ID, null, msgs);
      if (newVarID != null)
        msgs = ((InternalEObject)newVarID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.DEFINITION__VAR_ID, null, msgs);
      msgs = basicSetVarID(newVarID, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.DEFINITION__VAR_ID, newVarID, newVarID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs)
  {
    Expression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.DEFINITION__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Expression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.DEFINITION__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.DEFINITION__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.DEFINITION__EXP, newExp, newExp));
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
      case SlnDslPackage.DEFINITION__VAR_ID:
        return basicSetVarID(null, msgs);
      case SlnDslPackage.DEFINITION__EXP:
        return basicSetExp(null, msgs);
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
      case SlnDslPackage.DEFINITION__VAR_ID:
        return getVarID();
      case SlnDslPackage.DEFINITION__EXP:
        return getExp();
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
      case SlnDslPackage.DEFINITION__VAR_ID:
        setVarID((VariableName)newValue);
        return;
      case SlnDslPackage.DEFINITION__EXP:
        setExp((Expression)newValue);
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
      case SlnDslPackage.DEFINITION__VAR_ID:
        setVarID((VariableName)null);
        return;
      case SlnDslPackage.DEFINITION__EXP:
        setExp((Expression)null);
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
      case SlnDslPackage.DEFINITION__VAR_ID:
        return varID != null;
      case SlnDslPackage.DEFINITION__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
