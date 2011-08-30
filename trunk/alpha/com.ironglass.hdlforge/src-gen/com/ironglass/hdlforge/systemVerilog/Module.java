/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.Module#getName <em>Name</em>}</li>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.Module#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.Module#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.Module#getModule_items <em>Module items</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
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
   * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ironglass.hdlforge.systemVerilog.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.ironglass.hdlforge.systemVerilog.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#getModule_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link com.ironglass.hdlforge.systemVerilog.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#getModule_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Module items</b></em>' containment reference list.
   * The list contents are of type {@link com.ironglass.hdlforge.systemVerilog.Module_item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module items</em>' containment reference list.
   * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#getModule_Module_items()
   * @model containment="true"
   * @generated
   */
  EList<Module_item> getModule_items();

} // Module
