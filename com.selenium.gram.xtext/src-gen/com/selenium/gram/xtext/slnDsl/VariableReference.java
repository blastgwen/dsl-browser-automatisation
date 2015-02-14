/**
 */
package com.selenium.gram.xtext.slnDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.VariableReference#getVarID <em>Var ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Var ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var ID</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var ID</em>' reference.
   * @see #setVarID(VariableName)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getVariableReference_VarID()
   * @model
   * @generated
   */
  VariableName getVarID();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.VariableReference#getVarID <em>Var ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var ID</em>' reference.
   * @see #getVarID()
   * @generated
   */
  void setVarID(VariableName value);

} // VariableReference
