package me.softwarecraftsman.lox;

import me.softwarecraftsman.lox.Expr.Binary;
import me.softwarecraftsman.lox.Expr.Grouping;
import me.softwarecraftsman.lox.Expr.Literal;
import me.softwarecraftsman.lox.Expr.Unary;

class Interpreter implements Expr.Visitor<Object> {

    @Override
    public Object visitBinaryExpr(Binary expr) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object visitGroupingExpr(Grouping expr) {
        return evaluate(expr.expressions);
    }

    @Override
    public Object visitLiteralExpr(Literal expr) {
        return expr.value;
    }

    @Override
    public Object visitUnaryExpr(Unary expr) {
        Object right = evaluate(expr.right);

        switch(expr.operator.type) {
            case MINUS:
                return -(double)right;
            case BANG:
                return !isTruthy(right);
        }
        
        //Unreachable
        return null;
    }

    private Object evaluate(Expr expr) {
        return expr.accept(this);
    }
    
}
