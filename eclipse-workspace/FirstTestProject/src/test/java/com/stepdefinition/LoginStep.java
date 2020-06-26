package com.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends Base {

	@Given("^User able to go homepage$")
	public void user_able_to_go_homepage() throws Throwable {
	    
		
		 getDriver();
		
	}

	@When("^user enter email$")
	public void user_enter_email() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dfghbjn,m.mnbmhjn.m,");
	   
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	   
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("fgvjbnkm");
	}

	@When("^user able to click login$")
	public void user_able_to_click_login() throws Throwable {
	   
	   driver.findElement(By.xpath("//input[@id='u_0_4']")).click();
	}

	@Then("^user login successfully$")
	public void user_login_successfully() throws Throwable {
	   Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
	   System.out.println(driver.getTitle());
	   
	   
	}


	
	
	
	
	
	
	
	
}
