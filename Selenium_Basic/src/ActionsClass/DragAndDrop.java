package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://testautomationpractice.blogspot.com/");
		        Thread.sleep(3000);
		        Actions action=new Actions(driver);
		        
		        WebElement drag = driver.findElement(By.id("draggable")); 
		        WebElement drop = driver.findElement(By.id("droppable"));
		      
		        action.dragAndDrop(drag,drop).build().perform();
		        Thread.sleep(3000);
		        
		        System.out.println("Drag and drop activity perform");
		        driver.close();       
	}
}
