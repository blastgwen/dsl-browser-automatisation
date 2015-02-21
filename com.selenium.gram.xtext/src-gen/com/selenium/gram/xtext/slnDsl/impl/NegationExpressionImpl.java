/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.NegationExpression;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.NegationExpressionImpl#getNegation <em>Negation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegationExpressionImpl extends MinimalEObjectImpl.Container implements NegationExpression
{
  /**
   * The cached value of the '{@link #getNegation() <em>Negation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegation()
   * @generated
   * @ordered
   */
  protected BooleanExpression negation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NegationExpressionImpl()
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
    return SlnDslPackage.Literals.NEGATION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression getNegation()
  {
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNegation(BooleanExpression newNegation, NotificationChain msgs)
  {
    BooleanExpression oldNegation = negation;
    negation = newNegation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.NEGATION_EXPRESSION__NEGATION, oldNegation, newNegation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegation(BooleanExpression newNegation)
  {
    if (newNegation != negation)
    {
      NotificationChain msgs = null;
      if (negation != null)
        msgs = ((InternalEObject)negation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.NEGATION_EXPRESSION__NEGATION, null, msgs);
      if (newNegation != null)
        msgs = ((InternalEObject)newNegation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.NEGATION_EXPRESSION__NEGATION, null, msgs);
      msgs = basicSetNegation(newNegation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.NEGATION_EXPRESSION__NEGATION, newNegation, newNegation));
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
      case SlnDslPackage.NEGATION_EXPRESSION__NEGATION:
        return basicSetNegation(null, msgs);
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
      case SlnDslPackage.NEGATION_EXPRESSION__NEGATION:
        return getNegation();
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
      case SlnDslPackage.NEGATION_EXPRESSION__NEGATION:
        setNegation((BooleanExpression)newValue);
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
      case SlnDslPackage.NEGATION_EXPRESSION__NEGATION:
        setNegation((BooleanExpression)null);
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
      case SlnDslPackage.NEGATION_EXPRESSION__NEGATION:
        return negation != null;
    }
    return super.eIsSet(featureID);
  }

} //NegationExpressionImpl
