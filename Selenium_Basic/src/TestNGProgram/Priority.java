package TestNGProgram;

import org.testng.annotations.Test;

public class Priority {

	@Test
	public void test() {
		System.out.println("This ia a default Priority");
		
	}
	
	@Test(priority = 1)
	public void Login() {
		System.out.println("This ia a 1st Priority");
	}
	
	@Test(priority = 2)
	public void CreateAccount() {
		System.out.println("This ia a 2nd Priority");
	}
	
	@Test(priority = 'A')
	public void Update() {
		System.out.println("This ia a Alphabatical Priority");
	}
	
	@Test(priority = 'a')
	public void Delete() {
		System.out.println("This ia a LowerCase Priority");
	}
	
	@Test(priority = -1)
	public void LogOut() {
		System.out.println("This ia a negative Priority");
	}
}
