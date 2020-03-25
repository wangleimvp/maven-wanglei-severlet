package com.aaron.websocket.tomcat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author wanglei
 * Created on 2020-03-23
 */
@Controller
public class HelloWorld {

    @RequestMapping(value="/websocket/hello")
    public void sendMsg(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("hello world");
    }

}
