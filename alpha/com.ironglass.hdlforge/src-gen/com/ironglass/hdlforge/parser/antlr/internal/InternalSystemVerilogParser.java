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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DRIVE_STRENGTH", "RULE_INT", "RULE_BINARY_NUMBER", "RULE_OCTAL_NUMBER", "RULE_HEX_NUMBER", "RULE_DECIMAL_NUMBER", "RULE_BINARY_BASE", "RULE_BINARY_DIGIT", "RULE_OCTAL_BASE", "RULE_OCTAL_DIGIT", "RULE_HEX_BASE", "RULE_HEX_DIGIT", "RULE_DECIMAL_BASE", "RULE_X_DIGIT", "RULE_Z_DIGIT", "RULE_STRENGTH0", "RULE_STRENGTH1", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#('", "','", "')'", "'('", "';'", "'endmodule'", "'assign'", "'='", "'['", "':'", "']'", "'trireg'", "'supply0'", "'supply1'", "'tri'", "'triand'", "'trior'", "'tri0'", "'tri1'", "'wire'", "'wand'", "'wor'", "'const'", "'static'", "'automatic'", "'bit'", "'logic'", "'reg'", "'module'", "'macromodule'", "'input'", "'output'", "'inout'", "'ref'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_HEX_BASE=15;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_DECIMAL_NUMBER=10;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int RULE_OCTAL_DIGIT=14;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_OCTAL_BASE=13;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_BINARY_NUMBER=7;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int RULE_DRIVE_STRENGTH=5;
    public static final int RULE_X_DIGIT=18;
    public static final int RULE_OCTAL_NUMBER=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int RULE_BINARY_BASE=11;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_BINARY_DIGIT=12;
    public static final int T__49=49;
    public static final int RULE_HEX_DIGIT=16;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_Z_DIGIT=19;
    public static final int RULE_HEX_NUMBER=9;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_STRENGTH0=20;
    public static final int RULE_STRENGTH1=21;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=22;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=25;
    public static final int RULE_DECIMAL_BASE=17;

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:76:1: ruleModule returns [EObject current=null] : ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleMODULE_ITEM ) )* otherlv_14= 'endmodule' ) ;
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
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:79:28: ( ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleMODULE_ITEM ) )* otherlv_14= 'endmodule' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:80:1: ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleMODULE_ITEM ) )* otherlv_14= 'endmodule' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:80:1: ( ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleMODULE_ITEM ) )* otherlv_14= 'endmodule' )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:81:5: ruleMODULE_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '(' ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )? otherlv_11= ')' otherlv_12= ';' ( (lv_module_items_13_0= ruleMODULE_ITEM ) )* otherlv_14= 'endmodule'
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

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:106:4: otherlv_2= '#(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleModule160); 

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

                        if ( (LA1_0==28) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:128:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleModule194); 

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

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleModule229); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleModule243); 

                	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3());
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:158:1: ( ( (lv_ports_8_0= rulePort ) ) (otherlv_9= ',' ( (lv_ports_10_0= rulePort ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=57 && LA4_0<=60)) ) {
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

                        if ( (LA3_0==28) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:176:4: otherlv_9= ',' ( (lv_ports_10_0= rulePort ) )
                    	    {
                    	    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleModule278); 

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

            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleModule315); 

                	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getRightParenthesisKeyword_5());
                
            otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleModule327); 

                	newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getSemicolonKeyword_6());
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:206:1: ( (lv_module_items_13_0= ruleMODULE_ITEM ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33||(LA5_0>=38 && LA5_0<=54)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:207:1: (lv_module_items_13_0= ruleMODULE_ITEM )
            	    {
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:207:1: (lv_module_items_13_0= ruleMODULE_ITEM )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:208:3: lv_module_items_13_0= ruleMODULE_ITEM
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getModule_itemsMODULE_ITEMParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMODULE_ITEM_in_ruleModule348);
            	    lv_module_items_13_0=ruleMODULE_ITEM();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"module_items",
            	            		lv_module_items_13_0, 
            	            		"MODULE_ITEM");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleModule361); 

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


    // $ANTLR start "entryRuleParameter"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:236:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:237:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:238:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter397);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter407); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:245:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:248:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:249:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:249:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:250:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:250:1: (lv_name_0_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:251:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter448); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:275:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:276:2: (iv_rulePort= rulePort EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:277:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort488);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort498); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:284:1: rulePort returns [EObject current=null] : ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:287:28: ( ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:288:1: ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:288:1: ( ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:288:2: ( (lv_direction_0_0= rulePORT_DIRECTION ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:288:2: ( (lv_direction_0_0= rulePORT_DIRECTION ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:289:1: (lv_direction_0_0= rulePORT_DIRECTION )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:289:1: (lv_direction_0_0= rulePORT_DIRECTION )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:290:3: lv_direction_0_0= rulePORT_DIRECTION
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_rulePort544);
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

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:306:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:307:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:307:1: (lv_name_1_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:308:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort561); 

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


    // $ANTLR start "entryRuleMODULE_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:332:1: entryRuleMODULE_ITEM returns [EObject current=null] : iv_ruleMODULE_ITEM= ruleMODULE_ITEM EOF ;
    public final EObject entryRuleMODULE_ITEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE_ITEM = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:333:2: (iv_ruleMODULE_ITEM= ruleMODULE_ITEM EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:334:2: iv_ruleMODULE_ITEM= ruleMODULE_ITEM EOF
            {
             newCompositeNode(grammarAccess.getMODULE_ITEMRule()); 
            pushFollow(FOLLOW_ruleMODULE_ITEM_in_entryRuleMODULE_ITEM602);
            iv_ruleMODULE_ITEM=ruleMODULE_ITEM();

            state._fsp--;

             current =iv_ruleMODULE_ITEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_ITEM612); 

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
    // $ANTLR end "entryRuleMODULE_ITEM"


    // $ANTLR start "ruleMODULE_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:341:1: ruleMODULE_ITEM returns [EObject current=null] : this_NON_PORT_MODULE_ITEM_0= ruleNON_PORT_MODULE_ITEM ;
    public final EObject ruleMODULE_ITEM() throws RecognitionException {
        EObject current = null;

        EObject this_NON_PORT_MODULE_ITEM_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:344:28: (this_NON_PORT_MODULE_ITEM_0= ruleNON_PORT_MODULE_ITEM )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:346:5: this_NON_PORT_MODULE_ITEM_0= ruleNON_PORT_MODULE_ITEM
            {
             
                    newCompositeNode(grammarAccess.getMODULE_ITEMAccess().getNON_PORT_MODULE_ITEMParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNON_PORT_MODULE_ITEM_in_ruleMODULE_ITEM658);
            this_NON_PORT_MODULE_ITEM_0=ruleNON_PORT_MODULE_ITEM();

            state._fsp--;

             
                    current = this_NON_PORT_MODULE_ITEM_0; 
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
    // $ANTLR end "ruleMODULE_ITEM"


    // $ANTLR start "entryRuleNON_PORT_MODULE_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:362:1: entryRuleNON_PORT_MODULE_ITEM returns [EObject current=null] : iv_ruleNON_PORT_MODULE_ITEM= ruleNON_PORT_MODULE_ITEM EOF ;
    public final EObject entryRuleNON_PORT_MODULE_ITEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNON_PORT_MODULE_ITEM = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:363:2: (iv_ruleNON_PORT_MODULE_ITEM= ruleNON_PORT_MODULE_ITEM EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:364:2: iv_ruleNON_PORT_MODULE_ITEM= ruleNON_PORT_MODULE_ITEM EOF
            {
             newCompositeNode(grammarAccess.getNON_PORT_MODULE_ITEMRule()); 
            pushFollow(FOLLOW_ruleNON_PORT_MODULE_ITEM_in_entryRuleNON_PORT_MODULE_ITEM692);
            iv_ruleNON_PORT_MODULE_ITEM=ruleNON_PORT_MODULE_ITEM();

            state._fsp--;

             current =iv_ruleNON_PORT_MODULE_ITEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNON_PORT_MODULE_ITEM702); 

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
    // $ANTLR end "entryRuleNON_PORT_MODULE_ITEM"


    // $ANTLR start "ruleNON_PORT_MODULE_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:371:1: ruleNON_PORT_MODULE_ITEM returns [EObject current=null] : this_MODULE_OR_GENERATE_ITEM_0= ruleMODULE_OR_GENERATE_ITEM ;
    public final EObject ruleNON_PORT_MODULE_ITEM() throws RecognitionException {
        EObject current = null;

        EObject this_MODULE_OR_GENERATE_ITEM_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:374:28: (this_MODULE_OR_GENERATE_ITEM_0= ruleMODULE_OR_GENERATE_ITEM )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:376:5: this_MODULE_OR_GENERATE_ITEM_0= ruleMODULE_OR_GENERATE_ITEM
            {
             
                    newCompositeNode(grammarAccess.getNON_PORT_MODULE_ITEMAccess().getMODULE_OR_GENERATE_ITEMParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_ruleNON_PORT_MODULE_ITEM748);
            this_MODULE_OR_GENERATE_ITEM_0=ruleMODULE_OR_GENERATE_ITEM();

            state._fsp--;

             
                    current = this_MODULE_OR_GENERATE_ITEM_0; 
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
    // $ANTLR end "ruleNON_PORT_MODULE_ITEM"


    // $ANTLR start "entryRuleMODULE_OR_GENERATE_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:392:1: entryRuleMODULE_OR_GENERATE_ITEM returns [EObject current=null] : iv_ruleMODULE_OR_GENERATE_ITEM= ruleMODULE_OR_GENERATE_ITEM EOF ;
    public final EObject entryRuleMODULE_OR_GENERATE_ITEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE_OR_GENERATE_ITEM = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:393:2: (iv_ruleMODULE_OR_GENERATE_ITEM= ruleMODULE_OR_GENERATE_ITEM EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:394:2: iv_ruleMODULE_OR_GENERATE_ITEM= ruleMODULE_OR_GENERATE_ITEM EOF
            {
             newCompositeNode(grammarAccess.getMODULE_OR_GENERATE_ITEMRule()); 
            pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_entryRuleMODULE_OR_GENERATE_ITEM782);
            iv_ruleMODULE_OR_GENERATE_ITEM=ruleMODULE_OR_GENERATE_ITEM();

            state._fsp--;

             current =iv_ruleMODULE_OR_GENERATE_ITEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM792); 

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
    // $ANTLR end "entryRuleMODULE_OR_GENERATE_ITEM"


    // $ANTLR start "ruleMODULE_OR_GENERATE_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:401:1: ruleMODULE_OR_GENERATE_ITEM returns [EObject current=null] : this_MODULE_COMMON_ITEM_0= ruleMODULE_COMMON_ITEM ;
    public final EObject ruleMODULE_OR_GENERATE_ITEM() throws RecognitionException {
        EObject current = null;

        EObject this_MODULE_COMMON_ITEM_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:404:28: (this_MODULE_COMMON_ITEM_0= ruleMODULE_COMMON_ITEM )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:406:5: this_MODULE_COMMON_ITEM_0= ruleMODULE_COMMON_ITEM
            {
             
                    newCompositeNode(grammarAccess.getMODULE_OR_GENERATE_ITEMAccess().getMODULE_COMMON_ITEMParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleMODULE_COMMON_ITEM_in_ruleMODULE_OR_GENERATE_ITEM838);
            this_MODULE_COMMON_ITEM_0=ruleMODULE_COMMON_ITEM();

            state._fsp--;

             
                    current = this_MODULE_COMMON_ITEM_0; 
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
    // $ANTLR end "ruleMODULE_OR_GENERATE_ITEM"


    // $ANTLR start "entryRuleMODULE_COMMON_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:422:1: entryRuleMODULE_COMMON_ITEM returns [EObject current=null] : iv_ruleMODULE_COMMON_ITEM= ruleMODULE_COMMON_ITEM EOF ;
    public final EObject entryRuleMODULE_COMMON_ITEM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE_COMMON_ITEM = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:423:2: (iv_ruleMODULE_COMMON_ITEM= ruleMODULE_COMMON_ITEM EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:424:2: iv_ruleMODULE_COMMON_ITEM= ruleMODULE_COMMON_ITEM EOF
            {
             newCompositeNode(grammarAccess.getMODULE_COMMON_ITEMRule()); 
            pushFollow(FOLLOW_ruleMODULE_COMMON_ITEM_in_entryRuleMODULE_COMMON_ITEM872);
            iv_ruleMODULE_COMMON_ITEM=ruleMODULE_COMMON_ITEM();

            state._fsp--;

             current =iv_ruleMODULE_COMMON_ITEM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_COMMON_ITEM882); 

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
    // $ANTLR end "entryRuleMODULE_COMMON_ITEM"


    // $ANTLR start "ruleMODULE_COMMON_ITEM"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:431:1: ruleMODULE_COMMON_ITEM returns [EObject current=null] : (this_MODULE_OR_GENERATE_ITEM_DECLARATION_0= ruleMODULE_OR_GENERATE_ITEM_DECLARATION | this_CONTINUOUS_ASSIGN_1= ruleCONTINUOUS_ASSIGN ) ;
    public final EObject ruleMODULE_COMMON_ITEM() throws RecognitionException {
        EObject current = null;

        EObject this_MODULE_OR_GENERATE_ITEM_DECLARATION_0 = null;

        EObject this_CONTINUOUS_ASSIGN_1 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:434:28: ( (this_MODULE_OR_GENERATE_ITEM_DECLARATION_0= ruleMODULE_OR_GENERATE_ITEM_DECLARATION | this_CONTINUOUS_ASSIGN_1= ruleCONTINUOUS_ASSIGN ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:435:1: (this_MODULE_OR_GENERATE_ITEM_DECLARATION_0= ruleMODULE_OR_GENERATE_ITEM_DECLARATION | this_CONTINUOUS_ASSIGN_1= ruleCONTINUOUS_ASSIGN )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:435:1: (this_MODULE_OR_GENERATE_ITEM_DECLARATION_0= ruleMODULE_OR_GENERATE_ITEM_DECLARATION | this_CONTINUOUS_ASSIGN_1= ruleCONTINUOUS_ASSIGN )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=38 && LA6_0<=54)) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:436:5: this_MODULE_OR_GENERATE_ITEM_DECLARATION_0= ruleMODULE_OR_GENERATE_ITEM_DECLARATION
                    {
                     
                            newCompositeNode(grammarAccess.getMODULE_COMMON_ITEMAccess().getMODULE_OR_GENERATE_ITEM_DECLARATIONParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_ruleMODULE_COMMON_ITEM929);
                    this_MODULE_OR_GENERATE_ITEM_DECLARATION_0=ruleMODULE_OR_GENERATE_ITEM_DECLARATION();

                    state._fsp--;

                     
                            current = this_MODULE_OR_GENERATE_ITEM_DECLARATION_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:446:5: this_CONTINUOUS_ASSIGN_1= ruleCONTINUOUS_ASSIGN
                    {
                     
                            newCompositeNode(grammarAccess.getMODULE_COMMON_ITEMAccess().getCONTINUOUS_ASSIGNParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCONTINUOUS_ASSIGN_in_ruleMODULE_COMMON_ITEM956);
                    this_CONTINUOUS_ASSIGN_1=ruleCONTINUOUS_ASSIGN();

                    state._fsp--;

                     
                            current = this_CONTINUOUS_ASSIGN_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleMODULE_COMMON_ITEM"


    // $ANTLR start "entryRuleCONTINUOUS_ASSIGN"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:462:1: entryRuleCONTINUOUS_ASSIGN returns [EObject current=null] : iv_ruleCONTINUOUS_ASSIGN= ruleCONTINUOUS_ASSIGN EOF ;
    public final EObject entryRuleCONTINUOUS_ASSIGN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONTINUOUS_ASSIGN = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:463:2: (iv_ruleCONTINUOUS_ASSIGN= ruleCONTINUOUS_ASSIGN EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:464:2: iv_ruleCONTINUOUS_ASSIGN= ruleCONTINUOUS_ASSIGN EOF
            {
             newCompositeNode(grammarAccess.getCONTINUOUS_ASSIGNRule()); 
            pushFollow(FOLLOW_ruleCONTINUOUS_ASSIGN_in_entryRuleCONTINUOUS_ASSIGN991);
            iv_ruleCONTINUOUS_ASSIGN=ruleCONTINUOUS_ASSIGN();

            state._fsp--;

             current =iv_ruleCONTINUOUS_ASSIGN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTINUOUS_ASSIGN1001); 

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
    // $ANTLR end "entryRuleCONTINUOUS_ASSIGN"


    // $ANTLR start "ruleCONTINUOUS_ASSIGN"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:471:1: ruleCONTINUOUS_ASSIGN returns [EObject current=null] : (otherlv_0= 'assign' (this_DRIVE_STRENGTH_1= RULE_DRIVE_STRENGTH )? this_LIST_OF_NET_ASSIGNMENTS_2= ruleLIST_OF_NET_ASSIGNMENTS otherlv_3= ';' ) ;
    public final EObject ruleCONTINUOUS_ASSIGN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DRIVE_STRENGTH_1=null;
        Token otherlv_3=null;
        EObject this_LIST_OF_NET_ASSIGNMENTS_2 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:474:28: ( (otherlv_0= 'assign' (this_DRIVE_STRENGTH_1= RULE_DRIVE_STRENGTH )? this_LIST_OF_NET_ASSIGNMENTS_2= ruleLIST_OF_NET_ASSIGNMENTS otherlv_3= ';' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:475:1: (otherlv_0= 'assign' (this_DRIVE_STRENGTH_1= RULE_DRIVE_STRENGTH )? this_LIST_OF_NET_ASSIGNMENTS_2= ruleLIST_OF_NET_ASSIGNMENTS otherlv_3= ';' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:475:1: (otherlv_0= 'assign' (this_DRIVE_STRENGTH_1= RULE_DRIVE_STRENGTH )? this_LIST_OF_NET_ASSIGNMENTS_2= ruleLIST_OF_NET_ASSIGNMENTS otherlv_3= ';' )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:475:3: otherlv_0= 'assign' (this_DRIVE_STRENGTH_1= RULE_DRIVE_STRENGTH )? this_LIST_OF_NET_ASSIGNMENTS_2= ruleLIST_OF_NET_ASSIGNMENTS otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleCONTINUOUS_ASSIGN1038); 

                	newLeafNode(otherlv_0, grammarAccess.getCONTINUOUS_ASSIGNAccess().getAssignKeyword_0());
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:479:1: (this_DRIVE_STRENGTH_1= RULE_DRIVE_STRENGTH )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DRIVE_STRENGTH) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:479:2: this_DRIVE_STRENGTH_1= RULE_DRIVE_STRENGTH
                    {
                    this_DRIVE_STRENGTH_1=(Token)match(input,RULE_DRIVE_STRENGTH,FOLLOW_RULE_DRIVE_STRENGTH_in_ruleCONTINUOUS_ASSIGN1050); 
                     
                        newLeafNode(this_DRIVE_STRENGTH_1, grammarAccess.getCONTINUOUS_ASSIGNAccess().getDRIVE_STRENGTHTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getCONTINUOUS_ASSIGNAccess().getLIST_OF_NET_ASSIGNMENTSParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_ruleCONTINUOUS_ASSIGN1073);
            this_LIST_OF_NET_ASSIGNMENTS_2=ruleLIST_OF_NET_ASSIGNMENTS();

            state._fsp--;

             
                    current = this_LIST_OF_NET_ASSIGNMENTS_2; 
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleCONTINUOUS_ASSIGN1084); 

                	newLeafNode(otherlv_3, grammarAccess.getCONTINUOUS_ASSIGNAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleCONTINUOUS_ASSIGN"


    // $ANTLR start "entryRuleLIST_OF_NET_ASSIGNMENTS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:504:1: entryRuleLIST_OF_NET_ASSIGNMENTS returns [EObject current=null] : iv_ruleLIST_OF_NET_ASSIGNMENTS= ruleLIST_OF_NET_ASSIGNMENTS EOF ;
    public final EObject entryRuleLIST_OF_NET_ASSIGNMENTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLIST_OF_NET_ASSIGNMENTS = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:505:2: (iv_ruleLIST_OF_NET_ASSIGNMENTS= ruleLIST_OF_NET_ASSIGNMENTS EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:506:2: iv_ruleLIST_OF_NET_ASSIGNMENTS= ruleLIST_OF_NET_ASSIGNMENTS EOF
            {
             newCompositeNode(grammarAccess.getLIST_OF_NET_ASSIGNMENTSRule()); 
            pushFollow(FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_entryRuleLIST_OF_NET_ASSIGNMENTS1120);
            iv_ruleLIST_OF_NET_ASSIGNMENTS=ruleLIST_OF_NET_ASSIGNMENTS();

            state._fsp--;

             current =iv_ruleLIST_OF_NET_ASSIGNMENTS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIST_OF_NET_ASSIGNMENTS1130); 

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
    // $ANTLR end "entryRuleLIST_OF_NET_ASSIGNMENTS"


    // $ANTLR start "ruleLIST_OF_NET_ASSIGNMENTS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:513:1: ruleLIST_OF_NET_ASSIGNMENTS returns [EObject current=null] : ( ( (lv_assignments_0_0= ruleNET_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) ) )* ) ;
    public final EObject ruleLIST_OF_NET_ASSIGNMENTS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_assignments_0_0 = null;

        AntlrDatatypeRuleToken lv_assignments_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:516:28: ( ( ( (lv_assignments_0_0= ruleNET_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) ) )* ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:517:1: ( ( (lv_assignments_0_0= ruleNET_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) ) )* )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:517:1: ( ( (lv_assignments_0_0= ruleNET_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) ) )* )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:517:2: ( (lv_assignments_0_0= ruleNET_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) ) )*
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:517:2: ( (lv_assignments_0_0= ruleNET_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:518:1: (lv_assignments_0_0= ruleNET_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:518:1: (lv_assignments_0_0= ruleNET_ASSIGNMENT )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:519:3: lv_assignments_0_0= ruleNET_ASSIGNMENT
            {
             
            	        newCompositeNode(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsNET_ASSIGNMENTParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNET_ASSIGNMENT_in_ruleLIST_OF_NET_ASSIGNMENTS1176);
            lv_assignments_0_0=ruleNET_ASSIGNMENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLIST_OF_NET_ASSIGNMENTSRule());
            	        }
                   		add(
                   			current, 
                   			"assignments",
                    		lv_assignments_0_0, 
                    		"NET_ASSIGNMENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:535:2: (otherlv_1= ',' ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:535:4: otherlv_1= ',' ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleLIST_OF_NET_ASSIGNMENTS1189); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:539:1: ( (lv_assignments_2_0= ruleNET_ASSIGNMENT ) )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:540:1: (lv_assignments_2_0= ruleNET_ASSIGNMENT )
            	    {
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:540:1: (lv_assignments_2_0= ruleNET_ASSIGNMENT )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:541:3: lv_assignments_2_0= ruleNET_ASSIGNMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsNET_ASSIGNMENTParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNET_ASSIGNMENT_in_ruleLIST_OF_NET_ASSIGNMENTS1210);
            	    lv_assignments_2_0=ruleNET_ASSIGNMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLIST_OF_NET_ASSIGNMENTSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignments",
            	            		lv_assignments_2_0, 
            	            		"NET_ASSIGNMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleLIST_OF_NET_ASSIGNMENTS"


    // $ANTLR start "entryRuleNET_ASSIGNMENT"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:565:1: entryRuleNET_ASSIGNMENT returns [String current=null] : iv_ruleNET_ASSIGNMENT= ruleNET_ASSIGNMENT EOF ;
    public final String entryRuleNET_ASSIGNMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNET_ASSIGNMENT = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:566:2: (iv_ruleNET_ASSIGNMENT= ruleNET_ASSIGNMENT EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:567:2: iv_ruleNET_ASSIGNMENT= ruleNET_ASSIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getNET_ASSIGNMENTRule()); 
            pushFollow(FOLLOW_ruleNET_ASSIGNMENT_in_entryRuleNET_ASSIGNMENT1249);
            iv_ruleNET_ASSIGNMENT=ruleNET_ASSIGNMENT();

            state._fsp--;

             current =iv_ruleNET_ASSIGNMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_ASSIGNMENT1260); 

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
    // $ANTLR end "entryRuleNET_ASSIGNMENT"


    // $ANTLR start "ruleNET_ASSIGNMENT"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:574:1: ruleNET_ASSIGNMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NET_LVALUE_0= ruleNET_LVALUE kw= '=' this_NUMBER_2= ruleNUMBER ) ;
    public final AntlrDatatypeRuleToken ruleNET_ASSIGNMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NET_LVALUE_0 = null;

        AntlrDatatypeRuleToken this_NUMBER_2 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:577:28: ( (this_NET_LVALUE_0= ruleNET_LVALUE kw= '=' this_NUMBER_2= ruleNUMBER ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:578:1: (this_NET_LVALUE_0= ruleNET_LVALUE kw= '=' this_NUMBER_2= ruleNUMBER )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:578:1: (this_NET_LVALUE_0= ruleNET_LVALUE kw= '=' this_NUMBER_2= ruleNUMBER )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:579:5: this_NET_LVALUE_0= ruleNET_LVALUE kw= '=' this_NUMBER_2= ruleNUMBER
            {
             
                    newCompositeNode(grammarAccess.getNET_ASSIGNMENTAccess().getNET_LVALUEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNET_LVALUE_in_ruleNET_ASSIGNMENT1307);
            this_NET_LVALUE_0=ruleNET_LVALUE();

            state._fsp--;


            		current.merge(this_NET_LVALUE_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleNET_ASSIGNMENT1325); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNET_ASSIGNMENTAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getNET_ASSIGNMENTAccess().getNUMBERParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNET_ASSIGNMENT1347);
            this_NUMBER_2=ruleNUMBER();

            state._fsp--;


            		current.merge(this_NUMBER_2);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleNET_ASSIGNMENT"


    // $ANTLR start "entryRuleNET_LVALUE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:614:1: entryRuleNET_LVALUE returns [String current=null] : iv_ruleNET_LVALUE= ruleNET_LVALUE EOF ;
    public final String entryRuleNET_LVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNET_LVALUE = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:615:2: (iv_ruleNET_LVALUE= ruleNET_LVALUE EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:616:2: iv_ruleNET_LVALUE= ruleNET_LVALUE EOF
            {
             newCompositeNode(grammarAccess.getNET_LVALUERule()); 
            pushFollow(FOLLOW_ruleNET_LVALUE_in_entryRuleNET_LVALUE1393);
            iv_ruleNET_LVALUE=ruleNET_LVALUE();

            state._fsp--;

             current =iv_ruleNET_LVALUE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_LVALUE1404); 

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
    // $ANTLR end "entryRuleNET_LVALUE"


    // $ANTLR start "ruleNET_LVALUE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:623:1: ruleNET_LVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PS_OR_HIERARCHICAL_NET_IDENTIFIER_0= rulePS_OR_HIERARCHICAL_NET_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleNET_LVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PS_OR_HIERARCHICAL_NET_IDENTIFIER_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:626:28: (this_PS_OR_HIERARCHICAL_NET_IDENTIFIER_0= rulePS_OR_HIERARCHICAL_NET_IDENTIFIER )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:628:5: this_PS_OR_HIERARCHICAL_NET_IDENTIFIER_0= rulePS_OR_HIERARCHICAL_NET_IDENTIFIER
            {
             
                    newCompositeNode(grammarAccess.getNET_LVALUEAccess().getPS_OR_HIERARCHICAL_NET_IDENTIFIERParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_ruleNET_LVALUE1450);
            this_PS_OR_HIERARCHICAL_NET_IDENTIFIER_0=rulePS_OR_HIERARCHICAL_NET_IDENTIFIER();

            state._fsp--;


            		current.merge(this_PS_OR_HIERARCHICAL_NET_IDENTIFIER_0);
                
             
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
    // $ANTLR end "ruleNET_LVALUE"


    // $ANTLR start "entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:646:1: entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER returns [String current=null] : iv_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER= rulePS_OR_HIERARCHICAL_NET_IDENTIFIER EOF ;
    public final String entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:647:2: (iv_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER= rulePS_OR_HIERARCHICAL_NET_IDENTIFIER EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:648:2: iv_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER= rulePS_OR_HIERARCHICAL_NET_IDENTIFIER EOF
            {
             newCompositeNode(grammarAccess.getPS_OR_HIERARCHICAL_NET_IDENTIFIERRule()); 
            pushFollow(FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER1495);
            iv_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER=rulePS_OR_HIERARCHICAL_NET_IDENTIFIER();

            state._fsp--;

             current =iv_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER1506); 

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
    // $ANTLR end "entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER"


    // $ANTLR start "rulePS_OR_HIERARCHICAL_NET_IDENTIFIER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:655:1: rulePS_OR_HIERARCHICAL_NET_IDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NET_IDENTIFIER_0= ruleNET_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulePS_OR_HIERARCHICAL_NET_IDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NET_IDENTIFIER_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:658:28: (this_NET_IDENTIFIER_0= ruleNET_IDENTIFIER )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:660:5: this_NET_IDENTIFIER_0= ruleNET_IDENTIFIER
            {
             
                    newCompositeNode(grammarAccess.getPS_OR_HIERARCHICAL_NET_IDENTIFIERAccess().getNET_IDENTIFIERParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNET_IDENTIFIER_in_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER1552);
            this_NET_IDENTIFIER_0=ruleNET_IDENTIFIER();

            state._fsp--;


            		current.merge(this_NET_IDENTIFIER_0);
                
             
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
    // $ANTLR end "rulePS_OR_HIERARCHICAL_NET_IDENTIFIER"


    // $ANTLR start "entryRuleNET_IDENTIFIER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:678:1: entryRuleNET_IDENTIFIER returns [String current=null] : iv_ruleNET_IDENTIFIER= ruleNET_IDENTIFIER EOF ;
    public final String entryRuleNET_IDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNET_IDENTIFIER = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:679:2: (iv_ruleNET_IDENTIFIER= ruleNET_IDENTIFIER EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:680:2: iv_ruleNET_IDENTIFIER= ruleNET_IDENTIFIER EOF
            {
             newCompositeNode(grammarAccess.getNET_IDENTIFIERRule()); 
            pushFollow(FOLLOW_ruleNET_IDENTIFIER_in_entryRuleNET_IDENTIFIER1597);
            iv_ruleNET_IDENTIFIER=ruleNET_IDENTIFIER();

            state._fsp--;

             current =iv_ruleNET_IDENTIFIER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_IDENTIFIER1608); 

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
    // $ANTLR end "entryRuleNET_IDENTIFIER"


    // $ANTLR start "ruleNET_IDENTIFIER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:687:1: ruleNET_IDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SIMPLE_IDENTIFIER_0= ruleSIMPLE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleNET_IDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SIMPLE_IDENTIFIER_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:690:28: (this_SIMPLE_IDENTIFIER_0= ruleSIMPLE_IDENTIFIER )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:692:5: this_SIMPLE_IDENTIFIER_0= ruleSIMPLE_IDENTIFIER
            {
             
                    newCompositeNode(grammarAccess.getNET_IDENTIFIERAccess().getSIMPLE_IDENTIFIERParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSIMPLE_IDENTIFIER_in_ruleNET_IDENTIFIER1654);
            this_SIMPLE_IDENTIFIER_0=ruleSIMPLE_IDENTIFIER();

            state._fsp--;


            		current.merge(this_SIMPLE_IDENTIFIER_0);
                
             
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
    // $ANTLR end "ruleNET_IDENTIFIER"


    // $ANTLR start "entryRuleSIMPLE_IDENTIFIER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:710:1: entryRuleSIMPLE_IDENTIFIER returns [String current=null] : iv_ruleSIMPLE_IDENTIFIER= ruleSIMPLE_IDENTIFIER EOF ;
    public final String entryRuleSIMPLE_IDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIMPLE_IDENTIFIER = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:711:2: (iv_ruleSIMPLE_IDENTIFIER= ruleSIMPLE_IDENTIFIER EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:712:2: iv_ruleSIMPLE_IDENTIFIER= ruleSIMPLE_IDENTIFIER EOF
            {
             newCompositeNode(grammarAccess.getSIMPLE_IDENTIFIERRule()); 
            pushFollow(FOLLOW_ruleSIMPLE_IDENTIFIER_in_entryRuleSIMPLE_IDENTIFIER1699);
            iv_ruleSIMPLE_IDENTIFIER=ruleSIMPLE_IDENTIFIER();

            state._fsp--;

             current =iv_ruleSIMPLE_IDENTIFIER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIMPLE_IDENTIFIER1710); 

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
    // $ANTLR end "entryRuleSIMPLE_IDENTIFIER"


    // $ANTLR start "ruleSIMPLE_IDENTIFIER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:719:1: ruleSIMPLE_IDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSIMPLE_IDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:722:28: (this_ID_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:723:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSIMPLE_IDENTIFIER1749); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSIMPLE_IDENTIFIERAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleSIMPLE_IDENTIFIER"


    // $ANTLR start "entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:738:1: entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION returns [EObject current=null] : iv_ruleMODULE_OR_GENERATE_ITEM_DECLARATION= ruleMODULE_OR_GENERATE_ITEM_DECLARATION EOF ;
    public final EObject entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE_OR_GENERATE_ITEM_DECLARATION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:739:2: (iv_ruleMODULE_OR_GENERATE_ITEM_DECLARATION= ruleMODULE_OR_GENERATE_ITEM_DECLARATION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:740:2: iv_ruleMODULE_OR_GENERATE_ITEM_DECLARATION= ruleMODULE_OR_GENERATE_ITEM_DECLARATION EOF
            {
             newCompositeNode(grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION1793);
            iv_ruleMODULE_OR_GENERATE_ITEM_DECLARATION=ruleMODULE_OR_GENERATE_ITEM_DECLARATION();

            state._fsp--;

             current =iv_ruleMODULE_OR_GENERATE_ITEM_DECLARATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION1803); 

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
    // $ANTLR end "entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "ruleMODULE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:747:1: ruleMODULE_OR_GENERATE_ITEM_DECLARATION returns [EObject current=null] : this_PACKAGE_OR_GENERATE_ITEM_DECLARATION_0= rulePACKAGE_OR_GENERATE_ITEM_DECLARATION ;
    public final EObject ruleMODULE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject this_PACKAGE_OR_GENERATE_ITEM_DECLARATION_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:750:28: (this_PACKAGE_OR_GENERATE_ITEM_DECLARATION_0= rulePACKAGE_OR_GENERATE_ITEM_DECLARATION )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:752:5: this_PACKAGE_OR_GENERATE_ITEM_DECLARATION_0= rulePACKAGE_OR_GENERATE_ITEM_DECLARATION
            {
             
                    newCompositeNode(grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONAccess().getPACKAGE_OR_GENERATE_ITEM_DECLARATIONParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_ruleMODULE_OR_GENERATE_ITEM_DECLARATION1849);
            this_PACKAGE_OR_GENERATE_ITEM_DECLARATION_0=rulePACKAGE_OR_GENERATE_ITEM_DECLARATION();

            state._fsp--;

             
                    current = this_PACKAGE_OR_GENERATE_ITEM_DECLARATION_0; 
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
    // $ANTLR end "ruleMODULE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:768:1: entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION returns [EObject current=null] : iv_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION= rulePACKAGE_OR_GENERATE_ITEM_DECLARATION EOF ;
    public final EObject entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:769:2: (iv_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION= rulePACKAGE_OR_GENERATE_ITEM_DECLARATION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:770:2: iv_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION= rulePACKAGE_OR_GENERATE_ITEM_DECLARATION EOF
            {
             newCompositeNode(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONRule()); 
            pushFollow(FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION1883);
            iv_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION=rulePACKAGE_OR_GENERATE_ITEM_DECLARATION();

            state._fsp--;

             current =iv_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION1893); 

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
    // $ANTLR end "entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "rulePACKAGE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:777:1: rulePACKAGE_OR_GENERATE_ITEM_DECLARATION returns [EObject current=null] : (this_NET_DECLARATION_0= ruleNET_DECLARATION | this_DATA_DECLARATION_1= ruleDATA_DECLARATION ) ;
    public final EObject rulePACKAGE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject this_NET_DECLARATION_0 = null;

        EObject this_DATA_DECLARATION_1 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:780:28: ( (this_NET_DECLARATION_0= ruleNET_DECLARATION | this_DATA_DECLARATION_1= ruleDATA_DECLARATION ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:781:1: (this_NET_DECLARATION_0= ruleNET_DECLARATION | this_DATA_DECLARATION_1= ruleDATA_DECLARATION )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:781:1: (this_NET_DECLARATION_0= ruleNET_DECLARATION | this_DATA_DECLARATION_1= ruleDATA_DECLARATION )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=38 && LA9_0<=48)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=49 && LA9_0<=54)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:782:5: this_NET_DECLARATION_0= ruleNET_DECLARATION
                    {
                     
                            newCompositeNode(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getNET_DECLARATIONParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNET_DECLARATION_in_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION1940);
                    this_NET_DECLARATION_0=ruleNET_DECLARATION();

                    state._fsp--;

                     
                            current = this_NET_DECLARATION_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:792:5: this_DATA_DECLARATION_1= ruleDATA_DECLARATION
                    {
                     
                            newCompositeNode(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getDATA_DECLARATIONParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDATA_DECLARATION_in_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION1967);
                    this_DATA_DECLARATION_1=ruleDATA_DECLARATION();

                    state._fsp--;

                     
                            current = this_DATA_DECLARATION_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulePACKAGE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "entryRuleNET_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:808:1: entryRuleNET_DECLARATION returns [EObject current=null] : iv_ruleNET_DECLARATION= ruleNET_DECLARATION EOF ;
    public final EObject entryRuleNET_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNET_DECLARATION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:809:2: (iv_ruleNET_DECLARATION= ruleNET_DECLARATION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:810:2: iv_ruleNET_DECLARATION= ruleNET_DECLARATION EOF
            {
             newCompositeNode(grammarAccess.getNET_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleNET_DECLARATION_in_entryRuleNET_DECLARATION2002);
            iv_ruleNET_DECLARATION=ruleNET_DECLARATION();

            state._fsp--;

             current =iv_ruleNET_DECLARATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_DECLARATION2012); 

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
    // $ANTLR end "entryRuleNET_DECLARATION"


    // $ANTLR start "ruleNET_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:817:1: ruleNET_DECLARATION returns [EObject current=null] : ( ruleNET_TYPE_OR_TRIREG this_LIST_OF_NET_DECL_ASSIGNMENTS_1= ruleLIST_OF_NET_DECL_ASSIGNMENTS otherlv_2= ';' ) ;
    public final EObject ruleNET_DECLARATION() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LIST_OF_NET_DECL_ASSIGNMENTS_1 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:820:28: ( ( ruleNET_TYPE_OR_TRIREG this_LIST_OF_NET_DECL_ASSIGNMENTS_1= ruleLIST_OF_NET_DECL_ASSIGNMENTS otherlv_2= ';' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:821:1: ( ruleNET_TYPE_OR_TRIREG this_LIST_OF_NET_DECL_ASSIGNMENTS_1= ruleLIST_OF_NET_DECL_ASSIGNMENTS otherlv_2= ';' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:821:1: ( ruleNET_TYPE_OR_TRIREG this_LIST_OF_NET_DECL_ASSIGNMENTS_1= ruleLIST_OF_NET_DECL_ASSIGNMENTS otherlv_2= ';' )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:822:5: ruleNET_TYPE_OR_TRIREG this_LIST_OF_NET_DECL_ASSIGNMENTS_1= ruleLIST_OF_NET_DECL_ASSIGNMENTS otherlv_2= ';'
            {
             
                    newCompositeNode(grammarAccess.getNET_DECLARATIONAccess().getNET_TYPE_OR_TRIREGParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNET_TYPE_OR_TRIREG_in_ruleNET_DECLARATION2053);
            ruleNET_TYPE_OR_TRIREG();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getNET_DECLARATIONAccess().getLIST_OF_NET_DECL_ASSIGNMENTSParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_ruleNET_DECLARATION2074);
            this_LIST_OF_NET_DECL_ASSIGNMENTS_1=ruleLIST_OF_NET_DECL_ASSIGNMENTS();

            state._fsp--;

             
                    current = this_LIST_OF_NET_DECL_ASSIGNMENTS_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleNET_DECLARATION2085); 

                	newLeafNode(otherlv_2, grammarAccess.getNET_DECLARATIONAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleNET_DECLARATION"


    // $ANTLR start "entryRuleLIST_OF_NET_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:850:1: entryRuleLIST_OF_NET_DECL_ASSIGNMENTS returns [EObject current=null] : iv_ruleLIST_OF_NET_DECL_ASSIGNMENTS= ruleLIST_OF_NET_DECL_ASSIGNMENTS EOF ;
    public final EObject entryRuleLIST_OF_NET_DECL_ASSIGNMENTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLIST_OF_NET_DECL_ASSIGNMENTS = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:851:2: (iv_ruleLIST_OF_NET_DECL_ASSIGNMENTS= ruleLIST_OF_NET_DECL_ASSIGNMENTS EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:852:2: iv_ruleLIST_OF_NET_DECL_ASSIGNMENTS= ruleLIST_OF_NET_DECL_ASSIGNMENTS EOF
            {
             newCompositeNode(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSRule()); 
            pushFollow(FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS2121);
            iv_ruleLIST_OF_NET_DECL_ASSIGNMENTS=ruleLIST_OF_NET_DECL_ASSIGNMENTS();

            state._fsp--;

             current =iv_ruleLIST_OF_NET_DECL_ASSIGNMENTS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS2131); 

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
    // $ANTLR end "entryRuleLIST_OF_NET_DECL_ASSIGNMENTS"


    // $ANTLR start "ruleLIST_OF_NET_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:859:1: ruleLIST_OF_NET_DECL_ASSIGNMENTS returns [EObject current=null] : ( ( (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) ) )* ) ;
    public final EObject ruleLIST_OF_NET_DECL_ASSIGNMENTS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_nets_0_0 = null;

        EObject lv_nets_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:862:28: ( ( ( (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) ) )* ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:863:1: ( ( (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) ) )* )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:863:1: ( ( (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) ) )* )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:863:2: ( (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) ) )*
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:863:2: ( (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:864:1: (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:864:1: (lv_nets_0_0= ruleNET_DECL_ASSIGNMENT )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:865:3: lv_nets_0_0= ruleNET_DECL_ASSIGNMENT
            {
             
            	        newCompositeNode(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsNET_DECL_ASSIGNMENTParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNET_DECL_ASSIGNMENT_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS2177);
            lv_nets_0_0=ruleNET_DECL_ASSIGNMENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSRule());
            	        }
                   		add(
                   			current, 
                   			"nets",
                    		lv_nets_0_0, 
                    		"NET_DECL_ASSIGNMENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:881:2: (otherlv_1= ',' ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:881:4: otherlv_1= ',' ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS2190); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:885:1: ( (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT ) )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:886:1: (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT )
            	    {
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:886:1: (lv_nets_2_0= ruleNET_DECL_ASSIGNMENT )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:887:3: lv_nets_2_0= ruleNET_DECL_ASSIGNMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsNET_DECL_ASSIGNMENTParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNET_DECL_ASSIGNMENT_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS2211);
            	    lv_nets_2_0=ruleNET_DECL_ASSIGNMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nets",
            	            		lv_nets_2_0, 
            	            		"NET_DECL_ASSIGNMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleLIST_OF_NET_DECL_ASSIGNMENTS"


    // $ANTLR start "entryRuleNET_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:911:1: entryRuleNET_DECL_ASSIGNMENT returns [EObject current=null] : iv_ruleNET_DECL_ASSIGNMENT= ruleNET_DECL_ASSIGNMENT EOF ;
    public final EObject entryRuleNET_DECL_ASSIGNMENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNET_DECL_ASSIGNMENT = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:912:2: (iv_ruleNET_DECL_ASSIGNMENT= ruleNET_DECL_ASSIGNMENT EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:913:2: iv_ruleNET_DECL_ASSIGNMENT= ruleNET_DECL_ASSIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getNET_DECL_ASSIGNMENTRule()); 
            pushFollow(FOLLOW_ruleNET_DECL_ASSIGNMENT_in_entryRuleNET_DECL_ASSIGNMENT2249);
            iv_ruleNET_DECL_ASSIGNMENT=ruleNET_DECL_ASSIGNMENT();

            state._fsp--;

             current =iv_ruleNET_DECL_ASSIGNMENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_DECL_ASSIGNMENT2259); 

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
    // $ANTLR end "entryRuleNET_DECL_ASSIGNMENT"


    // $ANTLR start "ruleNET_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:920:1: ruleNET_DECL_ASSIGNMENT returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? ) ;
    public final EObject ruleNET_DECL_ASSIGNMENT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_dimensions_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:923:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:924:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:924:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:924:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )?
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:924:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:925:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:925:1: (lv_name_0_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:926:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNET_DECL_ASSIGNMENT2301); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNET_DECL_ASSIGNMENTAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNET_DECL_ASSIGNMENTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:942:2: ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:943:1: (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS )
            	    {
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:943:1: (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:944:3: lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getDimensionsUNPACKED_DIMENSIONSParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUNPACKED_DIMENSIONS_in_ruleNET_DECL_ASSIGNMENT2327);
            	    lv_dimensions_1_0=ruleUNPACKED_DIMENSIONS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNET_DECL_ASSIGNMENTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_1_0, 
            	            		"UNPACKED_DIMENSIONS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:960:3: (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:960:5: otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleNET_DECL_ASSIGNMENT2341); 

                        	newLeafNode(otherlv_2, grammarAccess.getNET_DECL_ASSIGNMENTAccess().getEqualsSignKeyword_2_0());
                        
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:964:1: ( (lv_value_3_0= ruleNUMBER ) )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:965:1: (lv_value_3_0= ruleNUMBER )
                    {
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:965:1: (lv_value_3_0= ruleNUMBER )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:966:3: lv_value_3_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getValueNUMBERParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleNET_DECL_ASSIGNMENT2362);
                    lv_value_3_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNET_DECL_ASSIGNMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"NUMBER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleNET_DECL_ASSIGNMENT"


    // $ANTLR start "entryRuleUNPACKED_DIMENSIONS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:990:1: entryRuleUNPACKED_DIMENSIONS returns [EObject current=null] : iv_ruleUNPACKED_DIMENSIONS= ruleUNPACKED_DIMENSIONS EOF ;
    public final EObject entryRuleUNPACKED_DIMENSIONS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNPACKED_DIMENSIONS = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:991:2: (iv_ruleUNPACKED_DIMENSIONS= ruleUNPACKED_DIMENSIONS EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:992:2: iv_ruleUNPACKED_DIMENSIONS= ruleUNPACKED_DIMENSIONS EOF
            {
             newCompositeNode(grammarAccess.getUNPACKED_DIMENSIONSRule()); 
            pushFollow(FOLLOW_ruleUNPACKED_DIMENSIONS_in_entryRuleUNPACKED_DIMENSIONS2400);
            iv_ruleUNPACKED_DIMENSIONS=ruleUNPACKED_DIMENSIONS();

            state._fsp--;

             current =iv_ruleUNPACKED_DIMENSIONS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNPACKED_DIMENSIONS2410); 

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
    // $ANTLR end "entryRuleUNPACKED_DIMENSIONS"


    // $ANTLR start "ruleUNPACKED_DIMENSIONS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:999:1: ruleUNPACKED_DIMENSIONS returns [EObject current=null] : (otherlv_0= '[' ( (lv_left_bound_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_right_bound_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleUNPACKED_DIMENSIONS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_left_bound_1_0=null;
        Token otherlv_2=null;
        Token lv_right_bound_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1002:28: ( (otherlv_0= '[' ( (lv_left_bound_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_right_bound_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1003:1: (otherlv_0= '[' ( (lv_left_bound_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_right_bound_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1003:1: (otherlv_0= '[' ( (lv_left_bound_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_right_bound_3_0= RULE_INT ) ) otherlv_4= ']' )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1003:3: otherlv_0= '[' ( (lv_left_bound_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_right_bound_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleUNPACKED_DIMENSIONS2447); 

                	newLeafNode(otherlv_0, grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeftSquareBracketKeyword_0());
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1007:1: ( (lv_left_bound_1_0= RULE_INT ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1008:1: (lv_left_bound_1_0= RULE_INT )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1008:1: (lv_left_bound_1_0= RULE_INT )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1009:3: lv_left_bound_1_0= RULE_INT
            {
            lv_left_bound_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUNPACKED_DIMENSIONS2464); 

            			newLeafNode(lv_left_bound_1_0, grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeft_boundINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUNPACKED_DIMENSIONSRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"left_bound",
                    		lv_left_bound_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleUNPACKED_DIMENSIONS2481); 

                	newLeafNode(otherlv_2, grammarAccess.getUNPACKED_DIMENSIONSAccess().getColonKeyword_2());
                
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1029:1: ( (lv_right_bound_3_0= RULE_INT ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1030:1: (lv_right_bound_3_0= RULE_INT )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1030:1: (lv_right_bound_3_0= RULE_INT )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1031:3: lv_right_bound_3_0= RULE_INT
            {
            lv_right_bound_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUNPACKED_DIMENSIONS2498); 

            			newLeafNode(lv_right_bound_3_0, grammarAccess.getUNPACKED_DIMENSIONSAccess().getRight_boundINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUNPACKED_DIMENSIONSRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"right_bound",
                    		lv_right_bound_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleUNPACKED_DIMENSIONS2515); 

                	newLeafNode(otherlv_4, grammarAccess.getUNPACKED_DIMENSIONSAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleUNPACKED_DIMENSIONS"


    // $ANTLR start "entryRuleNET_TYPE_OR_TRIREG"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1059:1: entryRuleNET_TYPE_OR_TRIREG returns [String current=null] : iv_ruleNET_TYPE_OR_TRIREG= ruleNET_TYPE_OR_TRIREG EOF ;
    public final String entryRuleNET_TYPE_OR_TRIREG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNET_TYPE_OR_TRIREG = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1060:2: (iv_ruleNET_TYPE_OR_TRIREG= ruleNET_TYPE_OR_TRIREG EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1061:2: iv_ruleNET_TYPE_OR_TRIREG= ruleNET_TYPE_OR_TRIREG EOF
            {
             newCompositeNode(grammarAccess.getNET_TYPE_OR_TRIREGRule()); 
            pushFollow(FOLLOW_ruleNET_TYPE_OR_TRIREG_in_entryRuleNET_TYPE_OR_TRIREG2552);
            iv_ruleNET_TYPE_OR_TRIREG=ruleNET_TYPE_OR_TRIREG();

            state._fsp--;

             current =iv_ruleNET_TYPE_OR_TRIREG.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_TYPE_OR_TRIREG2563); 

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
    // $ANTLR end "entryRuleNET_TYPE_OR_TRIREG"


    // $ANTLR start "ruleNET_TYPE_OR_TRIREG"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1068:1: ruleNET_TYPE_OR_TRIREG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NET_TYPE_0= ruleNET_TYPE | kw= 'trireg' ) ;
    public final AntlrDatatypeRuleToken ruleNET_TYPE_OR_TRIREG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NET_TYPE_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1071:28: ( (this_NET_TYPE_0= ruleNET_TYPE | kw= 'trireg' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1072:1: (this_NET_TYPE_0= ruleNET_TYPE | kw= 'trireg' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1072:1: (this_NET_TYPE_0= ruleNET_TYPE | kw= 'trireg' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=39 && LA13_0<=48)) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1073:5: this_NET_TYPE_0= ruleNET_TYPE
                    {
                     
                            newCompositeNode(grammarAccess.getNET_TYPE_OR_TRIREGAccess().getNET_TYPEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNET_TYPE_in_ruleNET_TYPE_OR_TRIREG2610);
                    this_NET_TYPE_0=ruleNET_TYPE();

                    state._fsp--;


                    		current.merge(this_NET_TYPE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1085:2: kw= 'trireg'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNET_TYPE_OR_TRIREG2634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPE_OR_TRIREGAccess().getTriregKeyword_1()); 
                        

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
    // $ANTLR end "ruleNET_TYPE_OR_TRIREG"


    // $ANTLR start "entryRuleNET_TYPE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1098:1: entryRuleNET_TYPE returns [String current=null] : iv_ruleNET_TYPE= ruleNET_TYPE EOF ;
    public final String entryRuleNET_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNET_TYPE = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1099:2: (iv_ruleNET_TYPE= ruleNET_TYPE EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1100:2: iv_ruleNET_TYPE= ruleNET_TYPE EOF
            {
             newCompositeNode(grammarAccess.getNET_TYPERule()); 
            pushFollow(FOLLOW_ruleNET_TYPE_in_entryRuleNET_TYPE2675);
            iv_ruleNET_TYPE=ruleNET_TYPE();

            state._fsp--;

             current =iv_ruleNET_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_TYPE2686); 

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
    // $ANTLR end "entryRuleNET_TYPE"


    // $ANTLR start "ruleNET_TYPE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1107:1: ruleNET_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'supply0' | kw= 'supply1' | kw= 'tri' | kw= 'triand' | kw= 'trior' | kw= 'tri0' | kw= 'tri1' | kw= 'wire' | kw= 'wand' | kw= 'wor' ) ;
    public final AntlrDatatypeRuleToken ruleNET_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1110:28: ( (kw= 'supply0' | kw= 'supply1' | kw= 'tri' | kw= 'triand' | kw= 'trior' | kw= 'tri0' | kw= 'tri1' | kw= 'wire' | kw= 'wand' | kw= 'wor' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1111:1: (kw= 'supply0' | kw= 'supply1' | kw= 'tri' | kw= 'triand' | kw= 'trior' | kw= 'tri0' | kw= 'tri1' | kw= 'wire' | kw= 'wand' | kw= 'wor' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1111:1: (kw= 'supply0' | kw= 'supply1' | kw= 'tri' | kw= 'triand' | kw= 'trior' | kw= 'tri0' | kw= 'tri1' | kw= 'wire' | kw= 'wand' | kw= 'wor' )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            case 42:
                {
                alt14=4;
                }
                break;
            case 43:
                {
                alt14=5;
                }
                break;
            case 44:
                {
                alt14=6;
                }
                break;
            case 45:
                {
                alt14=7;
                }
                break;
            case 46:
                {
                alt14=8;
                }
                break;
            case 47:
                {
                alt14=9;
                }
                break;
            case 48:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1112:2: kw= 'supply0'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNET_TYPE2724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getSupply0Keyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1119:2: kw= 'supply1'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleNET_TYPE2743); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getSupply1Keyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1126:2: kw= 'tri'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleNET_TYPE2762); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getTriKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1133:2: kw= 'triand'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleNET_TYPE2781); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getTriandKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1140:2: kw= 'trior'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleNET_TYPE2800); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getTriorKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1147:2: kw= 'tri0'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleNET_TYPE2819); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getTri0Keyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1154:2: kw= 'tri1'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleNET_TYPE2838); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getTri1Keyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1161:2: kw= 'wire'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleNET_TYPE2857); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getWireKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1168:2: kw= 'wand'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleNET_TYPE2876); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getWandKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1175:2: kw= 'wor'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleNET_TYPE2895); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNET_TYPEAccess().getWorKeyword_9()); 
                        

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
    // $ANTLR end "ruleNET_TYPE"


    // $ANTLR start "entryRuleDATA_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1188:1: entryRuleDATA_DECLARATION returns [EObject current=null] : iv_ruleDATA_DECLARATION= ruleDATA_DECLARATION EOF ;
    public final EObject entryRuleDATA_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDATA_DECLARATION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1189:2: (iv_ruleDATA_DECLARATION= ruleDATA_DECLARATION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1190:2: iv_ruleDATA_DECLARATION= ruleDATA_DECLARATION EOF
            {
             newCompositeNode(grammarAccess.getDATA_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleDATA_DECLARATION_in_entryRuleDATA_DECLARATION2935);
            iv_ruleDATA_DECLARATION=ruleDATA_DECLARATION();

            state._fsp--;

             current =iv_ruleDATA_DECLARATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATA_DECLARATION2945); 

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
    // $ANTLR end "entryRuleDATA_DECLARATION"


    // $ANTLR start "ruleDATA_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1197:1: ruleDATA_DECLARATION returns [EObject current=null] : ( (otherlv_0= 'const' )? ( ruleLIFETIME )? this_VARIABLE_DECLARATION_2= ruleVARIABLE_DECLARATION ) ;
    public final EObject ruleDATA_DECLARATION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VARIABLE_DECLARATION_2 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1200:28: ( ( (otherlv_0= 'const' )? ( ruleLIFETIME )? this_VARIABLE_DECLARATION_2= ruleVARIABLE_DECLARATION ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1201:1: ( (otherlv_0= 'const' )? ( ruleLIFETIME )? this_VARIABLE_DECLARATION_2= ruleVARIABLE_DECLARATION )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1201:1: ( (otherlv_0= 'const' )? ( ruleLIFETIME )? this_VARIABLE_DECLARATION_2= ruleVARIABLE_DECLARATION )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1201:2: (otherlv_0= 'const' )? ( ruleLIFETIME )? this_VARIABLE_DECLARATION_2= ruleVARIABLE_DECLARATION
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1201:2: (otherlv_0= 'const' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1201:4: otherlv_0= 'const'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleDATA_DECLARATION2983); 

                        	newLeafNode(otherlv_0, grammarAccess.getDATA_DECLARATIONAccess().getConstKeyword_0());
                        

                    }
                    break;

            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1205:3: ( ruleLIFETIME )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=50 && LA16_0<=51)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1206:5: ruleLIFETIME
                    {
                     
                            newCompositeNode(grammarAccess.getDATA_DECLARATIONAccess().getLIFETIMEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLIFETIME_in_ruleDATA_DECLARATION3002);
                    ruleLIFETIME();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDATA_DECLARATIONAccess().getVARIABLE_DECLARATIONParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_ruleDATA_DECLARATION3025);
            this_VARIABLE_DECLARATION_2=ruleVARIABLE_DECLARATION();

            state._fsp--;

             
                    current = this_VARIABLE_DECLARATION_2; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleDATA_DECLARATION"


    // $ANTLR start "entryRuleLIFETIME"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1230:1: entryRuleLIFETIME returns [String current=null] : iv_ruleLIFETIME= ruleLIFETIME EOF ;
    public final String entryRuleLIFETIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLIFETIME = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1231:2: (iv_ruleLIFETIME= ruleLIFETIME EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1232:2: iv_ruleLIFETIME= ruleLIFETIME EOF
            {
             newCompositeNode(grammarAccess.getLIFETIMERule()); 
            pushFollow(FOLLOW_ruleLIFETIME_in_entryRuleLIFETIME3061);
            iv_ruleLIFETIME=ruleLIFETIME();

            state._fsp--;

             current =iv_ruleLIFETIME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIFETIME3072); 

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
    // $ANTLR end "entryRuleLIFETIME"


    // $ANTLR start "ruleLIFETIME"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1239:1: ruleLIFETIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'static' | kw= 'automatic' ) ;
    public final AntlrDatatypeRuleToken ruleLIFETIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1242:28: ( (kw= 'static' | kw= 'automatic' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1243:1: (kw= 'static' | kw= 'automatic' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1243:1: (kw= 'static' | kw= 'automatic' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            else if ( (LA17_0==51) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1244:2: kw= 'static'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleLIFETIME3110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLIFETIMEAccess().getStaticKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1251:2: kw= 'automatic'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleLIFETIME3129); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLIFETIMEAccess().getAutomaticKeyword_1()); 
                        

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
    // $ANTLR end "ruleLIFETIME"


    // $ANTLR start "entryRuleVARIABLE_DECLARATION"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1264:1: entryRuleVARIABLE_DECLARATION returns [EObject current=null] : iv_ruleVARIABLE_DECLARATION= ruleVARIABLE_DECLARATION EOF ;
    public final EObject entryRuleVARIABLE_DECLARATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVARIABLE_DECLARATION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1265:2: (iv_ruleVARIABLE_DECLARATION= ruleVARIABLE_DECLARATION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1266:2: iv_ruleVARIABLE_DECLARATION= ruleVARIABLE_DECLARATION EOF
            {
             newCompositeNode(grammarAccess.getVARIABLE_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION3169);
            iv_ruleVARIABLE_DECLARATION=ruleVARIABLE_DECLARATION();

            state._fsp--;

             current =iv_ruleVARIABLE_DECLARATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION3179); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1273:1: ruleVARIABLE_DECLARATION returns [EObject current=null] : ( ruleDATA_TYPE this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS otherlv_2= ';' ) ;
    public final EObject ruleVARIABLE_DECLARATION() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1276:28: ( ( ruleDATA_TYPE this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS otherlv_2= ';' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1277:1: ( ruleDATA_TYPE this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS otherlv_2= ';' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1277:1: ( ruleDATA_TYPE this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS otherlv_2= ';' )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1278:5: ruleDATA_TYPE this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS otherlv_2= ';'
            {
             
                    newCompositeNode(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDATA_TYPE_in_ruleVARIABLE_DECLARATION3220);
            ruleDATA_TYPE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getVARIABLE_DECLARATIONAccess().getLIST_OF_VARIABLE_DECL_ASSIGNMENTSParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_ruleVARIABLE_DECLARATION3241);
            this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1=ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS();

            state._fsp--;

             
                    current = this_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleVARIABLE_DECLARATION3252); 

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


    // $ANTLR start "entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1306:1: entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS returns [EObject current=null] : iv_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS EOF ;
    public final EObject entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1307:2: (iv_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1308:2: iv_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS= ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS EOF
            {
             newCompositeNode(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSRule()); 
            pushFollow(FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3288);
            iv_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS=ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS();

            state._fsp--;

             current =iv_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3298); 

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
    // $ANTLR end "entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"


    // $ANTLR start "ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1315:1: ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) )* ) ;
    public final EObject ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1318:28: ( ( ( (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) )* ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1319:1: ( ( (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) )* )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1319:1: ( ( (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) )* )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1319:2: ( (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) )*
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1319:2: ( (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1320:1: (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1320:1: (lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1321:3: lv_variables_0_0= ruleVARIABLE_DECL_ASSIGNMENT
            {
             
            	        newCompositeNode(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesVARIABLE_DECL_ASSIGNMENTParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3344);
            lv_variables_0_0=ruleVARIABLE_DECL_ASSIGNMENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_0_0, 
                    		"VARIABLE_DECL_ASSIGNMENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1337:2: (otherlv_1= ',' ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1337:4: otherlv_1= ',' ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3357); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1341:1: ( (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT ) )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1342:1: (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT )
            	    {
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1342:1: (lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1343:3: lv_variables_2_0= ruleVARIABLE_DECL_ASSIGNMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesVARIABLE_DECL_ASSIGNMENTParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3378);
            	    lv_variables_2_0=ruleVARIABLE_DECL_ASSIGNMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_2_0, 
            	            		"VARIABLE_DECL_ASSIGNMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"


    // $ANTLR start "entryRuleVARIABLE_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1367:1: entryRuleVARIABLE_DECL_ASSIGNMENT returns [EObject current=null] : iv_ruleVARIABLE_DECL_ASSIGNMENT= ruleVARIABLE_DECL_ASSIGNMENT EOF ;
    public final EObject entryRuleVARIABLE_DECL_ASSIGNMENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVARIABLE_DECL_ASSIGNMENT = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1368:2: (iv_ruleVARIABLE_DECL_ASSIGNMENT= ruleVARIABLE_DECL_ASSIGNMENT EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1369:2: iv_ruleVARIABLE_DECL_ASSIGNMENT= ruleVARIABLE_DECL_ASSIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getVARIABLE_DECL_ASSIGNMENTRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_entryRuleVARIABLE_DECL_ASSIGNMENT3416);
            iv_ruleVARIABLE_DECL_ASSIGNMENT=ruleVARIABLE_DECL_ASSIGNMENT();

            state._fsp--;

             current =iv_ruleVARIABLE_DECL_ASSIGNMENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_DECL_ASSIGNMENT3426); 

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
    // $ANTLR end "entryRuleVARIABLE_DECL_ASSIGNMENT"


    // $ANTLR start "ruleVARIABLE_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1376:1: ruleVARIABLE_DECL_ASSIGNMENT returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? ) ;
    public final EObject ruleVARIABLE_DECL_ASSIGNMENT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_dimensions_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1379:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1380:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1380:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )? )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1380:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )* (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )?
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1380:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1381:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1381:1: (lv_name_0_0= RULE_ID )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1382:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_DECL_ASSIGNMENT3468); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVARIABLE_DECL_ASSIGNMENTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1398:2: ( (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1399:1: (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS )
            	    {
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1399:1: (lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS )
            	    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1400:3: lv_dimensions_1_0= ruleUNPACKED_DIMENSIONS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getDimensionsUNPACKED_DIMENSIONSParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUNPACKED_DIMENSIONS_in_ruleVARIABLE_DECL_ASSIGNMENT3494);
            	    lv_dimensions_1_0=ruleUNPACKED_DIMENSIONS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVARIABLE_DECL_ASSIGNMENTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_1_0, 
            	            		"UNPACKED_DIMENSIONS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1416:3: (otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1416:5: otherlv_2= '=' ( (lv_value_3_0= ruleNUMBER ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleVARIABLE_DECL_ASSIGNMENT3508); 

                        	newLeafNode(otherlv_2, grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getEqualsSignKeyword_2_0());
                        
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1420:1: ( (lv_value_3_0= ruleNUMBER ) )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1421:1: (lv_value_3_0= ruleNUMBER )
                    {
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1421:1: (lv_value_3_0= ruleNUMBER )
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1422:3: lv_value_3_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getValueNUMBERParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleVARIABLE_DECL_ASSIGNMENT3529);
                    lv_value_3_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVARIABLE_DECL_ASSIGNMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"NUMBER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleVARIABLE_DECL_ASSIGNMENT"


    // $ANTLR start "entryRuleDATA_TYPE"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1446:1: entryRuleDATA_TYPE returns [String current=null] : iv_ruleDATA_TYPE= ruleDATA_TYPE EOF ;
    public final String entryRuleDATA_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATA_TYPE = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1447:2: (iv_ruleDATA_TYPE= ruleDATA_TYPE EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1448:2: iv_ruleDATA_TYPE= ruleDATA_TYPE EOF
            {
             newCompositeNode(grammarAccess.getDATA_TYPERule()); 
            pushFollow(FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE3568);
            iv_ruleDATA_TYPE=ruleDATA_TYPE();

            state._fsp--;

             current =iv_ruleDATA_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATA_TYPE3579); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1455:1: ruleDATA_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_VECTOR_TYPE_0= ruleINTEGER_VECTOR_TYPE ;
    public final AntlrDatatypeRuleToken ruleDATA_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_INTEGER_VECTOR_TYPE_0 = null;


         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1458:28: (this_INTEGER_VECTOR_TYPE_0= ruleINTEGER_VECTOR_TYPE )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1460:5: this_INTEGER_VECTOR_TYPE_0= ruleINTEGER_VECTOR_TYPE
            {
             
                    newCompositeNode(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE3625);
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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1478:1: entryRuleINTEGER_VECTOR_TYPE returns [String current=null] : iv_ruleINTEGER_VECTOR_TYPE= ruleINTEGER_VECTOR_TYPE EOF ;
    public final String entryRuleINTEGER_VECTOR_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER_VECTOR_TYPE = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1479:2: (iv_ruleINTEGER_VECTOR_TYPE= ruleINTEGER_VECTOR_TYPE EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1480:2: iv_ruleINTEGER_VECTOR_TYPE= ruleINTEGER_VECTOR_TYPE EOF
            {
             newCompositeNode(grammarAccess.getINTEGER_VECTOR_TYPERule()); 
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE3670);
            iv_ruleINTEGER_VECTOR_TYPE=ruleINTEGER_VECTOR_TYPE();

            state._fsp--;

             current =iv_ruleINTEGER_VECTOR_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE3681); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1487:1: ruleINTEGER_VECTOR_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bit' | kw= 'logic' | kw= 'reg' ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER_VECTOR_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1490:28: ( (kw= 'bit' | kw= 'logic' | kw= 'reg' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1491:1: (kw= 'bit' | kw= 'logic' | kw= 'reg' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1491:1: (kw= 'bit' | kw= 'logic' | kw= 'reg' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt21=1;
                }
                break;
            case 53:
                {
                alt21=2;
                }
                break;
            case 54:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1492:2: kw= 'bit'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleINTEGER_VECTOR_TYPE3719); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1499:2: kw= 'logic'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleINTEGER_VECTOR_TYPE3738); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1506:2: kw= 'reg'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleINTEGER_VECTOR_TYPE3757); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1519:1: entryRuleMODULE_KEYWORD returns [String current=null] : iv_ruleMODULE_KEYWORD= ruleMODULE_KEYWORD EOF ;
    public final String entryRuleMODULE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMODULE_KEYWORD = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1520:2: (iv_ruleMODULE_KEYWORD= ruleMODULE_KEYWORD EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1521:2: iv_ruleMODULE_KEYWORD= ruleMODULE_KEYWORD EOF
            {
             newCompositeNode(grammarAccess.getMODULE_KEYWORDRule()); 
            pushFollow(FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD3798);
            iv_ruleMODULE_KEYWORD=ruleMODULE_KEYWORD();

            state._fsp--;

             current =iv_ruleMODULE_KEYWORD.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_KEYWORD3809); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1528:1: ruleMODULE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'module' | kw= 'macromodule' ) ;
    public final AntlrDatatypeRuleToken ruleMODULE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1531:28: ( (kw= 'module' | kw= 'macromodule' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1532:1: (kw= 'module' | kw= 'macromodule' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1532:1: (kw= 'module' | kw= 'macromodule' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            else if ( (LA22_0==56) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1533:2: kw= 'module'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleMODULE_KEYWORD3847); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1540:2: kw= 'macromodule'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleMODULE_KEYWORD3866); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1553:1: entryRulePORT_DIRECTION returns [String current=null] : iv_rulePORT_DIRECTION= rulePORT_DIRECTION EOF ;
    public final String entryRulePORT_DIRECTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePORT_DIRECTION = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1554:2: (iv_rulePORT_DIRECTION= rulePORT_DIRECTION EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1555:2: iv_rulePORT_DIRECTION= rulePORT_DIRECTION EOF
            {
             newCompositeNode(grammarAccess.getPORT_DIRECTIONRule()); 
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION3907);
            iv_rulePORT_DIRECTION=rulePORT_DIRECTION();

            state._fsp--;

             current =iv_rulePORT_DIRECTION.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePORT_DIRECTION3918); 

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
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1562:1: rulePORT_DIRECTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' ) ;
    public final AntlrDatatypeRuleToken rulePORT_DIRECTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1565:28: ( (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1566:1: (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1566:1: (kw= 'input' | kw= 'output' | kw= 'inout' | kw= 'ref' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt23=1;
                }
                break;
            case 58:
                {
                alt23=2;
                }
                break;
            case 59:
                {
                alt23=3;
                }
                break;
            case 60:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1567:2: kw= 'input'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_rulePORT_DIRECTION3956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1574:2: kw= 'output'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_rulePORT_DIRECTION3975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1581:2: kw= 'inout'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_rulePORT_DIRECTION3994); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1588:2: kw= 'ref'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_rulePORT_DIRECTION4013); 

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


    // $ANTLR start "entryRuleNUMBER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1601:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1602:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1603:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER4054);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER4065); 

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1610:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BINARY_NUMBER_0= RULE_BINARY_NUMBER | this_OCTAL_NUMBER_1= RULE_OCTAL_NUMBER | this_HEX_NUMBER_2= RULE_HEX_NUMBER | this_DECIMAL_NUMBER_3= RULE_DECIMAL_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_NUMBER_0=null;
        Token this_OCTAL_NUMBER_1=null;
        Token this_HEX_NUMBER_2=null;
        Token this_DECIMAL_NUMBER_3=null;

         enterRule(); 
            
        try {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1613:28: ( (this_BINARY_NUMBER_0= RULE_BINARY_NUMBER | this_OCTAL_NUMBER_1= RULE_OCTAL_NUMBER | this_HEX_NUMBER_2= RULE_HEX_NUMBER | this_DECIMAL_NUMBER_3= RULE_DECIMAL_NUMBER ) )
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1614:1: (this_BINARY_NUMBER_0= RULE_BINARY_NUMBER | this_OCTAL_NUMBER_1= RULE_OCTAL_NUMBER | this_HEX_NUMBER_2= RULE_HEX_NUMBER | this_DECIMAL_NUMBER_3= RULE_DECIMAL_NUMBER )
            {
            // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1614:1: (this_BINARY_NUMBER_0= RULE_BINARY_NUMBER | this_OCTAL_NUMBER_1= RULE_OCTAL_NUMBER | this_HEX_NUMBER_2= RULE_HEX_NUMBER | this_DECIMAL_NUMBER_3= RULE_DECIMAL_NUMBER )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_BINARY_NUMBER:
                {
                alt24=1;
                }
                break;
            case RULE_OCTAL_NUMBER:
                {
                alt24=2;
                }
                break;
            case RULE_HEX_NUMBER:
                {
                alt24=3;
                }
                break;
            case RULE_DECIMAL_NUMBER:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1614:6: this_BINARY_NUMBER_0= RULE_BINARY_NUMBER
                    {
                    this_BINARY_NUMBER_0=(Token)match(input,RULE_BINARY_NUMBER,FOLLOW_RULE_BINARY_NUMBER_in_ruleNUMBER4105); 

                    		current.merge(this_BINARY_NUMBER_0);
                        
                     
                        newLeafNode(this_BINARY_NUMBER_0, grammarAccess.getNUMBERAccess().getBINARY_NUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1622:10: this_OCTAL_NUMBER_1= RULE_OCTAL_NUMBER
                    {
                    this_OCTAL_NUMBER_1=(Token)match(input,RULE_OCTAL_NUMBER,FOLLOW_RULE_OCTAL_NUMBER_in_ruleNUMBER4131); 

                    		current.merge(this_OCTAL_NUMBER_1);
                        
                     
                        newLeafNode(this_OCTAL_NUMBER_1, grammarAccess.getNUMBERAccess().getOCTAL_NUMBERTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1630:10: this_HEX_NUMBER_2= RULE_HEX_NUMBER
                    {
                    this_HEX_NUMBER_2=(Token)match(input,RULE_HEX_NUMBER,FOLLOW_RULE_HEX_NUMBER_in_ruleNUMBER4157); 

                    		current.merge(this_HEX_NUMBER_2);
                        
                     
                        newLeafNode(this_HEX_NUMBER_2, grammarAccess.getNUMBERAccess().getHEX_NUMBERTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge/src-gen/com/ironglass/hdlforge/parser/antlr/internal/InternalSystemVerilog.g:1638:10: this_DECIMAL_NUMBER_3= RULE_DECIMAL_NUMBER
                    {
                    this_DECIMAL_NUMBER_3=(Token)match(input,RULE_DECIMAL_NUMBER,FOLLOW_RULE_DECIMAL_NUMBER_in_ruleNUMBER4183); 

                    		current.merge(this_DECIMAL_NUMBER_3);
                        
                     
                        newLeafNode(this_DECIMAL_NUMBER_3, grammarAccess.getNUMBERAccess().getDECIMAL_NUMBERTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleNUMBER"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_ruleModule126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule142 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_27_in_ruleModule160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleModule181 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleModule194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleModule215 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleModule229 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleModule243 = new BitSet(new long[]{0x1E00000020000000L});
    public static final BitSet FOLLOW_rulePort_in_ruleModule265 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleModule278 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_rulePort_in_ruleModule299 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleModule315 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleModule327 = new BitSet(new long[]{0x007FFFC300000000L});
    public static final BitSet FOLLOW_ruleMODULE_ITEM_in_ruleModule348 = new BitSet(new long[]{0x007FFFC300000000L});
    public static final BitSet FOLLOW_32_in_ruleModule361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_rulePort544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_ITEM_in_entryRuleMODULE_ITEM602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_ITEM612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNON_PORT_MODULE_ITEM_in_ruleMODULE_ITEM658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNON_PORT_MODULE_ITEM_in_entryRuleNON_PORT_MODULE_ITEM692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNON_PORT_MODULE_ITEM702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_ruleNON_PORT_MODULE_ITEM748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_entryRuleMODULE_OR_GENERATE_ITEM782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_COMMON_ITEM_in_ruleMODULE_OR_GENERATE_ITEM838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_COMMON_ITEM_in_entryRuleMODULE_COMMON_ITEM872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_COMMON_ITEM882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_ruleMODULE_COMMON_ITEM929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTINUOUS_ASSIGN_in_ruleMODULE_COMMON_ITEM956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTINUOUS_ASSIGN_in_entryRuleCONTINUOUS_ASSIGN991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTINUOUS_ASSIGN1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCONTINUOUS_ASSIGN1038 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_DRIVE_STRENGTH_in_ruleCONTINUOUS_ASSIGN1050 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_ruleCONTINUOUS_ASSIGN1073 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCONTINUOUS_ASSIGN1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_entryRuleLIST_OF_NET_ASSIGNMENTS1120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIST_OF_NET_ASSIGNMENTS1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_ASSIGNMENT_in_ruleLIST_OF_NET_ASSIGNMENTS1176 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleLIST_OF_NET_ASSIGNMENTS1189 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleNET_ASSIGNMENT_in_ruleLIST_OF_NET_ASSIGNMENTS1210 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleNET_ASSIGNMENT_in_entryRuleNET_ASSIGNMENT1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_ASSIGNMENT1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_LVALUE_in_ruleNET_ASSIGNMENT1307 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleNET_ASSIGNMENT1325 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNET_ASSIGNMENT1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_LVALUE_in_entryRuleNET_LVALUE1393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_LVALUE1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_ruleNET_LVALUE1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER1495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_IDENTIFIER_in_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_IDENTIFIER_in_entryRuleNET_IDENTIFIER1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_IDENTIFIER1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_IDENTIFIER_in_ruleNET_IDENTIFIER1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_IDENTIFIER_in_entryRuleSIMPLE_IDENTIFIER1699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIMPLE_IDENTIFIER1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSIMPLE_IDENTIFIER1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION1793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_ruleMODULE_OR_GENERATE_ITEM_DECLARATION1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION1883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECLARATION_in_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_DECLARATION_in_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECLARATION_in_entryRuleNET_DECLARATION2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_DECLARATION2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_OR_TRIREG_in_ruleNET_DECLARATION2053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_ruleNET_DECLARATION2074 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNET_DECLARATION2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS2121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECL_ASSIGNMENT_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS2177 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS2190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNET_DECL_ASSIGNMENT_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS2211 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleNET_DECL_ASSIGNMENT_in_entryRuleNET_DECL_ASSIGNMENT2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_DECL_ASSIGNMENT2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNET_DECL_ASSIGNMENT2301 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleUNPACKED_DIMENSIONS_in_ruleNET_DECL_ASSIGNMENT2327 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleNET_DECL_ASSIGNMENT2341 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNET_DECL_ASSIGNMENT2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNPACKED_DIMENSIONS_in_entryRuleUNPACKED_DIMENSIONS2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNPACKED_DIMENSIONS2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUNPACKED_DIMENSIONS2447 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUNPACKED_DIMENSIONS2464 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleUNPACKED_DIMENSIONS2481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUNPACKED_DIMENSIONS2498 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleUNPACKED_DIMENSIONS2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_OR_TRIREG_in_entryRuleNET_TYPE_OR_TRIREG2552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_TYPE_OR_TRIREG2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_in_ruleNET_TYPE_OR_TRIREG2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNET_TYPE_OR_TRIREG2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_in_entryRuleNET_TYPE2675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_TYPE2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNET_TYPE2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNET_TYPE2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNET_TYPE2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNET_TYPE2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNET_TYPE2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNET_TYPE2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNET_TYPE2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleNET_TYPE2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNET_TYPE2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNET_TYPE2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_DECLARATION_in_entryRuleDATA_DECLARATION2935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATA_DECLARATION2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDATA_DECLARATION2983 = new BitSet(new long[]{0x007FFFC000000000L});
    public static final BitSet FOLLOW_ruleLIFETIME_in_ruleDATA_DECLARATION3002 = new BitSet(new long[]{0x007FFFC000000000L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_ruleDATA_DECLARATION3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIFETIME_in_entryRuleLIFETIME3061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIFETIME3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLIFETIME3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLIFETIME3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_ruleVARIABLE_DECLARATION3220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_ruleVARIABLE_DECLARATION3241 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVARIABLE_DECLARATION3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3344 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS3378 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_entryRuleVARIABLE_DECL_ASSIGNMENT3416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_DECL_ASSIGNMENT3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_DECL_ASSIGNMENT3468 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleUNPACKED_DIMENSIONS_in_ruleVARIABLE_DECL_ASSIGNMENT3494 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleVARIABLE_DECL_ASSIGNMENT3508 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleVARIABLE_DECL_ASSIGNMENT3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE3568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATA_TYPE3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE3670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleINTEGER_VECTOR_TYPE3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleINTEGER_VECTOR_TYPE3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleINTEGER_VECTOR_TYPE3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD3798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_KEYWORD3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMODULE_KEYWORD3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMODULE_KEYWORD3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION3907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePORT_DIRECTION3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePORT_DIRECTION3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePORT_DIRECTION3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePORT_DIRECTION3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePORT_DIRECTION4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER4054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BINARY_NUMBER_in_ruleNUMBER4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAL_NUMBER_in_ruleNUMBER4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUMBER_in_ruleNUMBER4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_NUMBER_in_ruleNUMBER4183 = new BitSet(new long[]{0x0000000000000002L});

}