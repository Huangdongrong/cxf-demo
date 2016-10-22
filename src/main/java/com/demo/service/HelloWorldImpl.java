package com.demo.service;


public class HelloWorldImpl implements IHelloWorld{

	public String sayHello(String name) {
		return name + " say: Hello World!";  
	}

}
