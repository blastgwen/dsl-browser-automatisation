/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.FunctionCall#getRef <em>Ref</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.FunctionCall#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Instruction
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(FunctionReference)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getFunctionCall_Ref()
   * @model containment="true"
   * @generated
   */
  FunctionReference getRef();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.FunctionCall#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(FunctionReference value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link com.selenium.gram.xtext.slnDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getFunctionCall_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // FunctionCall
