/*
* generated by Xtext
*/
grammar InternalSystemVerilog;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.ironglass.hdlforge.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.ironglass.hdlforge.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;

}

@parser::members {
 
 	private SystemVerilogGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SystemVerilogGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModule
entryRuleModule 
:
{ before(grammarAccess.getModuleRule()); }
	 ruleModule
{ after(grammarAccess.getModuleRule()); } 
	 EOF 
;

// Rule Module
ruleModule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleAccess().getGroup()); }
(rule__Module__Group__0)
{ after(grammarAccess.getModuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModule_item
entryRuleModule_item 
:
{ before(grammarAccess.getModule_itemRule()); }
	 ruleModule_item
{ after(grammarAccess.getModule_itemRule()); } 
	 EOF 
;

// Rule Module_item
ruleModule_item
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModule_itemAccess().getVARIABLE_DECLARATIONParserRuleCall()); }
	ruleVARIABLE_DECLARATION
{ after(grammarAccess.getModule_itemAccess().getVARIABLE_DECLARATIONParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameter
entryRuleParameter 
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterAccess().getNameAssignment()); }
(rule__Parameter__NameAssignment)
{ after(grammarAccess.getParameterAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePort
entryRulePort 
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPortAccess().getGroup()); }
(rule__Port__Group__0)
{ after(grammarAccess.getPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVARIABLE_DECLARATION
entryRuleVARIABLE_DECLARATION 
:
{ before(grammarAccess.getVARIABLE_DECLARATIONRule()); }
	 ruleVARIABLE_DECLARATION
{ after(grammarAccess.getVARIABLE_DECLARATIONRule()); } 
	 EOF 
;

// Rule VARIABLE_DECLARATION
ruleVARIABLE_DECLARATION
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVARIABLE_DECLARATIONAccess().getGroup()); }
(rule__VARIABLE_DECLARATION__Group__0)
{ after(grammarAccess.getVARIABLE_DECLARATIONAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDATA_TYPE
entryRuleDATA_TYPE 
:
{ before(grammarAccess.getDATA_TYPERule()); }
	 ruleDATA_TYPE
{ after(grammarAccess.getDATA_TYPERule()); } 
	 EOF 
;

// Rule DATA_TYPE
ruleDATA_TYPE
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); }
	ruleINTEGER_VECTOR_TYPE
{ after(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleINTEGER_VECTOR_TYPE
entryRuleINTEGER_VECTOR_TYPE 
:
{ before(grammarAccess.getINTEGER_VECTOR_TYPERule()); }
	 ruleINTEGER_VECTOR_TYPE
{ after(grammarAccess.getINTEGER_VECTOR_TYPERule()); } 
	 EOF 
;

// Rule INTEGER_VECTOR_TYPE
ruleINTEGER_VECTOR_TYPE
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getAlternatives()); }
(rule__INTEGER_VECTOR_TYPE__Alternatives)
{ after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMODULE_KEYWORD
entryRuleMODULE_KEYWORD 
:
{ before(grammarAccess.getMODULE_KEYWORDRule()); }
	 ruleMODULE_KEYWORD
{ after(grammarAccess.getMODULE_KEYWORDRule()); } 
	 EOF 
;

// Rule MODULE_KEYWORD
ruleMODULE_KEYWORD
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMODULE_KEYWORDAccess().getAlternatives()); }
(rule__MODULE_KEYWORD__Alternatives)
{ after(grammarAccess.getMODULE_KEYWORDAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePORT_DIRECTION
entryRulePORT_DIRECTION 
:
{ before(grammarAccess.getPORT_DIRECTIONRule()); }
	 rulePORT_DIRECTION
{ after(grammarAccess.getPORT_DIRECTIONRule()); } 
	 EOF 
;

// Rule PORT_DIRECTION
rulePORT_DIRECTION
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPORT_DIRECTIONAccess().getAlternatives()); }
(rule__PORT_DIRECTION__Alternatives)
{ after(grammarAccess.getPORT_DIRECTIONAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__INTEGER_VECTOR_TYPE__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); }

	'bit' 

{ after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); }
)

    |(
{ before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); }

	'logic' 

{ after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); }
)

    |(
{ before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getRegKeyword_2()); }

	'reg' 

{ after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getRegKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MODULE_KEYWORD__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); }

	'module' 

