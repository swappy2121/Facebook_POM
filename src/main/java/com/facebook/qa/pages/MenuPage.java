package com.facebook.qa.pages;

import com.facebook.qa.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuPage extends BaseClass {
    public static WebElement fbLogo;
    public static WebElement welcome;
    public static WebElement event;
    public static WebElement FindFriends;
    public static WebElement groups;
    public static WebElement news;
    public static WebElement favourites;
    public static WebElement watchVideo;
    public static WebElement gaming;
    public static WebElement bloodDonation;

    public boolean verifyFacebookLogo() {
        fbLogo = driver.findElement(By.xpath("(//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yl/r/GavNGH1v5-z.png')])[1]"));
        return fbLogo.isDisplayed();
    }
    public boolean verifyWelcomeField() {
        welcome = driver.findElement(By.xpath("(//img[contains(@class,'gneimcpu p9wrh9lq')])[3]"));
        return welcome.isDisplayed();
    }
    public String verifyEventField() {
        event = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[2]"));
        WebElement searchEvent = driver.findElement(By.xpath("(//input[contains(@class,'qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 i5oewl5a r9fxt90l nnzkd6d7 jvc6uz2b adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w')])"));
        if(event.isEnabled()){
            event.click();
        }
        searchEvent.sendKeys("funny videos");
        return searchEvent.getAttribute("value");
    }
    public boolean verifyFindFriendsField() {
        FindFriends = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[3]"));
        return FindFriends.isEnabled();
    }
    public boolean verifyGroupsField() {
        groups = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[4]"));
        return groups.isEnabled();
    }
    public boolean verifyNewsField() {
        news = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[5]"));
        return news.isDisplayed();
    }
    public boolean verifyFavouritesField() {
        favourites = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[6]"));
        return favourites.isDisplayed();
    }
    public boolean verifyWatchVideosField() {
        watchVideo = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[9]"));
        return watchVideo.isEnabled();
    }
    public boolean verifyGamingField() {
        gaming = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[10]"));
        return gaming.isEnabled();
    }
    public boolean verifyBloodDonationField() {
        bloodDonation = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[19]"));
        return bloodDonation.isEnabled();
    }
}
