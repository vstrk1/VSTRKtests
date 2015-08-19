package com.inf.pages.gameconkz;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 29.07.2015.
 */
public class StrongElements extends BasePage {
    //Links and numbers first header
        @FindBy(xpath = "//div[@class=\"clearfix\"]/div[1]/a") WebElement smileLink;
        @FindBy(xpath = "//div[@class=\"clearfix\"]/div[2]/a") WebElement firstNumber;
        @FindBy(xpath = "//div[@class=\"clearfix\"]/div[3]/a") WebElement secondNumber;
        @FindBy(xpath = "//div[@class=\"clearfix\"]/div[4]/a") WebElement language;
    //Button social
        @FindBy(xpath = "//div[@class=\"clearfix\"]/div[5]/ul/li[1]/a") WebElement vk;
        @FindBy(xpath = "//div[@class=\"clearfix\"]/div[5]/ul/li[2]/a") WebElement ggl;
        @FindBy(xpath = "//div[@class=\"clearfix\"]/div[5]/ul/li[3]/a") WebElement fb;
    //Links second header
        @FindBy(xpath = "//ul[@id=\"w0\"]/li[1]/a") WebElement generalLink;
        @FindBy(xpath = "//ul[@id=\"w0\"]/li[2]/a") WebElement programLink;
        @FindBy(xpath = "//ul[@id=\"w0\"]/li[3]/a") WebElement demoZLink;
        @FindBy(xpath = "//ul[@id=\"w0\"]/li[4]/a") WebElement businesTLink;
        @FindBy(xpath = "//ul[@id=\"w0\"]/li[5]/a") WebElement byeTicLink;
        @FindBy(xpath = "//ul[@id=\"w0\"]/li[6]/a") WebElement newLink;
        @FindBy(xpath = "//ul[@id=\"w0\"]/li[7]/a") WebElement contactsLink;
    //General sponsor
        @FindBy(xpath = "//body/a") WebElement sponsor;
        @FindBy(xpath = "//body/a/img[2]") WebElement CornerSponsor;
    //Button ticket
        @FindBy(xpath = "//footer/div/div[1]/a") WebElement buttonTicket;
    //FOOTER
        //AboutCuratorInfo
            @FindBy(xpath = "//footer//div[@class=\"row\"]/div/img") WebElement imgCurator;
            @FindBy(xpath = "//div[@class=\"footer-title-1\"]") WebElement LM;
            @FindBy(xpath = "//div[@class=\"footer-section\"]/div/a[@href=\"tel:+74952121128\"]") WebElement mob;
            @FindBy(xpath = "//div[@class=\"footer-section\"]/div[3]/a") WebElement email;
            @FindBy(xpath = "//div[@class=\"footer-section\"]/div[4]/a") WebElement skype;
        //Smile-expo
            @FindBy(xpath = "//div[@class=\"footer-section\"]/div[@class=\"footer-title-2\"]") WebElement smilexpo;
            @FindBy(xpath = "//div[@class=\"footer-section\"]/a") WebElement linkse;
        //Last-news form
            @FindBy(xpath = "//div[@class=\"footer-subscribe-block-widget\"]/div[1]") WebElement headerFormSubscribe;
            @FindBy(xpath = "//div[@class=\"footer-subscribe-block-widget\"]//input[@id=\"formsubscribe-name\"]") WebElement formName;
            @FindBy(xpath = "//div[@class=\"footer-subscribe-block-widget\"]//input[@id=\"formsubscribe-email\"]") WebElement formEmail;
            @FindBy(xpath = "//div[@class=\"footer-subscribe-block-widget\"]//button") WebElement buttonForm;
            @FindBy(css = ".alert.alert-success") WebElement acceptMessage;


    public StrongElements(WebDriver driver) throws Exception {
        super(driver);
    }

