package com.aaron.design.pattern.structural.proxy;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest()
    {
        System.out.println("访问真实主题之前的预处理。");
    }
    public void postRequest()
    {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
