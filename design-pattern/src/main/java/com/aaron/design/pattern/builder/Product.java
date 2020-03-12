package com.aaron.design.pattern.builder;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show(){
        System.out.println("该产品组成由" + partA + "," + partB + ","+ partC);
    }
}
