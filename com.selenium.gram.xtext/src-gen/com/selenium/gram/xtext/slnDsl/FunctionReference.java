/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getFunctionReference()
 * @model
 * @generated
 */
public interface FunctionReference extends FunctionCall
{
  /**
   * Returns the value of the '<em><b>Function Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' reference.
   * @see #setFunctionName(FunctionName)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getFunctionReference_FunctionName()
   * @model
   * @generated
   */
  FunctionName getFunctionName();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getFunctionName <em>Function Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' reference.
   * @see #getFunctionName()
   * @generated
   */
  void setFunctionName(FunctionName value);

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
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getFunctionReference_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // FunctionReference
