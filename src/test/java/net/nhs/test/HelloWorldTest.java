package net.nhs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

class HelloWorldTest {
	
	//HelloWorld helloWorld;
	
	@Test
	void testOne() {
		String returnedString = HelloWorld.sayHelo("NHS");
		assertNotNull(returnedString);
	}
	
	@Test
	void testTwo() {
		String returnedString = HelloWorld.sayHelo("NHS");
		String expected = "Hi NHS! Hello World.";		
		assertTrue(expected.equals(returnedString));
	}

}
