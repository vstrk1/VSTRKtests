package com.inf.pages.iku;

import com.inf.BasePage;
import com.inf.NegativeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Program extends BasePage{
    NegativeForm nF = new NegativeForm(driver);
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-name.required>#formsubscribe-name")  private WebElement Genname;
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-email.required>#formsubscribe-email") private WebElement Genmail;
    @FindBy(css = ".btn.btn-primary.lg.yellow_button") private WebElement btn1;
    private String acceptMsg = "http://ukrainegaming.com.ua/#subscribe";

    public Program(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_URL = "http://ukrainegaming.com.ua/uk/program";
        this.PAGE_TITLE = "Програма | Ukrainian Gaming Congress";
    }

    public void formSubscr() throws Exception {
        loadPage();
        nF.testNForm(btn1,acceptMsg,Genname,Genmail);
    }
}
