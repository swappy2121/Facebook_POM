package com.facebook.qa.testcasses;

import com.facebook.qa.pages.MenuPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuPageTestCase extends MenuPage {

    public MenuPageTestCase(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//div[contains(@class,'qi72231t nu7423ey tav9wjvu flwp5yud tghlliq5 gkg15gwv s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx l7ghb35v kmwttqpk dnr7xe2t aeinzg81 om3e55n1 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg o9erhkwx dzqi5evh hupbnkgi hvb2xoa8 jl2a5g8c f14ij5to l3ldwz01 icdlwmnq i85zmo3j alzwoclg irrdun15 hgxaigo5 d2hqwtrz o9wcebwi fzsidkae l3gxykhd')]")).click();
    }
    @Test(priority = 1)
    public void verifyFB_LogoForMenuPage(){
        boolean logoOfFb = verifyFacebookLogo();
        Assert.assertTrue(logoOfFb);
    }
    @Test(priority = 2)
    public void verifyWelcomeFieldLogoInMenuPage(){
        boolean welcomeField  = verifyWelcomeField();
        Assert.assertTrue(welcomeField);
    }
    @Test(priority = 3)
    public void verifyEventFieldForMenuPage(){
        String eventField = verifyEventField();
        Assert.assertEquals(eventField,"funny videos");
    }
    @Test(priority = 4)
    public void verifyFindFriendsFieldOfMenuPage(){
        boolean findFriendField = verifyFindFriendsField();
        Assert.assertTrue(findFriendField);
    }
    @Test(priority = 5)
    public void verifyGroupsFieldOfPage() {
        boolean groups = verifyGroupsField();
        Assert.assertTrue(groups);
    }
    @Test(priority = 6)
    public void verifyNewsFieldOfPage() {
        boolean newsField = verifyNewsField();
        Assert.assertTrue(newsField);
    }
    @Test(priority = 7)
    public void verifyFavouritesFieldOfPage() {
        boolean favouritesField = verifyFavouritesField();
        Assert.assertTrue(favouritesField);
    }
    @Test(priority = 8)
    public void verifyWatchVideosFieldOfPage() {
        boolean watchVideosField = verifyWatchVideosField();
        Assert.assertTrue(watchVideosField);
    }
    @Test(priority = 9)
    public void verifyGamingFieldOfMenuPage() {
        boolean gamingField = verifyGamingField();
        Assert.assertTrue(gamingField);
    }
    @Test(priority = 10)
    public void verifyBloodDonationFieldOfMenuPage(){
        boolean bloodDonationField = verifyBloodDonationField();
        Assert.assertTrue(bloodDonationField);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}
