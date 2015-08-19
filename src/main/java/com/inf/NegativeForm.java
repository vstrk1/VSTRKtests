package com.inf;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

/**
 * Created by v.stuparenko on 05.08.2015.
 */
public class NegativeForm extends BasePage  {



    public NegativeForm( WebDriver driver, WebElement one, WebElement two, WebElement button, WebElement acceptmMessage, Boolean blanc) throws Exception {
        super(driver);
    }

    public NegativeForm(WebDriver driver, WebElement element) throws  Exception{
        super(driver);

    }
    public  NegativeForm( WebDriver driver, WebElement one, WebElement button, WebElement acceptMessage) throws Exception {   //тест на однострочную форму
        super(driver);

            try{
            verifyElementIsPresent(one);     //Проверяем поле
            sendAndAssertNegativeTest(button, acceptMessage);
            }catch (ElementNotFoundException e) {
                e.printStackTrace();
            }

                // кликаем и ждем месседж
            try {
                verifyElementIsPresent(one);
                if (one.getAttribute("name").contains("email")) {
                    setEmailAdress(one);
                    sendAndAssertNegativeTest(button, acceptMessage);
                    one.clear();
                } else {
                    setElementText(one);
                    sendAndAssertNegativeTest(button, acceptMessage);
                    one.clear();


                    //  public void sendAndAssertNegativeTest(WebElement button, WebElement acceptMessage)  {
                    wait.until(ExpectedConditions.elementToBeClickable(button));
                    clickOnElement(button);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Assert.assertTrue(!acceptMessage.isDisplayed());
                    System.out.println("Negative test is passed");

                }
            }catch(ElementNotFoundException e){
            e.printStackTrace();}
    }}
