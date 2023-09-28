package JUnit.Assignment_Automation_2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

//  W.A.J.script to register your self in Gmail.

public class Question5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new DriverConnection().getConnection("https://support.google.com/mail/answer/56256?hl=en");
	Thread.sleep(2000);
	String mainWin = driver.getWindowHandle();
	System.out.println(mainWin);
	
	WebElement Btn1 = driver.findElement(By.className("action-button"));
	Btn1.click();
	
	Thread.sleep(2000);
	
	Set<String> allWin = driver.getWindowHandles();
	for(String win: allWin) {
		System.out.println(win);
		if(!win.equals(mainWin)) {
			driver.switchTo().window(win);	
		}
	}
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("firstName")).sendKeys("Vijay");
	driver.findElement(By.id("lastName")).sendKeys("Chuahan");
	
	Thread.sleep(1000);
	
	WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
	btn2.click();
	
	Thread.sleep(2000);
	
	WebElement btn3 = driver.findElement(By.id("month"));
	btn3.click();
	Thread.sleep(1000);

	Select month = new Select(btn3);
	month.selectByVisibleText("March");
	
	Thread.sleep(1000);
	
	 driver.findElement(By.id("day")).sendKeys("5");
	Thread.sleep(1000);

	driver.findElement(By.id("year")).sendKeys("2005");
	Thread.sleep(1000);

	WebElement btn4= driver.findElement(By.id("gender"));
	btn4.click();
	Thread.sleep(1000);
	Select gender = new Select(btn4);
	gender.selectByVisibleText("Male");
	Thread.sleep(1000);
	
	WebElement btn5= driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
	btn5.click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("Username")).sendKeys("VijayCh2501");
	Thread.sleep(1000);
	
	WebElement btn6= driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
	btn6.click();
	Thread.sleep(1000);
	
	WebElement btn7= driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/button/span"));
	btn7.click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("VijChu8520@gmail.com");
	Thread.sleep(1000);
	
	WebElement btn8= driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
	btn8.click();
	Thread.sleep(2000);
	
	
	
} 
	
	}


