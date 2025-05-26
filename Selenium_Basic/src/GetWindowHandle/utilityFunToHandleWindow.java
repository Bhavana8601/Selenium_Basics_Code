package GetWindowHandle;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilityFunToHandleWindow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//String ParentID =driver.getWindowHandle();
	//System.out.println(ParentID);
	System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
	driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
	driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
	driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();
	driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]")).click();
	Thread.sleep(3000);
	 handleMultipleWindows(driver);
}
    public static void handleMultipleWindows(WebDriver driver) {
        String parentWindow = driver.getWindowHandle(); // Store parent

        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to Child Window: " + driver.getTitle());
                driver.close(); // Close child window
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to Parent Window: " + driver.getTitle());
        driver.close();
    }
}
