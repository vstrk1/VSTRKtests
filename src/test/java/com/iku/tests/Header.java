package com.iku.tests;

import com.inf.data.DataPages;
import com.inf.pages.iku.ConstantElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Header  {
    public WebDriver driver;
    ConstantElements ce;
    //DriverFactory.BrowserType type = CHROME;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        this.driver = new ChromeDriver();

        //FirefoxProfile fp = new FirefoxProfile();
        //fp.setPreference("webdriver.load.strategy", "unstable"); // use 'fast'
        //this.driver = new FirefoxDriver(fp);
     //   this.driver = DriverFactory.getDriver(type);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        ce = PageFactory.initElements(driver, ConstantElements.class);
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

   /* @Test(dataProviderClass = DriverFactory.class , dataProvider = "getDriver")
        public void loadPageInBrowsers(@Optional("chrome") String browserType){
        ce.PAGES();
        System.out.println(browserType);
    }*/

    @Test(dataProviderClass = DataPages.class, dataProvider = "pages")
    public void testHeader(String url, String title){
    ce.load(url, title);
    ce.checkFirstHeader();
    }
}
