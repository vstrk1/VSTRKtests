package com.inf;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NegativeForm extends BasePage  {


    public  NegativeForm( WebDriver driver, WebElement one, WebElement button, WebElement acceptMessage) throws Exception {   //тест на однострочную форму
        super(driver);
        try{
            verifyElementIsPresent(one);                                            //Проверяем поле
            sendAndAssertNegativeTest(button, acceptMessage);                       //Отправка сообщения без данных
        }catch (ElementNotFoundException e) {e.printStackTrace();}                  //Еррор если чтото пошло не так

        try {
            verifyElementIsPresent(one);
            if (one.getAttribute("name").contains("phone")) {
                setElementText(one);
                sendAndAssertNegativeTest(button, acceptMessage);
                one.clear();
            }
            if (one.getAttribute("name").contains("email")){
               setMobileNumber(one);
               sendAndAssertNegativeTest(button, acceptMessage);
               one.clear();
            }
        }catch (ElementNotVisibleException e){
            e.printStackTrace();
        }

    }


    public void sendAndAssertNegativeTest(WebElement button, WebElement acceptMessage)  {
        //wait.until(ExpectedConditions.elementToBeClickable(button));
        for(int i =1 ; i<5; i++){
            clickOnElement(button);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(!acceptMessage.isDisplayed());
        System.out.println("Negative test is passed");
    }




}
