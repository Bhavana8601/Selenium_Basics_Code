package Launching_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Navigation navigate = driver.navigate();
		navigate.to("https://facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle() + " " +driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println(driver.getTitle() + " " +driver.getCurrentUrl());

		navigate.back();
		System.out.println(driver.getTitle() + " " +driver.getCurrentUrl());

		navigate.forward();
		System.out.println(driver.getTitle() + " " +driver.getCurrentUrl());

		navigate.refresh();
		System.out.println(driver.getTitle() + " " +driver.getCurrentUrl());

		navigate.back();
		System.out.println(driver.getTitle() + " " +driver.getCurrentUrl());

		navigate.refresh();
		System.out.println(driver.getTitle() + " " +driver.getCurrentUrl());

		driver.close();
	}

}
