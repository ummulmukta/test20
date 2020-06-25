package com.common;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base implements ITestListener {
	
	public static WebDriver driver;

	



	@Parameters("browser")
	
	@Test
	public void getBrowser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./Browsernew/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://www.practiceselenium.com");
		//driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	

}
	public static TakesScreenshot tsp() throws IOException{
		
		
		File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image,new File("C:\\Users\\ummul\\eclipse-workspace\\TestngPracticee\\ScreenshotReport\\report"+System.currentTimeMillis()+".png"));
		return null;
	
		
	}
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test stared");
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {

try {
	Base.tsp();
} catch (IOException e) {
	
	e.printStackTrace();
}

	}
	@Override
	public void onTestFailure(ITestResult result) {
		/*
		 * try { Base.tsp(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}}