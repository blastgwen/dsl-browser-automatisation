package com.selenium.gram.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSlnDslLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int RULE_URL=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int RULE_CLICKABLEELEMENT=7;
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
    public String getGrammarFileName() { return "../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:11:7: ( 'All' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:11:9: 'All'
            {
            match("All"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:12:7: ( 'Any' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:12:9: 'Any'
            {
            match("Any"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:13:7: ( '==' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:13:9: '=='
            {
            match("=="); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:14:7: ( '<' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:14:9: '<'
            {
            match('<'); 

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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:15:7: ( '>' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:15:9: '>'
            {
            match('>'); 

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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:16:7: ( 'verify' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:16:9: 'verify'
            {
            match("verify"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:17:7: ( 'select' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:17:9: 'select'
            {
            match("select"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:18:7: ( 'main' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:18:9: 'main'
            {
            match("main"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:19:7: ( 'endmain' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:19:9: 'endmain'
            {
            match("endmain"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:20:7: ( 'sub' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:20:9: 'sub'
            {
            match("sub"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:21:7: ( 'endsub' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:21:9: 'endsub'
            {
            match("endsub"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:22:7: ( '()' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:22:9: '()'
            {
            match("()"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:23:7: ( '(' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:23:9: '('
            {
            match('('); 

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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:24:7: ( 'var' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:24:9: 'var'
            {
            match("var"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:25:7: ( ')' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:25:9: ')'
            {
            match(')'); 

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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:26:7: ( ',' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:26:9: ','
            {
            match(','); 

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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:27:7: ( '->' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:27:9: '->'
            {
            match("->"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:28:7: ( 'sizeof' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:28:9: 'sizeof'
            {
            match("sizeof"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:29:7: ( '!' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:29:9: '!'
            {
            match('!'); 

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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:30:7: ( '=' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:30:9: '='
            {
            match('='); 

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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:31:7: ( 'if' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:31:9: 'if'
            {
            match("if"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:32:7: ( 'then' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:32:9: 'then'
            {
            match("then"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:33:7: ( 'endif' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:33:9: 'endif'
            {
            match("endif"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:34:7: ( 'else' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:34:9: 'else'
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:35:7: ( 'while' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:35:9: 'while'
            {
            match("while"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:36:7: ( 'do' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:36:9: 'do'
            {
            match("do"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:37:7: ( 'endwhile' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:37:9: 'endwhile'
            {
            match("endwhile"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:38:7: ( 'foreach' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:38:9: 'foreach'
            {
            match("foreach"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:39:7: ( 'in' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:39:9: 'in'
            {
            match("in"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:40:7: ( 'endfor' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:40:9: 'endfor'
            {
            match("endfor"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:41:7: ( 'click' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:41:9: 'click'
            {
            match("click"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:42:7: ( 'open' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:42:9: 'open'
            {
            match("open"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:43:7: ( 'check' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:43:9: 'check'
            {
            match("check"); 


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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:44:7: ( 'type' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:44:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_CLICKABLEELEMENT"
    public final void mRULE_CLICKABLEELEMENT() throws RecognitionException {
        try {
            int _type = RULE_CLICKABLEELEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5075:23: ( ( 'button' | 'image' | 'link' ) )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5075:25: ( 'button' | 'image' | 'link' )
            {
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5075:25: ( 'button' | 'image' | 'link' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt1=1;
                }
                break;
            case 'i':
                {
                alt1=2;
                }
                break;
            case 'l':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5075:26: 'button'
                    {
                    match("button"); 


                    }
                    break;
                case 2 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5075:35: 'image'
                    {
                    match("image"); 


                    }
                    break;
                case 3 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5075:43: 'link'
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:10: ( ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )? )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:12: ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            {
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:12: ( 'a' .. 'z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:13: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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

            match("://"); 

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:30: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:31: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+
                    {
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:31: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:47: ( '0' .. '9' )+
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
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:48: '0' .. '9'
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
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:63: ( '0' .. '9' )+
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
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:64: '0' .. '9'
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
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:79: ( '0' .. '9' )+
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
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:80: '0' .. '9'
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


                    }
                    break;
                case 2 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:91: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=9;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:112: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:121: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:130: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:139: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:143: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:147: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:151: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:214: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:238: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='.') ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:239: '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    {
                    	    match('.'); 
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    loop8:
                    	    do {
                    	        int alt8=9;
                    	        alt8 = dfa8.predict(input);
                    	        switch (alt8) {
                    	    	case 1 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:264: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:273: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:282: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:291: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:295: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:299: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:303: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:366: '%' '0' .. '9' '0' .. '9'
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


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:393: ( ':' ( '0' .. '9' )+ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==':') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:394: ':' ( '0' .. '9' )+
                    {
                    match(':'); 
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:398: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:399: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:412: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='/') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:413: '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    {
            	    match('/'); 
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    loop13:
            	    do {
            	        int alt13=12;
            	        alt13 = dfa13.predict(input);
            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:418: 'a' .. 'z'
            	    	    {
            	    	    matchRange('a','z'); 

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:427: 'A' .. 'Z'
            	    	    {
            	    	    matchRange('A','Z'); 

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:436: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:445: '$'
            	    	    {
            	    	    match('$'); 

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:449: '-'
            	    	    {
            	    	    match('-'); 

            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:453: '_'
            	    	    {
            	    	    match('_'); 

            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:457: '~'
            	    	    {
            	    	    match('~'); 

            	    	    }
            	    	    break;
            	    	case 8 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:461: '+'
            	    	    {
            	    	    match('+'); 

            	    	    }
            	    	    break;
            	    	case 9 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:465: '.'
            	    	    {
            	    	    match('.'); 

            	    	    }
            	    	    break;
            	    	case 10 :
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:469: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:532: '%' '0' .. '9' '0' .. '9'
            	    	    {
            	    	    match('%'); 
            	    	    matchRange('0','9'); 
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:558: ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='?') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:559: '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    {
                    match('?'); 
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=12;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:564: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:573: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:582: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:591: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:595: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:599: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:603: '='
                    	    {
                    	    match('='); 

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:607: '&'
                    	    {
                    	    match('&'); 

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:611: ';'
                    	    {
                    	    match(';'); 

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:615: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:678: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:702: ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='+') ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:703: '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    {
                    	    match('+'); 
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    int cnt16=0;
                    	    loop16:
                    	    do {
                    	        int alt16=12;
                    	        alt16 = dfa16.predict(input);
                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:708: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:717: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:726: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:735: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:739: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:743: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:747: '='
                    	    	    {
                    	    	    match('='); 

                    	    	    }
                    	    	    break;
                    	    	case 8 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:751: '&'
                    	    	    {
                    	    	    match('&'); 

                    	    	    }
                    	    	    break;
                    	    	case 9 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:755: ';'
                    	    	    {
                    	    	    match(';'); 

                    	    	    }
                    	    	    break;
                    	    	case 10 :
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:759: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
                    	    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5077:822: '%' '0' .. '9' '0' .. '9'
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


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5079:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5079:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5079:11: ( '^' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='^') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5079:11: '^'
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

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5079:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5081:10: ( ( '0' .. '9' )+ )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5081:12: ( '0' .. '9' )+
            {
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5081:12: ( '0' .. '9' )+
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
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5081:13: '0' .. '9'
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5083:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5085:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5085:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5085:24: ( options {greedy=false; } : . )*
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
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5085:52: .
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\u0000' && LA26_0<='\t')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:40: ( ( '\\r' )? '\\n' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:41: ( '\\r' )? '\\n'
                    {
                    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:41: ( '\\r' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='\r') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5087:41: '\\r'
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5089:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5089:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5089:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:
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
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5091:16: ( . )
            // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:5091:18: .
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
        // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_CLICKABLEELEMENT | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=43;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:214: RULE_CLICKABLEELEMENT
                {
                mRULE_CLICKABLEELEMENT(); 

                }
                break;
            case 36 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:236: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 37 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:245: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:253: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:262: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:274: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:290: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:306: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../com.selenium.gram.xtext.ui/src-gen/com/selenium/gram/xtext/ui/contentassist/antlr/internal/InternalSlnDsl.g:1:314: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA7_eotS =
        "\1\1\11\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\44\11\uffff";
    static final String DFA7_maxS =
        "\1\172\11\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 5077:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
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
            return "()* loopback of 5077:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA13_eotS =
        "\1\1\14\uffff";
    static final String DFA13_eofS =
        "\15\uffff";
    static final String DFA13_minS =
        "\1\44\14\uffff";
    static final String DFA13_maxS =
        "\1\176\14\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 5077:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA15_eotS =
        "\1\1\14\uffff";
    static final String DFA15_eofS =
        "\15\uffff";
    static final String DFA15_minS =
        "\1\44\14\uffff";
    static final String DFA15_maxS =
        "\1\172\14\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA15_specialS =
        "\15\uffff}>";
    static final String[] DFA15_transitionS = {
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()+ loopback of 5077:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
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
            return "()+ loopback of 5077:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
        }
    }
    static final String DFA30_eotS =
        "\1\uffff\1\42\1\44\2\uffff\4\42\1\62\2\uffff\1\37\1\uffff\12\42"+
        "\1\37\2\uffff\3\37\2\uffff\2\42\5\uffff\2\42\1\uffff\7\42\6\uffff"+
        "\1\123\1\124\4\42\1\131\6\42\5\uffff\1\140\1\141\1\42\1\143\1\42"+
        "\1\145\4\42\2\uffff\4\42\1\uffff\6\42\2\uffff\1\42\1\uffff\1\42"+
        "\1\uffff\1\42\1\173\5\42\1\u0081\1\42\1\u0083\1\u0084\4\42\1\u0089"+
        "\1\42\1\u008b\3\42\1\uffff\2\42\1\u0091\2\42\1\uffff\1\u008b\2\uffff"+
        "\1\u0094\1\42\1\u0096\1\u0097\1\uffff\1\42\1\uffff\1\u0099\1\u009a"+
        "\1\u009b\1\42\1\u009d\1\uffff\1\42\1\u009f\1\uffff\1\42\2\uffff"+
        "\1\u008b\3\uffff\1\u00a1\1\uffff\1\42\1\uffff\1\u00a3\1\uffff\1"+
        "\u00a4\2\uffff";
    static final String DFA30_eofS =
        "\u00a5\uffff";
    static final String DFA30_minS =
        "\1\0\1\154\1\75\2\uffff\4\72\1\51\2\uffff\1\76\1\uffff\12\72\1"+
        "\101\2\uffff\2\0\1\52\2\uffff\1\154\1\171\5\uffff\2\72\1\uffff\7"+
        "\72\6\uffff\2\60\4\72\1\60\6\72\5\uffff\2\60\1\72\1\60\1\72\1\60"+
        "\4\72\2\uffff\4\72\1\uffff\6\72\2\uffff\1\72\1\uffff\1\72\1\uffff"+
        "\1\72\1\60\5\72\1\60\1\72\2\60\4\72\1\60\1\72\1\60\3\72\1\uffff"+
        "\2\72\1\60\2\72\1\uffff\1\60\2\uffff\1\60\1\72\2\60\1\uffff\1\72"+
        "\1\uffff\3\60\1\72\1\60\1\uffff\1\72\1\60\1\uffff\1\72\2\uffff\1"+
        "\60\3\uffff\1\60\1\uffff\1\72\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\1\156\1\75\2\uffff\4\172\1\51\2\uffff\1\76\1\uffff\13"+
        "\172\2\uffff\2\uffff\1\57\2\uffff\1\154\1\171\5\uffff\2\172\1\uffff"+
        "\7\172\6\uffff\15\172\5\uffff\12\172\2\uffff\4\172\1\uffff\6\172"+
        "\2\uffff\1\172\1\uffff\1\172\1\uffff\25\172\1\uffff\5\172\1\uffff"+
        "\1\172\2\uffff\4\172\1\uffff\1\172\1\uffff\5\172\1\uffff\2\172\1"+
        "\uffff\1\172\2\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1"+
        "\172\1\uffff\1\172\2\uffff";
    static final String DFA30_acceptS =
        "\3\uffff\1\4\1\5\5\uffff\1\17\1\20\1\uffff\1\23\13\uffff\1\45\1"+
        "\46\3\uffff\1\52\1\53\2\uffff\1\45\1\3\1\24\1\4\1\5\2\uffff\1\44"+
        "\7\uffff\1\14\1\15\1\17\1\20\1\21\1\23\15\uffff\1\46\1\47\1\50\1"+
        "\51\1\52\12\uffff\1\25\1\35\4\uffff\1\32\6\uffff\1\1\1\2\1\uffff"+
        "\1\16\1\uffff\1\12\25\uffff\1\10\5\uffff\1\30\1\uffff\1\26\1\42"+
        "\4\uffff\1\40\1\uffff\1\43\5\uffff\1\27\2\uffff\1\31\1\uffff\1\37"+
        "\1\41\1\uffff\1\6\1\7\1\22\1\uffff\1\13\1\uffff\1\36\1\uffff\1\11"+
        "\1\uffff\1\34\1\33";
    static final String DFA30_specialS =
        "\1\0\32\uffff\1\2\1\1\u0088\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\15\1\33\4\37\1\34\1\11\1"+
            "\12\2\37\1\13\1\14\1\37\1\35\12\32\2\37\1\3\1\2\1\4\2\37\1\1"+
            "\31\31\3\37\1\30\1\31\1\37\1\27\1\25\1\23\1\21\1\10\1\22\2\27"+
            "\1\16\2\27\1\26\1\7\1\27\1\24\3\27\1\6\1\17\1\27\1\5\1\20\3"+
            "\27\uff85\37",
            "\1\40\1\uffff\1\41",
            "\1\43",
            "",
            "",
            "\1\51\46\uffff\1\50\3\52\1\47\25\52",
            "\1\51\46\uffff\4\52\1\53\3\52\1\55\13\52\1\54\5\52",
            "\1\51\46\uffff\1\56\31\52",
            "\1\51\46\uffff\13\52\1\60\1\52\1\57\14\52",
            "\1\61",
            "",
            "",
            "\1\65",
            "",
            "\1\51\46\uffff\5\52\1\67\6\52\1\71\1\70\14\52",
            "\1\51\46\uffff\7\52\1\72\20\52\1\73\1\52",
            "\1\51\46\uffff\7\52\1\74\22\52",
            "\1\51\46\uffff\16\52\1\75\13\52",
            "\1\51\46\uffff\16\52\1\76\13\52",
            "\1\51\46\uffff\7\52\1\100\3\52\1\77\16\52",
            "\1\51\46\uffff\17\52\1\101\12\52",
            "\1\51\46\uffff\24\52\1\102\5\52",
            "\1\51\46\uffff\10\52\1\103\21\52",
            "\1\51\46\uffff\32\52",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\51\46\uffff\21\52\1\113\10\52",
            "\1\51\46\uffff\21\52\1\114\10\52",
            "",
            "\1\51\46\uffff\32\52",
            "\1\51\46\uffff\13\52\1\115\16\52",
            "\1\51\46\uffff\1\52\1\116\30\52",
            "\1\51\46\uffff\31\52\1\117",
            "\1\51\46\uffff\10\52\1\120\21\52",
            "\1\51\46\uffff\3\52\1\121\26\52",
            "\1\51\46\uffff\22\52\1\122\7\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\1\125\31\52",
            "\1\51\46\uffff\4\52\1\126\25\52",
            "\1\51\46\uffff\17\52\1\127\12\52",
            "\1\51\46\uffff\10\52\1\130\21\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\21\52\1\132\10\52",
            "\1\51\46\uffff\10\52\1\133\21\52",
            "\1\51\46\uffff\4\52\1\134\25\52",
            "\1\51\46\uffff\4\52\1\135\25\52",
            "\1\51\46\uffff\23\52\1\136\6\52",
            "\1\51\46\uffff\15\52\1\137\14\52",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\51\46\uffff\10\52\1\142\21\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\4\52\1\144\25\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\4\52\1\146\25\52",
            "\1\51\46\uffff\15\52\1\147\14\52",
            "\1\51\46\uffff\5\52\1\154\2\52\1\152\3\52\1\150\5\52\1\151"+
            "\3\52\1\153\3\52",
            "\1\51\46\uffff\4\52\1\155\25\52",
            "",
            "",
            "\1\51\46\uffff\6\52\1\156\23\52",
            "\1\51\46\uffff\15\52\1\157\14\52",
            "\1\51\46\uffff\4\52\1\160\25\52",
            "\1\51\46\uffff\13\52\1\161\16\52",
            "",
            "\1\51\46\uffff\4\52\1\162\25\52",
            "\1\51\46\uffff\2\52\1\163\27\52",
            "\1\51\46\uffff\2\52\1\164\27\52",
            "\1\51\46\uffff\15\52\1\165\14\52",
            "\1\51\46\uffff\23\52\1\166\6\52",
            "\1\51\46\uffff\12\52\1\167\17\52",
            "",
            "",
            "\1\51\46\uffff\5\52\1\170\24\52",
            "",
            "\1\51\46\uffff\2\52\1\171\27\52",
            "",
            "\1\51\46\uffff\16\52\1\172\13\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\1\174\31\52",
            "\1\51\46\uffff\24\52\1\175\5\52",
            "\1\51\46\uffff\5\52\1\176\24\52",
            "\1\51\46\uffff\7\52\1\177\22\52",
            "\1\51\46\uffff\16\52\1\u0080\13\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\4\52\1\u0082\25\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\4\52\1\u0085\25\52",
            "\1\51\46\uffff\1\u0086\31\52",
            "\1\51\46\uffff\12\52\1\u0087\17\52",
            "\1\51\46\uffff\12\52\1\u0088\17\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\16\52\1\u008a\13\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\30\52\1\u008c\1\52",
            "\1\51\46\uffff\23\52\1\u008d\6\52",
            "\1\51\46\uffff\5\52\1\u008e\24\52",
            "",
            "\1\51\46\uffff\10\52\1\u008f\21\52",
            "\1\51\46\uffff\1\52\1\u0090\30\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\10\52\1\u0092\21\52",
            "\1\51\46\uffff\21\52\1\u0093\10\52",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\2\52\1\u0095\27\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
            "\1\51\46\uffff\15\52\1\u0098\14\52",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "\1\51\46\uffff\15\52\1\u009c\14\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
            "\1\51\46\uffff\13\52\1\u009e\16\52",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
            "\1\51\46\uffff\7\52\1\u00a0\22\52",
            "",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
            "",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
            "\1\51\46\uffff\4\52\1\u00a2\25\52",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
            "\12\42\1\51\6\uffff\32\42\4\uffff\1\42\1\uffff\32\52",
            "",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_CLICKABLEELEMENT | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='A') ) {s = 1;}

                        else if ( (LA30_0=='=') ) {s = 2;}

                        else if ( (LA30_0=='<') ) {s = 3;}

                        else if ( (LA30_0=='>') ) {s = 4;}

                        else if ( (LA30_0=='v') ) {s = 5;}

                        else if ( (LA30_0=='s') ) {s = 6;}

                        else if ( (LA30_0=='m') ) {s = 7;}

                        else if ( (LA30_0=='e') ) {s = 8;}

                        else if ( (LA30_0=='(') ) {s = 9;}

                        else if ( (LA30_0==')') ) {s = 10;}

                        else if ( (LA30_0==',') ) {s = 11;}

                        else if ( (LA30_0=='-') ) {s = 12;}

                        else if ( (LA30_0=='!') ) {s = 13;}

                        else if ( (LA30_0=='i') ) {s = 14;}

                        else if ( (LA30_0=='t') ) {s = 15;}

                        else if ( (LA30_0=='w') ) {s = 16;}

                        else if ( (LA30_0=='d') ) {s = 17;}

                        else if ( (LA30_0=='f') ) {s = 18;}

                        else if ( (LA30_0=='c') ) {s = 19;}

                        else if ( (LA30_0=='o') ) {s = 20;}

                        else if ( (LA30_0=='b') ) {s = 21;}

                        else if ( (LA30_0=='l') ) {s = 22;}

                        else if ( (LA30_0=='a'||(LA30_0>='g' && LA30_0<='h')||(LA30_0>='j' && LA30_0<='k')||LA30_0=='n'||(LA30_0>='p' && LA30_0<='r')||LA30_0=='u'||(LA30_0>='x' && LA30_0<='z')) ) {s = 23;}

                        else if ( (LA30_0=='^') ) {s = 24;}

                        else if ( ((LA30_0>='B' && LA30_0<='Z')||LA30_0=='_') ) {s = 25;}

                        else if ( ((LA30_0>='0' && LA30_0<='9')) ) {s = 26;}

                        else if ( (LA30_0=='\"') ) {s = 27;}

                        else if ( (LA30_0=='\'') ) {s = 28;}

                        else if ( (LA30_0=='/') ) {s = 29;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 30;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||(LA30_0>='#' && LA30_0<='&')||(LA30_0>='*' && LA30_0<='+')||LA30_0=='.'||(LA30_0>=':' && LA30_0<=';')||(LA30_0>='?' && LA30_0<='@')||(LA30_0>='[' && LA30_0<=']')||LA30_0=='`'||(LA30_0>='{' && LA30_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_28 = input.LA(1);

                        s = -1;
                        if ( ((LA30_28>='\u0000' && LA30_28<='\uFFFF')) ) {s = 69;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_27 = input.LA(1);

                        s = -1;
                        if ( ((LA30_27>='\u0000' && LA30_27<='\uFFFF')) ) {s = 69;}

                        else s = 31;

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