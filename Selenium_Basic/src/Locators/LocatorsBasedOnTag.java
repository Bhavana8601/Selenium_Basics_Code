package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasedOnTag {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> list_a=driver.findElements(By.tagName("a"));
		System.out.println("Total number of Tags : "+list_a.size());
		
		for(int i=0;i<list_a.size();i++) {
			String linkTxt=list_a.get(i).getText();
			System.out.println(linkTxt);
			if(linkTxt.equals("Facebook Lite")) {
				list_a.get(i).click();
				System.out.println(driver.getTitle()+" <------> " + driver.getCurrentUrl());
				break;
			}
			
		}
		driver.close();
	}
}

