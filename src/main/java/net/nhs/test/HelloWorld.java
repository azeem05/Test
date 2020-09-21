package net.nhs.test;

public class HelloWorld {

	public static String sayHelo(String name)
	{
		return "Hi "+name+"! Hello World.";
	}
	
	public static void main(String[] args) {
		
		System.out.println(HelloWorld.sayHelo("Azeem"));
	}
}
