/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Loop#getExp <em>Exp</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Loop#getIns <em>Ins</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getLoop_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Loop#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

  /**
   * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
   * The list contents are of type {@link com.selenium.gram.xtext.slnDsl.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ins</em>' containment reference list.
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getLoop_Ins()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getIns();

} // Loop
