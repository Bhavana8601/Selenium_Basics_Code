package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTheDropDownWithCommonMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Pay")).click();
		
		
	}
		public void handleDropDown(WebElement element, String value) {
		    List<WebElement> options = element.findElements(By.name("birthday_day"));
		    
		    for (WebElement option : options) {
		        if (option.getText().equals(value)) {
		            option.click();
		            break; 
		        }
		    }		
	}

}
