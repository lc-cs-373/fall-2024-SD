//Some:top//
//Some:import//
import java.util.*;

// <parens>:Some ::= LP <parens>:in RP <parens>:out
public class Some extends Parens /*Some:class*/ {

    public static final String $className = "Some";
    public static final String $ruleString =
        "<parens>:Some ::= LP <parens>:in RP <parens>:out";

    public Parens in;
    public Parens out;

    public Some(Parens in, Parens out) {
//Some:init//
        this.in = in;
        this.out = out;
    }

    public static Some parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<parens>:Some", scn$.lno);
        scn$.match(Token.Match.LP, trace$);
        Parens in = Parens.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        Parens out = Parens.parse(scn$, trace$);
        return new Some(in, out);
    }

//Some//
}
