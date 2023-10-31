package Assesment_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import All_Practice_Project.Pract_Project.DriverConnection;

// 3 ) URL : https://demoqa.com/webtables

	//  Task 1 : Write a script to click on Edit button for given name
	//  Task 2 : Write a Script to click on Delete button for given name

public class Question_3 {
public static void main(String[] args) throws InterruptedException {
	String url = "https://demoqa.com/webtables";
	WebDriver driver = new DriverConnection().getConnection(url);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("edit-record-1")).click();
	Thread.sleep(2000);
	  driver.findElement(By.id("firstName")).clear();
	  driver.findElement(By.id("firstName")).sendKeys("Bhumit");
	driver.findElement(By.id("lastName")).clear();
	driver.findElement(By.id("lastName")).sendKeys("Patel");
	driver.findElement(By.id("userEmail")).clear();
	driver.findElement(By.id("userEmail")).sendKeys("abc12@gmail.com");
	driver.findElement(By.id("age")).clear();
	driver.findElement(By.id("age")).sendKeys("18");
	driver.findElement(By.id("salary")).clear();
	driver.findElement(By.id("salary")).sendKeys("100000");
	driver.findElement(By.id("department")).clear();
	driver.findElement(By.id("department")).sendKeys("Automation Testing");
	Thread.sleep(2000);
	
	driver.findElement(By.id("submit")).click();
	
	Thread.sleep(6000);
	
	driver.findElement(By.id("delete-record-1")).click();
	
	Thread.sleep(4000);
	driver.close();
	
	
	
}
}
