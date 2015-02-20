/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.ExistAction;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exist Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.ExistActionImpl#getNameElement <em>Name Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistActionImpl extends MinimalEObjectImpl.Container implements ExistAction
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExistActionImpl()
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
    return SlnDslPackage.Literals.EXIST_ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.EXIST_ACTION__NAME_ELEMENT, oldNameElement, nameElement));
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
      case SlnDslPackage.EXIST_ACTION__NAME_ELEMENT:
        return getNameElement();
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
      case SlnDslPackage.EXIST_ACTION__NAME_ELEMENT:
        setNameElement((String)newValue);
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
      case SlnDslPackage.EXIST_ACTION__NAME_ELEMENT:
        setNameElement(NAME_ELEMENT_EDEFAULT);
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
      case SlnDslPackage.EXIST_ACTION__NAME_ELEMENT:
        return NAME_ELEMENT_EDEFAULT == null ? nameElement != null : !NAME_ELEMENT_EDEFAULT.equals(nameElement);
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

} //ExistActionImpl
