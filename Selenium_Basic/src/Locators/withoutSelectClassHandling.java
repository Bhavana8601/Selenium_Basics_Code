package Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutSelectClassHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		/*WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		*/
		
		/*Actions actions = new Actions(driver);
		actions.moveToElement(day).click().perform();
		*/
		List<WebElement> dayDD = driver.findElements(By.xpath("//*[@id='day']/option"));
		List<WebElement> monthMM = driver.findElements(By.xpath("//*[@id='month']/option"));
		List<WebElement> yearYY = driver.findElements(By.xpath("//*[@id='year']/option"));

		handleDropdown(dayDD,"4");
		handleDropdown(monthMM,"March");
		handleDropdown(yearYY,"2001");
		//Threed.sleep(3000);
		
		//System.out.println("Select the value");
		driver.close();
	}
	public static void handleDropdown(List<WebElement> options,String value) {
		for (WebElement ele: options) {
			
			if(ele.getText().equals(value)) {
				ele.click();
				break;
			}
	}
	}
}
