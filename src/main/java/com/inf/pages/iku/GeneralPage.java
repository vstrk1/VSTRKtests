package com.inf.pages.iku;

import com.inf.BasePage;
import com.inf.NegativeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 01.09.2015.
 */
public class GeneralPage extends BasePage{
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-name.required>#formsubscribe-name") WebElement Genname;
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-email.required>#formsubscribe-email") WebElement Genmail;
    @FindBy(css = ".btn.btn-primary.lg.yellow_button") WebElement btn1;
    @FindBy(xpath = ".//*[@id='subscribe']/div[2]/p[1]") WebElement acceptMsg;
    public GeneralPage(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_URL = "http://ukrainegaming.com.ua/uk/program";
        this.PAGE_TITLE = "Програма | Ukrainian Gaming Congress";
    }

    public void tetstGeneralPageForm() throws Exception {
        loadPage();
        new NegativeForm(this.driver,Genname,Genmail,btn1,acceptMsg);
       // loadPage();
        setElementText(Genname);
        setEmailAdress(Genmail);
        clickOnElement(btn1);
        verifyElementIsPresent(acceptMsg);
        checkEmail();
    }


}
