package com.facebook.qa.pages;

import com.facebook.qa.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage extends BaseClass {
    public static WebElement posts;
    public static WebElement about;
    public static WebElement search;
    public static WebElement friends;
    public static WebElement searchForFriends;
    public static WebElement uploadPhotos;
    public static WebElement photos;
    public static WebElement videos;
    public static WebElement check_In;
    public static WebElement addStory;
    public static WebElement createStory;
    public static WebElement editDetails;
    public static WebElement addImg;
    public static WebElement addCoverPhotos;



    public String verifyPostsField() {
        posts = driver.findElement(By.xpath("//span[starts-with(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo')][1]"));
        return posts.getAttribute("class");
    }
    public String verifyAboutField() {
        about = driver.findElement(By.xpath("(//div[@class='qmqpeqxj e7u6y3za qwcclf47 nmlomj2f i85zmo3j frfouenu bonavkto djs4p424 r7bn319e bdao358l fxk3tzhb jcxyg2ei om3e55n1 a5wdgl2o h7q9eq3y iryl7rsq'])[2]"));
        driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken'])[3]")).click();
        return driver.getCurrentUrl();
    }
    public boolean verifySearchField() {
        search = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1'])"));
        return search.isEnabled();
    }
    public String verifyFriendsField() {
        friends = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[3]"));
        if(friends.isEnabled()){
            friends.click();
            searchForFriends = driver.findElement(By.xpath("(//input[contains(@class,'qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 i5oewl5a r9fxt90l nnzkd6d7 jvc6uz2b')])"));
            searchForFriends.sendKeys("Akshay Pawar");
        }
        return searchForFriends.getAttribute("value");
    }
    public boolean verifyPhotosField() {
        photos = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[4]"));
        photos.click();
        driver.navigate().to("https://www.facebook.com/media/set/create");
        uploadPhotos = driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q')])[2]"));
            Actions action = new Actions(driver);
            action.moveToElement(uploadPhotos).click().perform();
            return uploadPhotos.isEnabled();
    }
    public boolean verifyVideosField() {
        videos = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[5]"));
        return videos.isEnabled();
    }
    public boolean verifyCheck_InField() {
        check_In = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[6]"));
        return check_In.isDisplayed();
    }
    public boolean verifyAddStoryField() {
        addStory = driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[2]"));
        if(addStory.isEnabled()){
            addStory.click();
            createStory = driver.findElement(By.xpath("(//i[contains(@class,'z6erz7xo on4d8346 s8sjc6am myo4itp8 ekq1a7f9')])"));
        }
        return createStory.isEnabled();
    }
    public boolean verifyEditProfileDetailsField() {
        editDetails = driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[3]"));
        if(editDetails.isEnabled()){
            editDetails.click();
            addImg = driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q')])[2]"));
        }
       return addImg.isDisplayed();
    }
    public boolean verifyAddCoverPhotosField() {
        addCoverPhotos = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken'])[1]"));
        return addCoverPhotos.isEnabled();
    }
}
