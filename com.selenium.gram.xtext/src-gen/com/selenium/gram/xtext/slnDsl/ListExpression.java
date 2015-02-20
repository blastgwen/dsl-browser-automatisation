/**
 */
package com.selenium.gram.xtext.slnDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.ListExpression#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.ListExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getListExpression()
 * @model
 * @generated
 */
public interface ListExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' containment reference.
   * @see #setVarName(VariableName)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getListExpression_VarName()
   * @model containment="true"
   * @generated
   */
  VariableName getVarName();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.ListExpression#getVarName <em>Var Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' containment reference.
   * @see #getVarName()
   * @generated
   */
  void setVarName(VariableName value);

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
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getListExpression_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.ListExpression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // ListExpression
