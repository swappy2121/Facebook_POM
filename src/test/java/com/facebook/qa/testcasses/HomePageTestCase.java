package com.facebook.qa.testcasses;

import com.facebook.qa.pages.HomePage;
import com.facebook.qa.pages.MenuPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestCase extends HomePage {

    public HomePageTestCase(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.name("login")).click();
    }
    @Test(priority = 1)
    public void verifySearchFieldInHomePage(){
        boolean searchField = verifySearchFieldOfHomePage();
        Assert.assertTrue(searchField);
    }
    @Test(priority = 2)
    public void verifyMenuFieldLogoInHomePage(){
        boolean logoOfMenu = verifyMenuFieldLogo();
        Assert.assertTrue(logoOfMenu);
    }
    @Test(priority = 3)
    public void verifyMenuFieldForHomePage(){
        MenuPage menuField = verifyMenuField();
    }
    @Test(priority = 4)
    public void verifyFriendsFieldOfHomePage(){
        boolean friendField = verifyFriendsField();
        Assert.assertTrue(friendField);
    }
    @Test(priority = 5)
    public void verifyGroupsFieldOfPage(){
        boolean groupsField = verifyGroupsField();
        Assert.assertTrue(groupsField);
    }
    @Test(priority = 6)
    public void verifyCreateNewGroupFieldOfPage(){
        boolean createNewGroupField = verifyCreateNewGroupField();
        Assert.assertTrue(createNewGroupField);
    }
    @Test(priority = 7)
    public void verifyCreateNewGroupPlusIconOfPage(){
        boolean icon = verifyCreateNewGroupPlusIcon();
        Assert.assertTrue(icon);
    }
    @Test(priority = 8)
    public void verifyMessengerFieldOfPage(){
        String searchField = verifyMessengerField();
        Assert.assertEquals(searchField,"rahul");
    }
    @Test(priority = 9)
    public void verifyPlusIconOfHomePage(){
        boolean shareMomentsIcon = verifyShareMomentsIconField();
        Assert.assertTrue(shareMomentsIcon);
    }
    @Test(priority = 10)
    public void verifyNotificationsLinkOfHomePage(){
        boolean linkOfNotifications = verifyNotificatonsField();
        Assert.assertTrue(linkOfNotifications);
    }
    @AfterTest
    public void closeBrowsers(){
          driver.quit();
    }
}
