package com.aaron.design.pattern.behavioral.interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author wanglei
 * Created on 2020-03-20
 * 终结符表达式类
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data){
        set.addAll(Arrays.asList(data));
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
