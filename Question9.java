package JUnit.Assignment_Automation_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

//W.A.J. Script How to handled Alert in selenium
//"http://demo.guru99.com/test/delete_customer.php "

public class Question9 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new DriverConnection().getConnection("https://demo.guru99.com/test/delete_customer.php");
	 Thread.sleep(2000);
	 driver.findElement(By.name("cusid")).sendKeys("5247841656");
	 Thread.sleep(1000);
	 WebElement Submit= driver.findElement(By.name("submit"));
	 Submit.click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
    Thread.sleep(2000);
    alert.accept();
    
    Thread.sleep(2000);
    
	Alert alert1 = driver.switchTo().alert();
    Thread.sleep(2000);
    alert1.accept();
    
    Thread.sleep(2000);
    
    driver.close();
	 
	 
}

}

