package JUnit.Assignment_Automation_2;

//W.a. TestNG program to use parameterized demo with multiple
//parameter of Facebook login with TestNG


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Question16 {
	
	 private WebDriver driver;

	    @BeforeMethod
	    public void OpenBrowser() {
	        
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32");
	        driver = new ChromeDriver();
	        System.out.println("hey");
	    }

	    @DataProvider
	    (name = "loginData")
	    public Object[][] loginData() {
	        
	        return new Object[][] {
	            {"user1@example.com", "password1"},
	            {"user2@example.com", "password2"},
	            
	        };
	    }

	    @Test(dataProvider = "loginData")
	    public void testFacebookLogin(String username, String password) {
	       
	        driver.get("https://www.facebook.com");
	        driver.findElement(By.id("email")).sendKeys(username);
	        driver.findElement(By.id("pass")).sendKeys(password);
	        driver.findElement(By.id("loginbutton")).click();

	    }

	    @AfterMethod
	    public void close() {
	        
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	
}
