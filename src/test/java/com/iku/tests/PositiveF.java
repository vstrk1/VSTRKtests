package com.iku.tests;

import com.inf.pages.iku.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PositiveF {
    public WebDriver driver;
    Program programPage;
    General generalPage;
    Speakers speakerPage;
    News newsPage;
    Place placePage;
    Contacts contactsPage;
    tobeSpeaker tbSpeakerPage;
    tobeSponsor tbSponsorPage;
    tobePartner tbPartnerPage;
    tobeMedia tbMediaPage;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        generalPage = PageFactory.initElements(driver, General.class);
        programPage = PageFactory.initElements(driver, Program.class);
        speakerPage = PageFactory.initElements(driver, Speakers.class);
        newsPage = PageFactory.initElements(driver, News.class);
        placePage = PageFactory.initElements(driver, Place.class);
        contactsPage = PageFactory.initElements(driver,Contacts.class);
        tbSpeakerPage = PageFactory.initElements(driver,tobeSpeaker.class);
        tbSponsorPage = PageFactory.initElements(driver,tobeSponsor.class);
        tbPartnerPage = PageFactory.initElements(driver,tobePartner.class);
        tbMediaPage = PageFactory.initElements(driver,tobeMedia.class);
    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
    @Test
    public void testForms() throws Exception{

    }
}
