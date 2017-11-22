package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_scope_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_scope.xml");
	    
         Coach thecoach =  context.getBean("myCoach",Coach.class);
	     
         Coach alphacoach =  context.getBean("myCoach",Coach.class);    
	 
         boolean result = (thecoach==alphacoach);
         System.out.println("Pointing to the same object  :"+result);
         
         System.out.println("\nMemory location of thecoach :"+thecoach);
         
         System.out.println("\nMemory location of alphacoach :"+alphacoach);
         
         
         
         
         
	  /*   System.out.println(thecoach.getDailyWorkout());
	     System.out.println(thecoach.getDailyWorkout());*/
	}

}
