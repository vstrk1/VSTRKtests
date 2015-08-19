package com.inf.pages.race;
import com.inf.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by v.stuparenko on 13.07.2015.
 */
public class ExpoPage  extends BasePage {
    @FindBy (xpath = "//section[@class=\"text-editor\"]/h1") WebElement aboutExpohHeader;
    @FindBy (css = "#speaks>h2") WebElement exponentsh2;
    @FindBy (css = "#speaks>.participant.add") WebElement exponentshButton;
    @FindBy (xpath = "//section[@id='speaks']/a[2]/div") WebElement someExponent;
    @FindBy(css = ".close-modal") WebElement acceptClose;
    @FindBy(css = ".button.button-grey.dark") WebElement buttonPlan;
    @FindBy(css = ".plan>img") WebElement imagePlan;

    public ExpoPage(WebDriver driver) throws Exception{
        super(driver);
        this.PAGE_URL = "http://race-expo.ru/ru/expo/";
        this.PAGE_TITLE = "Выставка партнерских программ и маркетинга Race Expo 2015. Правила участия для экспонентов.";
    }
    public void loadRace() {
        loadPage();

    }
    public void testAboutExpoBlock(){
        verifyElementIsContainText(aboutExpohHeader, "О ВЫСТАВКЕ");
        List<WebElement> parentsElements = driver.findElements(By.xpath("//section[@class=\"text-editor\"]/p"));            //создаем лист из матерей
        System.out.println("Общее количество матерей - " + parentsElements.size());                                        //показываем в консоли кол-во матерей
        for (int k =1; k<=parentsElements.size(); k++) { //ЦИКЛ В 5 РАЗ {
            List<WebElement> useParentElement = driver.findElements(By.xpath("//section[@class=\"text-editor\"]/p["+k+"]/span")); //НАХОДИМ ПЕРВУЮ МАМАШУ
            System.out.println("Количество дочерних элементов в данном элементе - " + useParentElement.size());
                        for (int i = 0; i < useParentElement.size(); i++) {
                            verifyElementIsPresent(useParentElement.get(i));
                            }
        }
    }
    public void testExponentsBlock(){
        verifyElementIsContainText(exponentsh2, "УЧАСТНИКИ");
        verifyElementIsHaveLink(exponentshButton,"http://race-expo.ru/ru/exponents/");
        verifyElementIsPresent(someExponent);
        clickOnElement(someExponent);
        clickOnElement(acceptClose);
    }
    public void testPlanBlock(){

            verifyElementIsHaveLink(buttonPlan, "http://race-expo.ru/images/plan-of-hall_ru.png");
            verifyElementIsContainText(buttonPlan, "СКАЧАТЬ ПЛАН");
            verifyElementIsPresent(imagePlan) ;
            verifyElementIsContainSmth(imagePlan,"src","http://race-expo.ru/images/plan-of-hall_ru.png");
    }
}
