package com.inf.pages.race;
import com.inf.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class MainPage extends BasePage {
    @FindBy(xpath = "//div[@class=\"top-menu\"]/nav/ul/li[1]/a") WebElement mainPageGenButton;
    @FindBy(css = ".main>.info>p") WebElement mainInfo;
    @FindBy(css = ".aside>#subscribeForm>.row>#SubscribeForm_name") WebElement nameSubscr;
    @FindBy(css = ".aside>#subscribeForm>.row>#SubscribeForm_email") WebElement mailSubscr;
    @FindBy(css = ".aside>#subscribeForm>.row>#submitSubscribe") WebElement buttonSubcr;
    @FindBy(css = " #fancybox-close") WebElement popUpClose;
    @FindBy(css = "#PhoneHeader_phone") WebElement phoneCallme;
    @FindBy(css = " #phone_header>.row>#submit_phone") WebElement buttonPhoneCallme;
    @FindBy(css = ".info>.button.button-grey") WebElement buttonRegistration;
    @FindBy(css = ".prev>a") WebElement backButton;
    @FindBy(css = ".next>a") WebElement nextButton;
    @FindBy(css = ".main-page.news-page>h2") WebElement newsHeader;
    @FindBy(css = ".news-wrapper") WebElement newsContent;
    @FindBy(css = "#wrapper_mbYTP_my-video>iframe") WebElement videoFromYoutube;
    //ссылки на участие
    @FindBy(css = ".main-page.show-u-page>section>a[href^=\"/ru/partners/\"]") WebElement bePartner;
    @FindBy(css = ".main-page.show-u-page>section>a[href^=\"/ru/exponents/\"]") WebElement beExpo;
    @FindBy(css = ".main-page.show-u-page>section>a[href^=\"/ru/speakers/\"]") WebElement beSpeaker;
    @FindBy(css = ".main-page.show-u-page>section>a[href^=\"/ru/media/\"]") WebElement acreditation;
    //футер
    @FindBy(css = ".sponsors") WebElement sponsorsblock;
    @FindBy(css = ".sponsor") WebElement sponsors;
    @FindBy(css = ".sponsors-slider.small") WebElement helpers;
    @FindBy(css = ".main-page.sponsors-page>.sponsors-slider>.slider.slider-2>ul>li>a") WebElement infoSponsors;
    @FindBy(css = ".buttons-wrapper") WebElement fotterButtons;

    public MainPage(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_TITLE ="Выставка партнерских программ и маркетинга Race Expo 2015. Партнерские программы и маркетинг.";
        this.PAGE_URL = "http://www.raceexpo.ru";
    }
    public void loadRACE(){
        loadPage();
    }
    public void checkGenButton() {
        verifyElementIsContainText(mainPageGenButton, "Главная");
        verifyElementIsContainText(mainInfo, "RACE является признанной платформой для встречи владельцев партнерских программ и аффилиат-партнеров, рекламодателей и представителей рекламных площадок, участников интернет-маркетинга и специалистов в области электронной коммерции.");
    }

    public void testFormSubscrPositive() throws Exception {
        verifyElementIsPresent(nameSubscr);
        setElementText(nameSubscr);
        verifyElementIsPresent(mailSubscr);
        setEmailAdress(mailSubscr);
        verifyElementIsPresent(buttonSubcr);
        clickOnElement(buttonSubcr);
        clickOnElement(popUpClose);
        checkEmail();
    }
    public void testsFormNegatives() throws Exception {
        negativeTestForm(mailSubscr, buttonSubcr, popUpClose, true);
        negativeTestForm(mailSubscr, buttonSubcr, popUpClose, false);
        negativeTestForm(nameSubscr, buttonSubcr, popUpClose, false);


    }

    public void testPhonePositive() throws Exception {
        verifyElementIsPresent(phoneCallme);
        setMobileNumber(phoneCallme);
        verifyElementIsPresent(buttonPhoneCallme);
        clickOnElement(buttonPhoneCallme);
        clickOnElement(popUpClose);
    }
    public void testsPhoneNegative() throws Exception {
        verifyElementIsPresent(phoneCallme);
        clickOnElement(buttonPhoneCallme);
        phoneCallme.clear();
        negativeTestForm(phoneCallme, buttonPhoneCallme, popUpClose, true);    //эта пиздота не работает на пару с нижней
        phoneCallme.clear();
        negativeTestForm(phoneCallme, buttonPhoneCallme, popUpClose, false); //вот этой бля . РАЗБЕР�?СЬ С ЭТ�?М В ПН !!
    }

    public void testsMainPageButtos(){
        verifyElementIsContainSmth(buttonRegistration,"href","/ru/registration/");
        verifyElementIsContainSmth(backButton,"href","#");
        clickOnElement(backButton);
        verifyElementIsContainSmth(nextButton, "href", "#");
        clickOnElement(nextButton);
        verifyElementIsPresent(fotterButtons);
    }
    public  void  testNews(){
        verifyElementIsPresent(newsHeader);
        Assert.assertEquals(newsHeader.getText(), "НОВОСТИ");
        Assert.assertTrue(!newsContent.getText().isEmpty());
    }
    public  void testAvailableYoutubeVideo() {
        verifyElementIsContainSmth(videoFromYoutube, "src", "http://www.youtube.com/embed/");
    }
    public void testLinksForUsers(){
        verifyElementIsHaveLink(bePartner,"http://www.raceexpo.ru/ru/partners/");
        verifyElementIsHaveLink(beExpo,"http://www.raceexpo.ru/ru/exponents/");
        verifyElementIsHaveLink(beSpeaker,"http://www.raceexpo.ru/ru/speakers/");
        verifyElementIsHaveLink(acreditation, "http://www.raceexpo.ru/ru/media/");
    }

    public void testSponsors(){
        verifyElementIsContainText(sponsorsblock, "СПОНСОРЫ");
        verifyElementIsPresent(sponsors);
        Assert.assertTrue(!sponsors.findElements(By.cssSelector(".sponsor>div")).isEmpty());
    }
    public void testHelpers(){
        verifyElementIsContainText(helpers, "ПРИ ПОДДЕРЖКЕ");
        Assert.assertTrue(!helpers.findElements(By.cssSelector(".slider.slider-1>ul>li>a")).isEmpty());
    }

    public void testInfoSponsors(){
        verifyElementIsPresent(infoSponsors);
    }

}
