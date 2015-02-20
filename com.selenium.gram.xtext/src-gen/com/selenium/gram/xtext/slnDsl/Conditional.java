/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Conditional#getExp <em>Exp</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Conditional#getTrueIns <em>True Ins</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Conditional#getFalseIns <em>False Ins</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Instruction
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
   * @see #setExp(BooleanExpression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getConditional_Exp()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getExp();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Conditional#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>True Ins</b></em>' containment reference list.
   * The list contents are of type {@link com.selenium.gram.xtext.slnDsl.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True Ins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Ins</em>' containment reference list.
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getConditional_TrueIns()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getTrueIns();

  /**
   * Returns the value of the '<em><b>False Ins</b></em>' containment reference list.
   * The list contents are of type {@link com.selenium.gram.xtext.slnDsl.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False Ins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False Ins</em>' containment reference list.
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getConditional_FalseIns()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getFalseIns();

} // Conditional
