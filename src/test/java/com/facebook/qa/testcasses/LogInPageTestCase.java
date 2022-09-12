package com.facebook.qa.testcasses;

import com.facebook.qa.pages.HomePage;
import com.facebook.qa.pages.LogInPage;
import com.facebook.qa.pages.SignUpPage;
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
    public void verifyId2TextField(){
        boolean userName2 = verifyUserId2TextField();
        Assert.assertTrue(userName2);
    }
    @Test(priority = 3)
    public void verifyIdTextField(){
        String userName = verifyUserId1TextField();
        Assert.assertEquals(userName,"sopiakshu25@gmail.com");
    }
    @Test(priority = 4)
    public void verifyPasswordOfLogInPage(){
        String passLogIn1 = verifyPass1TextFieldOfLogInPage();
        Assert.assertEquals(passLogIn1,"Sopi@1234");
    }
    @Test(priority = 5)
    public void verifyPasswordOfLogInPage2(){
        boolean passLogIn2 = verifyPass2TextFieldOfLogInPage();
        Assert.assertEquals(passLogIn2,"pass");
    }
    @Test(priority = 6)
    public void verifyBtnOfLogInPage1(){
        boolean button1 = verifyLogInBtn1();
        Assert.assertTrue(button1);
    }
    @Test(priority = 7)
    public void verifyBtnOfLogInPage2(){
        boolean button2 = verifyLogInBtn2();
        Assert.assertTrue(button2);
    }
    @Test(priority = 8)
    public void verifyForgottenLinkOfPage(){
        String forgotLink = verifyForgotPassLink();
        Assert.assertEquals(forgotLink,"https://www.facebook.com/#");
    }
    @Test(priority = 9)
    public void verifyCreateAccBtnEnabledOrNotOfPage(){
        boolean Btn = verifyCreateAccountBtnEnabled();
        Assert.assertTrue(Btn);
    }
    @Test(priority = 10)
    public void verifyCreateAccBtnOfPage(){
        SignUpPage clickOnBtn = verifyCreateAccountBtn();
    }
    @Test(priority = 11)
    public void verifyLogInField(){
       HomePage homepage = verifyLogInField("sopiakshu25@gmail.com", "Sopi@1234");
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}