{ after(grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); }
)

    |(
{ before(grammarAccess.getMODULE_KEYWORDAccess().getMacromoduleKeyword_1()); }

	'macromodule' 

{ after(grammarAccess.getMODULE_KEYWORDAccess().getMacromoduleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PORT_DIRECTION__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); }

	'input' 

{ after(grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); }
)

    |(
{ before(grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); }

	'output' 

{ after(grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); }
)

    |(
{ before(grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); }

	'inout' 

{ after(grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); }
)

    |(
{ before(grammarAccess.getPORT_DIRECTIONAccess().getRefKeyword_3()); }

	'ref' 

{ after(grammarAccess.getPORT_DIRECTIONAccess().getRefKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Module__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__0__Impl
	rule__Module__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getMODULE_KEYWORDParserRuleCall_0()); }
	ruleMODULE_KEYWORD
{ after(grammarAccess.getModuleAccess().getMODULE_KEYWORDParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__1__Impl
	rule__Module__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameAssignment_1()); }
(rule__Module__NameAssignment_1)
{ after(grammarAccess.getModuleAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__2__Impl
	rule__Module__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_2()); }
(rule__Module__Group_2__0)?
{ after(grammarAccess.getModuleAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__3__Impl
	rule__Module__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3()); }

	'(' 

{ after(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__4__Impl
	rule__Module__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_4()); }
(rule__Module__Group_4__0)?
{ after(grammarAccess.getModuleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__5__Impl
	rule__Module__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_5()); }

	')' 

{ after(grammarAccess.getModuleAccess().getRightParenthesisKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__6__Impl
	rule__Module__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getModuleAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__7__Impl
	rule__Module__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModule_itemsAssignment_7()); }
(rule__Module__Module_itemsAssignment_7)*
{ after(grammarAccess.getModuleAccess().getModule_itemsAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getEndmoduleKeyword_8()); }

	'endmodule' 

{ after(grammarAccess.getModuleAccess().getEndmoduleKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Module__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2__0__Impl
	rule__Module__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNumberSignLeftParenthesisKeyword_2_0()); }

	'#(' 

{ after(grammarAccess.getModuleAccess().getNumberSignLeftParenthesisKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2__1__Impl
	rule__Module__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getParametersAssignment_2_1()); }
(rule__Module__ParametersAssignment_2_1)
{ after(grammarAccess.getModuleAccess().getParametersAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2__2__Impl
	rule__Module__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_2_2()); }
(rule__Module__Group_2_2__0)*
{ after(grammarAccess.getModuleAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3()); }

	')' 

{ after(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Module__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2_2__0__Impl
	rule__Module__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getModuleAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getParametersAssignment_2_2_1()); }
(rule__Module__ParametersAssignment_2_2_1)
{ after(grammarAccess.getModuleAccess().getParametersAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Module__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4__0__Impl
	rule__Module__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPortsAssignment_4_0()); }
(rule__Module__PortsAssignment_4_0)
{ after(grammarAccess.getModuleAccess().getPortsAssignment_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_4_1()); }
(rule__Module__Group_4_1__0)*
{ after(grammarAccess.getModuleAccess().getGroup_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Module__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4_1__0__Impl
	rule__Module__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getCommaKeyword_4_1_0()); }

	',' 

{ after(grammarAccess.getModuleAccess().getCommaKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPortsAssignment_4_1_1()); }
(rule__Module__PortsAssignment_4_1_1)
{ after(grammarAccess.getModuleAccess().getPortsAssignment_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Port__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__0__Impl
	rule__Port__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getDirectionAssignment_0()); }
(rule__Port__DirectionAssignment_0)
{ after(grammarAccess.getPortAccess().getDirectionAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameAssignment_1()); }
(rule__Port__NameAssignment_1)
{ after(grammarAccess.getPortAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__VARIABLE_DECLARATION__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VARIABLE_DECLARATION__Group__0__Impl
	rule__VARIABLE_DECLARATION__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VARIABLE_DECLARATION__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); }
	ruleDATA_TYPE
{ after(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VARIABLE_DECLARATION__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VARIABLE_DECLARATION__Group__1__Impl
	rule__VARIABLE_DECLARATION__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VARIABLE_DECLARATION__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameAssignment_1()); }
(rule__VARIABLE_DECLARATION__NameAssignment_1)
{ after(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VARIABLE_DECLARATION__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VARIABLE_DECLARATION__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VARIABLE_DECLARATION__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVARIABLE_DECLARATIONAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getVARIABLE_DECLARATIONAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Module__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ParametersAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_1_0()); }
	ruleParameter{ after(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ParametersAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_2_1_0()); }
	ruleParameter{ after(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__PortsAssignment_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_0_0()); }
	rulePort{ after(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__PortsAssignment_4_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_1_1_0()); }
	rulePort{ after(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Module_itemsAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModule_itemsModule_itemParserRuleCall_7_0()); }
	ruleModule_item{ after(grammarAccess.getModuleAccess().getModule_itemsModule_itemParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__DirectionAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); }
	rulePORT_DIRECTION{ after(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VARIABLE_DECLARATION__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


