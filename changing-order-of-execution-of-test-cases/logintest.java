package ui;

import org.testng.annotations.Test;

public class logintest {
    @Test(priority=1)
	public  void Logintest() {
		
		
		System.out.println("Login is successful");
		
		

	}
     @Test(priority=2)
    public void logouttest() {
    	 System.out.println("Logout is successful");
    }
}
