package com.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pages.DashboardPage;
import com.Pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Web Application Regression Testing")
@Feature("Dashboard Page Tests")
@Listeners(TestExecutionListener.class)
public class DashboardTests extends BaseTest {
 
    LoginPage objLogin;
    DashboardPage objDashboardPage;
 
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 0, description = "Verify Dashboard Page")
    @Description("Test Description : After successful login to application opens Dashboard page")
    @Story("Successful login of application opens Dashboard Page")
 
    public void DasboardTest() {
 
        objLogin = new LoginPage(driver);
 
        // login to application
        objLogin.login("Admin", "admin123");
 
        // go the dashboard page
        objDashboardPage = new DashboardPage(driver);
 
        // Verify dashboard page
        objDashboardPage.verifyQuickLaunchOptions();
 
    }
 
}
