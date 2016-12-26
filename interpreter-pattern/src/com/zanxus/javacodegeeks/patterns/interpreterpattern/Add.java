package com.zanxus.javacodegeeks.patterns.interpreterpattern;

/**
 * @author root
 * @create 2016-12-26 11:10 PM
 */
public class Add implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Add(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
