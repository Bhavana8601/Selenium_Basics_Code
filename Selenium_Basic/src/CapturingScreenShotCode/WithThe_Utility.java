package CapturingScreenShotCode;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WithThe_Utility {
	public static void main(String[] args) throws WebDriverException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());

		CaptureScreenshots(driver, "fb_login_form");
		driver.close();
	}

	static void CaptureScreenshots(WebDriver driver, String screenshotname) throws 
														WebDriverException, IOException {
		FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File("./screenShot/" + screenshotname + ".png"));
	}
}
 

//static void CaptureScreenshots(WebDriver driver, String screenshotname) throws WebDRiverException, IOException{
//FileHandler.copy(((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE),
//new File("./screenShot/" + screenshotname + ".png"));
//}
//}
























