package com.inf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;

public class NegativeForm extends BasePage {
   static int countNF = 1;

    public  NegativeForm( WebDriver driver , WebElement one, WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);

        verifyElementIsPresent(one);
        sendAndAssertNegativeTest(button, acceptMessage);

        if(one.getAttribute("name").contains("phone")) {
            setElementText(one);
            sendAndAssertNegativeTest(button, acceptMessage);
            one.clear();}

        else if(one.getAttribute("name").contains("email")){
            setElementText(one);
            sendAndAssertNegativeTest(button, acceptMessage);
            one.clear();}
        else System.out.println("The element " + one + "is not have attribute!");
        Robot r = new Robot();
        
    }

    public NegativeForm(WebDriver driver, WebElement one, WebElement two, WebElement button, WebElement acceptMessage) throws  Exception{
        super(driver);

            verifyElementIsPresent(one);
            verifyElementIsPresent(two);                                                    //Пустая форма
            sendAndAssertNegativeTest(button, acceptMessage);


            if (one.getAttribute("name").contains("phone") ){
                setElementText(one);
                setElementText(two);
                sendAndAssertNegativeTest(button,acceptMessage);
                one.clear();
                two.clear();}

            else if (one.getAttribute("name").contains("email")){
                setElementText(two);
                setMobileNumber(one);
                sendAndAssertNegativeTest(button,acceptMessage);
                one.clear();
                two.clear();}

            else if(two.getAttribute("name").contains("phone") ){
            setElementText(one);
            setElementText(two);
            sendAndAssertNegativeTest(button,acceptMessage);
                one.clear();
                two.clear();}

            else if (two.getAttribute("name").contains("email")){
            setElementText(one);
            setElementText(two);
            sendAndAssertNegativeTest(button, acceptMessage);
            one.clear();
            two.clear();}

            setElementText(one);
            sendAndAssertNegativeTest(button, acceptMessage);
            one.clear();
            setElementText(two);
            sendAndAssertNegativeTest(button,acceptMessage);
            two.clear();
    }




    public void sendAndAssertNegativeTest(WebElement button, WebElement acceptMessage) {

        wait.until(ExpectedConditions.elementToBeClickable(button));
        for(int i=1; i<5; i++) {
            clickOnElement(button);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        Assert.assertTrue(!acceptMessage.isDisplayed(), "\n" + "Negative test # " + countNF + " is failed - form sent");
        System.out.println("Negative test # " + countNF + " is passed");
        countNF++;
    }
}
