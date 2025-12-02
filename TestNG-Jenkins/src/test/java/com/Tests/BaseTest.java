package com.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Pages.DashboardPage;
import com.Pages.LoginPage;

import io.qameta.allure.Step;

public class BaseTest {
	public static WebDriver driver;
    LoginPage objLogin;
    DashboardPage objDashboardPage;
 
    @Step("Start the application")
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
 
    @Step("Stop the application")
    @AfterMethod
    public void close() {
        driver.close();
    }
}
