package com.inf.pages.race;
import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 20.07.2015.
 */
public class ConstantElements extends BasePage {
    //MOBILE BUTTONS
    @FindBy(xpath = "//div[@class='mobile-buttons']/a[1]") WebElement androidButton;
    @FindBy(xpath = "//div[@class='mobile-buttons']/a[2]") WebElement appleButton;
    @FindBy(xpath = "//div[@class='social-buttons']/a[1]") WebElement googleButton;
    @FindBy(xpath = "//div[@class='social-buttons']/a[2]") WebElement twitterButton;
    @FindBy(xpath = "//div[@class='social-buttons']/a[3]") WebElement vkButton;
    @FindBy(xpath = "//div[@class='social-buttons']/a[4]") WebElement fbButton;
    @FindBy(xpath = "//div[@class='social-buttons']/a[5]") WebElement linkedButton;
    //CONTACT FORM
    @FindBy(css = ".contact>#phone>#PhoneModel_phone") WebElement contactNumber;
    @FindBy(css = ".contact>#phone>#PhoneModel_name") WebElement contactName;
    @FindBy(css = ".contact>#phone>#submit_phone") WebElement contactButton;
    //FUTER FORM
    @FindBy(css = "#subscribeForm_futer>.row>#SubscribeForm_name") WebElement nameFuter;
    @FindBy(css = "#subscribeForm_futer>.row>#SubscribeForm_email") WebElement emailFuter;
    @FindBy(css = "#subscribeForm_futer>.row>#submitSubscribe") WebElement buttonFuter;
    //ACCEPT CLOSE
    @FindBy(css = "#fancybox-close") WebElement acceptClose;

    public ConstantElements(WebDriver driver) throws Exception {
        super(driver);
    }

    public void socialBt(){
        verifyElementIsHaveLink(androidButton,"https://play.google.com/store/apps/details?id=ru.smileexpo.visitor&feature=search_result#?t=W251bGwsMSwxLDEsInJ1LnNtaWxlZXhwby52aXNpdG9yIl0");
        verifyElementIsHaveLink(appleButton,  "https://itunes.apple.com/ru/app/smile-events/id793090621?mt=8");
        verifyElementIsHaveLink(googleButton, "https://plus.google.com/u/0/102771091992787927913");
        verifyElementIsHaveLink(twitterButton, "https://twitter.com/RaceExpo");
        verifyElementIsHaveLink(vkButton, "https://vk.com/raceexpo");
        verifyElementIsHaveLink(fbButton, "https://www.facebook.com/RACEExpo");
        verifyElementIsHaveLink(linkedButton,"https://ru.linkedin.com/in/raceexpo/en");
    }

    public void contactFormN() throws Exception {
        negativeTestForm(contactName,contactButton,acceptClose,true);
        negativeTestForm(contactName,contactButton,acceptClose,false);
        negativeTestForm(contactNumber,contactButton,acceptClose,false);

    }
    public void contactFormP() throws Exception {
        setElementText(contactName);
        setMobileNumber(contactNumber);
        clickOnElement(contactButton);
        clickOnElement(acceptClose);
        checkEmail();
    }
    public void futerSubscribeN() throws Exception {
        negativeTestForm(nameFuter,buttonFuter,acceptClose,false);
        negativeTestForm(emailFuter,buttonFuter,acceptClose,false);
        negativeTestForm(nameFuter,buttonFuter,acceptClose,true);

    }
    public void futerSubscribeP() throws Exception {
        setElementText(nameFuter);
        setEmailAdress(emailFuter);
        clickOnElement(buttonFuter);
        clickOnElement(acceptClose);
        checkEmail();
    }

}
