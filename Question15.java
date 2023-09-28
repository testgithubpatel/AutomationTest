package JUnit.Assignment_Automation_2;

// W.a. TestNG program to perform test with webdriver to login processof
// facebook

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.DriverConnection;

public class Question15 {

WebDriver driver1;
	
	@Before
	
	 public void setup() {
		System.out.println("hey");
	WebDriver driver1 = new DriverConnection().getConnection("http ://www.facebook.com");
	System.out.println("huu");

}
	 

	    @Test
	    public void testGmailLogin() {
	       
	        driver1.get("https://mail.google.com");

	        WebElement emailField = driver1.findElement(By.id("identifierId"));
	        WebElement nextButton = driver1.findElement(By.id("identifierNext"));

	        emailField.sendKeys("your_email@gmail.com");

	        nextButton.click();

	        
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Locate the password field and the "Next" button on the password page
	        WebElement passwordField = driver1.findElement(By.name("password"));
	        WebElement signInButton = driver1.findElement(By.id("passwordNext"));
	        passwordField.sendKeys("your_password");

	        signInButton.click();

	        
	        try {
	            Thread.sleep(10000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        String expectedTitle = "Inbox";
	        String actualTitle = driver1.getTitle();
	        Assert.assertTrue(actualTitle.contains(expectedTitle));
	    }

	    @After
	    public void Closedown() {
	        // Close the browser
	        driver1.quit();
	    }
	}
	





