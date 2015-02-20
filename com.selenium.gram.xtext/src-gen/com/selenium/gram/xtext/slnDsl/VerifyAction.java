/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getNameElement <em>Name Element</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getVerifyAction()
 * @model
 * @generated
 */
public interface VerifyAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Element</em>' attribute.
   * @see #setNameElement(String)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getVerifyAction_NameElement()
   * @model
   * @generated
   */
  String getNameElement();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getNameElement <em>Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Element</em>' attribute.
   * @see #getNameElement()
   * @generated
   */
  void setNameElement(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getVerifyAction_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // VerifyAction
