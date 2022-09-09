package com.facebook.qa.pages;

import com.facebook.qa.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends BaseClass {
    public static String titleOfLogInPage;
    public static WebElement userId1;
    public static WebElement userId2;
    public static WebElement pass1;
    public static WebElement pass2;
    public static WebElement logInBtn1;
    public static WebElement logInBtn2;
    public static WebElement forgotPassLink;
    public static WebElement createAcBtn1;
    public static WebElement createAcBtn2;

    public String verifyTitleOfLogInPage() {
        titleOfLogInPage = driver.getTitle();
        return titleOfLogInPage;
    }
    public String verifyUserId1TextField() {
        userId1 = driver.findElement(By.name("email"));
        return userId1.getAttribute("name");
    }
    public String verifyUserId2TextField() {
        userId2 = driver.findElement(By.name("email"));
        return userId2.getAttribute("id");
    }
    public String verifyPass1TextFieldOfLogInPage() {
        pass1 = driver.findElement(By.id("pass"));
        return pass1.getAttribute("name");
    }
    public String verifyPass2TextFieldOfLogInPage() {
        pass2 = driver.findElement(By.id("pass"));
        return pass2.getAttribute("id");
    }
    public String verifyLogInBtn1() {
        logInBtn1 = driver.findElement(By.name("login"));
        return logInBtn1.getAttribute("name");
    }
    public String verifyForgotPassLink() {
        forgotPassLink = driver.findElement(By.xpath("(//a)[1]"));
        return forgotPassLink.getAttribute("class");
    }
    public String verifyCreateAccountBtn() {
        createAcBtn1 = driver.findElement(By.linkText("Create New Account"));
        return createAcBtn1.getAttribute("class");
    }
    public boolean verifyCreateAccountBtnIsEnabled() {
        createAcBtn2 = driver.findElement(By.linkText("Create New Account"));
        return createAcBtn2.isEnabled();
    }
    public boolean verifyLogInBtn2() {
        logInBtn2 = driver.findElement(By.name("login"));
        return logInBtn2.isEnabled();
    }
}