package testNG;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webLoginHomeloan() {
		System.out.println("webLoginHome");
	}
	
	@Test(groups= {"smoke"})
	public void MobileLoginHomeloan() {
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void LoginAPIHomeloan() {
		System.out.println("LoginAPIHome");
	}

}
