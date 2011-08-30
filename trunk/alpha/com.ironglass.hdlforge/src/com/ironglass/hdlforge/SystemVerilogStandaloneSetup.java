
package com.ironglass.hdlforge;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SystemVerilogStandaloneSetup extends SystemVerilogStandaloneSetupGenerated{

	public static void doSetup() {
		new SystemVerilogStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

