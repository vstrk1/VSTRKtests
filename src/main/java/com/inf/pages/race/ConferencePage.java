package com.inf.pages.race;
import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by v.stuparenko on 10.07.2015.
 */
public class ConferencePage extends BasePage {
    @FindBy(css = ".text-editor>h1") WebElement aboutHeader;
    @FindBy(css = "#Form_name") WebElement nameFld;
    @FindBy(css = "#Form_last_name") WebElement lastNameFld;
    @FindBy(css = "#Form_company") WebElement companyFld;
    @FindBy(css = "#Form_post") WebElement postFld;
    @FindBy(css = "#Form_email") WebElement mailFld;
    @FindBy(css = "#Form_phone") WebElement phoneFld;
    @FindBy(css = "#Form_site") WebElement siteFld;
    @FindBy(css = "#Form_city") WebElement cityFld;
    @FindBy(css = "#Form_country") WebElement countryFld;
    @FindBy(css = "#speaker_form>#submit_phone") WebElement buttontHeader;
    @FindBy(css = "#fancybox-close") WebElement acceptClose;


    public ConferencePage(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_TITLE = "Программа конференции RACE EXPO 2015";
        this.PAGE_URL = "http://race-expo.ru/ru/conference/";
    }
    public void loadRACE() {
        loadPage();
    }
    public void testAboutConfBlock() {
        verifyElementIsContainText(aboutHeader, "О КОНФЕРЕНЦИИ");
        checkSimpleBlockContent("//section[@class=\"text-editor\"]/p[2]/span");
        }
    public void testFormBespeakerNegative() throws Exception {
        negativeTestForm(nameFld,buttontHeader,acceptClose,false);
        negativeTestForm(lastNameFld,buttontHeader,acceptClose,false);
        negativeTestForm(companyFld,buttontHeader,acceptClose,false);
        negativeTestForm(postFld,buttontHeader,acceptClose,false);
        negativeTestForm(mailFld,buttontHeader,acceptClose,false);
        negativeTestForm(phoneFld,buttontHeader,acceptClose,false);
        negativeTestForm(siteFld,buttontHeader,acceptClose,false);
        negativeTestForm(cityFld,buttontHeader,acceptClose,false);
        negativeTestForm(countryFld,buttontHeader,acceptClose,false);
        negativeTestForm(nameFld,buttontHeader,acceptClose,true);
    }
    public void testFormSpeacerPositive() throws Exception {
        setElementText(nameFld);
        setElementText(lastNameFld);
        setElementText(companyFld);
        setElementText(postFld);
        setEmailAdress(mailFld);
        setElementText(siteFld);
        setElementText(cityFld);
        setElementText(countryFld);
        setMobileNumber(phoneFld);
        clickOnElement(buttontHeader);
        verifyElementIsPresent(acceptClose);
        clickOnElement(acceptClose);
        checkEmail();
    }
}
