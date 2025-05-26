package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://amazon.in/");
	
	//driver.findElement(By.id("nav-link-accountList")).click();
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).perform();
	
	
	
	List<WebElement> yourLists = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/ul/li/a/span"));
	for(WebElement ele: yourLists)
	{
		System.out.println(ele.getText());
		if(ele.getText().equals("Discover Your Style"))
		{
			ele.click();
			break;
		}
	}
	
	
	}

}
