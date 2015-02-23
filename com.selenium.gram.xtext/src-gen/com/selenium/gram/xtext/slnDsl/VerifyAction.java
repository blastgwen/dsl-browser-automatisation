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
 *   <li>{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getVerifyType <em>Verify Type</em>}</li>
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
   * Returns the value of the '<em><b>Verify Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verify Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verify Type</em>' attribute.
   * @see #setVerifyType(String)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getVerifyAction_VerifyType()
   * @model
   * @generated
   */
  String getVerifyType();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getVerifyType <em>Verify Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verify Type</em>' attribute.
   * @see #getVerifyType()
   * @generated
   */
  void setVerifyType(String value);

  /**
   * Returns the value of the '<em><b>Name Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Element</em>' containment reference.
   * @see #setNameElement(Expression)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getVerifyAction_NameElement()
   * @model containment="true"
   * @generated
   */
  Expression getNameElement();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.VerifyAction#getNameElement <em>Name Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Element</em>' containment reference.
   * @see #getNameElement()
   * @generated
   */
  void setNameElement(Expression value);

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
