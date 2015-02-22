/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.ActionCheck#getElement <em>Element</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.ActionCheck#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getActionCheck()
 * @model
 * @generated
 */
public interface ActionCheck extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Expression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getActionCheck_Element()
   * @model containment="true"
   * @generated
   */
  Expression getElement();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.ActionCheck#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Expression value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(BooleanExpression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getActionCheck_Value()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getValue();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.ActionCheck#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanExpression value);

} // ActionCheck
