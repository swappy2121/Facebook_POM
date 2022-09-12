package com.facebook.qa.testcasses;

import com.facebook.qa.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.qa.extentreportlistener.TestNG_Listener.class)
public class SignUpPageTestCase extends SignUpPage{

    public SignUpPageTestCase(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/reg/");
    }
    @Test(priority = 1)
    public void verifyTitleSignUpPage(){
        String titleOfPage = verifyTitleOfSignUpPage();
        Assert.assertEquals(titleOfPage,"Sign up for Facebook | Facebook");
    }
    @Test(priority = 2)
    public void verifyFirstNameOfSignUpPage(){
        String Name1 = verifyFirstNameField();
        Assert.assertEquals(Name1,"Swapnil");
    }
    @Test(priority = 3)
    public void verifyLastNameOfSignUpPage(){
        String Name2 = verifyLastNameField();
        Assert.assertEquals(Name2,"Pawar");
    }
    @Test(priority = 4)
    public void verifyEmailFieldOfSignUpPage(){
        String email = verifyEmailTextField();
        Assert.assertEquals(email,"swapnilPawar25@gmail.com");
    }
    @Test(priority = 5)
    public void verifyConfirmEmailFieldOfSignUpPage(){
        String confEmail = verifyConfirmEmailTextField();
        Assert.assertEquals(confEmail,"swapnilPawar25@gmail.com");
    }
    @Test(priority = 6)
    public void verifypassFieldOfSignUpPage(){
        String pass = verifyPasswordTextField();
        Assert.assertEquals(pass,"Swappy@2524");
    }
    @Test(priority = 7)
    public void verifyBirthDayFieldOfSignUpPage(){
        String birth_Day = verifyBirthDayField();
        Assert.assertEquals(birth_Day,"5");
    }
    @Test(priority = 8)
    public void verifyBirthMonthFieldOfSignUpPage(){
        String birth_Month = verifyBirthmonthField();
        Assert.assertEquals(birth_Month,"9");
    }
    @Test(priority = 9)
    public void verifyBirthYearFieldOfSignUpPage(){
        String birth_Year = verifyBirthYearField();
        Assert.assertEquals(birth_Year,"1999");
    }
    @Test(priority = 10)
    public void verifyGenderFieldOfSignUpPage(){
        String gender = verifyGenderField();
        Assert.assertEquals(gender,"2");
    }
    @Test(priority = 11)
    public void verifySubmitbtnOfSignUpPage(){
        boolean subBtn = verifySignUpBtnField();
        Assert.assertTrue(subBtn);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}
