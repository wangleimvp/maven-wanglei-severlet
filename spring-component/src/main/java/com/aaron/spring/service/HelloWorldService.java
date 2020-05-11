package com.aaron.spring.service;

import com.aaron.spring.annotation.MyAnnotation;

/**
 * Author wanglei
 * Created on 2020-05-11
 */
@MyAnnotation
public class HelloWorldService {

    private String name = "lsr";

    public String say() {
        return "hello " + name;
    }
}
