/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Model#getSubs <em>Subs</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Model#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Subs</b></em>' containment reference list.
   * The list contents are of type {@link com.selenium.gram.xtext.slnDsl.Subprocedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subs</em>' containment reference list.
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getModel_Subs()
   * @model containment="true"
   * @generated
   */
  EList<Subprocedure> getSubs();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Instruction)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getModel_Main()
   * @model containment="true"
   * @generated
   */
  Instruction getMain();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Model#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Instruction value);

} // Model
