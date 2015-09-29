package com.inf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
public class PositiveForm extends BasePage{
    static int countPF = 1;
    public PositiveForm(WebDriver driver) throws Exception{
        super(driver);
    }

    public void testPForm(WebElement button, WebElement popUp, List<WebElement> elements) throws Exception {
        for (WebElement field: elements){
            if(field.getAttribute("type").contains("text")){
                setElementText(field);
            }else if(field.getAttribute("type").contains("email")){
                setEmailAdress(field);
            }else {
                setElementText(field);
            }
        }
    }

    public void testPForm(WebElement button, String accept, WebElement... elements) throws Exception {
        for (WebElement field: elements){
            if(field.getAttribute("type").contains("text")){
                setElementText(field);
            }else if(field.getAttribute("type").contains("email")){
                setEmailAdress(field);
            }else {
                setElementText(field);
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(button));
        for(int i=1; i<5; i++) {
            button.submit();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        checkEmail();
    }

}
