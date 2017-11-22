package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_lifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_lifecycle.xml");
	    
         Coach thecoach =  context.getBean("myCoach",Coach.class);
	     
         /*Coach alphacoach =  context.getBean("myCoach",Coach.class); */   
	     
         System.out.println(thecoach.getDailyWorkout());
         context.close();
         
         
	  /*   System.out.println(thecoach.getDailyWorkout());
	     System.out.println(thecoach.getDailyWorkout());*/
	}

}
