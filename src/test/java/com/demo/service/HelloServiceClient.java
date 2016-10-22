package com.demo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceClient {
//	    	   访问地地址http://localhost:8080/webservice-demo/helloWorld?wsdl
	    public static void main(String[] args) {
	        // 加载客户端的配置定义  
	        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");  
	        // 获取定义的 Web Service Bean  
	        IHelloWorld helloService = (IHelloWorld) context.getBean("helloServiceClient");  
	        String username = "Ailan";  
	        // 调用方法进行服务消费  
	        String result = helloService.sayHello(username);  
	        System.out.println("Result:" + result);  
	    }
}
