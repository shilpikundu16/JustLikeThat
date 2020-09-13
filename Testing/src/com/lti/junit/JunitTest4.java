package com.lti.junit;
import org.junit.Test;

//kind of performance testing
public class JunitTest4 {
 
	@Test(timeout = 1000)  
	public void infinity() {  
//		while (true);
		for (int i=0; i<10; i++);
	}  

}
