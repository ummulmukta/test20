package com.common;

import org.openqa.selenium.By;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Tsett extends Base {
	
	@Test
public void testone() {
	
		
		System.out.println(driver.getTitle());
}
	@Test
	public void testtwo() {
		
	
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Test
	public void letsfail() {
		
		driver.findElement(By.id("This will fail"));
		
	}
	@AfterTest
	
	public void closee() {
		driver.quit();
	}
}
