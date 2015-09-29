package com.inf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class NegativeForm extends BasePage {
   static int countNF = 1;
    public NegativeForm(WebDriver driver) throws Exception {
        super(driver);
    }

    public void testNForm(WebElement button,String acceptInf,WebElement... elements){
        sendAndAssertNegativeTest(button, acceptInf);
        for(WebElement field : elements){
            setElementText(field);
            sendAndAssertNegativeTest(button, acceptInf);
        }
    }
    public void testNForm(WebElement button,WebElement acceptInf,WebElement... elements){
        sendAndAssertNegativeTest(button,acceptInf);
        for(WebElement field : elements){
            sendAndAssertNegativeTest(button,acceptInf);
            setElementText(field);
        }
    }
    public void sendAndAssertNegativeTest(WebElement button, WebElement acceptInf) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        for(int i=1; i<5; i++) {
            button.submit();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        Assert.assertTrue(!acceptInf.isDisplayed(), "\n" + "Negative test # " + countNF + " is failed - form sent");
        System.out.println("Negative test # " + countNF + " is passed");
        countNF++;
    }

    public void sendAndAssertNegativeTest(WebElement button, String acceptInf) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        for(int i=1; i<5; i++) {
            button.submit();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        Assert.assertNotEquals(driver.getCurrentUrl(),acceptInf, "\n" + "Negative test # " + countNF + " is failed - form sent");
        System.out.println("Negative test # " + countNF + " is passed");
        countNF++;
    }
}
