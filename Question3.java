package JUnit.Assignment_Automation_2;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

//W.A.J.Script for Selecting multiple items in a drop dropdown

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.mobiscroll.com/jquery/select/multiple-select#";
		WebDriver driver = new DriverConnection().getConnection(url);
		Thread.sleep(2000);;
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		WebElement Ele1 = driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/label/span[2]/span[1]/span"));
		Ele1.click();
		
		Thread.sleep(1000);
		
		WebElement Ele2 = driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[41]"));
		Ele2.click();
		Thread.sleep(1000);
		WebElement Ele3 = driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[45]"));
		Ele3.click();
		Thread.sleep(1000);
		WebElement Ele4 = driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[46]"));
		Ele4.click();
		Thread.sleep(1000);
		WebElement Ele5 = driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[42]"));
		Ele5.click();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
		
		
		
	}
}
