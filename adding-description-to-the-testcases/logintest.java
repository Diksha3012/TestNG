package ui;

import org.testng.annotations.Test;

public class logintest {
    @Test(priority=1,description="This is login test")
	public  void Logintest() {
		
		
		System.out.println("Login is successful");
		
		

	}
     @Test(priority=2, description="This is logout test")
    public void logouttest() {
    	 System.out.println("Logout is successful");
    }
}
