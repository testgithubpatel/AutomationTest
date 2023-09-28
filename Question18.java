package JUnit.Assignment_Automation_2;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.DriverConnection;

//w.a. TestNG program to create dataprovider.
@RunWith(Parameterized.class)
 public class Question18 {
	 @Test(dataProvider = "dp")
     public void test(String name, String age) {
     	        System.out.println("Name : "+name);
     	        System.out.println("Age : "+age);
     }
    @DataProvider(name = "dp")
     public Object[][] dp() {
 	           Object[][] o = new Object[2][2];
 	           
 	           o[0][0] = "Bhumit";
 	           o[0][1] = "24";
 	           
 	           o[1][0] = "Sonal";
 	           o[1][1] = "25";
				   return o;
     }
}




