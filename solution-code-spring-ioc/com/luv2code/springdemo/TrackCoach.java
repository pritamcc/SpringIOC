package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
    
	public void init()
	{
		System.out.println("started ");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
}










