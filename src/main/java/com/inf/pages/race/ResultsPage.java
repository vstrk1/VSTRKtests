package com.inf.pages.race;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 20.07.2015.
 */
public class ResultsPage extends BasePage {
    @FindBy(css = ".open>h2") WebElement header;
    @FindBy(xpath = "//article[@class=\"results-page\"]/section[2]/h2") WebElement results2;
    @FindBy(xpath = "//article[@class=\"results-page\"]/section[3]/h2") WebElement results3;


    public ResultsPage(WebDriver driver) throws Exception{
        super(driver);
        this.PAGE_URL = "http://race-expo.ru/ru/results/";
        this.PAGE_TITLE = "Итоги - Race expo";
    }
    public void loadRace(){
        loadPage();
    }
    public void cntnt(){
        verifyElementIsContainText(header,"ИТОГИ-2014");
        checkSimpleBlockContent("//section[@class=\"open\"]/ul/li");
        verifyElementIsContainText(results2,"ИТОГИ-2013");
        clickOnElement(results2);
        checkSimpleBlockContent("//article[@class=\"results-page\"]/section[2]/ul/li");
        verifyElementIsContainText(results3,"ИТОГИ-2012");
        clickOnElement(results3);
        checkSimpleBlockContent("//article[@class=\"results-page\"]/section[3]/ul/li");
    }
}
