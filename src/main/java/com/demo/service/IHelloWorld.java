package com.demo.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@SuppressWarnings("restriction")
@WebService  
@SOAPBinding(style=Style.RPC)  
public interface IHelloWorld {  
      
    public String sayHello(@WebParam(name = "name") String name);  
  
}  