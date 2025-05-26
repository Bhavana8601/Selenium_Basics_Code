package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover2 {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://amazon.in/");
	
	driver.findElement(By.id("nav-link-accountList")).click();
	
	}

}
