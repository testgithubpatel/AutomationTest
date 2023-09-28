package JUnit.Assignment_Automation_2;
// 13. W.a. junit program to check gmail login using with @before,@after,@Test
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.DriverConnection;

public class Question13 {
	 private WebDriver driver;

	    @Before
	    public void OpenBrowser() throws InterruptedException {
	    	 WebDriver driver = new DriverConnection().getConnection("https://mail.google.com/");
	    	 
	    	 Thread.sleep(2000);
	    }

	    @Test
	    public void testGmailLogin() throws InterruptedException {
	    	
	      
	      Thread.sleep(2000);
	        driver.findElement(By.id("identifierld")).sendKeys("bhmtptl@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@id='identifierNext']/div/button/span")).click();

	        Thread.sleep(1000);
	        
	        driver.findElement(By.name("password")).sendKeys("2468Atoz");
	        Thread.sleep(2000);
	        driver.findElement(By.id("passwordNext")).click();
	       	    }

	    @After
	    public void CloseBrowser() {
	        driver.close();
	    }
	
	
}	
		



