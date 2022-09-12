package com.facebook.qa.testcasses;

import com.facebook.qa.pages.SettingPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingPageTestCase extends SettingPage {
    public SettingPageTestCase(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//input[contains(@class,'qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 b0eko5f3 r9fxt90l nq2b4knc jrp0dh92 m8m1d84o him0ws1g s0u2i99n oe2youzz mizpstq0 adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w')]")).sendKeys("settings");
        driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw k1z55t6l oog5qr5w tes86rjd pbevjfx6')])[1]")).click();
        driver.findElement(By.name("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[1]")).click();
    }

    @Test(priority = 1)
    public void verifyGeneralFieldOfPage(){
        boolean generalField = verifyGeneralField();
        Assert.assertTrue(generalField);
    }
    @Test(priority = 2)
    public void verifySecurityAndPrivacyFieldOfPage() {
        boolean securityAndPrivacyField = verifySecurityAndPrivacyField();
        Assert.assertTrue(securityAndPrivacyField);
    }
    @Test(priority = 3)
    public void verifyFacebookInfoOfPage() {
        boolean facebookInfoField = verifyYourFacebookInfoField();
        Assert.assertTrue(facebookInfoField);
    }
    @Test(priority = 4)
    public void verifyPrivacyFieldOfPage() {
        boolean privacyField = verifyPrivacyField();
        Assert.assertTrue(privacyField);
    }
    @Test(priority = 5)
    public void verifyPublicPostsOfPage() {
        boolean publicPostsField = verifyPublicPostsField();
        Assert.assertTrue(publicPostsField);
    }
    @Test(priority = 6)
    public void verifyBlockingFieldOfPage() {
        boolean blockingField = verifyBlockingField();
        Assert.assertTrue(blockingField);
    }
    @Test(priority = 7)
    public void verifyLocationFieldOfPage() {
        boolean locationOfField = verifyLocationField();
        Assert.assertTrue(locationOfField);
    }
    @Test(priority = 8)
    public void verifyLanguageAndRegionFieldOfSignUpPage() {
        boolean languageAndRegion = verifyLanguageAndRegionField();
        Assert.assertTrue(languageAndRegion);
    }
    @Test(priority = 9)
    public void verifyStoriesofPage() {
        boolean storiesField = verifyStoriesField();
        Assert.assertTrue(storiesField);
    }
    @Test(priority = 10)
    public void verifyBusinessIntegrationFieldOfPage() {
        boolean businessIntegrationField = verifyBusinessIntegrationField();
        Assert.assertTrue(businessIntegrationField);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}
