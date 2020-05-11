package com.aaron.spring.controller;

import com.aaron.spring.domain.Demo;
import com.aaron.spring.service.HelloWorldService;
import com.aaron.spring.service.SpringContextUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author wanglei
 * Created on 2020-05-11
 */
@Controller
public class HelloWorld {

    @RequestMapping(value="/spring/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String sendMsg(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HelloWorldService aaa = (HelloWorldService) SpringContextUtil.getBean("helloWorldService");
        System.out.println(aaa.say());
        return "0000, hello world !";
    }

    @RequestMapping(value="/spring/json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Demo getJson(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Demo demo = new Demo();
        demo.setAddress("谁登录看风景");
        demo.setAge(11);
        return demo;
    }
}
