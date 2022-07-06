package com.charcl.study;

import com.charcl.study.config.AppConfig;
import com.charcl.study.service.BookService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test implements BeanFactoryPostProcessor {

	//测试attributeAccessorSupport类中的Map集合存放什么东东
	public static void beanDefinitionTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		BeanDefinition bookService = context.getBeanDefinition("lalala");
		Object bookService=context.getBean("lalala");
		System.out.println(bookService);
	}

	public static void attributeAccessorSupportMap(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BeanDefinition appConfig = context.getBeanDefinition("appConfig");
		for (String item : appConfig.attributeNames()) {
			System.out.println(item + ":" + appConfig.getAttribute(item));
		}
	}

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println(context.getBeanDefinition("bookService").getSource());

		beanDefinitionTest();
//		attributeAccessorSupportMap();

	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		BeanDefinition beanDefinition = beanFactory.getBeanDefinition();
		//modify bean definition
//		beanDefinition.setAttribute(); //modify attrbute
		//invokeBeanFactoryPostProcessors refresh（）-》 invokeBeanFactoryPostProcessors #
	}
}
