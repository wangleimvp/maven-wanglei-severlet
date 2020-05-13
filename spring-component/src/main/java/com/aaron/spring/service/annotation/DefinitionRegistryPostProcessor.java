package com.aaron.spring.service.annotation;

import com.aaron.spring.annotation.MyAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * Author wanglei
 * Created on 2020-05-11
 */
@Configuration
public class DefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        //扫描自定义注解
        ClassPathBeanDefinitionScanner scanner = new
                ClassPathBeanDefinitionScanner(beanDefinitionRegistry);
        // bean 的名字生成规则在AnnotationBeanNameGenerator
        scanner.setBeanNameGenerator(new AnnotationBeanNameGenerator());
        // 设置哪些注解的扫描
        scanner.addIncludeFilter(new AnnotationTypeFilter(MyAnnotation.class));
        scanner.scan("com.aaron.spring.service");
        // 注意helloWord已经注册到容器中. 细看AnnotationBeanNameGenerator 的 generateBeanName()
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
