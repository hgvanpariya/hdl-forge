/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog.util;

import com.ironglass.hdlforge.systemVerilog.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage
 * @generated
 */
public class SystemVerilogSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SystemVerilogPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemVerilogSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SystemVerilogPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SystemVerilogPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.MODULE_ITEM:
      {
        MODULE_ITEM modulE_ITEM = (MODULE_ITEM)theEObject;
        T result = caseMODULE_ITEM(modulE_ITEM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.NON_PORT_MODULE_ITEM:
      {
        NON_PORT_MODULE_ITEM noN_PORT_MODULE_ITEM = (NON_PORT_MODULE_ITEM)theEObject;
        T result = caseNON_PORT_MODULE_ITEM(noN_PORT_MODULE_ITEM);
        if (result == null) result = caseMODULE_ITEM(noN_PORT_MODULE_ITEM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.MODULE_OR_GENERATE_ITEM:
      {
        MODULE_OR_GENERATE_ITEM modulE_OR_GENERATE_ITEM = (MODULE_OR_GENERATE_ITEM)theEObject;
        T result = caseMODULE_OR_GENERATE_ITEM(modulE_OR_GENERATE_ITEM);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(modulE_OR_GENERATE_ITEM);
        if (result == null) result = caseMODULE_ITEM(modulE_OR_GENERATE_ITEM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.MODULE_COMMON_ITEM:
      {
        MODULE_COMMON_ITEM modulE_COMMON_ITEM = (MODULE_COMMON_ITEM)theEObject;
        T result = caseMODULE_COMMON_ITEM(modulE_COMMON_ITEM);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(modulE_COMMON_ITEM);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(modulE_COMMON_ITEM);
        if (result == null) result = caseMODULE_ITEM(modulE_COMMON_ITEM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.CONTINUOUS_ASSIGN:
      {
        CONTINUOUS_ASSIGN continuouS_ASSIGN = (CONTINUOUS_ASSIGN)theEObject;
        T result = caseCONTINUOUS_ASSIGN(continuouS_ASSIGN);
        if (result == null) result = caseMODULE_COMMON_ITEM(continuouS_ASSIGN);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(continuouS_ASSIGN);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(continuouS_ASSIGN);
        if (result == null) result = caseMODULE_ITEM(continuouS_ASSIGN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.LIST_OF_NET_ASSIGNMENTS:
      {
        LIST_OF_NET_ASSIGNMENTS lisT_OF_NET_ASSIGNMENTS = (LIST_OF_NET_ASSIGNMENTS)theEObject;
        T result = caseLIST_OF_NET_ASSIGNMENTS(lisT_OF_NET_ASSIGNMENTS);
        if (result == null) result = caseCONTINUOUS_ASSIGN(lisT_OF_NET_ASSIGNMENTS);
        if (result == null) result = caseMODULE_COMMON_ITEM(lisT_OF_NET_ASSIGNMENTS);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(lisT_OF_NET_ASSIGNMENTS);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(lisT_OF_NET_ASSIGNMENTS);
        if (result == null) result = caseMODULE_ITEM(lisT_OF_NET_ASSIGNMENTS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.MODULE_OR_GENERATE_ITEM_DECLARATION:
      {
        MODULE_OR_GENERATE_ITEM_DECLARATION modulE_OR_GENERATE_ITEM_DECLARATION = (MODULE_OR_GENERATE_ITEM_DECLARATION)theEObject;
        T result = caseMODULE_OR_GENERATE_ITEM_DECLARATION(modulE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseMODULE_COMMON_ITEM(modulE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(modulE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(modulE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseMODULE_ITEM(modulE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.PACKAGE_OR_GENERATE_ITEM_DECLARATION:
      {
        PACKAGE_OR_GENERATE_ITEM_DECLARATION packagE_OR_GENERATE_ITEM_DECLARATION = (PACKAGE_OR_GENERATE_ITEM_DECLARATION)theEObject;
        T result = casePACKAGE_OR_GENERATE_ITEM_DECLARATION(packagE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM_DECLARATION(packagE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseMODULE_COMMON_ITEM(packagE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(packagE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(packagE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = caseMODULE_ITEM(packagE_OR_GENERATE_ITEM_DECLARATION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.NET_DECLARATION:
      {
        NET_DECLARATION neT_DECLARATION = (NET_DECLARATION)theEObject;
        T result = caseNET_DECLARATION(neT_DECLARATION);
        if (result == null) result = casePACKAGE_OR_GENERATE_ITEM_DECLARATION(neT_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM_DECLARATION(neT_DECLARATION);
        if (result == null) result = caseMODULE_COMMON_ITEM(neT_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(neT_DECLARATION);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(neT_DECLARATION);
        if (result == null) result = caseMODULE_ITEM(neT_DECLARATION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.LIST_OF_NET_DECL_ASSIGNMENTS:
      {
        LIST_OF_NET_DECL_ASSIGNMENTS lisT_OF_NET_DECL_ASSIGNMENTS = (LIST_OF_NET_DECL_ASSIGNMENTS)theEObject;
        T result = caseLIST_OF_NET_DECL_ASSIGNMENTS(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = caseNET_DECLARATION(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = casePACKAGE_OR_GENERATE_ITEM_DECLARATION(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM_DECLARATION(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_COMMON_ITEM(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_ITEM(lisT_OF_NET_DECL_ASSIGNMENTS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.NET_DECL_ASSIGNMENT:
      {
        NET_DECL_ASSIGNMENT neT_DECL_ASSIGNMENT = (NET_DECL_ASSIGNMENT)theEObject;
        T result = caseNET_DECL_ASSIGNMENT(neT_DECL_ASSIGNMENT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.UNPACKED_DIMENSIONS:
      {
        UNPACKED_DIMENSIONS unpackeD_DIMENSIONS = (UNPACKED_DIMENSIONS)theEObject;
        T result = caseUNPACKED_DIMENSIONS(unpackeD_DIMENSIONS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.DATA_DECLARATION:
      {
        DATA_DECLARATION datA_DECLARATION = (DATA_DECLARATION)theEObject;
        T result = caseDATA_DECLARATION(datA_DECLARATION);
        if (result == null) result = casePACKAGE_OR_GENERATE_ITEM_DECLARATION(datA_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM_DECLARATION(datA_DECLARATION);
        if (result == null) result = caseMODULE_COMMON_ITEM(datA_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(datA_DECLARATION);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(datA_DECLARATION);
        if (result == null) result = caseMODULE_ITEM(datA_DECLARATION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.VARIABLE_DECLARATION:
      {
        VARIABLE_DECLARATION variablE_DECLARATION = (VARIABLE_DECLARATION)theEObject;
        T result = caseVARIABLE_DECLARATION(variablE_DECLARATION);
        if (result == null) result = caseDATA_DECLARATION(variablE_DECLARATION);
        if (result == null) result = casePACKAGE_OR_GENERATE_ITEM_DECLARATION(variablE_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM_DECLARATION(variablE_DECLARATION);
        if (result == null) result = caseMODULE_COMMON_ITEM(variablE_DECLARATION);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(variablE_DECLARATION);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(variablE_DECLARATION);
        if (result == null) result = caseMODULE_ITEM(variablE_DECLARATION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.LIST_OF_VARIABLE_DECL_ASSIGNMENTS:
      {
        LIST_OF_VARIABLE_DECL_ASSIGNMENTS lisT_OF_VARIABLE_DECL_ASSIGNMENTS = (LIST_OF_VARIABLE_DECL_ASSIGNMENTS)theEObject;
        T result = caseLIST_OF_VARIABLE_DECL_ASSIGNMENTS(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = caseVARIABLE_DECLARATION(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = caseDATA_DECLARATION(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = casePACKAGE_OR_GENERATE_ITEM_DECLARATION(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM_DECLARATION(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_COMMON_ITEM(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_OR_GENERATE_ITEM(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = caseNON_PORT_MODULE_ITEM(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = caseMODULE_ITEM(lisT_OF_VARIABLE_DECL_ASSIGNMENTS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SystemVerilogPackage.VARIABLE_DECL_ASSIGNMENT:
      {
        VARIABLE_DECL_ASSIGNMENT variablE_DECL_ASSIGNMENT = (VARIABLE_DECL_ASSIGNMENT)theEObject;
        T result = caseVARIABLE_DECL_ASSIGNMENT(variablE_DECL_ASSIGNMENT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MODULE ITEM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MODULE ITEM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMODULE_ITEM(MODULE_ITEM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NON PORT MODULE ITEM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NON PORT MODULE ITEM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNON_PORT_MODULE_ITEM(NON_PORT_MODULE_ITEM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MODULE OR GENERATE ITEM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MODULE OR GENERATE ITEM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMODULE_OR_GENERATE_ITEM(MODULE_OR_GENERATE_ITEM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MODULE COMMON ITEM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MODULE COMMON ITEM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMODULE_COMMON_ITEM(MODULE_COMMON_ITEM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CONTINUOUS ASSIGN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CONTINUOUS ASSIGN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCONTINUOUS_ASSIGN(CONTINUOUS_ASSIGN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LIST OF NET ASSIGNMENTS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LIST OF NET ASSIGNMENTS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLIST_OF_NET_ASSIGNMENTS(LIST_OF_NET_ASSIGNMENTS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MODULE OR GENERATE ITEM DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MODULE OR GENERATE ITEM DECLARATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMODULE_OR_GENERATE_ITEM_DECLARATION(MODULE_OR_GENERATE_ITEM_DECLARATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PACKAGE OR GENERATE ITEM DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PACKAGE OR GENERATE ITEM DECLARATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePACKAGE_OR_GENERATE_ITEM_DECLARATION(PACKAGE_OR_GENERATE_ITEM_DECLARATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NET DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NET DECLARATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNET_DECLARATION(NET_DECLARATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LIST OF NET DECL ASSIGNMENTS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LIST OF NET DECL ASSIGNMENTS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLIST_OF_NET_DECL_ASSIGNMENTS(LIST_OF_NET_DECL_ASSIGNMENTS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NET DECL ASSIGNMENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NET DECL ASSIGNMENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNET_DECL_ASSIGNMENT(NET_DECL_ASSIGNMENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UNPACKED DIMENSIONS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UNPACKED DIMENSIONS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUNPACKED_DIMENSIONS(UNPACKED_DIMENSIONS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DATA DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DATA DECLARATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDATA_DECLARATION(DATA_DECLARATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VARIABLE DECLARATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VARIABLE DECLARATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVARIABLE_DECLARATION(VARIABLE_DECLARATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LIST OF VARIABLE DECL ASSIGNMENTS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LIST OF VARIABLE DECL ASSIGNMENTS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLIST_OF_VARIABLE_DECL_ASSIGNMENTS(LIST_OF_VARIABLE_DECL_ASSIGNMENTS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VARIABLE DECL ASSIGNMENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VARIABLE DECL ASSIGNMENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVARIABLE_DECL_ASSIGNMENT(VARIABLE_DECL_ASSIGNMENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SystemVerilogSwitch
