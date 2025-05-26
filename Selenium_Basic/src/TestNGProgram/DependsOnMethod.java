package TestNGProgram;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void Login() {
		System.out.println("This ia a 1st Priority");
	}
	
	@Test(dependsOnMethods = "Login")
	public void CreateAccount() {
		System.out.println("This ia a 2nd Priority");
	}
	
	@Test(dependsOnMethods = {"Login","CreateAccount"})
	public void Update() {
		System.out.println("This ia a Alphabatical Priority");
	}
	
	@Test(dependsOnMethods = "CreateAccount")
	public void Delete() {
		System.out.println("This ia a LowerCase Priority");
	}
	
	@Test(dependsOnMethods = "Delete")
	public void LogOut() {
		System.out.println("This ia a negative Priority");
	}
}
