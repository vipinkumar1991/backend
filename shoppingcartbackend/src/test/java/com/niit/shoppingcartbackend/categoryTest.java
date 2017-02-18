package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcartbackend.model.category;
public class categoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      //specify in package the classes are there
      
      
      context.scan("com.niit");
      context.refresh();
      //whatever the beans/instance you required,you ask context
      
      category c = (category) context.getBean("category") ;
      System.out.println("category instance created");
    		  
	}

}
