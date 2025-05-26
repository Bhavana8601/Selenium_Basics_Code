package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStartWith {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Password')]")).sendKeys("ram@123");
		driver.findElement(By.xpath("//a[starts-with(@href, '/r.php?entry_point=login')]")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
