//S:top//
//S:import//
import java.util.*;

// <keyword>:S ::= SKP
public class S extends Keyword /*S:class*/ {

    public static final String $className = "S";
    public static final String $ruleString =
        "<keyword>:S ::= SKP";



    public S() {
//S:init//

    }

    public static S parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<keyword>:S", scn$.lno);
        scn$.match(Token.Match.SKP, trace$);
        return new S();
    }

//S//
}
