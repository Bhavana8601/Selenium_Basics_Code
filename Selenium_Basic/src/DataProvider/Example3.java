package DataProvider;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Example3 {

	    @DataProvider(name = "registrationData")
	    public Object[][] getRegistrationData() {
	        return new Object[][] {
	            {"Ram", "Patil", "ram123@example.com", "password123", "10", "May", "1995", "Male"},
	            {"Bhavana", "Ahire", "bhavana456@example.com", "securePass!", "22", "August", "1992", "Female"},
	            {"Bhatu", "Ahire", "bhatuahire789@example.com", "passMike@2024", "5", "December", "1990", "Male"}
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

	            // Fill the form
	            driver.findElement(By.name("firstname")).sendKeys(firstName);
	            driver.findElement(By.name("lastname")).sendKeys(lastName);
	            driver.findElement(By.name("reg_email__")).sendKeys(email);
	            Thread.sleep(1000); 
	            driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
	            driver.findElement(By.name("reg_passwd__")).sendKeys(password);

	            // Select Date of Birth
	            driver.findElement(By.name("birthday_day")).sendKeys(day);
	            driver.findElement(By.name("birthday_month")).sendKeys(month);
	            driver.findElement(By.name("birthday_year")).sendKeys(year);

	            // Select Gender
	            if (gender.equalsIgnoreCase("Male")) {
	                driver.findElement(By.xpath("//input[@value='2']")).click(); // Male radio button
	            } else if (gender.equalsIgnoreCase("Female")) {
	                driver.findElement(By.xpath("//input[@value='1']")).click(); // Female radio button
	            } else {
	                driver.findElement(By.xpath("//input[@value='-1']")).click(); // Custom gender
	            }

	            Thread.sleep(3000); 
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	}


