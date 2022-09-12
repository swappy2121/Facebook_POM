package com.facebook.qa.pages;

import com.facebook.qa.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {
    public static WebElement search;
    public static WebElement logo;
    public static WebElement menu;
    public static WebElement friends;
    public static WebElement groups;
    public static WebElement createNewGroup;
    public static WebElement plusIcon;
    public static WebElement messenger;
    public static WebElement iconOfShareMoments;
    public static WebElement findFriendsLink;
    public static WebElement addPictures;

    public boolean verifySearchFieldOfHomePage() {
        search = driver.findElement(By.xpath("(//input[@class='qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 b0eko5f3 r9fxt90l fwlpnqze nq2b4knc adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w'])[1]"));
        return search.isDisplayed();
    }
    public boolean verifyMenuFieldLogo() {
        logo = driver.findElement(By.xpath("(//div[@class='qmqpeqxj e7u6y3za qwcclf47 nmlomj2f i85zmo3j frfouenu bonavkto djs4p424 r7bn319e bdao358l fxk3tzhb jcxyg2ei om3e55n1 a5wdgl2o h7q9eq3y iryl7rsq'])[1]"));
        return logo.isDisplayed();
    }
    public MenuPage verifyMenuField() {
        menu = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])"));
        if(menu.isEnabled()){
            menu.click();
        }
        return new MenuPage();
    }
    public boolean verifyFriendsField() {
        friends = driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[5]"));
        WebElement friendReq = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6')])[2]"));
        if(friends.isEnabled()){
            friends.click();
        }
        return friendReq.isDisplayed();
    }
    public boolean verifyGroupsField() {
        groups = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[2]"));
        WebElement discoverField = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken'])[2]"));
        if(groups.isEnabled()){
            groups.click();
        }
        return discoverField.isEnabled();
    }
    public boolean verifyCreateNewGroupField() {
        createNewGroup = driver.findElement(By.xpath("(//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o'])"));
        return createNewGroup.isEnabled();
    }
    public boolean verifyCreateNewGroupPlusIcon() {
        plusIcon = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[3]"));
        return plusIcon.isDisplayed();
    }
    public String verifyMessengerField() {
        messenger = driver.findElement(By.xpath("(//div[@class='qi72231t n3hqoq4p r86q59rh b3qcqh3k fq87ekyn fsf7x5fv s5oniofx m8h3af8h l7ghb35v kjdc1dyq kmwttqpk cr00lzj9 rn8ck1ys s3jn8y49 f14ij5to l3ldwz01 icdlwmnq i85zmo3j qmqpeqxj e7u6y3za qwcclf47 nmlomj2f frfouenu bonavkto djs4p424 r7bn319e bdao358l alzwoclg jcxyg2ei srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 nq2b4knc bis24fgy a5wdgl2o'])"));
        WebElement searchOnMessenger = driver.findElement(By.xpath("(//input[@class='qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 i5oewl5a r9fxt90l nnzkd6d7 jvc6uz2b adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w'])"));
        if(messenger.isEnabled()){
            messenger.click();
            searchOnMessenger.sendKeys("rahul");
        }
        return searchOnMessenger.getAttribute("value");
    }
    public boolean verifyShareMomentsIconField() {
        iconOfShareMoments = driver.findElement(By.xpath("(//i[@class='gneimcpu b0w474w7'])[3]"));
        return iconOfShareMoments.isEnabled();
    }
    public boolean verifyNotificatonsField() {
        addPictures = driver.findElement(By.xpath("(//span)[58]"));
        return addPictures.isEnabled();
    }
}
