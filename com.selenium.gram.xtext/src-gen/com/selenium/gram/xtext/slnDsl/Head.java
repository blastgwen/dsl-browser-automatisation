/**
 */
package com.selenium.gram.xtext.slnDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Head#getName <em>Name</em>}</li>
 *   <li>{@link com.selenium.gram.xtext.slnDsl.Head#getVarId <em>Var Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(FunctionName)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getHead_Name()
   * @model containment="true"
   * @generated
   */
  FunctionName getName();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Head#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(FunctionName value);

  /**
   * Returns the value of the '<em><b>Var Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Id</em>' containment reference.
   * @see #setVarId(VariableName)
   * @see com.selenium.gram.xtext.slnDsl.SlnDslPackage#getHead_VarId()
   * @model containment="true"
   * @generated
   */
  VariableName getVarId();

  /**
   * Sets the value of the '{@link com.selenium.gram.xtext.slnDsl.Head#getVarId <em>Var Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Id</em>' containment reference.
   * @see #getVarId()
   * @generated
   */
  void setVarId(VariableName value);

} // Head
