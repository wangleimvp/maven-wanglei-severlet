package com.aaron.design.pattern.creational.prototype;

import java.util.Scanner;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class Circle implements Shape {

    @Override
    public Shape clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆失败!");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r = 0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }
}
