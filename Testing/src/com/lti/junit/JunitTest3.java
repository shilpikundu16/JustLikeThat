package com.lti.junit;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest3 {

	@Ignore("Not Ready to test")  
	@Test
	public void divisionWithException() {  
	  System.out.println("Method is not ready yet");
	}  

}
