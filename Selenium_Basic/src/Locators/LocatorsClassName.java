package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClassName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement signBtn=driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v"));
		System.out.println(signBtn.isDisplayed());
		System.out.println(signBtn.getText());
		driver.close();
	}
}
