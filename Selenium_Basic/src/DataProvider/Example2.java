package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example2 {

    @DataProvider(name = "registrationData")
    public Object[][] getRegistrationData() {
        return new Object[][] {
            {"Ram", "Patil", "rampatil123@example.com", "password123", "10", "May", "1995", "Male"},
            {"Bhavana", "Ahire", "bhavana456@example.com", "securePass!", "22", "August", "1992", "Female"},
            {"Ayush", "Patil", "ayushpatil789@example.com", "passMike@2024", "5", "December", "1990", "Male"}
        };
    }

    @Test(dataProvider = "registrationData")
    public void createNewAccount(String firstName, String lastName, String email, String password, String day, String month, String year, String gender) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");

            WebElement createAccountBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
            createAccountBtn.click();
            Thread.sleep(2000); 

            driver.findElement(By.name("firstname")).sendKeys(firstName);
            driver.findElement(By.name("lastname")).sendKeys(lastName);
            driver.findElement(By.name("reg_email__")).sendKeys(email);
            
            Thread.sleep(1000); 
            
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
            driver.findElement(By.name("reg_passwd__")).sendKeys(password);

          /*  WebElement dayDropdown = driver.findElement(By.id("day"));
            Select selectDay = new Select(dayDropdown);
            selectDay.selectByVisibleText(day);

            WebElement monthDropdown = driver.findElement(By.id("month"));
            Select selectMonth = new Select(monthDropdown);
            selectMonth.selectByVisibleText(month);

            WebElement yearDropdown = driver.findElement(By.id("year"));
            Select selectYear = new Select(yearDropdown);
            selectYear.selectByVisibleText(year);
*/
     
        
            // Select Date of Birth using Select class
            Select selectDay = new Select(driver.findElement(By.id("day")));
            selectDay.selectByValue(day);

            Select selectMonth = new Select(driver.findElement(By.id("month")));
            selectMonth.selectByVisibleText(month); 

            Select selectYear = new Select(driver.findElement(By.id("year")));
            selectYear.selectByValue(year); 
            
            
            
            if (gender.equalsIgnoreCase("Male")) {
                driver.findElement(By.xpath("//input[@value='2']")).click(); 
            } else if (gender.equalsIgnoreCase("Female")) {
                driver.findElement(By.xpath("//input[@value='1']")).click(); 
            } else {
                driver.findElement(By.xpath("//input[@value='-1']")).click(); 
            }

            Thread.sleep(3000); 

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
