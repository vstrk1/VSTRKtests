package com.inf.pages.race;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 15.07.2015.
 */
public class SponsorsPage extends BasePage {
    ConstantElements csE;
    @FindBy (css = ".text-editor>h1") WebElement sponsorInfoHeader;
    @FindBy (css = ".download") WebElement sponsorsPackLink;
    @FindBy (css = ".sponsors>h2") WebElement sponshorsHeader;
    @FindBy (css = ".sponsor>div>a") WebElement sponshorSimple;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[1]/input[@id=\"Form_name\"]") WebElement beSponsorName;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[2]/input[@id=\"Form_last_name\"]") WebElement beSponsorLastName;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[3]/input[@id=\"Form_company\"]") WebElement beSponsorCompany;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[4]/input[@id=\"Form_post\"]") WebElement beSponsorPost;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[5]/input[@id=\"Form_email\"]") WebElement beSponsorEmail;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[6]/input[@id=\"Form_phone\"]") WebElement beSponsorPhone;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[7]/input[@id=\"Form_site\"]") WebElement beSponsorSite;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[8]/input[@id=\"Form_city\"]") WebElement beSponsorCity;
    @FindBy (xpath = "//form[@id='sponsor_form']/div[9]/input[@id=\"Form_country\"]") WebElement beSponsorCountry;
    @FindBy (xpath = "//div[@class=\"selectricWrapper selectric-white\"]/div[@class=\"selectric\"]/b") WebElement openDropDown;
    @FindBy (xpath = "//div[@class=\"selectricItems\"]/ul/li[contains(.,'Платиновый спонсор')]") WebElement bePLATINIUMSponsor;

    @FindBy (css = "#sponsor_form>#submit_phone") WebElement buttonSponsor;
    @FindBy(css = "#fancybox-close") WebElement acceptClose;


    public SponsorsPage (WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_TITLE ="Спонсорство Race Expo 2015 - ключевое событие для вашего бизнеса в 2015 году.";
        this.PAGE_URL = "http://race-expo.ru/ru/sponsors/";
    }
    public void loadRace() {
        loadPage();
    }
    public void cntnt() throws Exception {
        verifyElementIsContainText(sponsorInfoHeader, "СПОНСОРАМ");
        checkSimpleBlockContent("//section[@class=\"text-editor\"]/p[2]/span/span/span");
        checkSimpleBlockContent("//section[@class=\"text-editor\"]/p[3]/span/span/br");
        verifyElementIsHaveLink(sponsorsPackLink, "http://race-expo.ru/pdf/packages_ru.pdf");
        verifyElementIsContainText(sponshorsHeader, "СПОНСОРЫ");
        verifyElementIsHaveLink(sponshorSimple, "http://www.mobvista.com/");
    }
    public void fN() throws Exception {
        negativeTestForm(beSponsorName,buttonSponsor,acceptClose,true);
        negativeTestForm(beSponsorName,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorLastName,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorCompany,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorPost,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorEmail,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorPhone,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorSite,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorCity,buttonSponsor,acceptClose,false);
        negativeTestForm(beSponsorCountry,buttonSponsor,acceptClose,false);
    }

    public void fP() throws Exception {
        setElementText(beSponsorName);
        setElementText(beSponsorLastName);
        setElementText(beSponsorCompany);
        setElementText(beSponsorPost);
        setEmailAdress(beSponsorEmail);
        setMobileNumber(beSponsorPhone);
        setElementText(beSponsorSite);
        setElementText(beSponsorCountry);
        setElementText(beSponsorCity);
        clickOnElement(openDropDown);
        clickOnElement(bePLATINIUMSponsor);
        clickOnElement(buttonSponsor);
        clickOnElement(acceptClose);
        checkEmail();


    }



}
