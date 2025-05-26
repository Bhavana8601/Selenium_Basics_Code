package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ancestor {
	public static void main(String[] args) {
			
	WebDriver driver = new ChromeDriver();
    driver.get("https://facebook.com");
    driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
    driver.findElement(By.xpath("//input[@name='email']//ancestor::div"));
    driver.close();
}
}
