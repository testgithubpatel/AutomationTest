package JUnit.Assignment_Automation_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

//   W.A.J.Script To write a script for drop down.
//   http://demo.guru99.com/test/newtours/register.php

public class Question7 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new DriverConnection().getConnection("http://demo.guru99.com/test/newtours/register.php");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("firstName")).sendKeys("Bhumit");
	driver.findElement(By.name("lastName")).sendKeys("Patel");
	driver.findElement(By.name("phone")).sendKeys("4525145214");
	driver.findElement(By.name("userName")).sendKeys("Aryan");
	driver.findElement(By.name("address1")).sendKeys("Maninagar");
	driver.findElement(By.name("city")).sendKeys("Ahmedabad");
	driver.findElement(By.name("state")).sendKeys("Gujrat");
	driver.findElement(By.name("postalCode")).sendKeys("380008");
	
	Thread.sleep(1000);
	
	WebElement Country = driver.findElement(By.name("country"));
	Country.click();
	Thread.sleep(1000);
	Select India = new Select(Country);
	India.selectByValue("INDIA");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("email")).sendKeys("Abc@gmail.com");
	driver.findElement(By.name("password")).sendKeys("380008");
	driver.findElement(By.name("confirmPassword")).sendKeys("380008");
	
	Thread.sleep(1000);
	
	WebElement Submit = driver.findElement(By.name("submit"));
	Submit.click();
	
	Thread.sleep(2000);
	
	driver.close();
	
	
	
}

	}

