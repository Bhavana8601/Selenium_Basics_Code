package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToASpecificElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"3-HowIsYourInformation\"]/span"));
		Thread.sleep(5000);
		scrollIntoView(element,driver);
		Thread.sleep(5000);
		driver.close();
		
	}
	 public static void scrollIntoView(WebElement element,WebDriver driver) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }
}
