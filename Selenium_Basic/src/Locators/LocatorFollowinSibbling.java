package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFollowinSibbling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement elem=driver.findElement(By.xpath("//div[@class='_8iep _8icy _9ahz _9ah-']//following-sibling::div//input[@id='email']"));
		
		System.out.println(elem.getAttribute("placeholder"));
		
		driver.close();
		


	}

}
