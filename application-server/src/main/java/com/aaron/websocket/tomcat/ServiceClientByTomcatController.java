package com.aaron.websocket.tomcat;

import com.alibaba.fastjson.JSONObject;
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
@RequestMapping(value="/websocket/webSocketByTomcat/serviceToClient")
public class ServiceClientByTomcatController {

    private WebSocket websocket = new WebSocket();

    @RequestMapping
    public void sendMsg(HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject json = new JSONObject();
        json.put("to", request.getSession().getId());
        json.put("msg", "欢迎连接WebSocket！！！！");
        websocket.onMessage(json.toJSONString());
    }

}
