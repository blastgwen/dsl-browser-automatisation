/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exist Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.ExistAction#getSelect <em>Select</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.ExistAction#getNameElement <em>Name Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getExistAction()
 * @model
 * @generated
 */
public interface ExistAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' attribute.
   * @see #setSelect(String)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getExistAction_Select()
   * @model
   * @generated
   */
  String getSelect();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.ExistAction#getSelect <em>Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' attribute.
   * @see #getSelect()
   * @generated
   */
  void setSelect(String value);

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
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getExistAction_NameElement()
   * @model containment="true"
   * @generated
   */
  Expression getNameElement();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.ExistAction#getNameElement <em>Name Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Element</em>' containment reference.
   * @see #getNameElement()
   * @generated
   */
  void setNameElement(Expression value);

} // ExistAction
