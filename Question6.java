package JUnit.Assignment_Automation_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

//  W.A.J. Script To perform the radio button to select one by one in loop
//	http://demo.guru99.com/test/radio.html

public class Question6 {
  public static void main(String[] args) throws InterruptedException {
	  
//	  Check "Radio" Button
	
	  WebDriver driver = new DriverConnection().getConnection("http://demo.guru99.com/test/radio.html\r\n");
	  Thread.sleep(2000);
	  WebElement Btn1= driver.findElement(By.id("vfb-7-1"));
	  Btn1.click();
	  Thread.sleep(1000);
	  WebElement Btn2= driver.findElement(By.id("vfb-7-3"));
	  Btn2.click();
	  Thread.sleep(1000);
	  WebElement Btn3= driver.findElement(By.id("vfb-7-2"));
	  Btn3.click();
	  Thread.sleep(2000);
	  
//   Check "CheckBox" Button
	  
	  WebElement Btn4= driver.findElement(By.id("vfb-6-0"));
	  Btn4.click(); 
	  Thread.sleep(1000);
	  WebElement Btn5= driver.findElement(By.id("vfb-6-1"));
	  Btn5.click();
	  Thread.sleep(1000);
	  WebElement Btn6= driver.findElement(By.id("vfb-6-2"));
	  Btn6.click();
	  Thread.sleep(3000);
	  
	  
	  driver.close();
	  
 
  
}
}
