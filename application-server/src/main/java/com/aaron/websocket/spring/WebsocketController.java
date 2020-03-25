package com.aaron.websocket.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Author wanglei
 * Created on 2020-03-24
 */
@Controller
public class WebsocketController {

    @Autowired
    SpringWebSocketHandler springWebSocketHandler;

    @RequestMapping("/websocket/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String username = request.getParameter("username");
        System.out.println(username + "登录");
        HttpSession session = request.getSession(true);
        session.setAttribute("SESSION_USERNAME", username);
        response.sendRedirect("/static/websocket/springSendMessage.jsp");
//        return new ModelAndView("springSendMessage");
    }

    @RequestMapping("/websocket/send")
    @ResponseBody
    public void send(HttpServletRequest request) {
        String username = request.getParameter("username");
        springWebSocketHandler.sendMessageToUser(username, new TextMessage("你好，测试！！！！"));
    }

    @RequestMapping("/websocket/sendAll")
    @ResponseBody
    public void sendAll(HttpServletRequest request) {
        springWebSocketHandler.sendMessageToUsers(new TextMessage("你好，测试！！！！"));
    }

    @Bean //这个注解会从Spring容器拿出Bean
    public SpringWebSocketHandler infoHandler() {
        return new SpringWebSocketHandler();
    }
}
