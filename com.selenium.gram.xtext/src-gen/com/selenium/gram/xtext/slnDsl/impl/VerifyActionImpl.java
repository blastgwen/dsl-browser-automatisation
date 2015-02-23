/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;
import com.selenium.gram.xtext.slnDsl.VerifyAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verify Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.VerifyActionImpl#getVerifyType <em>Verify Type</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.VerifyActionImpl#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.VerifyActionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerifyActionImpl extends MinimalEObjectImpl.Container implements VerifyAction
{
  /**
   * The default value of the '{@link #getVerifyType() <em>Verify Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerifyType()
   * @generated
   * @ordered
   */
  protected static final String VERIFY_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVerifyType() <em>Verify Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerifyType()
   * @generated
   * @ordered
   */
  protected String verifyType = VERIFY_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameElement() <em>Name Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameElement()
   * @generated
   * @ordered
   */
  protected Expression nameElement;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerifyActionImpl()
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
    return SlnDslPackage.Literals.VERIFY_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVerifyType()
  {
    return verifyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerifyType(String newVerifyType)
  {
    String oldVerifyType = verifyType;
    verifyType = newVerifyType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.VERIFY_ACTION__VERIFY_TYPE, oldVerifyType, verifyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getNameElement()
  {
    return nameElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameElement(Expression newNameElement, NotificationChain msgs)
  {
    Expression oldNameElement = nameElement;
    nameElement = newNameElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT, oldNameElement, newNameElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameElement(Expression newNameElement)
  {
    if (newNameElement != nameElement)
    {
      NotificationChain msgs = null;
      if (nameElement != null)
        msgs = ((InternalEObject)nameElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT, null, msgs);
      if (newNameElement != null)
        msgs = ((InternalEObject)newNameElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT, null, msgs);
      msgs = basicSetNameElement(newNameElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT, newNameElement, newNameElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.VERIFY_ACTION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.VERIFY_ACTION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.VERIFY_ACTION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.VERIFY_ACTION__VALUE, newValue, newValue));
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
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        return basicSetNameElement(null, msgs);
      case SlnDslPackage.VERIFY_ACTION__VALUE:
        return basicSetValue(null, msgs);
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
      case SlnDslPackage.VERIFY_ACTION__VERIFY_TYPE:
        return getVerifyType();
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        return getNameElement();
      case SlnDslPackage.VERIFY_ACTION__VALUE:
        return getValue();
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
      case SlnDslPackage.VERIFY_ACTION__VERIFY_TYPE:
        setVerifyType((String)newValue);
        return;
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        setNameElement((Expression)newValue);
        return;
      case SlnDslPackage.VERIFY_ACTION__VALUE:
        setValue((Expression)newValue);
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
      case SlnDslPackage.VERIFY_ACTION__VERIFY_TYPE:
        setVerifyType(VERIFY_TYPE_EDEFAULT);
        return;
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        setNameElement((Expression)null);
        return;
      case SlnDslPackage.VERIFY_ACTION__VALUE:
        setValue((Expression)null);
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
      case SlnDslPackage.VERIFY_ACTION__VERIFY_TYPE:
        return VERIFY_TYPE_EDEFAULT == null ? verifyType != null : !VERIFY_TYPE_EDEFAULT.equals(verifyType);
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        return nameElement != null;
      case SlnDslPackage.VERIFY_ACTION__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (verifyType: ");
    result.append(verifyType);
    result.append(')');
    return result.toString();
  }

} //VerifyActionImpl
