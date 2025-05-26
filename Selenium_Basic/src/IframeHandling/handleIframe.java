package IframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleIframe {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/iframe");
	
	int iFrames =driver.findElements(By.tagName("iframe")).size();
	System.out.println();
}
}
