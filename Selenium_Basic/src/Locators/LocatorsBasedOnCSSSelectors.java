package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasedOnCSSSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("ram@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("ram@123");

		driver.close();
	}
}
