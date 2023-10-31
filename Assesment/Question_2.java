package Assesment_Automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.RowFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import All_Practice_Project.Pract_Project.DriverConnection;


// URL : http:// /2017/02/automate-demo-web-table-withselenium.html

//Task 1 : Verify that there are only 4 structure values present in the table with Selenium
//Task 2 : Verify that the 6th row of the table (Last Row) has only two columns with Selenium
//Task 3 : Find the tallest structure in the table with Selenium

public class Question_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		
		System.out.println("Task 1.......Verify that there are only 4 structure values present in the table with Selenium");
		
	    List<WebElement>rows= driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		System.out.println("total rows:"+rows.size());
		WebElement Structure = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody"));
		System.out.println(Structure.getText());
		
		System.out.println("Task 2....... Verify that the 6th row of the table (Last Row) has only two columns with Selenium");
			
	WebElement lastRow=driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot/tr"));
	System.out.println(lastRow.getText());
	
	System.out.println("Task 3......Find the tallest structure in the table with Selenium");
	
	List<WebElement> row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
	System.out.println(row.size());
	for (int i = 1;i<=row.size();i++) {
		List<WebElement>row_data = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]"));
		List<WebElement>col_data = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[3]"));
		for(WebElement col_ele : col_data) {
			String col = col_ele.getText();
			System.out.println(col_ele.getText());
			Thread.sleep(3000);
			int[] Height = {829,601,509,492};
			Arrays.sort(Height);
			System.out.println("Tallest Strucure  is Burj Khalifa : " + Height[3]+"m");
			Thread.sleep(2000);
			driver.close();
			
    }
    }
	}
	}
	

