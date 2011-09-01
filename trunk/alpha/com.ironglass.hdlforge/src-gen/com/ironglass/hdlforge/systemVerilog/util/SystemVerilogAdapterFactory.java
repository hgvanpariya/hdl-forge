/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog.util;

import com.ironglass.hdlforge.systemVerilog.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage
 * @generated
 */
public class SystemVerilogAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SystemVerilogPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemVerilogAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SystemVerilogPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemVerilogSwitch<Adapter> modelSwitch =
    new SystemVerilogSwitch<Adapter>()
    {
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseMODULE_ITEM(MODULE_ITEM object)
      {
        return createMODULE_ITEMAdapter();
      }
      @Override
      public Adapter caseNON_PORT_MODULE_ITEM(NON_PORT_MODULE_ITEM object)
      {
        return createNON_PORT_MODULE_ITEMAdapter();
      }
      @Override
      public Adapter caseMODULE_OR_GENERATE_ITEM(MODULE_OR_GENERATE_ITEM object)
      {
        return createMODULE_OR_GENERATE_ITEMAdapter();
      }
      @Override
      public Adapter caseMODULE_COMMON_ITEM(MODULE_COMMON_ITEM object)
      {
        return createMODULE_COMMON_ITEMAdapter();
      }
      @Override
      public Adapter caseCONTINUOUS_ASSIGN(CONTINUOUS_ASSIGN object)
      {
        return createCONTINUOUS_ASSIGNAdapter();
      }
      @Override
      public Adapter caseLIST_OF_NET_ASSIGNMENTS(LIST_OF_NET_ASSIGNMENTS object)
      {
        return createLIST_OF_NET_ASSIGNMENTSAdapter();
      }
      @Override
      public Adapter caseMODULE_OR_GENERATE_ITEM_DECLARATION(MODULE_OR_GENERATE_ITEM_DECLARATION object)
      {
        return createMODULE_OR_GENERATE_ITEM_DECLARATIONAdapter();
      }
      @Override
      public Adapter casePACKAGE_OR_GENERATE_ITEM_DECLARATION(PACKAGE_OR_GENERATE_ITEM_DECLARATION object)
      {
        return createPACKAGE_OR_GENERATE_ITEM_DECLARATIONAdapter();
      }
      @Override
      public Adapter caseNET_DECLARATION(NET_DECLARATION object)
      {
        return createNET_DECLARATIONAdapter();
      }
      @Override
      public Adapter caseLIST_OF_NET_DECL_ASSIGNMENTS(LIST_OF_NET_DECL_ASSIGNMENTS object)
      {
        return createLIST_OF_NET_DECL_ASSIGNMENTSAdapter();
      }
      @Override
      public Adapter caseNET_DECL_ASSIGNMENT(NET_DECL_ASSIGNMENT object)
      {
        return createNET_DECL_ASSIGNMENTAdapter();
      }
      @Override
      public Adapter caseUNPACKED_DIMENSIONS(UNPACKED_DIMENSIONS object)
      {
        return createUNPACKED_DIMENSIONSAdapter();
      }
      @Override
      public Adapter caseDATA_DECLARATION(DATA_DECLARATION object)
      {
        return createDATA_DECLARATIONAdapter();
      }
      @Override
      public Adapter caseVARIABLE_DECLARATION(VARIABLE_DECLARATION object)
      {
        return createVARIABLE_DECLARATIONAdapter();
      }
      @Override
      public Adapter caseLIST_OF_VARIABLE_DECL_ASSIGNMENTS(LIST_OF_VARIABLE_DECL_ASSIGNMENTS object)
      {
        return createLIST_OF_VARIABLE_DECL_ASSIGNMENTSAdapter();
      }
      @Override
      public Adapter caseVARIABLE_DECL_ASSIGNMENT(VARIABLE_DECL_ASSIGNMENT object)
      {
        return createVARIABLE_DECL_ASSIGNMENTAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_ITEM <em>MODULE ITEM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_ITEM
   * @generated
   */
  public Adapter createMODULE_ITEMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.NON_PORT_MODULE_ITEM <em>NON PORT MODULE ITEM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.NON_PORT_MODULE_ITEM
   * @generated
   */
  public Adapter createNON_PORT_MODULE_ITEMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM <em>MODULE OR GENERATE ITEM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM
   * @generated
   */
  public Adapter createMODULE_OR_GENERATE_ITEMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_COMMON_ITEM <em>MODULE COMMON ITEM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_COMMON_ITEM
   * @generated
   */
  public Adapter createMODULE_COMMON_ITEMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.CONTINUOUS_ASSIGN <em>CONTINUOUS ASSIGN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.CONTINUOUS_ASSIGN
   * @generated
   */
  public Adapter createCONTINUOUS_ASSIGNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS <em>LIST OF NET ASSIGNMENTS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS
   * @generated
   */
  public Adapter createLIST_OF_NET_ASSIGNMENTSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM_DECLARATION <em>MODULE OR GENERATE ITEM DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM_DECLARATION
   * @generated
   */
  public Adapter createMODULE_OR_GENERATE_ITEM_DECLARATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.PACKAGE_OR_GENERATE_ITEM_DECLARATION <em>PACKAGE OR GENERATE ITEM DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.PACKAGE_OR_GENERATE_ITEM_DECLARATION
   * @generated
   */
  public Adapter createPACKAGE_OR_GENERATE_ITEM_DECLARATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.NET_DECLARATION <em>NET DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.NET_DECLARATION
   * @generated
   */
  public Adapter createNET_DECLARATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS <em>LIST OF NET DECL ASSIGNMENTS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS
   * @generated
   */
  public Adapter createLIST_OF_NET_DECL_ASSIGNMENTSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT <em>NET DECL ASSIGNMENT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT
   * @generated
   */
  public Adapter createNET_DECL_ASSIGNMENTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS <em>UNPACKED DIMENSIONS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS
   * @generated
   */
  public Adapter createUNPACKED_DIMENSIONSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.DATA_DECLARATION <em>DATA DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.DATA_DECLARATION
   * @generated
   */
  public Adapter createDATA_DECLARATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION <em>VARIABLE DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION
   * @generated
   */
  public Adapter createVARIABLE_DECLARATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS <em>LIST OF VARIABLE DECL ASSIGNMENTS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS
   * @generated
   */
  public Adapter createLIST_OF_VARIABLE_DECL_ASSIGNMENTSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT <em>VARIABLE DECL ASSIGNMENT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT
   * @generated
   */
  public Adapter createVARIABLE_DECL_ASSIGNMENTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SystemVerilogAdapterFactory
