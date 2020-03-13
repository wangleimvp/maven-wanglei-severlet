package com.aaron.design.pattern.structural.bridge;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Wallet extends AbstractBag {
    @Override
    public String getName() {
        return color.getColor() + " Wallet";
    }
}
