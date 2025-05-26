package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.manage().window().maximize();	
    WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
    element.sendKeys("ram@gmail.com");
 CheckTheElementStatus(driver, element);
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	driver.close();
}

	public static void CheckTheElementStatus(WebDriver driver, WebElement element){
	
	
	if (element.isDisplayed()) {
        if (element.isEnabled()) {
            if (element.isSelected()) {
                System.out.println("The element is displayed, enabled, and selected.");
            } else {
                System.out.println("The element is displayed, enabled, but not selected.");
            }
        } else {
            System.out.println("The element is displayed but not enabled.");
        }
    } else {
        System.out.println("The element is not displayed.");
   }
}
}






