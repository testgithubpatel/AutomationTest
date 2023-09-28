package JUnit.Assignment_Automation_2;

//     W.a. junit program to perform test with webdriver to login process of
//    facebook with different paramiters

	
import java.util.Arrays;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.DriverConnection;

public class Question12 {
	
	 static WebDriver driver;
     @Test
      public void fblogin() throws InterruptedException {
     	         driver.findElement(By.id("email")).sendKeys("bhmtptl@gmail.com");
     	         driver.findElement(By.id("pass")).sendKeys("2468Atoz");
     	         driver.findElement(By.name("login")).click();
     	         Thread.sleep(7000);
     }
     
     @BeforeClass
      public static void beforeclass() {
     	         driver = new DriverConnection().getConnection("https://www.facebook.com/");
     	         
     }
     @AfterClass
     public static void afterclass() throws InterruptedException {
     	       Thread.sleep(2000);
     	        driver.close();
     }	
}




		
	


	
	


