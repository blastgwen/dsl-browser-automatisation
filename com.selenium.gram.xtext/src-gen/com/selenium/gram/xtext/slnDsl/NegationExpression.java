/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.NegationExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getNegationExpression()
 * @model
 * @generated
 */
public interface NegationExpression extends EObject
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
   * @see #setExp(Expression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getNegationExpression_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.NegationExpression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // NegationExpression
