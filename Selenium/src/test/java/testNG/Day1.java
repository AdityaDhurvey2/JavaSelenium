package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
//	@AfterTest is belongs to one folder.... 
	@AfterTest
	public void lastExecutation() {
		System.out.println("I will execute last");
		
	}
	
	@Test
public void demo() {
	System.out.println("Hello");
	Assert.assertTrue(false);
}
	
	@AfterSuite
	public void AfSuite() {
		System.out.println("I'm the no 1 from last");
	}

	@Test
public void demo2() {
	System.out.println("Bye");
}
	
	
}
