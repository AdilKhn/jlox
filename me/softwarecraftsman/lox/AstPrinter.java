package me.softwarecraftsman.lox;

public class AstPrinter {
   class AstPrinter implements Expr.Visitor<String> {
       String print(Expr expr) {
           return expr.accept(this);
       }
   } 
}