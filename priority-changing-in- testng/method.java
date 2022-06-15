
package ui;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class method {
	
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
	@BeforeMethod
	public void connectToDB()
	
	{
		System.out.println("Lets connect to the database");
	}
    @AfterMethod
	public void DisconnectFromDB()
	
	{
		System.out.println("Hey! You lost database connection");
	}
	
	
	@Test(priority=1,description="This is login test")
	public  void Logintest() {
		System.out.println("Login is successful");
	}
	 @Test(priority=0, description="This is logout test")
    public void logouttest() {
    	 System.out.println("Logout is successful");

     }
   
 	}
