//Keyword:top//
//Keyword:import//
import java.util.*;

public abstract class Keyword /*Keyword:class*/ {

    public static final String $className = "Keyword";
    public static Keyword parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case TKN:
            return T.parse(scn$,trace$);
        case SKP:
            return S.parse(scn$,trace$);
        case NAME:
            return N.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Keyword cannot begin with " + t$.errString()
            );
        }
    }

//Keyword//
}
