package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.qameta.allure.Step;

public class LoginPage {
	
		 
	    WebDriver driver;
	 
	    By userName = By.name("username");
	 
	    By password = By.name("password");
	 
	    By titleText = By.xpath("//h5[normalize-space()='Login']");
	 
	    By login = By.xpath("//button[normalize-space()='Login']");
	 
	    By errorMessage = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	 
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	    // Set user name in textbox
	    public void setUserName(String strUserName) {
	        driver.findElement(userName).sendKeys(strUserName);
	    }
	 
	    // Set password in password textbox
	    public void setPassword(String strPassword) {
	        driver.findElement(password).sendKeys(strPassword);
	    }
	 
	    // Click on login button
	    public void clickLogin() {
	        driver.findElement(login).click();
	    }
	 
	    @Step("Verify title of Login Page")
	    public void verifyPageTitle() {
	        String loginPageTitle = driver.findElement(titleText).getText();
	        Assert.assertTrue(loginPageTitle.contains("Login"));
	    }
	 
	    /* Failed Test */
	    @Step("Verify error message when invalid credentail is provided")
	    public void verifyErrorMessage() {
	        String invalidCredentialErrorMessage = driver.findElement(errorMessage).getText();
	        Assert.assertTrue(invalidCredentialErrorMessage.contains("Invalid credentials"));
	    }
	 
	    @Step("Enter username and password")
	    public void login(String strUserName, String strPasword) {
	 
	        // Fill user name
	        this.setUserName(strUserName);
	 
	        // Fill password
	        this.setPassword(strPasword);
	 
	        // Click Login button
	        this.clickLogin();
	 
	    }
}
