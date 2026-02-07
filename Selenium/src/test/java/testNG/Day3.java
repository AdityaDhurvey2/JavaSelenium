package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before executing any methods in the class");
	}
	
	
	
	@Test
	public void webLoginCarloan() {
		System.out.println("webLoginCarloan");
	}
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method in Day 3 class");
	}
	
	
	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method in Day 3 class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After executing any methods in the class");
	}
	
	
	@Test(groups= {"smoke"})
	public void MobileLoginCarloan() {
		System.out.println("MobileLoginCarloan");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I'm no 1");
	}
	
	@Test
	public void MobileSighinCarloan() {
		System.out.println("MobileSighinCarloan");
	}
	
	@Test
	public void MobileSignoutCarloan() {
		System.out.println("MobileSignoutCarloan");
	}
	
	@Test
	public void APICarloan() {
		System.out.println("LoginAPICarloan");
	}

}
