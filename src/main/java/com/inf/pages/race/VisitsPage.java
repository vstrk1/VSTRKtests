package com.inf.pages.race;
import com.inf.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 16.07.2015.
 */
public class VisitsPage extends BasePage {
    @FindBy(css = ".text-editor>h1") WebElement headerVisitors;
    @FindBy(css = ".text-editor>p>span>img") WebElement planImg;
    @FindBy(css = ".download") WebElement dwn;

    public VisitsPage (WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_TITLE ="Информация для посетителей Race Expo 2015";
        this.PAGE_URL = "http://race-expo.ru/ru/visit/";
    }
    public void loadRace() {
        loadPage();
    }
    public void testVisitsContent(){
        verifyElementIsContainText(headerVisitors, "ПОСЕТИТЕЛЯМ");
        checkSimpleBlockContent("//section[@class=\"text-editor\"]/ol/li");
        checkSimpleBlockContent("//section[@class=\"text-editor\"]/ul[1]/li");
        checkSimpleBlockContent("//section[@class=\"text-editor\"]/ul[2]/li");
        verifyElementIsHaveLink(dwn, "http://race-expo.ru/docx/Public_offer_for_sale_of_tickets_ru.docx");
        verifyElementIsContainText(dwn, "Договор публичной оферты на продажу билетов");
    }
}
