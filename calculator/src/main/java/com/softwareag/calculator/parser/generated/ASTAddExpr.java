package com.softwareag.calculator.parser.generated;

/* Generated By:JJTree: Do not edit this line. ASTAddExpr.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAddExpr extends SimpleNode {
  public ASTAddExpr(int id) {
    super(id);
  }

  public ASTAddExpr(Arithmetic p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public int jjtAccept(ArithmeticVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6926b338f68226418b524362ccec97bb (do not edit this line) */
