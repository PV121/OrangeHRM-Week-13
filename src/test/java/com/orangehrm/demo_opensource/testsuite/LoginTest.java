package com.orangehrm.demo_opensource.testsuite;

import com.orangehrm.demo_opensource.pages.LogInPage;
import com.orangehrm.demo_opensource.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LogInPage login = new LogInPage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //  Enter “Admin” username
        login.enterUserName("Admin");
        //   Enter “admin123 password
        login.enterPassword("admin123");
        //Click on ‘LOGIN’ button
        login.clickOnLogin();
        //Verify the ‘Welcome’ text is display
        String actualWelcomeText = login.VerifyWelcomeText();
        String FinalText =  actualWelcomeText.substring(0,7);
        String expectedWelcomeText = "Welcome";
        Assert.assertEquals(FinalText,expectedWelcomeText);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        login.clickOnForgotPassword();
        String actualForgotPasswordText = login.verifyForgotPasswordText();
        String expectedForgotPasswordText = "Forgot Your Password?";
        Assert.assertEquals(actualForgotPasswordText,expectedForgotPasswordText);
    }
}
