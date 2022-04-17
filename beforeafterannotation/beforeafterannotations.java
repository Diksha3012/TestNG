package ui;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class beforeafterannotations {
	
	@BeforeTest
	public void logintoapplication()
	{
		System.out.println("hey you are logged In");
	}
	@AfterTest
	public void logoutfromapplication()
	{
		System.out.println("Bye! You are logged out");
	}

	@Test(priority=1,description="This is login test")
	public  void Logintest() {
		System.out.println("Login is successful");
	}
     @Test(priority=2, description="This is logout test")
    public void logouttest() {
    	 System.out.println("Logout is successful");

     }
   
 	}




		
	


