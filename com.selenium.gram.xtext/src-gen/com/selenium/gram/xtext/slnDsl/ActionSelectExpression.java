/**
 */
package com.selenium.gram.xtext.slnDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.ActionSelectExpression#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getActionSelectExpression()
 * @model
 * @generated
 */
public interface ActionSelectExpression extends Expression
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
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getActionSelectExpression_Element()
   * @model containment="true"
   * @generated
   */
  Expression getElement();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.ActionSelectExpression#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Expression value);

} // ActionSelectExpression
