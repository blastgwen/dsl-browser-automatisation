/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Instruction#getDef <em>Def</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Instruction#getFunc <em>Func</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Instruction#getCond <em>Cond</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Instruction#getLoop <em>Loop</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Instruction#getAct <em>Act</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Instruction#getAss <em>Ass</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(Definition)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getInstruction_Def()
   * @model containment="true"
   * @generated
   */
  Definition getDef();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Instruction#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(Definition value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(FunctionCall)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getInstruction_Func()
   * @model containment="true"
   * @generated
   */
  FunctionCall getFunc();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Instruction#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(FunctionCall value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Conditional)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getInstruction_Cond()
   * @model containment="true"
   * @generated
   */
  Conditional getCond();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Instruction#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Conditional value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(Loop)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getInstruction_Loop()
   * @model containment="true"
   * @generated
   */
  Loop getLoop();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Instruction#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(Loop value);

  /**
   * Returns the value of the '<em><b>Act</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Act</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act</em>' containment reference.
   * @see #setAct(ActionInstruction)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getInstruction_Act()
   * @model containment="true"
   * @generated
   */
  ActionInstruction getAct();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Instruction#getAct <em>Act</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Act</em>' containment reference.
   * @see #getAct()
   * @generated
   */
  void setAct(ActionInstruction value);

  /**
   * Returns the value of the '<em><b>Ass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ass</em>' containment reference.
   * @see #setAss(Assignation)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getInstruction_Ass()
   * @model containment="true"
   * @generated
   */
  Assignation getAss();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Instruction#getAss <em>Ass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ass</em>' containment reference.
   * @see #getAss()
   * @generated
   */
  void setAss(Assignation value);

} // Instruction
