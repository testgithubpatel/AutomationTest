package Assesment_Automation;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//URL : https://demoqa.com/automation-practice-form

//Task 1 : Write script to fill this form using selenium webdriver.
//Task 2 : Write script to take screenshot of filled form
// Note : Use Xpath , keyboard event and mouse event

public class Question_1 {

	public static void getSreenShot(WebDriver driver,String path) throws InterruptedException {
		TakesScreenshot ss = (TakesScreenshot)driver;		
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taekn");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
	
		
	
		
		String url = "https://demoqa.com/automation-practice-form";
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(url);

		
			
		
		//////TASK 1
		Driver.findElement(By.id("firstName")).sendKeys("Bhumit");
		Driver.findElement(By.id("lastName")).sendKeys("Patel");
		Driver.findElement(By.id("userEmail")).sendKeys("bht@gamil.com");
		Driver.findElement(By.xpath("//label [text () = 'Male']")).click();
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,200)");
		Driver.findElement(By.id("userNumber")).sendKeys("4515256143");
		Driver.findElement(By.id("dateOfBirthInput")).click();

		Thread.sleep(1000);

		WebElement months = Driver.findElement(By.className("react-datepicker__month-select"));
		Select month = new Select(months);
		month.selectByIndex(6);

		Thread.sleep(1000);

		WebElement years = Driver.findElement(By.className("react-datepicker__year-select"));
		Select year = new Select(years);
		year.selectByVisibleText("1997");

		Thread.sleep(1000);

		WebElement date = Driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[2]/div[1]"));
		date.click();

		
		Thread.sleep(1000);

		WebElement sub = Driver.findElement(By.id("subjectsInput"));
		Actions action = new Actions(Driver);
		action.click(sub).sendKeys("Science").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.pause(Duration.ofSeconds(2)).sendKeys("Physics").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.pause(Duration.ofSeconds(2)).sendKeys("Maths").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build()
				.perform();

		Thread.sleep(1000);

		WebElement Hobby = Driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
		Hobby.click();

		Thread.sleep(1000);

		WebElement ChooseFile = Driver.findElement(By.id("uploadPicture"));
		ChooseFile.sendKeys("C:\\Users\\HP\\Pictures\\Screenshots");

		Thread.sleep(2000);

		Driver.findElement(By.id("currentAddress"))
				.sendKeys("Ask Someone in Maninagar and give my name ,you will defienetely get my Address");
		JavascriptExecutor js1 = (JavascriptExecutor) Driver;
				js1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		getSreenShot(Driver, "C:\\Users\\HP\\Desktop\\SSTASKING/myss.png");
	
		Thread.sleep(2000);
		Driver.close();
		
		
		WebElement State = Driver.findElement(By.xpath("//*[@id=\"state\"]/div"));
		Actions action1 = new Actions(Driver);
		action1.click(State).sendKeys("Haryana").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);
		
		Driver.close();

		/*String mainWin = Driver.getWindowHandle();
		System.out.println(mainWin);
		Set<String> allWin = Driver.getWindowHandles();
		for (String win : allWin) {
			System.out.println(win);
			if (!win.equals(mainWin)) {
				Driver.switchTo().window(win);

				Thread.sleep(2000);

				WebElement Btn = Driver
						.findElement(By.xpath("//*[@id=\"cookieModal\"]/div/div/div[1]/div[3]/div[2]/div[3]/button"));
				Btn.click();

				Thread.sleep(2000);
				Driver.close();
				System.out.println("close or not");
				Driver.switchTo().window(mainWin);
				System.out.println("close or not");
				Driver.close();
				System.out.println("close or not");

			}
		}

	}
	private static void getScreenShot(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}*/


}

}