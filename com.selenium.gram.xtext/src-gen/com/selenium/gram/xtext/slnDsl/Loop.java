/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Loop#getIns <em>Ins</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Instruction
{
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
