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
   * The default value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameElement()
   * @generated
   * @ordered
   */
  protected static final String NAME_ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameElement() <em>Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameElement()
   * @generated
   * @ordered
   */
  protected String nameElement = NAME_ELEMENT_EDEFAULT;

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
  public String getNameElement()
  {
    return nameElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameElement(String newNameElement)
  {
    String oldNameElement = nameElement;
    nameElement = newNameElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT, oldNameElement, nameElement));
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
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        setNameElement((String)newValue);
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
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        setNameElement(NAME_ELEMENT_EDEFAULT);
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
      case SlnDslPackage.VERIFY_ACTION__NAME_ELEMENT:
        return NAME_ELEMENT_EDEFAULT == null ? nameElement != null : !NAME_ELEMENT_EDEFAULT.equals(nameElement);
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
    result.append(" (nameElement: ");
    result.append(nameElement);
    result.append(')');
    return result.toString();
  }

} //VerifyActionImpl
