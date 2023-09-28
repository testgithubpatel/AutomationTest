package JUnit.Assignment_Automation_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.DriverConnection;

//W.A.J.Script To use Mouse and Keyboard event using Action class
//Mouse Hover Event

public class Question8 { 

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new DriverConnection().getConnection("http://demo.guru99.com/test/newtours/register.php");
		
   Thread.sleep(2000);
	
   Actions action = new Actions(driver);
   
   WebElement Home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
   action.moveToElement(Home).build().perform();
   Thread.sleep(1000);
   
   WebElement FLights=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));	
   action.moveToElement(FLights).build().perform();
   Thread.sleep(1000);
   
   WebElement Hotels=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a"));
   action.moveToElement(Hotels).build().perform();
   Thread.sleep(1000);
   
   WebElement CarRental =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
   action.moveToElement(CarRental).build().perform();
   Thread.sleep(1000);
   
   WebElement Cruises =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a"));
   action.moveToElement(Cruises).build().perform();
   Thread.sleep(1000);
   
   WebElement Destination=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a"));
   action.moveToElement(Destination).build().perform();
   Thread.sleep(1000);
   
   WebElement Vacation = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a"));
   action.moveToElement(Vacation).build().perform();
   Thread.sleep(1000);	 
   
   Thread.sleep(2000);
   
   driver.close();
   
   
   
   
	}

	
}
