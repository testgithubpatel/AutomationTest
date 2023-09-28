package JUnit.Assignment_Automation_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

//  W.A.J. Script To find the total hyperlink from this web page
//  http://demo.guru99.com/test/web-table-element.php

public class Question10 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new DriverConnection().getConnection("http://demo.guru99.com/test/web-table-element.php");
	Thread.sleep(2000);
	List<WebElement> total_links = driver.findElements(By.tagName("a"));
	int count = total_links.size();
	System.out.println("The total number of size : "  +count);
	Thread.sleep(1000);
	for (int i =0; i<count; i++) {
	System.out.println(total_links.get(i).getText());
	}
	Thread.sleep(2000);
	driver.close();
}	
}
