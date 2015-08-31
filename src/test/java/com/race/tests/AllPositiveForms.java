package com.race.tests;

import com.inf.pages.race.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllPositiveForms {
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




    @Test
    public void testALLFormsPositive() throws Exception {
        mmPage.loadRACE();
        mmPage.testFormSubscrPositive();
        mmPage.testPhonePositive();
        c.contactFormP();
        c.futerSubscribeP();
        cfPage.loadRACE();
        cfPage.testFormSpeacerPositive();
        c.contactFormP();
        c.futerSubscribeP();
        exPage.loadRace();
        c.futerSubscribeP();
        spPage.loadRace();
        spPage.fP();
        c.contactFormP();
        c.futerSubscribeP();
        vsPage.loadRace();
        c.contactFormP();
        c.futerSubscribeP();
        mdPage.loadRace();
        mdPage.testMediaPositive();
        c.contactFormP();
        c.futerSubscribeP();
        nwPage.loadRace();
        nwPage.fP();
        c.contactFormP();
        c.futerSubscribeP();
        csPage.loadRace();
        csPage.contactFormP();
        c.futerSubscribeP();
        exTsPage.loadRace();
        exTsPage.fp();
        c.contactFormP();
        c.futerSubscribeP();
        prPage.loadRace();
        prPage.fp();
        c.contactFormP();
        c.futerSubscribeP();
        rsPage.loadRace();
        spiPage.loadRace();
        spiPage.fp();
        c.futerSubscribeP();
    }
}
