/**
 */
package com.selenium.gram.xtext.slnDsl.impl;

import com.selenium.gram.xtext.slnDsl.ActionInstruction;
import com.selenium.gram.xtext.slnDsl.Assignation;
import com.selenium.gram.xtext.slnDsl.Conditional;
import com.selenium.gram.xtext.slnDsl.Definition;
import com.selenium.gram.xtext.slnDsl.FunctionCall;
import com.selenium.gram.xtext.slnDsl.Instruction;
import com.selenium.gram.xtext.slnDsl.Loop;
import com.selenium.gram.xtext.slnDsl.SlnDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl#getDef <em>Def</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl#getAct <em>Act</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.impl.InstructionImpl#getAss <em>Ass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction
{
  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected Definition def;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected FunctionCall func;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Conditional cond;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected Loop loop;

  /**
   * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAct()
   * @generated
   * @ordered
   */
  protected ActionInstruction act;

  /**
   * The cached value of the '{@link #getAss() <em>Ass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAss()
   * @generated
   * @ordered
   */
  protected Assignation ass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionImpl()
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
    return SlnDslPackage.Literals.INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(Definition newDef, NotificationChain msgs)
  {
    Definition oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(Definition newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunc(FunctionCall newFunc, NotificationChain msgs)
  {
    FunctionCall oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__FUNC, oldFunc, newFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(FunctionCall newFunc)
  {
    if (newFunc != func)
    {
      NotificationChain msgs = null;
      if (func != null)
        msgs = ((InternalEObject)func).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__FUNC, null, msgs);
      if (newFunc != null)
        msgs = ((InternalEObject)newFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__FUNC, null, msgs);
      msgs = basicSetFunc(newFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__FUNC, newFunc, newFunc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(Conditional newCond, NotificationChain msgs)
  {
    Conditional oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(Conditional newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(Loop newLoop, NotificationChain msgs)
  {
    Loop oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__LOOP, oldLoop, newLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoop(Loop newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionInstruction getAct()
  {
    return act;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAct(ActionInstruction newAct, NotificationChain msgs)
  {
    ActionInstruction oldAct = act;
    act = newAct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__ACT, oldAct, newAct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAct(ActionInstruction newAct)
  {
    if (newAct != act)
    {
      NotificationChain msgs = null;
      if (act != null)
        msgs = ((InternalEObject)act).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__ACT, null, msgs);
      if (newAct != null)
        msgs = ((InternalEObject)newAct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__ACT, null, msgs);
      msgs = basicSetAct(newAct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__ACT, newAct, newAct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignation getAss()
  {
    return ass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAss(Assignation newAss, NotificationChain msgs)
  {
    Assignation oldAss = ass;
    ass = newAss;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__ASS, oldAss, newAss);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAss(Assignation newAss)
  {
    if (newAss != ass)
    {
      NotificationChain msgs = null;
      if (ass != null)
        msgs = ((InternalEObject)ass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__ASS, null, msgs);
      if (newAss != null)
        msgs = ((InternalEObject)newAss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlnDslPackage.INSTRUCTION__ASS, null, msgs);
      msgs = basicSetAss(newAss, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SlnDslPackage.INSTRUCTION__ASS, newAss, newAss));
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
      case SlnDslPackage.INSTRUCTION__DEF:
        return basicSetDef(null, msgs);
      case SlnDslPackage.INSTRUCTION__FUNC:
        return basicSetFunc(null, msgs);
      case SlnDslPackage.INSTRUCTION__COND:
        return basicSetCond(null, msgs);
      case SlnDslPackage.INSTRUCTION__LOOP:
        return basicSetLoop(null, msgs);
      case SlnDslPackage.INSTRUCTION__ACT:
        return basicSetAct(null, msgs);
      case SlnDslPackage.INSTRUCTION__ASS:
        return basicSetAss(null, msgs);
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
      case SlnDslPackage.INSTRUCTION__DEF:
        return getDef();
      case SlnDslPackage.INSTRUCTION__FUNC:
        return getFunc();
      case SlnDslPackage.INSTRUCTION__COND:
        return getCond();
      case SlnDslPackage.INSTRUCTION__LOOP:
        return getLoop();
      case SlnDslPackage.INSTRUCTION__ACT:
        return getAct();
      case SlnDslPackage.INSTRUCTION__ASS:
        return getAss();
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
      case SlnDslPackage.INSTRUCTION__DEF:
        setDef((Definition)newValue);
        return;
      case SlnDslPackage.INSTRUCTION__FUNC:
        setFunc((FunctionCall)newValue);
        return;
      case SlnDslPackage.INSTRUCTION__COND:
        setCond((Conditional)newValue);
        return;
      case SlnDslPackage.INSTRUCTION__LOOP:
        setLoop((Loop)newValue);
        return;
      case SlnDslPackage.INSTRUCTION__ACT:
        setAct((ActionInstruction)newValue);
        return;
      case SlnDslPackage.INSTRUCTION__ASS:
        setAss((Assignation)newValue);
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
      case SlnDslPackage.INSTRUCTION__DEF:
        setDef((Definition)null);
        return;
      case SlnDslPackage.INSTRUCTION__FUNC:
        setFunc((FunctionCall)null);
        return;
      case SlnDslPackage.INSTRUCTION__COND:
        setCond((Conditional)null);
        return;
      case SlnDslPackage.INSTRUCTION__LOOP:
        setLoop((Loop)null);
        return;
      case SlnDslPackage.INSTRUCTION__ACT:
        setAct((ActionInstruction)null);
        return;
      case SlnDslPackage.INSTRUCTION__ASS:
        setAss((Assignation)null);
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
      case SlnDslPackage.INSTRUCTION__DEF:
        return def != null;
      case SlnDslPackage.INSTRUCTION__FUNC:
        return func != null;
      case SlnDslPackage.INSTRUCTION__COND:
        return cond != null;
      case SlnDslPackage.INSTRUCTION__LOOP:
        return loop != null;
      case SlnDslPackage.INSTRUCTION__ACT:
        return act != null;
      case SlnDslPackage.INSTRUCTION__ASS:
        return ass != null;
    }
    return super.eIsSet(featureID);
  }

} //InstructionImpl
