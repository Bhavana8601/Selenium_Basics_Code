package HandlingDropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutSelect {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Sign Up")).click();
	
	WebElement monthDD = driver.findElement(By.name("birthday_month"));
	monthDD.click();
	
	List<WebElement> options=driver.findElements(By.xpath("//option[text()='Mar']"));

	String option = "Mar";

	for (WebElement opt : options) {
      try {  if (opt.getText().equals("Mar")) {
            opt.click();
            System.out.println(opt.getText());
            break;
        }}catch(Exception e) {
        	e.printStackTrace();
        }
    }
    driver.quit();
	
}

}
