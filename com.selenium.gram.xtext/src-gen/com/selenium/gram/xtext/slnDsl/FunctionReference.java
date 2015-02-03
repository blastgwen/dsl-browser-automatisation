/**
 */
package com.selenium.gram.xtext.slnDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getVar <em>Var</em>}</li>
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
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Expression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getFunctionReference_Var()
   * @model containment="true"
   * @generated
   */
  Expression getVar();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.FunctionReference#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Expression value);

} // FunctionReference
