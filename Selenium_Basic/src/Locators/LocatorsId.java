package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsId {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			WebElement emailText=driver.findElement(By.id("email"));
			WebElement passText=driver.findElement(By.id("pass"));
			WebElement loginBtn=driver.findElement(By.name("login"));
			
			emailText.sendKeys("ram@gmail.com");
			passText.sendKeys("ram@123");
			loginBtn.click();
			Thread.sleep(3000);
			
			System.out.println(emailText.getText());
			System.out.println(passText.getText());
			
			driver.close();
			
		}
	}


