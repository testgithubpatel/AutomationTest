package JUnit.Assignment_Automation_2;
//W.A.J. script to use different methods to manage the windows-alerts
//and pop ups.
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.DriverConnection;


public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new DriverConnection().getConnection("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		WebElement alertButton = driver.findElement(By.id("alertBox"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
	    Thread.sleep(2000);
	    alert.accept();
	    
	    Thread.sleep(2000);
		
	    WebElement alertButton1 = driver.findElement(By.id("confirmBox"));
		alertButton1.click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.dismiss();
		
		Thread.sleep(2000);
		WebElement alertButton2 = driver.findElement(By.id("promptBox"));
		alertButton2.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		
		alert.sendKeys("Yo Yo Honey Singgggg");
		alert.accept();
		Thread.sleep(2000);
		driver.close();
		
		
		
	
	}

}