    public void firstheadercheck() {
        verifyElementIsHaveLink(smileLink, "http://www.smileexpo.ru/ru/");
        verifyElementIsContainText(smileLink, "Smile-Expo");

        verifyElementIsHaveLink(firstNumber, "tel:+74952121128");
        verifyElementIsContainText(firstNumber, "+7 (495) 212-11-28");

        verifyElementIsHaveLink(secondNumber, "tel:+77172727447");
        verifyElementIsContainText(secondNumber, "+7 (7172) 272-70-90");
        //Assert.assertEquals(secondNumber.getText(), secondNumber.getAttribute("href"));

        verifyElementIsHaveLink(language, "http://gamingcongress.kz/en/");
        verifyElementIsContainText(language, "ENG");

        verifyElementIsHaveLink(vk, "https://vk.com/gamingcongress");
        verifyElementIsHaveLink(ggl, "https://plus.google.com/u/0/113297780995723922141/posts");
        verifyElementIsHaveLink(fb, "https://www.facebook.com/pages/%D0%98%D0%B3%D0%BE%D1%80%D0%BD%D1%8B%D0%B9-%D0%9A%D0%BE%D0%BD%D0%B3%D1%80%D0%B5%D1%81%D1%81-%D0%9A%D0%B0%D0%B7%D0%B0%D1%85%D1%81%D1%82%D0%B0%D0%BD/1610015362565369?fref=ts");
    }

    public void secondheadercheck() {

        verifyElementIsHaveLink(generalLink, "http://gamingcongress.kz/ru");
        verifyElementIsContainText(generalLink, "Главная");

        verifyElementIsHaveLink(programLink, "http://gamingcongress.kz/ru/program");
        verifyElementIsContainText(programLink, "Программа");

        verifyElementIsHaveLink(demoZLink, "http://gamingcongress.kz/ru/Demoarea");
        verifyElementIsContainText(demoZLink, "Демо-Зона");

        verifyElementIsContainText(businesTLink, "Бизнес тур");

        verifyElementIsHaveLink(byeTicLink, "http://gamingcongress.kz/ru/registration");
        verifyElementIsContainText(byeTicLink, "Купить билет");

        verifyElementIsHaveLink(newLink, "http://gamingcongress.kz/ru/news");
        verifyElementIsContainText(newLink, "Новости");

        verifyElementIsHaveLink(contactsLink, "http://gamingcongress.kz/ru/contacts");
        verifyElementIsContainText(contactsLink, "Контакты / Место проведения");
    }

    public void checkGenSponsor() {
        verifyElementIsHaveLink(sponsor, "http://www.parimatch.kz/");
        verifyElementIsContainSmth(CornerSponsor, "src", "http://gamingcongress.kz/img/corner_2.png");
    }

    public void checkBuyTc() {
        verifyElementIsHaveLink(buttonTicket, "http://gamingcongress.kz/ru/registration");
    }

    public void aboutCuratorTest() {
        verifyElementIsPresent(imgCurator);
        verifyElementIsContainText(LM, "Мачуская Людмила");
        verifyElementIsContainText(mob, "+7 (495) 212-11-28");
        verifyElementIsHaveLink(mob, "tel:+74952121128");
        verifyElementIsContainText(email, "l.machuskaya@smileexpo.ru");
        verifyElementIsHaveLink(email, "mailto:l.machuskaya@smileexpo.ru");
        verifyElementIsContainText(skype, "lyudmilam24");
        verifyElementIsHaveLink(skype, "skype:lyudmilam24?call");
    }

    public void organizator() {
        verifyElementIsContainText(smilexpo, "Организатор");
        verifyElementIsHaveLink(linkse, "http://www.smileexpo.ru/ru/");
    }

    public void testFormSubscribeN() throws Exception {
        negativeTestForm(formName, buttonForm, acceptMessage, true);
        negativeTestForm(formName, buttonForm, acceptMessage, false);
        negativeTestForm(formEmail, buttonForm, acceptMessage, false);
    }

    public void testFormSubscribeP() throws Exception {
        verifyElementIsPresent(headerFormSubscribe);
        setElementText(formName);
        setEmailAdress(formEmail);
        clickOnElement(buttonForm);
        verifyElementIsPresent(acceptMessage);
        checkEmail();
    }
}
