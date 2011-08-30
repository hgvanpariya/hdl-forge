/*
* generated by Xtext
*/

package com.ironglass.hdlforge.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SystemVerilogGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Module");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMODULE_KEYWORDParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cNumberSignLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cParametersAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_2_1_0 = (RuleCall)cParametersAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cParametersAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_2_2_1_0 = (RuleCall)cParametersAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cPortsAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cPortsPortParserRuleCall_4_0_0 = (RuleCall)cPortsAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cPortsAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cPortsPortParserRuleCall_4_1_1_0 = (RuleCall)cPortsAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cModule_itemsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cModule_itemsModule_itemParserRuleCall_7_0 = (RuleCall)cModule_itemsAssignment_7.eContents().get(0);
		private final Keyword cEndmoduleKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Module:
		//	MODULE_KEYWORD name=ID ("#(" parameters+=Parameter ("," parameters+=Parameter)* ")")? "(" (ports+=Port (","
		//	ports+=Port)*)? ")" ";" module_items+=Module_item* "endmodule";
		public ParserRule getRule() { return rule; }

		//MODULE_KEYWORD name=ID ("#(" parameters+=Parameter ("," parameters+=Parameter)* ")")? "(" (ports+=Port (","
		//ports+=Port)*)? ")" ";" module_items+=Module_item* "endmodule"
		public Group getGroup() { return cGroup; }

		//MODULE_KEYWORD
		public RuleCall getMODULE_KEYWORDParserRuleCall_0() { return cMODULE_KEYWORDParserRuleCall_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("#(" parameters+=Parameter ("," parameters+=Parameter)* ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"#("
		public Keyword getNumberSignLeftParenthesisKeyword_2_0() { return cNumberSignLeftParenthesisKeyword_2_0; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_2_1() { return cParametersAssignment_2_1; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_2_1_0() { return cParametersParameterParserRuleCall_2_1_0; }

		//("," parameters+=Parameter)*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_2_2_1() { return cParametersAssignment_2_2_1; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_2_2_1_0() { return cParametersParameterParserRuleCall_2_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//(ports+=Port ("," ports+=Port)*)?
		public Group getGroup_4() { return cGroup_4; }

		//ports+=Port
		public Assignment getPortsAssignment_4_0() { return cPortsAssignment_4_0; }

		//Port
		public RuleCall getPortsPortParserRuleCall_4_0_0() { return cPortsPortParserRuleCall_4_0_0; }

		//("," ports+=Port)*
		public Group getGroup_4_1() { return cGroup_4_1; }

		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }

		//ports+=Port
		public Assignment getPortsAssignment_4_1_1() { return cPortsAssignment_4_1_1; }

		//Port
		public RuleCall getPortsPortParserRuleCall_4_1_1_0() { return cPortsPortParserRuleCall_4_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }

		//module_items+=Module_item*
		public Assignment getModule_itemsAssignment_7() { return cModule_itemsAssignment_7; }

		//Module_item
		public RuleCall getModule_itemsModule_itemParserRuleCall_7_0() { return cModule_itemsModule_itemParserRuleCall_7_0; }

		//"endmodule"
		public Keyword getEndmoduleKeyword_8() { return cEndmoduleKeyword_8; }
	}

	public class Module_itemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Module_item");
		private final RuleCall cVARIABLE_DECLARATIONParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Module_item:
		//	VARIABLE_DECLARATION;
		public ParserRule getRule() { return rule; }

		//VARIABLE_DECLARATION
		public RuleCall getVARIABLE_DECLARATIONParserRuleCall() { return cVARIABLE_DECLARATIONParserRuleCall; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Parameter:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class PortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Port");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDirectionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDirectionPORT_DIRECTIONParserRuleCall_0_0 = (RuleCall)cDirectionAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Port:
		//	direction=PORT_DIRECTION name=ID;
		public ParserRule getRule() { return rule; }

		//direction=PORT_DIRECTION name=ID
		public Group getGroup() { return cGroup; }

		//direction=PORT_DIRECTION
		public Assignment getDirectionAssignment_0() { return cDirectionAssignment_0; }

		//PORT_DIRECTION
		public RuleCall getDirectionPORT_DIRECTIONParserRuleCall_0_0() { return cDirectionPORT_DIRECTIONParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class VARIABLE_DECLARATIONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VARIABLE_DECLARATION");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDATA_TYPEParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		/// *
		// * Keywords
		// * / VARIABLE_DECLARATION:
		//	DATA_TYPE name=ID ";";
		public ParserRule getRule() { return rule; }

		//DATA_TYPE name=ID ";"
		public Group getGroup() { return cGroup; }

		//DATA_TYPE
		public RuleCall getDATA_TYPEParserRuleCall_0() { return cDATA_TYPEParserRuleCall_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class DATA_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DATA_TYPE");
		private final RuleCall cINTEGER_VECTOR_TYPEParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DATA_TYPE:
		//	INTEGER_VECTOR_TYPE;
		public ParserRule getRule() { return rule; }

		//INTEGER_VECTOR_TYPE
		public RuleCall getINTEGER_VECTOR_TYPEParserRuleCall() { return cINTEGER_VECTOR_TYPEParserRuleCall; }
	}

	public class INTEGER_VECTOR_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER_VECTOR_TYPE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cBitKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cLogicKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cRegKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//INTEGER_VECTOR_TYPE:
		//	"bit" | "logic" | "reg";
		public ParserRule getRule() { return rule; }

		//"bit" | "logic" | "reg"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"bit"
		public Keyword getBitKeyword_0() { return cBitKeyword_0; }

		//"logic"
		public Keyword getLogicKeyword_1() { return cLogicKeyword_1; }

		//"reg"
		public Keyword getRegKeyword_2() { return cRegKeyword_2; }
	}

	public class MODULE_KEYWORDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MODULE_KEYWORD");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cModuleKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cMacromoduleKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//MODULE_KEYWORD:
		//	"module" | "macromodule";
		public ParserRule getRule() { return rule; }

		//"module" | "macromodule"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"module"
		public Keyword getModuleKeyword_0() { return cModuleKeyword_0; }

		//"macromodule"
		public Keyword getMacromoduleKeyword_1() { return cMacromoduleKeyword_1; }
	}

	public class PORT_DIRECTIONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PORT_DIRECTION");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cInputKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cOutputKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cInoutKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cRefKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		/// *
		// * Some added terminals, should add this to a separate file maybe?
		// * / / *
		//terminal ASSIGNMENT_OPERATOR: 
		//	'=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '<<<=' | '>>>='
		//;
		// 
		//terminal UNARY_OPERATOR: 
		//	'+' | '-' | '!' | '~' | '&' | '~&' | '|' | '~|' | '^' | '~^' | '^~'
		//; 
		//
		//terminal BINARY_OPERATOR: 
		//	'+' | '-' | '*' | '/' | '%' | '==' | '!='| '===' | '!==' | '=?=' | '!?=' | '&&' | '||' | '**' 
		//	| '<' | '<=' | '>' | '>=' | '&' | '|' | '^' | '^~' | '~^' | '>>' | '<<' | '>>>' | '<<<' 
		//;
		//
		//terminal INC_OR_DEC_OPERATOR:
		//	'++' | '--'
		//;
		// 
		//terminal UNARY_MODULE_PATH_OPERATOR: 
		//	'!' | '~' | '&' | '~&' | '|' | '~|' | '^' | '~^' | '^~'
		//; 
		//
		//terminal BINARY_MODULE_PATH_OPERATOR: 
		//	'==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '^~' | '~^'
		//; 
		//
		//terminal CMOS_SWITCHTYPE: 
		//	'cmos' | 'rcmos'
		//; 
		//
		//terminal ENABLE_GATETYPE: 
		//	'bufif0' | 'bufif1' | 'notif0' | 'notif1'
		//; 
		//
		//terminal MOS_SWITCHTYPE: 
		//	'nmos' | 'pmos' | 'rnmos' | 'rpmos'
		//; 
		//
		//terminal N_INPUT_GATETYPE: 
		//	'and' | 'nand' | 'or' | 'nor' | 'xor' | 'xnor'
		//; 
		//
		//terminal N_OUTPUT_GATETYPE: 
		//	'buf' | 'not'
		//; 
		//
		//terminal PASS_EN_SWITCHTYPE: 
		//	'tranif0' | 'tranif1' | 'rtranif1' | 'rtranif0'
		//; 
		//
		//terminal PASS_SWITCHTYPE: 
		//	'tran' | 'rtran'
		//;
		// * / PORT_DIRECTION:
		//	"input" | "output" | "inout" | "ref";
		public ParserRule getRule() { return rule; }

		//"input" | "output" | "inout" | "ref"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"input"
		public Keyword getInputKeyword_0() { return cInputKeyword_0; }

		//"output"
		public Keyword getOutputKeyword_1() { return cOutputKeyword_1; }

		//"inout"
		public Keyword getInoutKeyword_2() { return cInoutKeyword_2; }

		//"ref"
		public Keyword getRefKeyword_3() { return cRefKeyword_3; }
	}
	
	
	private ModuleElements pModule;
	private Module_itemElements pModule_item;
	private ParameterElements pParameter;
	private PortElements pPort;
	private VARIABLE_DECLARATIONElements pVARIABLE_DECLARATION;
	private DATA_TYPEElements pDATA_TYPE;
	private INTEGER_VECTOR_TYPEElements pINTEGER_VECTOR_TYPE;
	private MODULE_KEYWORDElements pMODULE_KEYWORD;
	private PORT_DIRECTIONElements pPORT_DIRECTION;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SystemVerilogGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Module:
	//	MODULE_KEYWORD name=ID ("#(" parameters+=Parameter ("," parameters+=Parameter)* ")")? "(" (ports+=Port (","
	//	ports+=Port)*)? ")" ";" module_items+=Module_item* "endmodule";
	public ModuleElements getModuleAccess() {
		return (pModule != null) ? pModule : (pModule = new ModuleElements());
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}

	//Module_item:
	//	VARIABLE_DECLARATION;
	public Module_itemElements getModule_itemAccess() {
		return (pModule_item != null) ? pModule_item : (pModule_item = new Module_itemElements());
	}
	
	public ParserRule getModule_itemRule() {
		return getModule_itemAccess().getRule();
	}

	//Parameter:
	//	name=ID;
	public ParameterElements getParameterAccess() {
		return (pParameter != null) ? pParameter : (pParameter = new ParameterElements());
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//Port:
	//	direction=PORT_DIRECTION name=ID;
	public PortElements getPortAccess() {
		return (pPort != null) ? pPort : (pPort = new PortElements());
	}
	
	public ParserRule getPortRule() {
		return getPortAccess().getRule();
	}

	/// *
	// * Keywords
	// * / VARIABLE_DECLARATION:
	//	DATA_TYPE name=ID ";";
	public VARIABLE_DECLARATIONElements getVARIABLE_DECLARATIONAccess() {
		return (pVARIABLE_DECLARATION != null) ? pVARIABLE_DECLARATION : (pVARIABLE_DECLARATION = new VARIABLE_DECLARATIONElements());
	}
	
	public ParserRule getVARIABLE_DECLARATIONRule() {
		return getVARIABLE_DECLARATIONAccess().getRule();
	}

	//DATA_TYPE:
	//	INTEGER_VECTOR_TYPE;
	public DATA_TYPEElements getDATA_TYPEAccess() {
		return (pDATA_TYPE != null) ? pDATA_TYPE : (pDATA_TYPE = new DATA_TYPEElements());
	}
	
	public ParserRule getDATA_TYPERule() {
		return getDATA_TYPEAccess().getRule();
	}

	//INTEGER_VECTOR_TYPE:
	//	"bit" | "logic" | "reg";
	public INTEGER_VECTOR_TYPEElements getINTEGER_VECTOR_TYPEAccess() {
		return (pINTEGER_VECTOR_TYPE != null) ? pINTEGER_VECTOR_TYPE : (pINTEGER_VECTOR_TYPE = new INTEGER_VECTOR_TYPEElements());
	}
	
	public ParserRule getINTEGER_VECTOR_TYPERule() {
		return getINTEGER_VECTOR_TYPEAccess().getRule();
	}

	//MODULE_KEYWORD:
	//	"module" | "macromodule";
	public MODULE_KEYWORDElements getMODULE_KEYWORDAccess() {
		return (pMODULE_KEYWORD != null) ? pMODULE_KEYWORD : (pMODULE_KEYWORD = new MODULE_KEYWORDElements());
	}
	
	public ParserRule getMODULE_KEYWORDRule() {
		return getMODULE_KEYWORDAccess().getRule();
	}

	/// *
	// * Some added terminals, should add this to a separate file maybe?
	// * / / *
	//terminal ASSIGNMENT_OPERATOR: 
	//	'=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '<<<=' | '>>>='
	//;
	// 
	//terminal UNARY_OPERATOR: 
	//	'+' | '-' | '!' | '~' | '&' | '~&' | '|' | '~|' | '^' | '~^' | '^~'
	//; 
	//
	//terminal BINARY_OPERATOR: 
	//	'+' | '-' | '*' | '/' | '%' | '==' | '!='| '===' | '!==' | '=?=' | '!?=' | '&&' | '||' | '**' 
	//	| '<' | '<=' | '>' | '>=' | '&' | '|' | '^' | '^~' | '~^' | '>>' | '<<' | '>>>' | '<<<' 
	//;
	//
	//terminal INC_OR_DEC_OPERATOR:
	//	'++' | '--'
	//;
	// 
	//terminal UNARY_MODULE_PATH_OPERATOR: 
	//	'!' | '~' | '&' | '~&' | '|' | '~|' | '^' | '~^' | '^~'
	//; 
	//
	//terminal BINARY_MODULE_PATH_OPERATOR: 
	//	'==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '^~' | '~^'
	//; 
	//
	//terminal CMOS_SWITCHTYPE: 
	//	'cmos' | 'rcmos'
	//; 
	//
	//terminal ENABLE_GATETYPE: 
	//	'bufif0' | 'bufif1' | 'notif0' | 'notif1'
	//; 
	//
	//terminal MOS_SWITCHTYPE: 
	//	'nmos' | 'pmos' | 'rnmos' | 'rpmos'
	//; 
	//
	//terminal N_INPUT_GATETYPE: 
	//	'and' | 'nand' | 'or' | 'nor' | 'xor' | 'xnor'
	//; 
	//
	//terminal N_OUTPUT_GATETYPE: 
	//	'buf' | 'not'
	//; 
	//
	//terminal PASS_EN_SWITCHTYPE: 
	//	'tranif0' | 'tranif1' | 'rtranif1' | 'rtranif0'
	//; 
	//
	//terminal PASS_SWITCHTYPE: 
	//	'tran' | 'rtran'
	//;
	// * / PORT_DIRECTION:
	//	"input" | "output" | "inout" | "ref";
	public PORT_DIRECTIONElements getPORT_DIRECTIONAccess() {
		return (pPORT_DIRECTION != null) ? pPORT_DIRECTION : (pPORT_DIRECTION = new PORT_DIRECTIONElements());
	}
	
	public ParserRule getPORT_DIRECTIONRule() {
		return getPORT_DIRECTIONAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
