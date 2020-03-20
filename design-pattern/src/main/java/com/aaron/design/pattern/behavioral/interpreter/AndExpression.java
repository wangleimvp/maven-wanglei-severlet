package com.aaron.design.pattern.behavioral.interpreter;

/**
 * Author wanglei
 * Created on 2020-03-20
 */
public class AndExpression implements Expression {

    private Expression city;
    private Expression person;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
