package TestNGProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class ReporterLog {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void validateURL() {
		Reporter.log("validate facebook url" + true);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}

	@Test
	public void validatelogo() {
		Reporter.log("validate facebook logo is displayed" + true);
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed());
	}

	@Test
	public void validateEmailfield() {
		Reporter.log("Validate email field is displayed" + true);
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
	}
	
	@Test
	public void validatePassWordfiel() {
		Reporter.log("validate password field is displayed" + true);
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
