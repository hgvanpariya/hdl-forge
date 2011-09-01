package com.ironglass.hdlforge.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemVerilogLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_HEX_BASE=15;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_DECIMAL_NUMBER=8;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_OCTAL_DIGIT=14;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_OCTAL_BASE=13;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_BINARY_NUMBER=5;
    public static final int RULE_INT=10;
    public static final int T__50=50;
    public static final int RULE_DRIVE_STRENGTH=9;
    public static final int RULE_X_DIGIT=18;
    public static final int RULE_OCTAL_NUMBER=6;
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
    public static final int RULE_HEX_NUMBER=7;
    public static final int RULE_STRENGTH0=20;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_STRENGTH1=21;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=22;
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

    public InternalSystemVerilogLexer() {;} 
    public InternalSystemVerilogLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSystemVerilogLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:11:7: ( 'trireg' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:11:9: 'trireg'
            {
            match("trireg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:12:7: ( 'supply0' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:12:9: 'supply0'
            {
            match("supply0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:13:7: ( 'supply1' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:13:9: 'supply1'
            {
            match("supply1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:14:7: ( 'tri' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:14:9: 'tri'
            {
            match("tri"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:15:7: ( 'triand' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:15:9: 'triand'
            {
            match("triand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:16:7: ( 'trior' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:16:9: 'trior'
            {
            match("trior"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:17:7: ( 'tri0' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:17:9: 'tri0'
            {
            match("tri0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:18:7: ( 'tri1' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:18:9: 'tri1'
            {
            match("tri1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:19:7: ( 'wire' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:19:9: 'wire'
            {
            match("wire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:20:7: ( 'wand' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:20:9: 'wand'
            {
            match("wand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:21:7: ( 'wor' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:21:9: 'wor'
            {
            match("wor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:22:7: ( 'static' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:22:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:23:7: ( 'automatic' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:23:9: 'automatic'
            {
            match("automatic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:24:7: ( 'bit' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:24:9: 'bit'
            {
            match("bit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:25:7: ( 'logic' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:25:9: 'logic'
            {
            match("logic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:26:7: ( 'reg' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:26:9: 'reg'
            {
            match("reg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:27:7: ( 'module' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:27:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:28:7: ( 'macromodule' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:28:9: 'macromodule'
            {
            match("macromodule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:29:7: ( 'input' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:29:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:30:7: ( 'output' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:30:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:31:7: ( 'inout' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:31:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:32:7: ( 'ref' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:32:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:33:7: ( '(' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:33:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:34:7: ( ')' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:34:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:35:7: ( ';' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:35:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:36:7: ( 'endmodule' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:36:9: 'endmodule'
            {
            match("endmodule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:37:7: ( '#(' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:37:9: '#('
            {
            match("#("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:38:7: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:39:7: ( 'assign' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:39:9: 'assign'
            {
            match("assign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:40:7: ( '=' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:40:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:41:7: ( '[' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:41:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:42:7: ( ':' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:42:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:43:7: ( ']' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:44:7: ( 'const' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:44:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_BINARY_NUMBER"
    public final void mRULE_BINARY_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_BINARY_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3632:20: ( RULE_INT RULE_BINARY_BASE ( RULE_BINARY_DIGIT )+ )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3632:22: RULE_INT RULE_BINARY_BASE ( RULE_BINARY_DIGIT )+
            {
            mRULE_INT(); 
            mRULE_BINARY_BASE(); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3632:48: ( RULE_BINARY_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='1')||LA1_0=='?'||LA1_0=='X'||LA1_0=='Z'||LA1_0=='x'||LA1_0=='z') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3632:48: RULE_BINARY_DIGIT
            	    {
            	    mRULE_BINARY_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_NUMBER"

    // $ANTLR start "RULE_OCTAL_NUMBER"
    public final void mRULE_OCTAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3634:19: ( RULE_INT RULE_OCTAL_BASE ( RULE_OCTAL_DIGIT )+ )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3634:21: RULE_INT RULE_OCTAL_BASE ( RULE_OCTAL_DIGIT )+
            {
            mRULE_INT(); 
            mRULE_OCTAL_BASE(); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3634:46: ( RULE_OCTAL_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='7')||LA2_0=='?'||LA2_0=='X'||LA2_0=='Z'||LA2_0=='x'||LA2_0=='z') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3634:46: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_NUMBER"

    // $ANTLR start "RULE_HEX_NUMBER"
    public final void mRULE_HEX_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_HEX_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3636:17: ( RULE_INT RULE_HEX_BASE ( RULE_HEX_DIGIT )+ )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3636:19: RULE_INT RULE_HEX_BASE ( RULE_HEX_DIGIT )+
            {
            mRULE_INT(); 
            mRULE_HEX_BASE(); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3636:42: ( RULE_HEX_DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='F')||LA3_0=='X'||LA3_0=='Z'||(LA3_0>='a' && LA3_0<='f')||LA3_0=='x'||LA3_0=='z') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3636:42: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_NUMBER"

    // $ANTLR start "RULE_DECIMAL_NUMBER"
    public final void mRULE_DECIMAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3638:21: ( RULE_INT RULE_DECIMAL_BASE RULE_INT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3638:23: RULE_INT RULE_DECIMAL_BASE RULE_INT
            {
            mRULE_INT(); 
            mRULE_DECIMAL_BASE(); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_NUMBER"

    // $ANTLR start "RULE_BINARY_BASE"
    public final void mRULE_BINARY_BASE() throws RecognitionException {
        try {
            int _type = RULE_BINARY_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3640:18: ( ( '\\'' ( 's' | 'S' )? 'b' | '\\'' ( 's' | 'S' )? 'B' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3640:20: ( '\\'' ( 's' | 'S' )? 'b' | '\\'' ( 's' | 'S' )? 'B' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3640:20: ( '\\'' ( 's' | 'S' )? 'b' | '\\'' ( 's' | 'S' )? 'B' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\'') ) {
                switch ( input.LA(2) ) {
                case 'S':
                case 's':
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='b') ) {
                        alt6=1;
                    }
                    else if ( (LA6_2=='B') ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'b':
                    {
                    alt6=1;
                    }
                    break;
                case 'B':
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3640:21: '\\'' ( 's' | 'S' )? 'b'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3640:26: ( 's' | 'S' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='S'||LA4_0=='s') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('b'); 

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3640:41: '\\'' ( 's' | 'S' )? 'B'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3640:46: ( 's' | 'S' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='S'||LA5_0=='s') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('B'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_BASE"

    // $ANTLR start "RULE_DECIMAL_BASE"
    public final void mRULE_DECIMAL_BASE() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3642:19: ( ( '\\'' ( 's' | 'S' )? 'd' | '\\'' ( 's' | 'S' )? 'D' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3642:21: ( '\\'' ( 's' | 'S' )? 'd' | '\\'' ( 's' | 'S' )? 'D' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3642:21: ( '\\'' ( 's' | 'S' )? 'd' | '\\'' ( 's' | 'S' )? 'D' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\'') ) {
                switch ( input.LA(2) ) {
                case 'S':
                case 's':
                    {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2=='d') ) {
                        alt9=1;
                    }
                    else if ( (LA9_2=='D') ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'D':
                    {
                    alt9=2;
                    }
                    break;
                case 'd':
                    {
                    alt9=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3642:22: '\\'' ( 's' | 'S' )? 'd'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3642:27: ( 's' | 'S' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='S'||LA7_0=='s') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('d'); 

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3642:42: '\\'' ( 's' | 'S' )? 'D'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3642:47: ( 's' | 'S' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='S'||LA8_0=='s') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('D'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_BASE"

    // $ANTLR start "RULE_OCTAL_BASE"
    public final void mRULE_OCTAL_BASE() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3644:17: ( ( '\\'' ( 's' | 'S' )? 'o' | '\\'' ( 's' | 'S' )? 'O' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3644:19: ( '\\'' ( 's' | 'S' )? 'o' | '\\'' ( 's' | 'S' )? 'O' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3644:19: ( '\\'' ( 's' | 'S' )? 'o' | '\\'' ( 's' | 'S' )? 'O' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\'') ) {
                switch ( input.LA(2) ) {
                case 'S':
                case 's':
                    {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='O') ) {
                        alt12=2;
                    }
                    else if ( (LA12_2=='o') ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'o':
                    {
                    alt12=1;
                    }
                    break;
                case 'O':
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3644:20: '\\'' ( 's' | 'S' )? 'o'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3644:25: ( 's' | 'S' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='S'||LA10_0=='s') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('o'); 

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3644:40: '\\'' ( 's' | 'S' )? 'O'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3644:45: ( 's' | 'S' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='S'||LA11_0=='s') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('O'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_BASE"

    // $ANTLR start "RULE_HEX_BASE"
    public final void mRULE_HEX_BASE() throws RecognitionException {
        try {
            int _type = RULE_HEX_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3646:15: ( ( '\\'' ( 's' | 'S' )? 'h' | '\\'' ( 's' | 'S' )? 'H' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3646:17: ( '\\'' ( 's' | 'S' )? 'h' | '\\'' ( 's' | 'S' )? 'H' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3646:17: ( '\\'' ( 's' | 'S' )? 'h' | '\\'' ( 's' | 'S' )? 'H' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') ) {
                switch ( input.LA(2) ) {
                case 'S':
                case 's':
                    {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2=='H') ) {
                        alt15=2;
                    }
                    else if ( (LA15_2=='h') ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'H':
                    {
                    alt15=2;
                    }
                    break;
                case 'h':
                    {
                    alt15=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3646:18: '\\'' ( 's' | 'S' )? 'h'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3646:23: ( 's' | 'S' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='S'||LA13_0=='s') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('h'); 

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3646:38: '\\'' ( 's' | 'S' )? 'H'
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3646:43: ( 's' | 'S' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='S'||LA14_0=='s') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
                            {
                            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    match('H'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_BASE"

    // $ANTLR start "RULE_X_DIGIT"
    public final void mRULE_X_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_X_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3648:14: ( ( 'x' | 'X' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3648:16: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_X_DIGIT"

    // $ANTLR start "RULE_Z_DIGIT"
    public final void mRULE_Z_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_Z_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3650:14: ( ( 'z' | 'Z' | '?' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3650:16: ( 'z' | 'Z' | '?' )
            {
            if ( input.LA(1)=='?'||input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_Z_DIGIT"

    // $ANTLR start "RULE_BINARY_DIGIT"
    public final void mRULE_BINARY_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_BINARY_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3652:19: ( ( RULE_X_DIGIT | RULE_Z_DIGIT | '1' | '0' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3652:21: ( RULE_X_DIGIT | RULE_Z_DIGIT | '1' | '0' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1')||input.LA(1)=='?'||input.LA(1)=='X'||input.LA(1)=='Z'||input.LA(1)=='x'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_DIGIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3654:18: ( ( RULE_BINARY_DIGIT | '2' | '3' | '4' | '5' | '6' | '7' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3654:20: ( RULE_BINARY_DIGIT | '2' | '3' | '4' | '5' | '6' | '7' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='7')||input.LA(1)=='?'||input.LA(1)=='X'||input.LA(1)=='Z'||input.LA(1)=='x'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_HEX_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3656:16: ( ( RULE_OCTAL_DIGIT | '8' | '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3656:18: ( RULE_OCTAL_DIGIT | '8' | '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='X'||input.LA(1)=='Z'||(input.LA(1)>='a' && input.LA(1)<='f')||input.LA(1)=='x'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_STRENGTH0"
    public final void mRULE_STRENGTH0() throws RecognitionException {
        try {
            int _type = RULE_STRENGTH0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3658:16: ( ( 'supply0' | 'strong0' | 'pull0' | 'weak0' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3658:18: ( 'supply0' | 'strong0' | 'pull0' | 'weak0' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3658:18: ( 'supply0' | 'strong0' | 'pull0' | 'weak0' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 's':
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='u') ) {
                    alt16=1;
                }
                else if ( (LA16_1=='t') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'p':
                {
                alt16=3;
                }
                break;
            case 'w':
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3658:19: 'supply0'
                    {
                    match("supply0"); 


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3658:29: 'strong0'
                    {
                    match("strong0"); 


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3658:39: 'pull0'
                    {
                    match("pull0"); 


                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3658:47: 'weak0'
                    {
                    match("weak0"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRENGTH0"

    // $ANTLR start "RULE_STRENGTH1"
    public final void mRULE_STRENGTH1() throws RecognitionException {
        try {
            int _type = RULE_STRENGTH1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3660:16: ( ( 'supply1' | 'strong1' | 'pull1' | 'weak1' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3660:18: ( 'supply1' | 'strong1' | 'pull1' | 'weak1' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3660:18: ( 'supply1' | 'strong1' | 'pull1' | 'weak1' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 's':
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='u') ) {
                    alt17=1;
                }
                else if ( (LA17_1=='t') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'p':
                {
                alt17=3;
                }
                break;
            case 'w':
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3660:19: 'supply1'
                    {
                    match("supply1"); 


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3660:29: 'strong1'
                    {
                    match("strong1"); 


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3660:39: 'pull1'
                    {
                    match("pull1"); 


                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3660:47: 'weak1'
                    {
                    match("weak1"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRENGTH1"

    // $ANTLR start "RULE_DRIVE_STRENGTH"
    public final void mRULE_DRIVE_STRENGTH() throws RecognitionException {
        try {
            int _type = RULE_DRIVE_STRENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:21: ( ( '(' RULE_STRENGTH0 ',' RULE_STRENGTH1 ')' | '(' RULE_STRENGTH1 ',' RULE_STRENGTH0 ')' | '(' RULE_STRENGTH0 ',' 'highz1' ')' | '(' RULE_STRENGTH1 ',' 'highz0' ')' | '(' 'highz0' ',' RULE_STRENGTH1 ')' | '(' 'highz1' ',' RULE_STRENGTH0 ')' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:23: ( '(' RULE_STRENGTH0 ',' RULE_STRENGTH1 ')' | '(' RULE_STRENGTH1 ',' RULE_STRENGTH0 ')' | '(' RULE_STRENGTH0 ',' 'highz1' ')' | '(' RULE_STRENGTH1 ',' 'highz0' ')' | '(' 'highz0' ',' RULE_STRENGTH1 ')' | '(' 'highz1' ',' RULE_STRENGTH0 ')' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:23: ( '(' RULE_STRENGTH0 ',' RULE_STRENGTH1 ')' | '(' RULE_STRENGTH1 ',' RULE_STRENGTH0 ')' | '(' RULE_STRENGTH0 ',' 'highz1' ')' | '(' RULE_STRENGTH1 ',' 'highz0' ')' | '(' 'highz0' ',' RULE_STRENGTH1 ')' | '(' 'highz1' ',' RULE_STRENGTH0 ')' )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:24: '(' RULE_STRENGTH0 ',' RULE_STRENGTH1 ')'
                    {
                    match('('); 
                    mRULE_STRENGTH0(); 
                    match(','); 
                    mRULE_STRENGTH1(); 
                    match(')'); 

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:66: '(' RULE_STRENGTH1 ',' RULE_STRENGTH0 ')'
                    {
                    match('('); 
                    mRULE_STRENGTH1(); 
                    match(','); 
                    mRULE_STRENGTH0(); 
                    match(')'); 

                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:108: '(' RULE_STRENGTH0 ',' 'highz1' ')'
                    {
                    match('('); 
                    mRULE_STRENGTH0(); 
                    match(','); 
                    match("highz1"); 

                    match(')'); 

                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:144: '(' RULE_STRENGTH1 ',' 'highz0' ')'
                    {
                    match('('); 
                    mRULE_STRENGTH1(); 
                    match(','); 
                    match("highz0"); 

                    match(')'); 

                    }
                    break;
                case 5 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:180: '(' 'highz0' ',' RULE_STRENGTH1 ')'
                    {
                    match('('); 
                    match("highz0"); 

                    match(','); 
                    mRULE_STRENGTH1(); 
                    match(')'); 

                    }
                    break;
                case 6 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3662:216: '(' 'highz1' ',' RULE_STRENGTH0 ')'
                    {
                    match('('); 
                    match("highz1"); 

                    match(','); 
                    mRULE_STRENGTH0(); 
                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DRIVE_STRENGTH"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3664:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3664:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3664:11: ( '^' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='^') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3664:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3664:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3666:10: ( ( '0' .. '9' )+ )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3666:12: ( '0' .. '9' )+
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3666:12: ( '0' .. '9' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3666:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\"') ) {
                alt24=1;
            }
            else if ( (LA24_0=='\'') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\\') ) {
                            alt22=1;
                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                            alt22=2;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3668:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3670:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3670:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3670:24: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='*') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='/') ) {
                        alt25=2;
                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3670:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:40: ( ( '\\r' )? '\\n' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:41: ( '\\r' )? '\\n'
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:41: ( '\\r' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\r') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3672:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3674:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3674:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3674:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3676:16: ( . )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3676:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_BINARY_NUMBER | RULE_OCTAL_NUMBER | RULE_HEX_NUMBER | RULE_DECIMAL_NUMBER | RULE_BINARY_BASE | RULE_DECIMAL_BASE | RULE_OCTAL_BASE | RULE_HEX_BASE | RULE_X_DIGIT | RULE_Z_DIGIT | RULE_BINARY_DIGIT | RULE_OCTAL_DIGIT | RULE_HEX_DIGIT | RULE_STRENGTH0 | RULE_STRENGTH1 | RULE_DRIVE_STRENGTH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=57;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:88: T__40
                {
                mT__40(); 

                }
                break;
            case 15 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:94: T__41
                {
                mT__41(); 

                }
                break;
            case 16 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:100: T__42
                {
                mT__42(); 

                }
                break;
            case 17 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:106: T__43
                {
                mT__43(); 

                }
                break;
            case 18 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:112: T__44
                {
                mT__44(); 

                }
                break;
            case 19 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:118: T__45
                {
                mT__45(); 

                }
                break;
            case 20 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:124: T__46
                {
                mT__46(); 

                }
                break;
            case 21 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:130: T__47
                {
                mT__47(); 

                }
                break;
            case 22 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:136: T__48
                {
                mT__48(); 

                }
                break;
            case 23 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:142: T__49
                {
                mT__49(); 

                }
                break;
            case 24 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:148: T__50
                {
                mT__50(); 

                }
                break;
            case 25 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:154: T__51
                {
                mT__51(); 

                }
                break;
            case 26 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:160: T__52
                {
                mT__52(); 

                }
                break;
            case 27 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:166: T__53
                {
                mT__53(); 

                }
                break;
            case 28 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:172: T__54
                {
                mT__54(); 

                }
                break;
            case 29 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:178: T__55
                {
                mT__55(); 

                }
                break;
            case 30 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:184: T__56
                {
                mT__56(); 

                }
                break;
            case 31 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:190: T__57
                {
                mT__57(); 

                }
                break;
            case 32 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:196: T__58
                {
                mT__58(); 

                }
                break;
            case 33 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:202: T__59
                {
                mT__59(); 

                }
                break;
            case 34 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:208: T__60
                {
                mT__60(); 

                }
                break;
            case 35 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:214: RULE_BINARY_NUMBER
                {
                mRULE_BINARY_NUMBER(); 

                }
                break;
            case 36 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:233: RULE_OCTAL_NUMBER
                {
                mRULE_OCTAL_NUMBER(); 

                }
                break;
            case 37 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:251: RULE_HEX_NUMBER
                {
                mRULE_HEX_NUMBER(); 

                }
                break;
            case 38 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:267: RULE_DECIMAL_NUMBER
                {
                mRULE_DECIMAL_NUMBER(); 

                }
                break;
            case 39 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:287: RULE_BINARY_BASE
                {
                mRULE_BINARY_BASE(); 

                }
                break;
            case 40 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:304: RULE_DECIMAL_BASE
                {
                mRULE_DECIMAL_BASE(); 

                }
                break;
            case 41 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:322: RULE_OCTAL_BASE
                {
                mRULE_OCTAL_BASE(); 

                }
                break;
            case 42 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:338: RULE_HEX_BASE
                {
                mRULE_HEX_BASE(); 

                }
                break;
            case 43 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:352: RULE_X_DIGIT
                {
                mRULE_X_DIGIT(); 

                }
                break;
            case 44 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:365: RULE_Z_DIGIT
                {
                mRULE_Z_DIGIT(); 

                }
                break;
            case 45 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:378: RULE_BINARY_DIGIT
                {
                mRULE_BINARY_DIGIT(); 

                }
                break;
            case 46 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:396: RULE_OCTAL_DIGIT
                {
                mRULE_OCTAL_DIGIT(); 

                }
                break;
            case 47 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:413: RULE_HEX_DIGIT
                {
                mRULE_HEX_DIGIT(); 

                }
                break;
            case 48 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:428: RULE_STRENGTH0
                {
                mRULE_STRENGTH0(); 

                }
                break;
            case 49 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:443: RULE_STRENGTH1
                {
                mRULE_STRENGTH1(); 

                }
                break;
            case 50 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:458: RULE_DRIVE_STRENGTH
                {
                mRULE_DRIVE_STRENGTH(); 

                }
                break;
            case 51 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:478: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:486: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 53 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:495: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:507: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:523: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:539: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 57 :
                // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1:547: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA18_eotS =
        "\52\uffff";
    static final String DFA18_eofS =
        "\52\uffff";
    static final String DFA18_minS =
        "\1\50\1\150\1\151\1\164\1\165\1\145\1\147\1\160\1\162\1\154\1\141"+
        "\1\150\1\160\1\157\1\154\1\153\1\172\1\154\1\156\3\60\1\171\1\147"+
        "\4\54\2\uffff\2\60\2\150\4\54\4\uffff";
    static final String DFA18_maxS =
        "\1\50\1\167\1\151\2\165\1\145\1\147\1\160\1\162\1\154\1\141\1\150"+
        "\1\160\1\157\1\154\1\153\1\172\1\154\1\156\3\61\1\171\1\147\4\54"+
        "\2\uffff\2\61\2\167\4\54\4\uffff";
    static final String DFA18_acceptS =
        "\34\uffff\1\5\1\6\10\uffff\1\4\1\2\1\3\1\1";
    static final String DFA18_specialS =
        "\52\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2\7\uffff\1\4\2\uffff\1\3\3\uffff\1\5",
            "\1\6",
            "\1\10\1\7",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\31\1\30",
            "\1\33\1\32",
            "\1\34\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\40",
            "\1\41",
            "",
            "",
            "\1\43\1\42",
            "\1\45\1\44",
            "\1\46\7\uffff\1\47\2\uffff\1\47\3\uffff\1\47",
            "\1\50\7\uffff\1\51\2\uffff\1\51\3\uffff\1\51",
            "\1\40",
            "\1\41",
            "\1\40",
            "\1\41",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "3662:23: ( '(' RULE_STRENGTH0 ',' RULE_STRENGTH1 ')' | '(' RULE_STRENGTH1 ',' RULE_STRENGTH0 ')' | '(' RULE_STRENGTH0 ',' 'highz1' ')' | '(' RULE_STRENGTH1 ',' 'highz0' ')' | '(' 'highz0' ',' RULE_STRENGTH1 ')' | '(' 'highz1' ',' RULE_STRENGTH0 ')' )";
        }
    }
    static final String DFA30_eotS =
        "\1\uffff\3\46\2\57\5\46\1\70\2\uffff\1\57\1\44\5\uffff\1\57\1\103"+
        "\1\44\1\120\1\121\1\122\2\57\1\46\1\44\2\uffff\2\44\2\uffff\1\46"+
        "\1\uffff\10\46\1\uffff\7\46\4\uffff\1\46\6\uffff\1\46\1\uffff\1"+
        "\154\2\uffff\1\162\1\163\1\uffff\1\164\2\165\1\162\1\164\1\163\3"+
        "\uffff\1\46\3\uffff\1\174\5\46\1\u0082\3\46\1\u0086\1\46\1\u0088"+
        "\1\u0089\7\46\12\uffff\4\46\1\u0095\1\u0096\1\uffff\3\46\1\u009a"+
        "\1\u009b\1\uffff\3\46\1\uffff\1\46\2\uffff\12\46\1\u00ac\2\uffff"+
        "\3\46\2\uffff\1\u00b0\1\u00b1\2\46\1\u00b4\2\46\1\u00b7\1\u00b8"+
        "\2\46\1\u00bb\1\u00b0\1\u00b1\1\u00bc\1\u00bd\1\uffff\1\46\1\u00c0"+
        "\1\46\2\uffff\1\46\1\u00c4\1\uffff\1\u00c5\1\46\2\uffff\1\u00c7"+
        "\1\46\3\uffff\1\u00c9\1\u00ca\1\uffff\1\u00b0\1\u00b1\1\46\2\uffff"+
        "\1\46\1\uffff\1\46\2\uffff\3\46\1\u00d1\1\46\1\u00d3\1\uffff\1\46"+
        "\1\uffff\1\u00d5\1\uffff";
    static final String DFA30_eofS =
        "\u00d6\uffff";
    static final String DFA30_minS =
        "\1\0\1\162\1\164\1\141\2\60\1\157\1\145\1\141\1\156\1\165\1\150"+
        "\2\uffff\1\60\1\50\5\uffff\1\60\1\47\1\0\2\60\2\47\1\60\1\165\1"+
        "\101\2\uffff\1\0\1\52\2\uffff\1\151\1\uffff\1\160\1\141\1\162\1"+
        "\156\1\162\1\141\1\164\1\163\1\uffff\1\164\1\147\1\146\1\144\1\143"+
        "\1\157\1\164\4\uffff\1\144\6\uffff\1\156\1\uffff\1\47\1\102\3\0"+
        "\1\uffff\6\0\3\uffff\1\154\3\uffff\1\60\1\160\1\164\1\157\1\145"+
        "\1\144\1\60\1\153\1\157\1\151\1\60\1\151\2\60\1\165\1\162\2\165"+
        "\1\160\1\155\1\163\1\uffff\1\102\10\uffff\1\154\1\145\1\156\1\162"+
        "\2\60\1\uffff\1\154\1\151\1\156\2\60\1\uffff\1\60\1\155\1\147\1"+
        "\uffff\1\143\2\uffff\1\154\1\157\2\164\1\165\1\157\1\164\1\60\1"+
        "\147\1\144\1\60\2\uffff\1\171\1\143\1\147\2\uffff\2\60\1\141\1\156"+
        "\1\60\1\145\1\155\2\60\1\164\1\144\5\60\1\uffff\3\60\2\uffff\1\164"+
        "\1\60\1\uffff\1\60\1\157\2\uffff\1\60\1\165\3\uffff\2\60\1\uffff"+
        "\2\60\1\151\2\uffff\1\144\1\uffff\1\154\2\uffff\1\143\1\165\1\145"+
        "\1\60\1\154\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA30_maxS =
        "\1\uffff\1\162\1\165\1\157\2\172\1\157\1\145\1\157\1\156\1\165"+
        "\1\167\2\uffff\1\172\1\50\5\uffff\1\172\1\71\1\uffff\2\172\2\71"+
        "\1\172\1\165\1\172\2\uffff\1\uffff\1\57\2\uffff\1\151\1\uffff\1"+
        "\160\2\162\1\156\1\162\1\141\1\164\1\163\1\uffff\1\164\2\147\1\144"+
        "\1\143\1\160\1\164\4\uffff\1\144\6\uffff\1\156\1\uffff\1\71\1\163"+
        "\3\uffff\1\uffff\6\uffff\3\uffff\1\154\3\uffff\1\172\1\160\1\164"+
        "\1\157\1\145\1\144\1\172\1\153\1\157\1\151\1\172\1\151\2\172\1\165"+
        "\1\162\2\165\1\160\1\155\1\163\1\uffff\1\157\10\uffff\1\154\1\145"+
        "\1\156\1\162\2\172\1\uffff\1\154\1\151\1\156\2\172\1\uffff\1\61"+
        "\1\155\1\147\1\uffff\1\143\2\uffff\1\154\1\157\2\164\1\165\1\157"+
        "\1\164\1\61\1\147\1\144\1\172\2\uffff\1\171\1\143\1\147\2\uffff"+
        "\2\172\1\141\1\156\1\172\1\145\1\155\2\172\1\164\1\144\5\172\1\uffff"+
        "\1\61\1\172\1\61\2\uffff\1\164\1\172\1\uffff\1\172\1\157\2\uffff"+
        "\1\172\1\165\3\uffff\2\172\1\uffff\2\172\1\151\2\uffff\1\144\1\uffff"+
        "\1\154\2\uffff\1\143\1\165\1\145\1\172\1\154\1\172\1\uffff\1\145"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA30_acceptS =
        "\14\uffff\1\30\1\31\2\uffff\1\34\1\36\1\37\1\40\1\41\12\uffff\1"+
        "\54\1\63\2\uffff\1\70\1\71\1\uffff\1\63\10\uffff\1\57\7\uffff\1"+
        "\62\1\27\1\30\1\31\1\uffff\1\33\1\34\1\36\1\37\1\40\1\41\1\uffff"+
        "\1\55\5\uffff\1\65\6\uffff\1\53\1\54\1\56\1\uffff\1\66\1\67\1\70"+
        "\25\uffff\1\64\1\uffff\1\44\1\46\1\43\1\45\1\50\1\51\1\52\1\47\6"+
        "\uffff\1\4\5\uffff\1\13\3\uffff\1\16\1\uffff\1\20\1\26\13\uffff"+
        "\1\7\1\10\3\uffff\1\11\1\12\20\uffff\1\6\3\uffff\1\60\1\61\2\uffff"+
        "\1\17\2\uffff\1\23\1\25\2\uffff\1\42\1\1\1\5\2\uffff\1\14\3\uffff"+
        "\1\35\1\21\1\uffff\1\24\1\uffff\1\2\1\3\6\uffff\1\15\1\uffff\1\32"+
        "\1\uffff\1\22";
    static final String DFA30_specialS =
        "\1\7\26\uffff\1\12\11\uffff\1\0\44\uffff\1\13\1\4\1\6\1\uffff\1"+
        "\1\1\10\1\11\1\3\1\2\1\5\u0086\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\41\1\17\3\44\1\27\1"+
            "\13\1\14\2\44\1\20\2\44\1\42\2\26\6\32\2\33\1\23\1\15\1\44\1"+
            "\21\1\44\1\37\1\44\6\34\21\40\1\30\1\40\1\31\1\22\1\44\1\24"+
            "\1\36\1\40\1\44\1\4\1\5\1\25\1\34\1\16\1\34\2\40\1\11\2\40\1"+
            "\6\1\10\1\40\1\12\1\35\1\40\1\7\1\2\1\1\2\40\1\3\1\30\1\40\1"+
            "\31\uff85\44",
            "\1\45",
            "\1\50\1\47",
            "\1\52\3\uffff\1\54\3\uffff\1\51\5\uffff\1\53",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\56\1\46"+
            "\1\55\5\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\60\21\46",
            "\1\61",
            "\1\62",
            "\1\64\15\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67\7\uffff\1\67\2\uffff\1\67\3\uffff\1\67",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\73\14\46",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\102\13\46",
            "\1\105\10\uffff\12\104",
            "\102\111\1\114\1\111\1\107\3\111\1\116\6\111\1\110\3\111\1"+
            "\106\16\111\1\113\1\111\1\115\3\111\1\112\6\111\1\117\3\111"+
            "\1\106\uff8c\111",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\105\10\uffff\12\104",
            "\1\105\10\uffff\12\104",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\123",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\111",
            "\1\124\4\uffff\1\125",
            "",
            "",
            "\1\127",
            "",
            "\1\130",
            "\1\131\20\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\144\1\143",
            "\1\145",
            "\1\146",
            "\1\150\1\147",
            "\1\151",
            "",
            "",
            "",
            "",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "",
            "\1\105\10\uffff\12\104",
            "\1\160\1\uffff\1\157\3\uffff\1\161\6\uffff\1\156\3\uffff\1"+
            "\155\16\uffff\1\160\1\uffff\1\157\3\uffff\1\161\6\uffff\1\156"+
            "\3\uffff\1\155",
            "\102\111\1\114\1\111\1\107\3\111\1\116\6\111\1\110\22\111"+
            "\1\113\1\111\1\115\3\111\1\112\6\111\1\117\uff90\111",
            "\0\111",
            "\0\111",
            "",
            "\0\111",
            "\0\111",
            "\0\111",
            "\0\111",
            "\0\111",
            "\0\111",
            "",
            "",
            "",
            "\1\166",
            "",
            "",
            "",
            "\1\172\1\173\10\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\170"+
            "\15\46\1\171\2\46\1\167\10\46",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0087",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\160\1\uffff\1\157\3\uffff\1\161\6\uffff\1\156\22\uffff"+
            "\1\160\1\uffff\1\157\3\uffff\1\161\6\uffff\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u009c\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b2",
            "\1\u00b3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b5",
            "\1\u00b6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b9",
            "\1\u00ba",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00be\1\u00bf",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c1\1\u00c2",
            "",
            "",
            "\1\u00c3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c6",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c8",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d2",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00d4",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_BINARY_NUMBER | RULE_OCTAL_NUMBER | RULE_HEX_NUMBER | RULE_DECIMAL_NUMBER | RULE_BINARY_BASE | RULE_DECIMAL_BASE | RULE_OCTAL_BASE | RULE_HEX_BASE | RULE_X_DIGIT | RULE_Z_DIGIT | RULE_BINARY_DIGIT | RULE_OCTAL_DIGIT | RULE_HEX_DIGIT | RULE_STRENGTH0 | RULE_STRENGTH1 | RULE_DRIVE_STRENGTH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_33 = input.LA(1);

                        s = -1;
                        if ( ((LA30_33>='\u0000' && LA30_33<='\uFFFF')) ) {s = 73;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_74 = input.LA(1);

                        s = -1;
                        if ( ((LA30_74>='\u0000' && LA30_74<='\uFFFF')) ) {s = 73;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_78 = input.LA(1);

                        s = -1;
                        if ( ((LA30_78>='\u0000' && LA30_78<='\uFFFF')) ) {s = 73;}

                        else s = 116;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_77 = input.LA(1);

                        s = -1;
                        if ( ((LA30_77>='\u0000' && LA30_77<='\uFFFF')) ) {s = 73;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_71 = input.LA(1);

                        s = -1;
                        if ( ((LA30_71>='\u0000' && LA30_71<='\uFFFF')) ) {s = 73;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_79 = input.LA(1);

                        s = -1;
                        if ( ((LA30_79>='\u0000' && LA30_79<='\uFFFF')) ) {s = 73;}

                        else s = 115;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_72 = input.LA(1);

                        s = -1;
                        if ( ((LA30_72>='\u0000' && LA30_72<='\uFFFF')) ) {s = 73;}

                        else s = 115;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='t') ) {s = 1;}

                        else if ( (LA30_0=='s') ) {s = 2;}

                        else if ( (LA30_0=='w') ) {s = 3;}

                        else if ( (LA30_0=='a') ) {s = 4;}

                        else if ( (LA30_0=='b') ) {s = 5;}

                        else if ( (LA30_0=='l') ) {s = 6;}

                        else if ( (LA30_0=='r') ) {s = 7;}

                        else if ( (LA30_0=='m') ) {s = 8;}

                        else if ( (LA30_0=='i') ) {s = 9;}

                        else if ( (LA30_0=='o') ) {s = 10;}

                        else if ( (LA30_0=='(') ) {s = 11;}

                        else if ( (LA30_0==')') ) {s = 12;}

                        else if ( (LA30_0==';') ) {s = 13;}

                        else if ( (LA30_0=='e') ) {s = 14;}

                        else if ( (LA30_0=='#') ) {s = 15;}

                        else if ( (LA30_0==',') ) {s = 16;}

                        else if ( (LA30_0=='=') ) {s = 17;}

                        else if ( (LA30_0=='[') ) {s = 18;}

                        else if ( (LA30_0==':') ) {s = 19;}

                        else if ( (LA30_0==']') ) {s = 20;}

                        else if ( (LA30_0=='c') ) {s = 21;}

                        else if ( ((LA30_0>='0' && LA30_0<='1')) ) {s = 22;}

                        else if ( (LA30_0=='\'') ) {s = 23;}

                        else if ( (LA30_0=='X'||LA30_0=='x') ) {s = 24;}

                        else if ( (LA30_0=='Z'||LA30_0=='z') ) {s = 25;}

                        else if ( ((LA30_0>='2' && LA30_0<='7')) ) {s = 26;}

                        else if ( ((LA30_0>='8' && LA30_0<='9')) ) {s = 27;}

                        else if ( ((LA30_0>='A' && LA30_0<='F')||LA30_0=='d'||LA30_0=='f') ) {s = 28;}

                        else if ( (LA30_0=='p') ) {s = 29;}

                        else if ( (LA30_0=='^') ) {s = 30;}

                        else if ( (LA30_0=='?') ) {s = 31;}

                        else if ( ((LA30_0>='G' && LA30_0<='W')||LA30_0=='Y'||LA30_0=='_'||(LA30_0>='g' && LA30_0<='h')||(LA30_0>='j' && LA30_0<='k')||LA30_0=='n'||LA30_0=='q'||(LA30_0>='u' && LA30_0<='v')||LA30_0=='y') ) {s = 32;}

                        else if ( (LA30_0=='\"') ) {s = 33;}

                        else if ( (LA30_0=='/') ) {s = 34;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 35;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||LA30_0=='!'||(LA30_0>='$' && LA30_0<='&')||(LA30_0>='*' && LA30_0<='+')||(LA30_0>='-' && LA30_0<='.')||LA30_0=='<'||LA30_0=='>'||LA30_0=='@'||LA30_0=='\\'||LA30_0=='`'||(LA30_0>='{' && LA30_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_75 = input.LA(1);

                        s = -1;
                        if ( ((LA30_75>='\u0000' && LA30_75<='\uFFFF')) ) {s = 73;}

                        else s = 117;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA30_76 = input.LA(1);

                        s = -1;
                        if ( ((LA30_76>='\u0000' && LA30_76<='\uFFFF')) ) {s = 73;}

                        else s = 117;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA30_23 = input.LA(1);

                        s = -1;
                        if ( (LA30_23=='S'||LA30_23=='s') ) {s = 70;}

                        else if ( (LA30_23=='D') ) {s = 71;}

                        else if ( (LA30_23=='O') ) {s = 72;}

                        else if ( ((LA30_23>='\u0000' && LA30_23<='A')||LA30_23=='C'||(LA30_23>='E' && LA30_23<='G')||(LA30_23>='I' && LA30_23<='N')||(LA30_23>='P' && LA30_23<='R')||(LA30_23>='T' && LA30_23<='a')||LA30_23=='c'||(LA30_23>='e' && LA30_23<='g')||(LA30_23>='i' && LA30_23<='n')||(LA30_23>='p' && LA30_23<='r')||(LA30_23>='t' && LA30_23<='\uFFFF')) ) {s = 73;}

                        else if ( (LA30_23=='h') ) {s = 74;}

                        else if ( (LA30_23=='b') ) {s = 75;}

                        else if ( (LA30_23=='B') ) {s = 76;}

                        else if ( (LA30_23=='d') ) {s = 77;}

                        else if ( (LA30_23=='H') ) {s = 78;}

                        else if ( (LA30_23=='o') ) {s = 79;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA30_70 = input.LA(1);

                        s = -1;
                        if ( (LA30_70=='H') ) {s = 78;}

                        else if ( (LA30_70=='b') ) {s = 75;}

                        else if ( (LA30_70=='D') ) {s = 71;}

                        else if ( (LA30_70=='h') ) {s = 74;}

                        else if ( (LA30_70=='d') ) {s = 77;}

                        else if ( (LA30_70=='B') ) {s = 76;}

                        else if ( (LA30_70=='O') ) {s = 72;}

                        else if ( ((LA30_70>='\u0000' && LA30_70<='A')||LA30_70=='C'||(LA30_70>='E' && LA30_70<='G')||(LA30_70>='I' && LA30_70<='N')||(LA30_70>='P' && LA30_70<='a')||LA30_70=='c'||(LA30_70>='e' && LA30_70<='g')||(LA30_70>='i' && LA30_70<='n')||(LA30_70>='p' && LA30_70<='\uFFFF')) ) {s = 73;}

                        else if ( (LA30_70=='o') ) {s = 79;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}