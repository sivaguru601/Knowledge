package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.qameta.allure.Step;

public class DashboardPage {
	WebDriver driver;
	 
    By dashboardPageTitle = By.xpath("//h6[normalize-space()='Dashboard']");
 
    By options = By.xpath("//p[normalize-space()='Assign Leave']");
 
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
 
    }
 
    @Step("Verify title of Dashboard page")
    public void verifyDashboardPageTitle() {
        String DashboardPageTitle = driver.findElement(dashboardPageTitle).getText();
        Assert.assertTrue(DashboardPageTitle.contains("Dashboard"));
    }
 
    @Step("Verify Quick Launch Options on Dashboard page")
    public void verifyQuickLaunchOptions() {
        String QuickLaunchOptions = driver.findElement(options).getText();
        Assert.assertTrue(QuickLaunchOptions.contains("Assign Leave"));
    }
}
