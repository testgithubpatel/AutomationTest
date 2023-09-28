package JUnit.Assignment_Automation_2;


import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import Util.DriverConnection;

//  W.a. junit program to use parameterized demo with multiple
//  parameter of Facebook login in junit.

@RunWith(Parameterized.class)
public class Question14 {
	
		String email;
		String pass;
		static WebDriver driver;
		public Question14(String email, String pass) {
			super();
			this.email = email;
			this.pass = pass;
		}
		@BeforeClass
		public static void beforeClass() {
			driver = new DriverConnection().getConnection("https://www.facebook.com/");
			
		}
		
		@Test
		public void logintest() {
			WebElement emailE = driver.findElement(By.id("email"));
			emailE.clear();
			emailE.sendKeys(email);
			WebElement passP = driver.findElement(By.id("pass"));
			passP.clear();
			passP.sendKeys(pass);
		}
//		@After
//		public void after() {
//			driver.close();
//		}
		
		@Parameters
		public static List<Object[]> passData() {
			
			Object o[][] = new Object[4][2];
			o[0][0] = "abcgmail.com";
			o[0][1] = "correct@123";
			
			o[1][0] = "zyj@gmail.com";
			o[1][1] = "correct@123";
			
			o[2][0] = "correct@gmail.com";
			o[2][1] = "2468xnk";
			
			o[3][0] = "abc.com";
			o[3][1] = "incorrect@123";
			
			
			return Arrays.asList(o);
		}
		
	}

