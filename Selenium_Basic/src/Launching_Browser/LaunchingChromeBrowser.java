package Launching_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		driver.close();
	}
}
