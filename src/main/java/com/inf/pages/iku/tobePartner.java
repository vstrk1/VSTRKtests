package com.inf.pages.iku;

import com.inf.BasePage;
import com.inf.NegativeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 11.09.2015.
 */
public class tobePartner extends BasePage {
    NegativeForm nF = new NegativeForm(driver);
    @FindBy(xpath = "//*[@id='becomeinfopartner-name']")  private WebElement name;
    @FindBy(xpath = "//*[@id='becomeinfopartner-post']")  private WebElement post;
    @FindBy(xpath = "//*[@id='becomeinfopartner-site']")  private WebElement site;
    @FindBy(xpath = "//*[@id='becomeinfopartner-phone']")  private WebElement phone;
    @FindBy(xpath = "//*[@id='becomeinfopartner-email']")  private WebElement mail;
    @FindBy(xpath = "//*[@id='becomeinfopartner-comment']")  private WebElement comment;
    @FindBy(xpath = "//*[@class=\"vtop\"]/button")private WebElement btn;

    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-name.required>#formsubscribe-name")  private WebElement Genname;
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-email.required>#formsubscribe-email") private WebElement Genmail;
    @FindBy(xpath = "//button[@class=\"btn btn-primary lg yellow_button\"]")private WebElement btn1;

    String  acceptMsg = "http://ukrainegaming.com.ua/#subscribe";

    public tobePartner(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_URL = "http://ukrainegaming.com.ua/uk/form/partner";
        this.PAGE_TITLE = "http://ukrainegaming.com.ua/uk/form/partner";
    }
    public void formSubscr() throws Exception {
        loadPage();
        nF.testNForm(btn, acceptMsg, name,post, site,phone,mail,comment);
        nF.testNForm(btn1,acceptMsg,Genname,Genmail);
    }
}
