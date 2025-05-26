package TestNGProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@Test
	public void test() {
	System.out.println("This is a Test Annotation");	
	}
	
	@BeforeSuite
	public void beforSuite() {
		System.out.println("This is a BeforeSuite Annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is a AfterSuite Annotation");
	}
	
	@BeforeClass
	public void beforClass() {
		System.out.println("This is a BeforeClass Annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is a AfterClass Annotation");
	}
	
	@BeforeMethod
	public void beforMethod() {
		System.out.println("This is a BeforMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is a AfterMethod Annotation");
	}
}
