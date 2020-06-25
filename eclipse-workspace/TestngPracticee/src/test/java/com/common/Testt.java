package com.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testt extends Base {

	
	
	public static ArrayList<Object[]> getdata() throws Throwable, Throwable, IOException {
		ArrayList<Object[]> ob = new ArrayList<>();

		FileInputStream fis = new FileInputStream("./Xceel/Book1.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			// Row row = sheet.getRow(i);

			String name = sheet.getRow(i).getCell(0).toString();
			System.out.println(name);

			String pass = sheet.getRow(i).getCell(1).toString();
			System.out.println(pass);

			String phone = sheet.getRow(i).getCell(2).toString();
			System.out.println(phone);

//ob.add(new Object[] {name,pass,phone});
			Object[] obb = { name, pass, phone };
			ob.add(obb);
		}
		return ob;

	}

	@DataProvider
	public Iterator<Object[]> getTestdata() throws IOException, Throwable {
		ArrayList<Object[]> finaldata = Testt.getdata();
		return finaldata.iterator();

	}

	
	


	@Test(dataProvider = "getTestdata")
	public void testRun(String a, String b, String c) {
getBrowser("browser");
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("http://www.practiceselenium.com");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
		driver.findElement(By.linkText("Check Out")).click();
		driver.findElement(By.id("email")).clear();;
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys(b);
		
		
	
	
	
	
	
	}

}
