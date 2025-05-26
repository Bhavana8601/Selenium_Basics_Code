package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void verifyFacebookTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
	}

	@Test
	public void verifyEmailInputField() {
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passField = driver.findElement(By.id("pass"));
		Assert.assertTrue(emailField.isDisplayed(), "Email input field is not displayed!");
		Assert.assertTrue(passField.isDisplayed(), "Password input field is not displayed!");
	}

	@Test
	public void verifyFacebookLogo() {
		WebElement logo = driver.findElement(By.cssSelector("img[alt='Facebook']"));
		Assert.assertTrue(logo.isDisplayed(), "Facebook logo is not displayed!");
	}

	@Test
	public void VerifyFacebookLoginForm() {
		WebElement loginForm = driver.findElement((By.xpath("//form[@class=\"_9vtf\"]")));
		Assert.assertTrue(loginForm.isDisplayed(), "Loging form is not displayed");
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}