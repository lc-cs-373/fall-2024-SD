//None:top//
//None:import//
import java.util.*;

// <parens>:None ::= 
public class None extends Parens /*None:class*/ {

    public static final String $className = "None";
    public static final String $ruleString =
        "<parens>:None ::= ";



    public None() {
//None:init//

    }

    public static None parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<parens>:None", scn$.lno);
        return new None();
    }

//None//
}
