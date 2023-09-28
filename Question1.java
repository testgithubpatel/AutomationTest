package JUnit.Assignment_Automation_2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.DriverConnection;

//1 List of Websites to Practice Selenium :-
//	 https://phptravels.com/demo/
	
public class Question1 {
	public static void main(String[] args) throws InterruptedException {
			String url = "https:phptravels.com";
			WebDriver driver = new DriverConnection().getConnection(url);
			Thread.sleep(1000);
			WebElement ele = driver.findElement(By.linkText("DEMO"));
			ele.click();
			Thread.sleep(2000);
			driver.findElement(By.name("first_name")).sendKeys("Bhumit");
			driver.findElement(By.name("last_name")).sendKeys("Patel");
			driver.findElement(By.name("business_name")).sendKeys("Nothing");
			driver.findElement(By.name("email")).sendKeys("bhmtptl@gmial.com");
			
			 WebElement num1 = driver.findElement(By.id("numb1"));
			   String s1 = num1.getText();
			   int n1 = Integer.parseInt(s1);
			   
			   WebElement num2 = driver.findElement(By.id("numb2"));
			   String s2 = num2.getText();
			   int n2 = Integer.parseInt(s2);
			   int n3 = n1+n2;
			   
			   String s3 = String.valueOf(n3);
			   WebElement res = driver.findElement(By.id("number"));
			   res.sendKeys(s3);
			   Thread.sleep(2000);
			   driver.findElement(By.id("demo")).click();
			   Thread.sleep(2000);
			   WebElement ele1 = driver.findElement(By.xpath("//div[@id='mynavbar']/div[1]/a[2]"));
			   ele1.click();
			   
			   String mainWin = driver.getWindowHandle();
			   System.out.println("mainWin");
			   Set<String> allWin = driver.getWindowHandles();
			   for(String win : allWin) {
				   System.out.println(win);
				   if(!win.equals(mainWin)) {
					   driver.switchTo().window(win);
					   
				   }
			   }
			   Thread.sleep(2000);
			   
			   driver.findElement(By.name("firstname")).sendKeys("Bhumit");
			   driver.findElement(By.name("lastname")).sendKeys("Patel");
			   driver.findElement(By.name("email")).sendKeys("bhmtptl@gmail.com");
			   driver.findElement(By.name("phonenumber")).sendKeys("8265654544");
			   driver.findElement(By.name("companyname")).sendKeys("No Need ok");
			   driver.findElement(By.name("address1")).sendKeys("Maninagar");
			   driver.findElement(By.name("address2")).sendKeys("Maninagar2");
			   driver.findElement(By.name("city")).sendKeys("Ahmedabad");
			   driver.findElement(By.name("state")).sendKeys("Gujarat");
			   driver.findElement(By.name("postcode")).sendKeys("380008");
			   driver.findElement(By.name("country")).sendKeys("India");
			   driver.findElement(By.name("customfield[2]")).sendKeys("9245784547");
			   driver.findElement(By.name("password")).sendKeys("2468Atoz");
			   driver.findElement(By.name("password2")).sendKeys("2468Atoz");
			   	  					
			   Thread.sleep(2000);
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(mainWin);
				Thread.sleep(1000);
				driver.close();
			
		}
}
	
	


