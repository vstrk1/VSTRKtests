package com.inf.pages.race;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 20.07.2015.
 */
public class ContactsPage extends BasePage{
    @FindBy(css = "#PhoneModel_phone") WebElement cntPhone;
    @FindBy(css = "#PhoneModel_name") WebElement cntName;
    @FindBy(css = "#submit_phone") WebElement cntButton;
    @FindBy(css = "#fancybox-close") WebElement acceptClose;

    public ContactsPage(WebDriver driver) throws Exception {
                super(driver);
        this.PAGE_TITLE = "Контакты - Race expo";
        this.PAGE_URL = "http://race-expo.ru/ru/contact/";
    }
    public void loadRace(){
        loadPage();
    }
    public void contactFormN() throws Exception {
        negativeTestForm(cntName,cntButton,acceptClose,true);
        negativeTestForm(cntName,cntButton,acceptClose,false);
        negativeTestForm(cntPhone,cntButton,acceptClose,false);

    }
    public void contactFormP(){
        setElementText(cntName);
        setMobileNumber(cntPhone);
        clickOnElement(cntButton);
        clickOnElement(acceptClose);
    }
}
