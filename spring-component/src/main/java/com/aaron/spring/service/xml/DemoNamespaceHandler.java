package com.aaron.spring.service.xml;

import com.aaron.spring.domain.Demo;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Author wanglei
 * Created on 2020-05-13
 */
public class DemoNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("elementname1", new DemoBeanDefinitionParser(Demo.class));
    }
}
