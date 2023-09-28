package JUnit.Assignment_Automation_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

// W.A.J.Script for Locating links by linkText() and partialLinkText()

public class Question2 {
	public static void main(String[] args) {
		
			String url = "https://www.facebook.com/";	
			WebDriver driver =  new DriverConnection().getConnection(url);
			
		 	List<WebElement> list = driver.findElements(By.partialLinkText("Create"));
		 	System.out.println(list.size());
		 	list.get(1).click();
		 	driver.navigate().back();
		 	for(WebElement link:list) {
		 		System.out.println(link.getText());
		 		
		 	}
		}
	}
 

