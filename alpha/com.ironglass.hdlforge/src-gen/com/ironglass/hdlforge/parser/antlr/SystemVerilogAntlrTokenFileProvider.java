/*
* generated by Xtext
*/
package com.ironglass.hdlforge.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SystemVerilogAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.tokens");
	}
}