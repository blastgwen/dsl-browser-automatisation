package com.selenium.gram.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSlnDslLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_URL=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_CLICKABLEELEMENT=8;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalSlnDslLexer() {;} 
    public InternalSlnDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSlnDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:11:7: ( 'main' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:11:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:12:7: ( 'endmain' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:12:9: 'endmain'
            {
            match("endmain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:13:7: ( 'sub' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:13:9: 'sub'
            {
            match("sub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:14:7: ( 'endsub' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:14:9: 'endsub'
            {
            match("endsub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:15:7: ( '()' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:15:9: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:16:7: ( '(' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:17:7: ( 'var' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:17:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:18:7: ( ',' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:19:7: ( ')' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:20:7: ( 'sizeof' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:20:9: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:21:7: ( '->' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:21:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:22:7: ( 'All' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:22:9: 'All'
            {
            match("All"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:23:7: ( 'Any' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:23:9: 'Any'
            {
            match("Any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:24:7: ( 'verify' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:24:9: 'verify'
            {
            match("verify"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:25:7: ( 'exist' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:25:9: 'exist'
            {
            match("exist"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:26:7: ( '!' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:26:9: '!'
            {
            match('!'); 

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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:27:7: ( '==' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:27:9: '=='
            {
            match("=="); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:28:7: ( '<' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:28:9: '<'
            {
            match('<'); 

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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:29:7: ( '>' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:29:9: '>'
            {
            match('>'); 

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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:30:7: ( '=' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:30:9: '='
            {
            match('='); 

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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:31:7: ( 'if' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:31:9: 'if'
            {
            match("if"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:32:7: ( 'then' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:32:9: 'then'
            {
            match("then"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:33:7: ( 'else' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:33:9: 'else'
            {
            match("else"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:34:7: ( 'endif' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:34:9: 'endif'
            {
            match("endif"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:35:7: ( 'while' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:35:9: 'while'
            {
            match("while"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:36:7: ( 'do' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:36:9: 'do'
            {
            match("do"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:37:7: ( 'endwhile' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:37:9: 'endwhile'
            {
            match("endwhile"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:38:7: ( 'foreach' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:38:9: 'foreach'
            {
            match("foreach"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:39:7: ( 'in' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:39:9: 'in'
            {
            match("in"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:40:7: ( 'endfor' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:40:9: 'endfor'
            {
            match("endfor"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:41:7: ( 'click' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:41:9: 'click'
            {
            match("click"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:42:7: ( 'open' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:42:9: 'open'
            {
            match("open"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:43:7: ( 'check' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:43:9: 'check'
            {
            match("check"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:44:7: ( 'type' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:44:9: 'type'
            {
            match("type"); 


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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:45:7: ( 'select' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:45:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2303:14: ( ( 'true' | 'false' ) )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2303:16: ( 'true' | 'false' )
            {
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2303:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2303:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2303:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_CLICKABLEELEMENT"
    public final void mRULE_CLICKABLEELEMENT() throws RecognitionException {
        try {
            int _type = RULE_CLICKABLEELEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2305:23: ( ( 'button' | 'image' | 'link' ) )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2305:25: ( 'button' | 'image' | 'link' )
            {
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2305:25: ( 'button' | 'image' | 'link' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt2=1;
                }
                break;
            case 'i':
                {
                alt2=2;
                }
                break;
            case 'l':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2305:26: 'button'
                    {
                    match("button"); 


                    }
                    break;
                case 2 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2305:35: 'image'
                    {
                    match("image"); 


                    }
                    break;
                case 3 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2305:43: 'link'
                    {
                    match("link"); 


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
    // $ANTLR end "RULE_CLICKABLEELEMENT"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:10: ( ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )? )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:12: ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            {
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:12: ( 'a' .. 'z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:13: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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

            match("://"); 

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:30: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                alt11=1;
            }
            else if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:31: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+
                    {
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:31: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:47: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:48: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:63: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:64: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:79: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:80: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:91: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=9;
                        alt8 = dfa8.predict(input);
                        switch (alt8) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:112: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:121: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:130: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:139: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:143: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:147: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:151: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    match('\\'); 
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:214: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:238: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='.') ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:239: '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    {
                    	    match('.'); 
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    loop9:
                    	    do {
                    	        int alt9=9;
                    	        alt9 = dfa9.predict(input);
                    	        switch (alt9) {
                    	    	case 1 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:264: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:273: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:282: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:291: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:295: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:299: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:303: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    	    {
                    	    	    match('\\'); 
                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}

                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}


                    	    	    }
                    	    	    break;
                    	    	case 8 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:366: '%' '0' .. '9' '0' .. '9'
                    	    	    {
                    	    	    match('%'); 
                    	    	    matchRange('0','9'); 
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop9;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:393: ( ':' ( '0' .. '9' )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==':') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:394: ':' ( '0' .. '9' )+
                    {
                    match(':'); 
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:398: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:399: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:412: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='/') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:413: '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    {
            	    match('/'); 
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    loop14:
            	    do {
            	        int alt14=12;
            	        alt14 = dfa14.predict(input);
            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:418: 'a' .. 'z'
            	    	    {
            	    	    matchRange('a','z'); 

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:427: 'A' .. 'Z'
            	    	    {
            	    	    matchRange('A','Z'); 

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:436: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:445: '$'
            	    	    {
            	    	    match('$'); 

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:449: '-'
            	    	    {
            	    	    match('-'); 

            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:453: '_'
            	    	    {
            	    	    match('_'); 

            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:457: '~'
            	    	    {
            	    	    match('~'); 

            	    	    }
            	    	    break;
            	    	case 8 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:461: '+'
            	    	    {
            	    	    match('+'); 

            	    	    }
            	    	    break;
            	    	case 9 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:465: '.'
            	    	    {
            	    	    match('.'); 

            	    	    }
            	    	    break;
            	    	case 10 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:469: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            	    	    {
            	    	    match('\\'); 
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}

            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 11 :
            	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:532: '%' '0' .. '9' '0' .. '9'
            	    	    {
            	    	    match('%'); 
            	    	    matchRange('0','9'); 
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:558: ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='?') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:559: '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    {
                    match('?'); 
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=12;
                        alt16 = dfa16.predict(input);
                        switch (alt16) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:564: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:573: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:582: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:591: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:595: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:599: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:603: '='
                    	    {
                    	    match('='); 

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:607: '&'
                    	    {
                    	    match('&'); 

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:611: ';'
                    	    {
                    	    match(';'); 

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:615: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    match('\\'); 
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 11 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:678: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:702: ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='+') ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:703: '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    {
                    	    match('+'); 
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    int cnt17=0;
                    	    loop17:
                    	    do {
                    	        int alt17=12;
                    	        alt17 = dfa17.predict(input);
                    	        switch (alt17) {
                    	    	case 1 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:708: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:717: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:726: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:735: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:739: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:743: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:747: '='
                    	    	    {
                    	    	    match('='); 

                    	    	    }
                    	    	    break;
                    	    	case 8 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:751: '&'
                    	    	    {
                    	    	    match('&'); 

                    	    	    }
                    	    	    break;
                    	    	case 9 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:755: ';'
                    	    	    {
                    	    	    match(';'); 

                    	    	    }
                    	    	    break;
                    	    	case 10 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:759: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    	    {
                    	    	    match('\\'); 
                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}

                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}


                    	    	    }
                    	    	    break;
                    	    	case 11 :
                    	    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2307:822: '%' '0' .. '9' '0' .. '9'
                    	    	    {
                    	    	    match('%'); 
                    	    	    matchRange('0','9'); 
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt17 >= 1 ) break loop17;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(17, input);
                    	                throw eee;
                    	        }
                    	        cnt17++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2309:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2309:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2309:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2309:11: '^'
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

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2309:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:
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
            	    break loop21;
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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2311:10: ( ( '0' .. '9' )+ )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2311:12: ( '0' .. '9' )+
            {
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2311:12: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2311:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\"') ) {
                alt25=1;
            }
            else if ( (LA25_0=='\'') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop23;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2313:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop24;
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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2315:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2315:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2315:24: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2315:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop26;
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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop27;
                }
            } while (true);

            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:40: ( ( '\\r' )? '\\n' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:41: ( '\\r' )? '\\n'
                    {
                    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:41: ( '\\r' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\r') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2317:41: '\\r'
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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2319:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2319:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2319:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2321:16: ( . )
            // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:2321:18: .
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
        // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_BOOLEAN | RULE_CLICKABLEELEMENT | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt31=45;
        alt31 = dfa31.predict(input);
        switch (alt31) {
            case 1 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:220: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 37 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:233: RULE_CLICKABLEELEMENT
                {
                mRULE_CLICKABLEELEMENT(); 

                }
                break;
            case 38 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:255: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 39 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:264: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:272: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:281: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:293: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:309: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:325: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // ../com.selenium.gram.xtext/src-gen/com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.g:1:333: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA8_eotS =
        "\1\1\11\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\44\11\uffff";
    static final String DFA8_maxS =
        "\1\172\11\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\5\1\11\7\uffff\1\6\2\uffff\12\4\7\uffff\32\3\1\uffff\1\10"+
            "\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 2307:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA9_eotS =
        "\1\1\11\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\44\11\uffff";
    static final String DFA9_maxS =
        "\1\172\11\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\1\11\7\uffff\1\6\2\uffff\12\4\7\uffff\32\3\1\uffff\1\10"+
            "\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 2307:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA14_eotS =
        "\1\1\14\uffff";
    static final String DFA14_eofS =
        "\15\uffff";
    static final String DFA14_minS =
        "\1\44\14\uffff";
    static final String DFA14_maxS =
        "\1\176\14\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA14_specialS =
        "\15\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\14\5\uffff\1\11\1\uffff\1\6\1\12\1\uffff\12\4\7\uffff"+
            "\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2\3\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 2307:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA16_eotS =
        "\1\1\14\uffff";
    static final String DFA16_eofS =
        "\15\uffff";
    static final String DFA16_minS =
        "\1\44\14\uffff";
    static final String DFA16_maxS =
        "\1\172\14\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA16_specialS =
        "\15\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\5\1\14\1\11\6\uffff\1\6\2\uffff\12\4\1\uffff\1\12\1\uffff"+
            "\1\10\3\uffff\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2307:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
        }
    }
    static final String DFA17_eotS =
        "\1\1\14\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\44\14\uffff";
    static final String DFA17_maxS =
        "\1\172\14\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA17_specialS =
        "\15\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\5\1\14\1\11\6\uffff\1\6\2\uffff\12\4\1\uffff\1\12\1\uffff"+
            "\1\10\3\uffff\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2307:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
        }
    }
    static final String DFA31_eotS =
        "\1\uffff\3\41\1\53\1\41\2\uffff\1\37\1\41\1\uffff\1\65\2\uffff"+
        "\12\41\1\37\2\uffff\3\37\2\uffff\1\41\2\uffff\7\41\2\uffff\2\41"+
        "\3\uffff\2\41\5\uffff\1\127\1\130\5\41\1\136\7\41\5\uffff\4\41\1"+
        "\156\2\41\1\161\1\41\1\163\1\164\2\uffff\5\41\1\uffff\7\41\1\u0081"+
        "\6\41\1\u0088\1\uffff\2\41\1\uffff\1\41\2\uffff\1\41\1\u008d\1\u008e"+
        "\1\u008f\5\41\1\u0095\1\41\1\u0097\1\uffff\2\41\1\u009a\2\41\1\u009d"+
        "\1\uffff\3\41\1\u0097\3\uffff\1\u00a1\1\41\1\u008f\1\u00a3\1\u00a4"+
        "\1\uffff\1\41\1\uffff\1\41\1\u00a7\1\uffff\1\41\1\u00a9\1\uffff"+
        "\1\u00aa\1\u00ab\1\u00ac\1\uffff\1\41\2\uffff\1\u0097\1\u00ae\1"+
        "\uffff\1\41\4\uffff\1\u00b0\1\uffff\1\u00b1\2\uffff";
    static final String DFA31_eofS =
        "\u00b2\uffff";
    static final String DFA31_minS =
        "\1\0\3\72\1\51\1\72\2\uffff\1\76\1\154\1\uffff\1\75\2\uffff\12"+
        "\72\1\101\2\uffff\2\0\1\52\2\uffff\1\72\2\uffff\7\72\2\uffff\2\72"+
        "\3\uffff\1\154\1\171\5\uffff\2\60\5\72\1\60\7\72\5\uffff\4\72\1"+
        "\60\2\72\1\60\1\72\2\60\2\uffff\5\72\1\uffff\7\72\1\60\6\72\1\60"+
        "\1\uffff\2\72\1\uffff\1\72\2\uffff\1\72\3\60\5\72\1\60\1\72\1\60"+
        "\1\uffff\2\72\1\60\2\72\1\60\1\uffff\3\72\1\60\3\uffff\1\60\1\72"+
        "\3\60\1\uffff\1\72\1\uffff\1\72\1\60\1\uffff\1\72\1\60\1\uffff\3"+
        "\60\1\uffff\1\72\2\uffff\2\60\1\uffff\1\72\4\uffff\1\60\1\uffff"+
        "\1\60\2\uffff";
    static final String DFA31_maxS =
        "\1\uffff\3\172\1\51\1\172\2\uffff\1\76\1\156\1\uffff\1\75\2\uffff"+
        "\13\172\2\uffff\2\uffff\1\57\2\uffff\1\172\2\uffff\7\172\2\uffff"+
        "\2\172\3\uffff\1\154\1\171\5\uffff\17\172\5\uffff\13\172\2\uffff"+
        "\5\172\1\uffff\17\172\1\uffff\2\172\1\uffff\1\172\2\uffff\14\172"+
        "\1\uffff\6\172\1\uffff\4\172\3\uffff\5\172\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\2\uffff\2\172\1"+
        "\uffff\1\172\4\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA31_acceptS =
        "\6\uffff\1\10\1\11\2\uffff\1\20\1\uffff\1\22\1\23\13\uffff\1\47"+
        "\1\50\3\uffff\1\54\1\55\1\uffff\1\47\1\46\7\uffff\1\5\1\6\2\uffff"+
        "\1\10\1\11\1\13\2\uffff\1\20\1\21\1\24\1\22\1\23\17\uffff\1\50\1"+
        "\51\1\52\1\53\1\54\13\uffff\1\25\1\35\5\uffff\1\32\17\uffff\1\3"+
        "\2\uffff\1\7\1\uffff\1\14\1\15\14\uffff\1\1\6\uffff\1\27\4\uffff"+
        "\1\26\1\42\1\44\5\uffff\1\40\1\uffff\1\45\2\uffff\1\30\2\uffff\1"+
        "\17\3\uffff\1\31\1\uffff\1\37\1\41\2\uffff\1\4\1\uffff\1\36\1\12"+
        "\1\43\1\16\1\uffff\1\2\1\uffff\1\34\1\33";
    static final String DFA31_specialS =
        "\1\1\32\uffff\1\0\1\2\u0095\uffff}>";
    static final String[] DFA31_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\12\1\33\4\37\1\34\1\4\1"+
            "\7\2\37\1\6\1\10\1\37\1\35\12\32\2\37\1\14\1\13\1\15\2\37\1"+
            "\11\31\31\3\37\1\30\1\31\1\37\1\27\1\25\1\23\1\21\1\2\1\22\2"+
            "\27\1\16\2\27\1\26\1\1\1\27\1\24\3\27\1\3\1\17\1\27\1\5\1\20"+
            "\3\27\uff85\37",
            "\1\42\46\uffff\1\40\31\43",
            "\1\42\46\uffff\13\43\1\46\1\43\1\44\11\43\1\45\2\43",
            "\1\42\46\uffff\4\43\1\51\3\43\1\50\13\43\1\47\5\43",
            "\1\52",
            "\1\42\46\uffff\1\54\3\43\1\55\25\43",
            "",
            "",
            "\1\60",
            "\1\61\1\uffff\1\62",
            "",
            "\1\64",
            "",
            "",
            "\1\42\46\uffff\5\43\1\70\6\43\1\72\1\71\14\43",
            "\1\42\46\uffff\7\43\1\73\11\43\1\75\6\43\1\74\1\43",
            "\1\42\46\uffff\7\43\1\76\22\43",
            "\1\42\46\uffff\16\43\1\77\13\43",
            "\1\42\46\uffff\1\101\15\43\1\100\13\43",
            "\1\42\46\uffff\7\43\1\103\3\43\1\102\16\43",
            "\1\42\46\uffff\17\43\1\104\12\43",
            "\1\42\46\uffff\24\43\1\105\5\43",
            "\1\42\46\uffff\10\43\1\106\21\43",
            "\1\42\46\uffff\32\43",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\110",
            "\0\110",
            "\1\111\4\uffff\1\112",
            "",
            "",
            "\1\42\46\uffff\10\43\1\114\21\43",
            "",
            "",
            "\1\42\46\uffff\32\43",
            "\1\42\46\uffff\3\43\1\115\26\43",
            "\1\42\46\uffff\10\43\1\116\21\43",
            "\1\42\46\uffff\22\43\1\117\7\43",
            "\1\42\46\uffff\1\43\1\120\30\43",
            "\1\42\46\uffff\31\43\1\121",
            "\1\42\46\uffff\13\43\1\122\16\43",
            "",
            "",
            "\1\42\46\uffff\21\43\1\123\10\43",
            "\1\42\46\uffff\21\43\1\124\10\43",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\1\131\31\43",
            "\1\42\46\uffff\4\43\1\132\25\43",
            "\1\42\46\uffff\17\43\1\133\12\43",
            "\1\42\46\uffff\24\43\1\134\5\43",
            "\1\42\46\uffff\10\43\1\135\21\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\21\43\1\137\10\43",
            "\1\42\46\uffff\13\43\1\140\16\43",
            "\1\42\46\uffff\10\43\1\141\21\43",
            "\1\42\46\uffff\4\43\1\142\25\43",
            "\1\42\46\uffff\4\43\1\143\25\43",
            "\1\42\46\uffff\23\43\1\144\6\43",
            "\1\42\46\uffff\15\43\1\145\14\43",
            "",
            "",
            "",
            "",
            "",
            "\1\42\46\uffff\15\43\1\146\14\43",
            "\1\42\46\uffff\5\43\1\153\2\43\1\151\3\43\1\147\5\43\1\150"+
            "\3\43\1\152\3\43",
            "\1\42\46\uffff\22\43\1\154\7\43",
            "\1\42\46\uffff\4\43\1\155\25\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\4\43\1\157\25\43",
            "\1\42\46\uffff\4\43\1\160\25\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\10\43\1\162\21\43",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\42\46\uffff\6\43\1\165\23\43",
            "\1\42\46\uffff\15\43\1\166\14\43",
            "\1\42\46\uffff\4\43\1\167\25\43",
            "\1\42\46\uffff\4\43\1\170\25\43",
            "\1\42\46\uffff\13\43\1\171\16\43",
            "",
            "\1\42\46\uffff\4\43\1\172\25\43",
            "\1\42\46\uffff\22\43\1\173\7\43",
            "\1\42\46\uffff\2\43\1\174\27\43",
            "\1\42\46\uffff\2\43\1\175\27\43",
            "\1\42\46\uffff\15\43\1\176\14\43",
            "\1\42\46\uffff\23\43\1\177\6\43",
            "\1\42\46\uffff\12\43\1\u0080\17\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\1\u0082\31\43",
            "\1\42\46\uffff\24\43\1\u0083\5\43",
            "\1\42\46\uffff\5\43\1\u0084\24\43",
            "\1\42\46\uffff\7\43\1\u0085\22\43",
            "\1\42\46\uffff\16\43\1\u0086\13\43",
            "\1\42\46\uffff\23\43\1\u0087\6\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\1\42\46\uffff\16\43\1\u0089\13\43",
            "\1\42\46\uffff\2\43\1\u008a\27\43",
            "",
            "\1\42\46\uffff\5\43\1\u008b\24\43",
            "",
            "",
            "\1\42\46\uffff\4\43\1\u008c\25\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\4\43\1\u0090\25\43",
            "\1\42\46\uffff\1\u0091\31\43",
            "\1\42\46\uffff\4\43\1\u0092\25\43",
            "\1\42\46\uffff\12\43\1\u0093\17\43",
            "\1\42\46\uffff\12\43\1\u0094\17\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\16\43\1\u0096\13\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\1\42\46\uffff\10\43\1\u0098\21\43",
            "\1\42\46\uffff\1\43\1\u0099\30\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\10\43\1\u009b\21\43",
            "\1\42\46\uffff\21\43\1\u009c\10\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\1\42\46\uffff\5\43\1\u009e\24\43",
            "\1\42\46\uffff\23\43\1\u009f\6\43",
            "\1\42\46\uffff\30\43\1\u00a0\1\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "",
            "",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\1\42\46\uffff\2\43\1\u00a2\27\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\1\42\46\uffff\15\43\1\u00a5\14\43",
            "",
            "\1\42\46\uffff\15\43\1\u00a6\14\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\1\42\46\uffff\13\43\1\u00a8\16\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\1\42\46\uffff\7\43\1\u00ad\22\43",
            "",
            "",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\1\42\46\uffff\4\43\1\u00af\25\43",
            "",
            "",
            "",
            "",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            "\12\41\1\42\6\uffff\32\41\4\uffff\1\41\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_BOOLEAN | RULE_CLICKABLEELEMENT | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_27 = input.LA(1);

                        s = -1;
                        if ( ((LA31_27>='\u0000' && LA31_27<='\uFFFF')) ) {s = 72;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_0 = input.LA(1);

                        s = -1;
                        if ( (LA31_0=='m') ) {s = 1;}

                        else if ( (LA31_0=='e') ) {s = 2;}

                        else if ( (LA31_0=='s') ) {s = 3;}

                        else if ( (LA31_0=='(') ) {s = 4;}

                        else if ( (LA31_0=='v') ) {s = 5;}

                        else if ( (LA31_0==',') ) {s = 6;}

                        else if ( (LA31_0==')') ) {s = 7;}

                        else if ( (LA31_0=='-') ) {s = 8;}

                        else if ( (LA31_0=='A') ) {s = 9;}

                        else if ( (LA31_0=='!') ) {s = 10;}

                        else if ( (LA31_0=='=') ) {s = 11;}

                        else if ( (LA31_0=='<') ) {s = 12;}

                        else if ( (LA31_0=='>') ) {s = 13;}

                        else if ( (LA31_0=='i') ) {s = 14;}

                        else if ( (LA31_0=='t') ) {s = 15;}

                        else if ( (LA31_0=='w') ) {s = 16;}

                        else if ( (LA31_0=='d') ) {s = 17;}

                        else if ( (LA31_0=='f') ) {s = 18;}

                        else if ( (LA31_0=='c') ) {s = 19;}

                        else if ( (LA31_0=='o') ) {s = 20;}

                        else if ( (LA31_0=='b') ) {s = 21;}

                        else if ( (LA31_0=='l') ) {s = 22;}

                        else if ( (LA31_0=='a'||(LA31_0>='g' && LA31_0<='h')||(LA31_0>='j' && LA31_0<='k')||LA31_0=='n'||(LA31_0>='p' && LA31_0<='r')||LA31_0=='u'||(LA31_0>='x' && LA31_0<='z')) ) {s = 23;}

                        else if ( (LA31_0=='^') ) {s = 24;}

                        else if ( ((LA31_0>='B' && LA31_0<='Z')||LA31_0=='_') ) {s = 25;}

                        else if ( ((LA31_0>='0' && LA31_0<='9')) ) {s = 26;}

                        else if ( (LA31_0=='\"') ) {s = 27;}

                        else if ( (LA31_0=='\'') ) {s = 28;}

                        else if ( (LA31_0=='/') ) {s = 29;}

                        else if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {s = 30;}

                        else if ( ((LA31_0>='\u0000' && LA31_0<='\b')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\u001F')||(LA31_0>='#' && LA31_0<='&')||(LA31_0>='*' && LA31_0<='+')||LA31_0=='.'||(LA31_0>=':' && LA31_0<=';')||(LA31_0>='?' && LA31_0<='@')||(LA31_0>='[' && LA31_0<=']')||LA31_0=='`'||(LA31_0>='{' && LA31_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_28 = input.LA(1);

                        s = -1;
                        if ( ((LA31_28>='\u0000' && LA31_28<='\uFFFF')) ) {s = 72;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}