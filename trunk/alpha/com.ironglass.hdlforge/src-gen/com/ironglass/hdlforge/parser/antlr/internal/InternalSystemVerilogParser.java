package com.ironglass.hdlforge.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemVerilogParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#('", "','", "')'", "'('", "';'", "'endmodule'", "'bit'", "'logic'", "'reg'", "'module'", "'macromodule'", "'input'", "'output'", "'inout'", "'ref'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSystemVerilogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemVerilogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemVerilogParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g"; }



     	private SystemVerilogGrammarAccess grammarAccess;
     	
        public InternalSystemVerilogParser(TokenStream input, SystemVerilogGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected SystemVerilogGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModule"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:67:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:68:2: (iv_ruleModule= ruleModule EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:69:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:76:1: ruleModule returns [EObject current=null] : ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleModule_item ) )* otherlv_14= 'endmodule' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_ports_8_0 = null;

        EObject lv_ports_10_0 = null;

        EObject lv_module_items_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:79:28: ( ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleModule_item ) )* otherlv_14= 'endmodule' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:80:1: ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleModule_item ) )* otherlv_14= 'endmodule' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:80:1: ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleModule_item ) )* otherlv_14= 'endmodule' )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:81:5: ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleModule_item ) )* otherlv_14= 'endmodule'
            {
             
                    newCompositeNode(grammarAccess.getModuleAccess().getMODULE_KEYWORDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMODULE_KEYWORD_in_ruleModule126);
            ruleMODULE_KEYWORD();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:88:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:89:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:89:1: (lv_name_1_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:90:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule142); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:106:2: (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:106:4: otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleModule160); 

                        	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getNumberSignLeftParenthesisKeyword_2_0());
                        
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:110:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:111:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:111:1: (lv_parameters_3_0= ruleParameter )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:112:3: lv_parameters_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleModule181);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:128:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:128:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleModule194); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:132:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:133:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:133:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:134:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleModule215);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleModule229); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleModule243); 

                	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3());
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:158:1: ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=22 && LA4_0<=25)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:158:2: ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )*
                    {
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:158:2: ( (lv_ports_8_0= rulePort ) )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:159:1: (lv_ports_8_0= rulePort )
                    {
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:159:1: (lv_ports_8_0= rulePort )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:160:3: lv_ports_8_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePort_in_ruleModule265);
                    lv_ports_8_0=rulePort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"ports",
                            		lv_ports_8_0, 
                            		"Port");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:176:2: (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:176:4: otherlv_9= ',' ( (lv_ports_10_0= rulePort ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleModule278); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:180:1: ( (lv_ports_10_0= rulePort ) )
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:181:1: (lv_ports_10_0= rulePort )
                    	    {
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:181:1: (lv_ports_10_0= rulePort )
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:182:3: lv_ports_10_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleModule299);
                    	    lv_ports_10_0=rulePort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ports",
                    	            		lv_ports_10_0, 
                    	            		"Port");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleModule315); 

                	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getRightParenthesisKeyword_5());
                
            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleModule327); 

                	newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getSemicolonKeyword_6());
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:206:1: ( (lv_module_items_13_0= ruleModule_item ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:207:1: (lv_module_items_13_0= ruleModule_item )
            	    {
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:207:1: (lv_module_items_13_0= ruleModule_item )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:208:3: lv_module_items_13_0= ruleModule_item
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getModule_itemsModule_itemParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_item_in_ruleModule348);
            	    lv_module_items_13_0=ruleModule_item();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"module_items",
            	            		lv_module_items_13_0, 
            	            		"Module_item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleModule361); 

                	newLeafNode(otherlv_14, grammarAccess.getModuleAccess().getEndmoduleKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModule_item"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:236:1: entryRuleModule_item returns [EObject current=null] : iv_ruleModule_item= ruleModule_item EOF ;
    public final EObject entryRuleModule_item() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule_item = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:237:2: (iv_ruleModule_item= ruleModule_item EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:238:2: iv_ruleModule_item= ruleModule_item EOF
            {
             newCompositeNode(grammarAccess.getModule_itemRule()); 
            pushFollow(FOLLOW_ruleModule_item_in_entryRuleModule_item397);
            iv_ruleModule_item=ruleModule_item();

            state._fsp--;

             current =iv_ruleModule_item; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule_item407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule_item"


    // $ANTLR start "ruleModule_item"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:245:1: ruleModule_item returns [EObject current=null] : this_VARIABLE_DECLARATION_0= ruleVARIABLE_DECLARATION ;
    public final EObject ruleModule_item() throws RecognitionException {
        EObject current = null;

        EObject this_VARIABLE_DECLARATION_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:248:28: (this_VARIABLE_DECLARATION_0= ruleVARIABLE_DECLARATION )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:250:5: this_VARIABLE_DECLARATION_0= ruleVARIABLE_DECLARATION
            {
             
                    newCompositeNode(grammarAccess.getModule_itemAccess().getVARIABLE_DECLARATIONParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_ruleModule_item453);
            this_VARIABLE_DECLARATION_0=ruleVARIABLE_DECLARATION();

            state._fsp--;

             
                    current = this_VARIABLE_DECLARATION_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule_item"


    // $ANTLR start "entryRuleParameter"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:266:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:267:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:268:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter487);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:275:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:278:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:279:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:279:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:280:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:280:1: (lv_name_0_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:281:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter538); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePort"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:305:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:306:2: (iv_rulePort= rulePort EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:307:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort578);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:314:1: rulePort returns [EObject current=null] : ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:317:28: ( ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:318:1: ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:318:1: ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:318:2: ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:318:2: ( (lv_direction_0_0= rulePORT_DIRECTION ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:319:1: (lv_direction_0_0= rulePORT_DIRECTION )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:319:1: (lv_direction_0_0= rulePORT_DIRECTION )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:320:3: lv_direction_0_0= rulePORT_DIRECTION
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_rulePort634);
            lv_direction_0_0=rulePORT_DIRECTION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_0_0, 
                    		"PORT_DIRECTION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:336:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:337:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:337:1: (lv_name_1_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:338:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort651); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleVARIABLE_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:362:1: entryRuleVARIABLE_DECLARATION returns [EObject current=null] : iv_ruleVARIABLE_DECLARATION= ruleVARIABLE_DECLARATION EOF ;
    public final EObject entryRuleVARIABLE_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVARIABLE_DECLARATION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:363:2: (iv_ruleVARIABLE_DECLARATION= ruleVARIABLE_DECLARATION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:364:2: iv_ruleVARIABLE_DECLARATION= ruleVARIABLE_DECLARATION EOF
            {
             newCompositeNode(grammarAccess.getVARIABLE_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION692);
            iv_ruleVARIABLE_DECLARATION=ruleVARIABLE_DECLARATION();

            state._fsp--;

             current =iv_ruleVARIABLE_DECLARATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVARIABLE_DECLARATION"


    // $ANTLR start "ruleVARIABLE_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:371:1: ruleVARIABLE_DECLARATION returns [EObject current=null] : ( ruleDATA_TYPE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleVARIABLE_DECLARATION() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:374:28: ( ( ruleDATA_TYPE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:375:1: ( ruleDATA_TYPE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:375:1: ( ruleDATA_TYPE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:376:5: ruleDATA_TYPE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
             
                    newCompositeNode(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDATA_TYPE_in_ruleVARIABLE_DECLARATION743);
            ruleDATA_TYPE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:383:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:384:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:384:1: (lv_name_1_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:385:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_DECLARATION759); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVARIABLE_DECLARATIONAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVARIABLE_DECLARATIONRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVARIABLE_DECLARATION776); 

                	newLeafNode(otherlv_2, grammarAccess.getVARIABLE_DECLARATIONAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVARIABLE_DECLARATION"


    // $ANTLR start "entryRuleDATA_TYPE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:413:1: entryRuleDATA_TYPE returns [String current=null] : iv_ruleDATA_TYPE= ruleDATA_TYPE EOF ;
    public final String entryRuleDATA_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATA_TYPE = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:414:2: (iv_ruleDATA_TYPE= ruleDATA_TYPE EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:415:2: iv_ruleDATA_TYPE= ruleDATA_TYPE EOF
            {
             newCompositeNode(grammarAccess.getDATA_TYPERule()); 
            pushFollow(FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE813);
            iv_ruleDATA_TYPE=ruleDATA_TYPE();

            state._fsp--;

             current =iv_ruleDATA_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATA_TYPE824); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDATA_TYPE"


    // $ANTLR start "ruleDATA_TYPE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:422:1: ruleDATA_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_VECTOR_TYPE_0= ruleINTEGER_VECTOR_TYPE ;
    public final AntlrDatatypeRuleToken ruleDATA_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_INTEGER_VECTOR_TYPE_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:425:28: (this_INTEGER_VECTOR_TYPE_0= ruleINTEGER_VECTOR_TYPE )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:427:5: this_INTEGER_VECTOR_TYPE_0= ruleINTEGER_VECTOR_TYPE
            {
             
                    newCompositeNode(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE870);
            this_INTEGER_VECTOR_TYPE_0=ruleINTEGER_VECTOR_TYPE();

            state._fsp--;


            		current.merge(this_INTEGER_VECTOR_TYPE_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDATA_TYPE"


    // $ANTLR start "entryRuleINTEGER_VECTOR_TYPE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:445:1: entryRuleINTEGER_VECTOR_TYPE returns [String current=null] : iv_ruleINTEGER_VECTOR_TYPE= ruleINTEGER_VECTOR_TYPE EOF ;
    public final String entryRuleINTEGER_VECTOR_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER_VECTOR_TYPE = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:446:2: (iv_ruleINTEGER_VECTOR_TYPE= ruleINTEGER_VECTOR_TYPE EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:447:2: iv_ruleINTEGER_VECTOR_TYPE= ruleINTEGER_VECTOR_TYPE EOF
            {
             newCompositeNode(grammarAccess.getINTEGER_VECTOR_TYPERule()); 
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE915);
            iv_ruleINTEGER_VECTOR_TYPE=ruleINTEGER_VECTOR_TYPE();

            state._fsp--;

             current =iv_ruleINTEGER_VECTOR_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER_VECTOR_TYPE"


    // $ANTLR start "ruleINTEGER_VECTOR_TYPE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:454:1: ruleINTEGER_VECTOR_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bit' | kw= 'logic' | kw= 'reg' ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER_VECTOR_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:457:28: ( (kw= 'bit' | kw= 'logic' | kw= 'reg' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:458:1: (kw= 'bit' | kw= 'logic' | kw= 'reg' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:458:1: (kw= 'bit' | kw= 'logic' | kw= 'reg' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:459:2: kw= 'bit'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleINTEGER_VECTOR_TYPE964); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:466:2: kw= 'logic'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleINTEGER_VECTOR_TYPE983); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:473:2: kw= 'reg'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleINTEGER_VECTOR_TYPE1002); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getRegKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTEGER_VECTOR_TYPE"


    // $ANTLR start "entryRuleMODULE_KEYWORD"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:486:1: entryRuleMODULE_KEYWORD returns [String current=null] : iv_ruleMODULE_KEYWORD= ruleMODULE_KEYWORD EOF ;
    public final String entryRuleMODULE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMODULE_KEYWORD = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:487:2: (iv_ruleMODULE_KEYWORD= ruleMODULE_KEYWORD EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:488:2: iv_ruleMODULE_KEYWORD= ruleMODULE_KEYWORD EOF
            {
             newCompositeNode(grammarAccess.getMODULE_KEYWORDRule()); 
            pushFollow(FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD1043);
            iv_ruleMODULE_KEYWORD=ruleMODULE_KEYWORD();

            state._fsp--;

             current =iv_ruleMODULE_KEYWORD.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_KEYWORD1054); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODULE_KEYWORD"


    // $ANTLR start "ruleMODULE_KEYWORD"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:495:1: ruleMODULE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'module' | kw= 'macromodule' ) ;
    public final AntlrDatatypeRuleToken ruleMODULE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:498:28: ( (kw= 'module' | kw= 'macromodule' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:499:1: (kw= 'module' | kw= 'macromodule' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:499:1: (kw= 'module' | kw= 'macromodule' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:500:2: kw= 'module'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleMODULE_KEYWORD1092); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:507:2: kw= 'macromodule'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleMODULE_KEYWORD1111); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMODULE_KEYWORDAccess().getMacromoduleKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODULE_KEYWORD"


    // $ANTLR start "entryRulePORT_DIRECTION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:520:1: entryRulePORT_DIRECTION returns [String current=null] : iv_rulePORT_DIRECTION= rulePORT_DIRECTION EOF ;
    public final String entryRulePORT_DIRECTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePORT_DIRECTION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:521:2: (iv_rulePORT_DIRECTION= rulePORT_DIRECTION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:522:2: iv_rulePORT_DIRECTION= rulePORT_DIRECTION EOF
            {
             newCompositeNode(grammarAccess.getPORT_DIRECTIONRule()); 
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION1152);
            iv_rulePORT_DIRECTION=rulePORT_DIRECTION();

            state._fsp--;

             current =iv_rulePORT_DIRECTION.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePORT_DIRECTION1163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePORT_DIRECTION"


    // $ANTLR start "rulePORT_DIRECTION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:529:1: rulePORT_DIRECTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' ) ;
    public final AntlrDatatypeRuleToken rulePORT_DIRECTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:532:28: ( (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:533:1: (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:533:1: (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:534:2: kw= 'input'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_rulePORT_DIRECTION1201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:541:2: kw= 'output'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulePORT_DIRECTION1220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:548:2: kw= 'inout'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulePORT_DIRECTION1239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:555:2: kw= 'ref'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulePORT_DIRECTION1258); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getRefKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePORT_DIRECTION"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_ruleModule126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule142 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_ruleModule160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleModule181 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleModule194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleModule215 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleModule229 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModule243 = new BitSet(new long[]{0x0000000003C02000L});
    public static final BitSet FOLLOW_rulePort_in_ruleModule265 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleModule278 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rulePort_in_ruleModule299 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleModule315 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModule327 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_ruleModule_item_in_ruleModule348 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_16_in_ruleModule361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_item_in_entryRuleModule_item397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule_item407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_ruleModule_item453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_rulePort634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_ruleVARIABLE_DECLARATION743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_DECLARATION759 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVARIABLE_DECLARATION776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATA_TYPE824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleINTEGER_VECTOR_TYPE964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleINTEGER_VECTOR_TYPE983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleINTEGER_VECTOR_TYPE1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_KEYWORD1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMODULE_KEYWORD1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMODULE_KEYWORD1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePORT_DIRECTION1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePORT_DIRECTION1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePORT_DIRECTION1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePORT_DIRECTION1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePORT_DIRECTION1258 = new BitSet(new long[]{0x0000000000000002L});

}