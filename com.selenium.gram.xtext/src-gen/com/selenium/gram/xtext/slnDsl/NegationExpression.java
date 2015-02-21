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
 *   <li>{@link com.selenium.gram.xtext.slnDsl.NegationExpression#getNegation <em>Negation</em>}</li>
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
   * Returns the value of the '<em><b>Negation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negation</em>' containment reference.
   * @see #setNegation(BooleanExpression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getNegationExpression_Negation()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getNegation();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.NegationExpression#getNegation <em>Negation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negation</em>' containment reference.
   * @see #getNegation()
   * @generated
   */
  void setNegation(BooleanExpression value);

} // NegationExpression
