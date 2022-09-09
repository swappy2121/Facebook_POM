package com.facebook.qa.testcasses;

import com.facebook.qa.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageTestCase extends LogInPage {

    public LogInPageTestCase(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
    }
    @Test(priority = 1)
    public void verifyTitleLogInPage(){
        String title = verifyTitleOfLogInPage();
        Assert.assertEquals(title,"Facebook – log in or sign up");
    }
    @Test(priority = 2)
    public void verifyIdTextField(){
        String userName = verifyUserId1TextField();
        Assert.assertEquals(userName,"email");
    }
    @Test(priority = 3)
    public void verifyPasswordOfLogInPage(){
        String passLogIn1 = verifyPass1TextFieldOfLogInPage();
        Assert.assertEquals(passLogIn1,"pass");
    }
    @Test(priority = 4)
    public void verifyBtnOfLogInPage1(){
        String button1 = verifyLogInBtn1();
        Assert.assertEquals(button1,"login");
    }
    @Test(priority = 5)
    public void verifyForgottenLinkOfPage(){
        String forgotLink = verifyForgotPassLink();
        Assert.assertEquals(forgotLink,"_6ltj");
    }
    @Test(priority = 6)
    public void verifyCreateAccBtnOfPage(){
        String createBtn = verifyCreateAccountBtn();
        Assert.assertEquals(createBtn,"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy");
    }
    @Test(priority = 7)
    public void verifyId2TextField(){
        String userName2 = verifyUserId2TextField();
        Assert.assertEquals(userName2,"email");
    }
    @Test(priority = 8)
    public void verifyPasswordOfLogInPage2(){
        String passLogIn2 = verifyPass2TextFieldOfLogInPage();
        Assert.assertEquals(passLogIn2,"pass");
    }
    @Test(priority = 9)
    public void verifyCreateAccBtnOfPageIsEnabledOrNot(){
        boolean createBtn1 = verifyCreateAccountBtnIsEnabled();
        Assert.assertTrue(createBtn1);
    }
    @Test(priority = 10)
    public void verifyBtnOfLogInPage2(){
        boolean button2 = verifyLogInBtn2();
        Assert.assertTrue(button2);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}
