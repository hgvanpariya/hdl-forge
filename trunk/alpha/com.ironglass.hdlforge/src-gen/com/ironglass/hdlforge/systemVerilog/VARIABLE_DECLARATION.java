/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VARIABLE DECLARATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#getVARIABLE_DECLARATION()
 * @model
 * @generated
 */
public interface VARIABLE_DECLARATION extends Module_item
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#getVARIABLE_DECLARATION_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // VARIABLE_DECLARATION
