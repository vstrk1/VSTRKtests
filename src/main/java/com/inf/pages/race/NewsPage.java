package com.inf.pages.race;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 20.07.2015.
 */
public class NewsPage extends BasePage {
    @FindBy(css = "#all_h") WebElement newsHeader;

    @FindBy(css = "#subscribeForm_news>div>#SubscribeForm_name") WebElement topName;
    @FindBy(css = "#subscribeForm_news>div>#SubscribeForm_email") WebElement topEmail;
    @FindBy(css = "#subscribeForm_news>div>#submitSubscribe") WebElement topBtn;
    @FindBy(css = "#fancybox-close") WebElement acceptClose;

    @FindBy(css = ".banner>a") WebElement cofBtn;
    @FindBy(css = ".info_graph_ru") WebElement infoGrpBtn;



    public NewsPage(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_TITLE = "Новости - Race Expo 2015";
        this.PAGE_URL = "http://race-expo.ru/ru/allnews/";
    }
    public void loadRace(){
        loadPage();
    }

    public void contnt() {

        verifyElementIsContainText(newsHeader, "НОВОСТИ");
        checkSimpleBlockContent("//div[@class=\"news-wrapper\"]/a");
        verifyElementIsHaveLink(cofBtn, "http://race-expo.ru/ru/conference/");
        verifyElementIsHaveLink(infoGrpBtn, "http://race-expo.ru/ru/allnews?info=1");
    }
    public void fN() throws Exception {
        negativeTestForm(topName,topBtn,acceptClose,true);
        negativeTestForm(topEmail,topBtn,acceptClose,false);
        negativeTestForm(topName,topBtn,acceptClose,false);
    }
    public void fP() throws Exception {
        setElementText(topName);
        setEmailAdress(topEmail);
        clickOnElement(topBtn);
        checkEmail();
    }
}
