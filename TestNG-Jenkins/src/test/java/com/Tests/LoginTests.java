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
@Feature("Login Page Tests")
@Listeners(TestExecutionListener.class)
public class LoginTests extends BaseTest {
 
    LoginPage objLogin;
    DashboardPage objDashboardPage;
 
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 0, description = "Verify Login Page")
    @Description("Test Description : Verify the title of Login Page")
    @Story("Title of Login Page")
    public void verifyLoginPage() {
 
        // Create Login Page object
        objLogin = new LoginPage(driver);
 
        // Verify login page text
        objLogin.verifyPageTitle();
    }
 
   /* Failed Test */
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 1, description = "Login with invalid username and password")
    @Description("Test Description : Login Test with invalid credentials")
    @Story("Unsuccessful Login to Application")
    public void invalidCredentialTest() {
 
        // Create Login Page object
        objLogin = new LoginPage(driver);
        objLogin.login("test", "test123");
 
        // Verify login page text
        objLogin.verifyErrorMessage();
 
    }
 
}
