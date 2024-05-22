package com.dhruv.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("inputUsername");
    private By passwordField = By.name("inputPassword");
    private By signInButton = By.className("signInBtn");
    private By errorMessage = By.className("error");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String loginWithInvalidCred(String un, String pwd) {
        driver.findElement(usernameField).sendKeys(un);
        driver.findElement(passwordField).sendKeys(pwd);
        driver.findElement(signInButton).click();
        return driver.findElement(errorMessage).getText();
    }
}
