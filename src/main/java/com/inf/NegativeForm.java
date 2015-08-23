package com.inf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

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
       // Robot r = new Robot();
        
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

    public NegativeForm (WebDriver driver, WebElement one, WebElement two, WebElement three ,WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);
        verifyElementIsPresent(one);
        verifyElementIsPresent(two);
        verifyElementIsPresent(three);
        sendAndAssertNegativeTest(button, acceptMessage);

        setElementText(one);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();

        setElementText(one);
        setElementText(two);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
    }

    public NegativeForm(WebDriver driver, WebElement one, WebElement two, WebElement three ,WebElement four, WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);
        verifyElementIsPresent(one);
        verifyElementIsPresent(two);
        verifyElementIsPresent(three);
        verifyElementIsPresent(four);
        sendAndAssertNegativeTest(button, acceptMessage);

        setElementText(one);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();

        setElementText(one);
        setElementText(two);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
    }


    public NegativeForm(WebDriver driver, WebElement one, WebElement two, WebElement three ,WebElement four,WebElement five, WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);
        verifyElementIsPresent(one);
        verifyElementIsPresent(two);
        verifyElementIsPresent(three);
        verifyElementIsPresent(four);
        verifyElementIsPresent(five);
        sendAndAssertNegativeTest(button, acceptMessage);

        setElementText(one);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();

        setElementText(one);
        setElementText(two);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
    }

    public NegativeForm(WebDriver driver, WebElement one, WebElement two, WebElement three ,WebElement four,WebElement five,WebElement six ,WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);
        verifyElementIsPresent(one);
        verifyElementIsPresent(two);
        verifyElementIsPresent(three);
        verifyElementIsPresent(four);
        verifyElementIsPresent(five);
        verifyElementIsPresent(six);
        sendAndAssertNegativeTest(button, acceptMessage);

        setElementText(one);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();

        setElementText(one);
        setElementText(two);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
    }

    public NegativeForm(WebDriver driver, WebElement one, WebElement two, WebElement three ,WebElement four,WebElement five,WebElement six ,WebElement seven, WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);
        verifyElementIsPresent(one);
        verifyElementIsPresent(two);
        verifyElementIsPresent(three);
        verifyElementIsPresent(four);
        verifyElementIsPresent(five);
        verifyElementIsPresent(six);
        verifyElementIsPresent(seven);
        sendAndAssertNegativeTest(button, acceptMessage);

        setElementText(one);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();

        setElementText(one);
        setElementText(two);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        setElementText(seven);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();

    }

    public NegativeForm(WebDriver driver, WebElement one, WebElement two, WebElement three ,WebElement four,WebElement five,WebElement six ,WebElement seven,WebElement eight, WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);
        verifyElementIsPresent(one);
        verifyElementIsPresent(two);
        verifyElementIsPresent(three);
        verifyElementIsPresent(four);
        verifyElementIsPresent(five);
        verifyElementIsPresent(six);
        verifyElementIsPresent(seven);
        verifyElementIsPresent(eight);
        sendAndAssertNegativeTest(button, acceptMessage);

        setElementText(one);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();

        setElementText(one);
        setElementText(two);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        setElementText(seven);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        setElementText(seven);
        setElementText(eight);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();
        eight.clear();
    }

    public NegativeForm(WebDriver driver, WebElement one, WebElement two, WebElement three ,WebElement four,WebElement five,WebElement six ,WebElement seven,WebElement eight, WebElement nine,WebElement button, WebElement acceptMessage) throws Exception {
        super(driver);
        verifyElementIsPresent(one);
        verifyElementIsPresent(two);
        verifyElementIsPresent(three);
        verifyElementIsPresent(four);
        verifyElementIsPresent(five);
        verifyElementIsPresent(six);
        verifyElementIsPresent(seven);
        verifyElementIsPresent(eight);
        verifyElementIsPresent(nine);
        sendAndAssertNegativeTest(button, acceptMessage);

        setElementText(one);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();

        setElementText(one);
        setElementText(two);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        setElementText(seven);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        setElementText(seven);
        setElementText(eight);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();
        eight.clear();

        setElementText(one);
        setElementText(two);
        setElementText(three);
        setElementText(four);
        setElementText(five);
        setElementText(six);
        setElementText(seven);
        setElementText(eight);
        setElementText(nine);
        sendAndAssertNegativeTest(button, acceptMessage);
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();
        eight.clear();
        nine.clear();
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
