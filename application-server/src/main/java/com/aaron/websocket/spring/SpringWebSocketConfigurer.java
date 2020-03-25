package com.aaron.websocket.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Author wanglei
 * Created on 2020-03-24
 */
@Configuration
@EnableWebMvc
@EnableWebSocket
//public class SpringWebSocketConfigurer extends WebMvcConfigurerAdapter implements WebMvcConfigurer {
public class SpringWebSocketConfigurer implements WebSocketConfigurer {

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry){
        registry.addHandler(webSocketHandler(),"/websocket/socketServer.do")
                .addInterceptors(new SpringWebSocketHandlerInterceptor()).setAllowedOrigins("*");
        registry.addHandler(webSocketHandler(), "/websocket/sockjs/socketServer.do")
                .addInterceptors(new SpringWebSocketHandlerInterceptor()).withSockJS();
    }

    @Bean
    public TextWebSocketHandler webSocketHandler(){
        return new SpringWebSocketHandler();
    }

}
