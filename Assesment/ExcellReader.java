package Assesment_Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ExcellReader {
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
	public ExcellReader(String filePath, String sheetName) {
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	String filePath;
	String sheetName;

	public int rowCount() {
		int i = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			i = worksheet.getPhysicalNumberOfRows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int colCount() {
		int i = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			i = worksheet.getRow(0).getPhysicalNumberOfCells();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public String getData(int row, int col) {
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
	/*public ExcellReader (String filePath,String SheetName) {
		  super();
		  this.filePath = filePath;
		  this.SheetName= SheetName;
		  
		} 
	String filePath;
	String SheetName;

	public int rowCount () {
		int i =0;
		try {
			XSSFWorkbook workbook= new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workbook.getSheet(SheetName);
			i = workSheet.getPhysicalNumberOfRows();
			System.out.println(i);
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
		return i;
}
public  int  colCount() {
	int i =0;
	try {
		XSSFWorkbook workbook= new XSSFWorkbook(filePath );
		XSSFSheet workSheet = workbook.getSheet(SheetName);
		i = workSheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(i);
		
	} catch ( IOException e) {
		e.printStackTrace();
	}
	return i;

}	
	public String getData (int row,int col) {
		String data = null;
		try {
			XSSFWorkbook workbook= new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workbook.getSheet(SheetName);
			 data = workSheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}*/
	

	
	
	
	
	
	


