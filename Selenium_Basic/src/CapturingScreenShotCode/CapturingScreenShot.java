package CapturingScreenShotCode;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


//Whole Page Capturing 

public class CapturingScreenShot {
public static void main(String[]args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File scr =  ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./screenShot/image.png");
	
	FileHandler.copy(scr,target);
	driver.close();

}
}

