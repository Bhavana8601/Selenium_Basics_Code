package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsLinkedText {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement email_id=driver.findElement(By.linkText("Create a Page"));
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		//email_id.click();
		
		System.out.println(driver.getTitle()+ "......." +driver.getCurrentUrl());
		
		driver.close();
		
}
}
