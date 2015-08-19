package com.race.tests;

import com.inf.pages.race.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContentAndNForms {
    public WebDriver driver;
    MainPage mmPage;
    ConferencePage cfPage;
    ExpoPage exPage;
    SponsorsPage spPage;
    VisitsPage vsPage;
    MediaPage mdPage;
    NewsPage nwPage;
    ConstantElements c;
    ContactsPage csPage;
    ExponentsPage exTsPage;
    PartnersPage prPage;
    ResultsPage rsPage;
    SpeakerPage spiPage;

    @BeforeClass(alwaysRun = true)
    public void setup(){
        FirefoxProfile fp = new FirefoxProfile();
        fp.setPreference("webdriver.load.strategy", "unstable"); // use 'fast'
        this.driver = new FirefoxDriver(fp);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        mmPage = PageFactory.initElements(driver, MainPage.class);
        cfPage = PageFactory.initElements(driver,ConferencePage.class);
        exPage = PageFactory.initElements(driver,ExpoPage.class);
        spPage = PageFactory.initElements(driver,SponsorsPage.class);
        vsPage = PageFactory.initElements(driver,VisitsPage.class);
        mdPage = PageFactory.initElements(driver,MediaPage.class);
        csPage = PageFactory.initElements(driver,ContactsPage.class);
        exTsPage = PageFactory.initElements(driver,ExponentsPage.class);
        prPage = PageFactory.initElements(driver,PartnersPage.class);
        rsPage = PageFactory.initElements(driver,ResultsPage.class);
        spiPage = PageFactory.initElements(driver,SpeakerPage.class);
        nwPage = PageFactory.initElements(driver,NewsPage.class);
        c = PageFactory.initElements(driver,ConstantElements.class);

    }
    @AfterClass(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }

    @Test(groups = "thread1")
    public void testGeneralPage() throws Exception{
        mmPage.loadRACE();
        mmPage.checkGenButton();
        mmPage.testsFormNegatives();
        mmPage.testsPhoneNegative();
        mmPage.testsMainPageButtos();
        mmPage.testNews();
        mmPage.testAvailableYoutubeVideo();
        mmPage.testLinksForUsers();
        mmPage.testSponsors();
        mmPage.testHelpers();
        mmPage.testInfoSponsors();
        c.contactFormN();
        c.futerSubscribeN();
    }

    @Test(groups = "thread1")
    public void testConferencePage() throws Exception{
        cfPage.loadRACE();
        cfPage.testAboutConfBlock();
        cfPage.testFormBespeakerNegative();
        c.socialBt();
        c.contactFormN();
        c.futerSubscribeN();
    }
    @Test(groups = "thread2")
    public  void testExpoPage() throws Exception {
        exPage.loadRace();
        exPage.testAboutExpoBlock();
        exPage.testExponentsBlock();
        exPage.testPlanBlock();
        c.socialBt();
        c.futerSubscribeN();
    }
    @Test(groups = "thread2")
    public void testSponsorsPage() throws Exception {
        spPage.loadRace();
        spPage.cntnt();
        c.socialBt();
        spPage.fN();
        c.contactFormN();
        c.futerSubscribeN();
    }
    @Test(groups = "thread3")
    public void testVisitsPage() throws Exception {
        vsPage.loadRace();
        vsPage.testVisitsContent();
        c.socialBt();
        c.contactFormN();
        c.futerSubscribeN();
    }
    @Test(groups = "thread3")
    public void testMediaPage() throws Exception {
        mdPage.loadRace();
        mdPage.testContent();
        mdPage.testMediaNegative();
        c.socialBt();
        c.contactFormN();
        c.futerSubscribeN();
    }
    @Test(groups = "thread4")
    public void testNewsPage() throws Exception {
        nwPage.loadRace();
        nwPage.contnt();
        nwPage.fN();
        c.socialBt();
        c.contactFormN();
        c.futerSubscribeN();
    }
    @Test(groups = "thread4")
    public void testContactsPage() throws Exception {
        csPage.loadRace();
        csPage.contactFormN();
        c.socialBt();
        c.futerSubscribeN();
    }
    @Test(groups = "thread5")
    public void testExponentsPage() throws Exception {
        exTsPage.loadRace();
        exTsPage.fn();
        c.socialBt();
        c.contactFormN();
        c.futerSubscribeN();
    }
    @Test(groups = "thread5")
    public void testPartnersPage() throws Exception {   //работает
        prPage.loadRace();
        prPage.cntnt();
        prPage.fn();
        c.socialBt();
        c.contactFormN();
        c.futerSubscribeN();
    }
    @Test(groups = "thread6")
    public void testResultsPage() throws Exception {    //работает
        rsPage.loadRace();
        rsPage.cntnt();
        c.socialBt();
        c.futerSubscribeN();
    }
    @Test(groups = "thread6")
    public void testSpeakerPage() throws Exception {
        spiPage.loadRace();
        spiPage.cntnt();
        spiPage.fn();
        c.socialBt();
        c.futerSubscribeN();
    }


    @Test
    public void ttttttttt() throws  Exception{
        mmPage.loadRACE();
        mmPage.expampleOneField();
    }





}