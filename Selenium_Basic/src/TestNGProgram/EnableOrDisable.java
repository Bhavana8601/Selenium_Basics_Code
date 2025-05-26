package TestNGProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableOrDisable {

	@Test
	public void login() {
		System.out.println("This is a enable login test");
		Assert.assertTrue(false);
	}

	@Test(enabled = false)
	public void Create() {
		System.out.println("This is a enable Create test");
	}
	@Test(enabled = false)
	public void logout() {
		System.out.println("This is a enable logout test");
	}
	
}
