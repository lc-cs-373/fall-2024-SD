#Some:top#
#Some:import#

# <parens>:Some ::= LP <parens>:in RP <parens>:out
class Some(Parens): #Some:class#

    className = "Some"
    ruleString = "<parens>:Some ::= LP <parens>:in RP <parens>:out"
    in = None
    out = None

    def __init__(in, out):
        #Some:init#
        self.in = in
        self.out = out

#Some#
