package com.inf.pages.race;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 20.07.2015.
 */
public class PartnersPage extends BasePage {
    @FindBy(css = ".text-editor>h1") WebElement header;
    @FindBy(xpath = "//section[@class=\"text-editor\"]/p[1]/span/span/span") WebElement content;

    @FindBy(xpath = ".//*[@id='Form_name']") WebElement fName;
    @FindBy(xpath = ".//*[@id='Form_last_name']") WebElement fLName;
    @FindBy(xpath = ".//*[@id='Form_company']") WebElement fCmp;
    @FindBy(xpath = ".//*[@id='Form_post']") WebElement fPst;
    @FindBy(xpath = ".//*[@id='Form_email']") WebElement fEm;
    @FindBy(xpath = ".//*[@id='Form_phone']") WebElement fPh;
    @FindBy(xpath = ".//*[@id='Form_site']") WebElement fS;
    @FindBy(xpath = ".//*[@id='Form_city']") WebElement fCi;
    @FindBy(xpath = ".//*[@id='Form_country']") WebElement fCntr;
    @FindBy(css = "#partner_form>#submit_phone") WebElement fBtn;
    @FindBy(css = "#fancybox-close") WebElement acceptClose;
    public PartnersPage(WebDriver driver) throws Exception{
        super(driver);
        this.PAGE_URL = "http://race-expo.ru/ru/partners/";
        this.PAGE_TITLE = "RACE 2015";
    }
    public void loadRace(){
        loadPage();
    }
    public void cntnt (){
        verifyElementIsContainText(header,"ПАРТНЕРАМ");
        verifyElementIsContainText(content,"ЧТО ДАЕМ МЫ");
    }
    public void fn() throws Exception {
        negativeTestForm(fName,fBtn,acceptClose,true);
        negativeTestForm(fName,fBtn,acceptClose,false);
        negativeTestForm(fLName,fBtn,acceptClose,false);
        negativeTestForm(fCmp,fBtn,acceptClose,false);
        negativeTestForm(fPst,fBtn,acceptClose,false);
        negativeTestForm(fEm,fBtn,acceptClose,false);
        negativeTestForm(fPh,fBtn,acceptClose,false);
        negativeTestForm(fS,fBtn,acceptClose,false);
        negativeTestForm(fCi,fBtn,acceptClose,false);
        negativeTestForm(fCntr,fBtn,acceptClose,false);
    }
    public void fp() throws Exception {
        setElementText(fName);
        setElementText(fLName);
        setElementText(fCmp);
        setElementText(fPst);
        setEmailAdress(fEm);
        setMobileNumber(fPh);
        setElementText(fS);
        setElementText(fCi);
        setElementText(fCntr);
        clickOnElement(fBtn);
        clickOnElement(acceptClose);
        checkEmail();
    }
}
