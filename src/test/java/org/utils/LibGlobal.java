package org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
 private static final long Time = 0;
public static WebDriver driver; 
	//1)driver launch
	public  static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
//2)get url
public static void geturl(String url) {
	driver.get(url);

}
//3)get current url
public static String getcurrenturl() {
	String currentUrl = driver.getCurrentUrl();
	
return currentUrl;

}
//4) get title
public static String gettitle() {
	String title = driver.getTitle();
	return title;

}
//5) to close the current browser
public static void closebrowser() {
	driver.close();

}

//6) to close the all browser
public static void quitbrowser() {
driver.quit();

}

//7) to insert the value
public static void insertType(WebElement ele,String value) {
	ele.sendKeys(value);

}
//8) to click
public static void click(WebElement ele) {
ele.click();
}
//9)to get the excel datas
public static String getdata(int row,int cell) throws IOException {
	File loc = new File("C:\\Users\\Prabhu S\\eclipse-workspace\\sample\\input\\gayathri.xlsx");
	FileInputStream file = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(file);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	System.out.println(c);
	int cellType = c.getCellType();
	System.out.println(cellType);
	String value = null;
	if (cellType==1) {
		value = c.getStringCellValue();
	}else if(cellType==0) {
		if(DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
			System.out.println(dateCellValue);
		
		SimpleDateFormat sim = new SimpleDateFormat("dd/mm/yyyy");
		value = sim.format(dateCellValue);
		System.out.println(value);
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
			System.out.println(value);
		}
	
	
		}
	return value;
	
}


//10)get attribute
public static String getAttribute(WebElement ele ,String value) {
	String attribute = ele.getAttribute(value);
	System.out.println(attribute);
	return attribute;

}
//11)Switch to parent page
public static void SwitchToParentPage() {
	driver.switchTo().defaultContent();

}
//12)Implicit wait time
public static  void Implicitwait() {
	driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);

}
//13)JavaScript
public static void ClickJS(WebElement ele) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("argument[0].click()", ele);

}



















}
