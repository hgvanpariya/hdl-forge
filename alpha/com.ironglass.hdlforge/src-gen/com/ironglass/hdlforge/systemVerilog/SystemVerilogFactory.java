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
   * Returns a new object of class '<em>MODULE ITEM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MODULE ITEM</em>'.
   * @generated
   */
  MODULE_ITEM createMODULE_ITEM();

  /**
   * Returns a new object of class '<em>NON PORT MODULE ITEM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NON PORT MODULE ITEM</em>'.
   * @generated
   */
  NON_PORT_MODULE_ITEM createNON_PORT_MODULE_ITEM();

  /**
   * Returns a new object of class '<em>MODULE OR GENERATE ITEM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MODULE OR GENERATE ITEM</em>'.
   * @generated
   */
  MODULE_OR_GENERATE_ITEM createMODULE_OR_GENERATE_ITEM();

  /**
   * Returns a new object of class '<em>MODULE COMMON ITEM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MODULE COMMON ITEM</em>'.
   * @generated
   */
  MODULE_COMMON_ITEM createMODULE_COMMON_ITEM();

  /**
   * Returns a new object of class '<em>CONTINUOUS ASSIGN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CONTINUOUS ASSIGN</em>'.
   * @generated
   */
  CONTINUOUS_ASSIGN createCONTINUOUS_ASSIGN();

  /**
   * Returns a new object of class '<em>LIST OF NET ASSIGNMENTS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LIST OF NET ASSIGNMENTS</em>'.
   * @generated
   */
  LIST_OF_NET_ASSIGNMENTS createLIST_OF_NET_ASSIGNMENTS();

  /**
   * Returns a new object of class '<em>MODULE OR GENERATE ITEM DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MODULE OR GENERATE ITEM DECLARATION</em>'.
   * @generated
   */
  MODULE_OR_GENERATE_ITEM_DECLARATION createMODULE_OR_GENERATE_ITEM_DECLARATION();

  /**
   * Returns a new object of class '<em>PACKAGE OR GENERATE ITEM DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PACKAGE OR GENERATE ITEM DECLARATION</em>'.
   * @generated
   */
  PACKAGE_OR_GENERATE_ITEM_DECLARATION createPACKAGE_OR_GENERATE_ITEM_DECLARATION();

  /**
   * Returns a new object of class '<em>NET DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NET DECLARATION</em>'.
   * @generated
   */
  NET_DECLARATION createNET_DECLARATION();

  /**
   * Returns a new object of class '<em>LIST OF NET DECL ASSIGNMENTS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LIST OF NET DECL ASSIGNMENTS</em>'.
   * @generated
   */
  LIST_OF_NET_DECL_ASSIGNMENTS createLIST_OF_NET_DECL_ASSIGNMENTS();

  /**
   * Returns a new object of class '<em>NET DECL ASSIGNMENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NET DECL ASSIGNMENT</em>'.
   * @generated
   */
  NET_DECL_ASSIGNMENT createNET_DECL_ASSIGNMENT();

  /**
   * Returns a new object of class '<em>UNPACKED DIMENSIONS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UNPACKED DIMENSIONS</em>'.
   * @generated
   */
  UNPACKED_DIMENSIONS createUNPACKED_DIMENSIONS();

  /**
   * Returns a new object of class '<em>DATA DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DATA DECLARATION</em>'.
   * @generated
   */
  DATA_DECLARATION createDATA_DECLARATION();

  /**
   * Returns a new object of class '<em>VARIABLE DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VARIABLE DECLARATION</em>'.
   * @generated
   */
  VARIABLE_DECLARATION createVARIABLE_DECLARATION();

  /**
   * Returns a new object of class '<em>LIST OF VARIABLE DECL ASSIGNMENTS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LIST OF VARIABLE DECL ASSIGNMENTS</em>'.
   * @generated
   */
  LIST_OF_VARIABLE_DECL_ASSIGNMENTS createLIST_OF_VARIABLE_DECL_ASSIGNMENTS();

  /**
   * Returns a new object of class '<em>VARIABLE DECL ASSIGNMENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VARIABLE DECL ASSIGNMENT</em>'.
   * @generated
   */
  VARIABLE_DECL_ASSIGNMENT createVARIABLE_DECL_ASSIGNMENT();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SystemVerilogPackage getSystemVerilogPackage();

} //SystemVerilogFactory
