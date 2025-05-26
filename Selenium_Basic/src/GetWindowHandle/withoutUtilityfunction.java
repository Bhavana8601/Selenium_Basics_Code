package GetWindowHandle;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutUtilityfunction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String ParentID =driver.getWindowHandle();
		System.out.println(ParentID);
		System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]")).click();
		Thread.sleep(3000);
		Set<String>winIds = driver.getWindowHandles();
		for(String win : winIds) {
			driver.switchTo().window(win);
			System.out.println(driver.getCurrentUrl()+ " " + driver.getTitle());
		}
		//driver.close();
		driver.quit();
	}

}
