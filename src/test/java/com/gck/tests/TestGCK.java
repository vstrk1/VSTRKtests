package com.gck.tests;

import com.inf.pages.gameconkz.GeneralPage;
import com.inf.pages.gameconkz.StrongElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGCK {
    public WebDriver driver;
    GeneralPage gPage;
    StrongElements s;

    @BeforeClass
    public void setup() {
        this.driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        s = PageFactory.initElements(driver, StrongElements.class);
        gPage = PageFactory.initElements(driver, GeneralPage.class);
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }

    public void tC() throws Exception {
    s.firstheadercheck();
    s.secondheadercheck();
    s.checkGenSponsor();
    s.checkBuyTc();
    s.aboutCuratorTest();
    s.organizator();
    //s.testFormSubscribeN();
    s.testFormSubscribeP();
    }

    @Test
    public void testGeneralPage() throws Exception {
        gPage.lp();
        tC();
    }
}
