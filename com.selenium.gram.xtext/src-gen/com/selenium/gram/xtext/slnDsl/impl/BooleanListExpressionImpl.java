/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.BooleanListExpression;
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
 * An implementation of the model object '<em><b>Boolean List Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.BooleanListExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.BooleanListExpressionImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.BooleanListExpressionImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanListExpressionImpl extends MinimalEObjectImpl.Container implements BooleanListExpression
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected VariableName varName;

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
  protected BooleanListExpressionImpl()
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
    return SlnDslPackage.Literals.BOOLEAN_LIST_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.BOOLEAN_LIST_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName getVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarName(VariableName newVarName, NotificationChain msgs)
  {
    VariableName oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME, oldVarName, newVarName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarName(VariableName newVarName)
  {
    if (newVarName != varName)
    {
      NotificationChain msgs = null;
      if (varName != null)
        msgs = ((InternalEObject)varName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME, null, msgs);
      if (newVarName != null)
        msgs = ((InternalEObject)newVarName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME, null, msgs);
      msgs = basicSetVarName(newVarName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME, newVarName, newVarName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP, oldExp, newExp);
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
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP, newExp, newExp));
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
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME:
        return basicSetVarName(null, msgs);
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP:
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
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__OP:
        return getOp();
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME:
        return getVarName();
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP:
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
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME:
        setVarName((VariableName)newValue);
        return;
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP:
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
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME:
        setVarName((VariableName)null);
        return;
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP:
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
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__VAR_NAME:
        return varName != null;
      case SlnDslPackage.BOOLEAN_LIST_EXPRESSION__EXP:
        return exp != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //BooleanListExpressionImpl
