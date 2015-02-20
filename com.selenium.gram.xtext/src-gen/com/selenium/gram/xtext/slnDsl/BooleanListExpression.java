/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean List Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getOp <em>Op</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getBooleanListExpression()
 * @model
 * @generated
 */
public interface BooleanListExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getBooleanListExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

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
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getBooleanListExpression_VarName()
   * @model containment="true"
   * @generated
   */
  VariableName getVarName();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getVarName <em>Var Name</em>}' containment reference.
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
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getBooleanListExpression_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.BooleanListExpression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // BooleanListExpression
