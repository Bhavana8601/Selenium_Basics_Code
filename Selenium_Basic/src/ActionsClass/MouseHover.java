package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {
public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement ele= driver.findElement(By.className("dropbtn"));
	WebElement ele2 = driver.findElement(By.xpath("//a[text()=\"Laptops\"]"));
	
	Actions action = new Actions(driver);
	action.moveToElement(ele).click(ele2).build().perform();
	
	System.out.println("successfully perform");
}
}
