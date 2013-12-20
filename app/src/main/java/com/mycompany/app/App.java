package com.mycompany.app;

/**
 * Hello world
 * comment 2
 * comment 3
 * requirement 1
 * requirement 1
 */
public class App {
    public static final String HELLO = "Hello World!";
	public static final String AWAY = "Go away";
        
    public String sayHello() {
        String hello = HELLO;
        System.out.println(hello);
        return hello;  
    }
    
    public String sayGoAway() {
		String away = AWAY;
		return away;
    }
	
	public String sayGoAwa() {
		return "Go away";
    }
	
    public String sayDoh() {
        return "DOOOOOOOOH!!!";
    }
	
	public String sayDooooh() {
        return "DOOOOOOOOH!!!";
    }

	
	public String sayDooooooh() {
        return "DOOOOOOOOH!!!";
    }
}