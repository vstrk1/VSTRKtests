package com.inf.pages.race;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 17.07.2015.
 */
public class MediaPage extends BasePage {
    //content
    @FindBy(css = ".text-editor>h1") WebElement mediaHeader;
    @FindBy(xpath = "//section[@class=\"text-editor\"]/a[1]") WebElement link1;
    @FindBy(xpath = "//section[@class=\"text-editor\"]/a[2]") WebElement link2;
    @FindBy(xpath = "//section[@class=\"text-editor\"]/a[3]") WebElement link3;
    //acceptClose
    @FindBy(css = "#fancybox-close") WebElement acceptClose;
    //mediaForm
    @FindBy(css = "#SmiModel_company") WebElement nameMediaField;
    @FindBy(css = "#SmiModel_name") WebElement namePersonMediaField;
    @FindBy(css = "#SmiModel_post") WebElement postMediaField;
    @FindBy(css = "#SmiModel_phone") WebElement phoneMediaField;
    @FindBy(css = "#SmiModel_email") WebElement emailMediaField;
    @FindBy(css = "#SmiModel_site") WebElement siteMediaField;
    @FindBy(css = "#smi_form>#submit_phone") WebElement buttonMedia;
    public MediaPage (WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_TITLE ="Информация для СМИ по аккредитации на RACE 2015";
        this.PAGE_URL = "http://race-expo.ru/ru/media/";
    }
    public void loadRace() {
        loadPage();
    }
    public void testContent(){
        verifyElementIsContainText(mediaHeader,"СМИ");
        verifyElementIsHaveLink(link1,"http://race-expo.ru/pdf/Press_release_RACE_2015.pdf");
        verifyElementIsHaveLink(link2, "http://race-expo.ru/pdf/Press_release_RACE_Awards_2015.pdf");
        verifyElementIsHaveLink(link3, "http://race-expo.ru/pdf/Press_release_RACE_conference_2015.pdf");
    }
    public void testMediaNegative() throws Exception {
        negativeTestForm(nameMediaField,buttonMedia,acceptClose,true);
        negativeTestForm(nameMediaField,buttonMedia,acceptClose,false);
        negativeTestForm(namePersonMediaField,buttonMedia,acceptClose,false);
        negativeTestForm(postMediaField,buttonMedia,acceptClose,false);
        negativeTestForm(phoneMediaField,buttonMedia,acceptClose,false);
        negativeTestForm(emailMediaField,buttonMedia,acceptClose,false);
        negativeTestForm(siteMediaField,buttonMedia,acceptClose,false);
    }
    public void testMediaPositive() throws Exception {
        setElementText(nameMediaField);
        setElementText(namePersonMediaField);
        setElementText(postMediaField);
        setMobileNumber(phoneMediaField);
        setEmailAdress(emailMediaField);
        setElementText(siteMediaField);
        clickOnElement(buttonMedia);
        clickOnElement(acceptClose);
        checkEmail();
    }
}
