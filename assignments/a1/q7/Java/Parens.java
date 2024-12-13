//Parens:top//
//Parens:import//
import java.util.*;

public abstract class Parens /*Parens:class*/ {

    public static final String $className = "Parens";
    public static Parens parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case AT:
        case RP:
            return None.parse(scn$,trace$);
        case LP:
            return Some.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Parens cannot begin with " + t$.errString()
            );
        }
    }

//Parens//
}
