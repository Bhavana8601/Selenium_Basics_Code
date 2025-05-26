package Grouping;

import org.testng.annotations.Test;

public class GoupTestInTestng {

	
	@Test(groups="Regression")
	public void regression() {
		System.out.println("regression Testing");
	}
	
	@Test(groups="smoke")
	public void smoke() {
		System.out.println("smoke Testing");
	}
	
	@Test(groups="sanity")
	public void sanity() {
		System.out.println("sanity Testing");
	}
	
	@Test(groups="endToEnd")
	public void endToEnd() {
		System.out.println("EndToEnd Testing");
	}
}
