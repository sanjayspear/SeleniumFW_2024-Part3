package com.dhruv.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.dhruv.helper.BaseClass;
import com.dhruv.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

    @BeforeMethod
    public void setUp() {
        driver = initializeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        String errorMessageText = loginPage.loginWithInvalidCred("rahul", "rahul123");
        System.out.println("The Error Message Is: " + errorMessageText);
        Assert.assertEquals(errorMessageText, "* Incorrect username or password", "Error message did not match");
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }
}
