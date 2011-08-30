/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage
 * @generated
 */
public interface SystemVerilogFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SystemVerilogFactory eINSTANCE = com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Module item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module item</em>'.
   * @generated
   */
  Module_item createModule_item();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>VARIABLE DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VARIABLE DECLARATION</em>'.
   * @generated
   */
  VARIABLE_DECLARATION createVARIABLE_DECLARATION();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SystemVerilogPackage getSystemVerilogPackage();

} //SystemVerilogFactory
