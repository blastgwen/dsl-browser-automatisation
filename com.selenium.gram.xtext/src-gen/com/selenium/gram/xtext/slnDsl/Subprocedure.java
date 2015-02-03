/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprocedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Subprocedure#getHead <em>Head</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Subprocedure#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getSubprocedure()
 * @model
 * @generated
 */
public interface Subprocedure extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Head)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getSubprocedure_Head()
   * @model containment="true"
   * @generated
   */
  Head getHead();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Subprocedure#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Head value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Instruction)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getSubprocedure_Body()
   * @model containment="true"
   * @generated
   */
  Instruction getBody();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Subprocedure#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Instruction value);

} // Subprocedure
