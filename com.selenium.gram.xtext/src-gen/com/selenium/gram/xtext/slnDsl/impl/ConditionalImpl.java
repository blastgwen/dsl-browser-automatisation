/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.BooleanExpression;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl#getTrueIns <em>True Ins</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.ConditionalImpl#getFalseIns <em>False Ins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends InstructionImpl implements Conditional
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected BooleanExpression exp;

  /**
   * The cached value of the '{@link #getTrueIns() <em>True Ins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueIns()
   * @generated
   * @ordered
   */
  protected EList<Instruction> trueIns;

  /**
   * The cached value of the '{@link #getFalseIns() <em>False Ins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseIns()
   * @generated
   * @ordered
   */
  protected EList<Instruction> falseIns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
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
    return SlnDslPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(BooleanExpression newExp, NotificationChain msgs)
  {
    BooleanExpression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.CONDITIONAL__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(BooleanExpression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.CONDITIONAL__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.CONDITIONAL__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.CONDITIONAL__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instruction> getTrueIns()
  {
    if (trueIns == null)
    {
      trueIns = new EObjectContainmentEList<Instruction>(Instruction.class, this, SlnDslPackage.CONDITIONAL__TRUE_INS);
    }
    return trueIns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instruction> getFalseIns()
  {
    if (falseIns == null)
    {
      falseIns = new EObjectContainmentEList<Instruction>(Instruction.class, this, SlnDslPackage.CONDITIONAL__FALSE_INS);
    }
    return falseIns;
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
      case SlnDslPackage.CONDITIONAL__EXP:
        return basicSetExp(null, msgs);
      case SlnDslPackage.CONDITIONAL__TRUE_INS:
        return ((InternalEList<?>)getTrueIns()).basicRemove(otherEnd, msgs);
      case SlnDslPackage.CONDITIONAL__FALSE_INS:
        return ((InternalEList<?>)getFalseIns()).basicRemove(otherEnd, msgs);
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
      case SlnDslPackage.CONDITIONAL__EXP:
        return getExp();
      case SlnDslPackage.CONDITIONAL__TRUE_INS:
        return getTrueIns();
      case SlnDslPackage.CONDITIONAL__FALSE_INS:
        return getFalseIns();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SlnDslPackage.CONDITIONAL__EXP:
        setExp((BooleanExpression)newValue);
        return;
      case SlnDslPackage.CONDITIONAL__TRUE_INS:
        getTrueIns().clear();
        getTrueIns().addAll((Collection<? extends Instruction>)newValue);
        return;
      case SlnDslPackage.CONDITIONAL__FALSE_INS:
        getFalseIns().clear();
        getFalseIns().addAll((Collection<? extends Instruction>)newValue);
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
      case SlnDslPackage.CONDITIONAL__EXP:
        setExp((BooleanExpression)null);
        return;
      case SlnDslPackage.CONDITIONAL__TRUE_INS:
        getTrueIns().clear();
        return;
      case SlnDslPackage.CONDITIONAL__FALSE_INS:
        getFalseIns().clear();
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
      case SlnDslPackage.CONDITIONAL__EXP:
        return exp != null;
      case SlnDslPackage.CONDITIONAL__TRUE_INS:
        return trueIns != null && !trueIns.isEmpty();
      case SlnDslPackage.CONDITIONAL__FALSE_INS:
        return falseIns != null && !falseIns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionalImpl
