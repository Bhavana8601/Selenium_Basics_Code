package HandlingDropDown;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WiththehelpofWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		List<WebElement> dayDD = driver.findElements(By.xpath("//*[@id='day']/option"));
		List<WebElement> monthMM = driver.findElements(By.xpath("//*[@id='month']/option"));
		List<WebElement> yearYY = driver.findElements(By.xpath("//*[@id='year']/option"));
		selectDropdown(driver,dayDD,"8");
		selectDropdown(driver,monthMM,"Jan");
		selectDropdown(driver,yearYY,"2024");
		driver.close();	
}
	
	public static void selectDropdown(WebDriver driver, List<WebElement> options,String value) {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(options));
		 for (WebElement option : options) {
		        if (option.getText().trim().equalsIgnoreCase(value)) {
		            option.click();
		            break;
		        }
		    }
		}
		
}

