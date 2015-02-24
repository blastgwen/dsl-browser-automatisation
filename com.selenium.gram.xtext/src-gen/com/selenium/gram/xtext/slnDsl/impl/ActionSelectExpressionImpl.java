/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.ActionSelectExpression;
import com.selenium.gram.xtext.slnDsl.Expression;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Select Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.ActionSelectExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.ActionSelectExpressionImpl#getNameElement <em>Name Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionSelectExpressionImpl extends ExpressionImpl implements ActionSelectExpression
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionSelectExpressionImpl()
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
    return SlnDslPackage.Literals.ACTION_SELECT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.ACTION_SELECT_EXPRESSION__TYPE, oldType, type));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT, oldNameElement, newNameElement);
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
        msgs = ((InternalEObject)nameElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT, null, msgs);
      if (newNameElement != null)
        msgs = ((InternalEObject)newNameElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT, null, msgs);
      msgs = basicSetNameElement(newNameElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT, newNameElement, newNameElement));
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
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT:
        return basicSetNameElement(null, msgs);
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
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__TYPE:
        return getType();
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT:
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
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__TYPE:
        setType((String)newValue);
        return;
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT:
        setNameElement((Expression)newValue);
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
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT:
        setNameElement((Expression)null);
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
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case SlnDslPackage.ACTION_SELECT_EXPRESSION__NAME_ELEMENT:
        return nameElement != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ActionSelectExpressionImpl
