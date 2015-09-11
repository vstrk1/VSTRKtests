package com.inf.pages.iku;

import com.inf.BasePage;
import com.inf.NegativeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 11.09.2015.
 */
public class tobeSpeaker extends BasePage{
    NegativeForm nF = new NegativeForm(driver);
    @FindBy(xpath = "//*[@id='becomespeaker-name']")  private WebElement name;
    @FindBy(xpath = "//*[@id='becomespeaker-last_name']")  private WebElement lastName;
    @FindBy(xpath = "//*[@id='becomespeaker-email']")  private WebElement mail;
    @FindBy(xpath = "//*[@id='becomespeaker-phone']")  private WebElement phone;
    @FindBy(xpath = "//*[@id='becomespeaker-country']")  private WebElement land;
    @FindBy(xpath = "//*[@id='becomespeaker-company']")  private WebElement company;
    @FindBy(xpath = "//*[@id='becomespeaker-subject']")  private WebElement theme;
    @FindBy(xpath = "//*[@id='becomespeaker-comment']")  private WebElement comment;
    @FindBy(xpath = "//*[@id='becomespeaker-post']")  private WebElement post;
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-name.required>#formsubscribe-name")  private WebElement Genname;
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-email.required>#formsubscribe-email") private WebElement Genmail;
    @FindBy(xpath = "//*[@class=\"vtop\"]/button")private WebElement btn;
    @FindBy(xpath = "//button[@class=\"btn btn-primary lg yellow_button\"]")private WebElement btn1;
    String  acceptMsg = "http://ukrainegaming.com.ua/#subscribe";

    public tobeSpeaker(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_URL = "http://ukrainegaming.com.ua/uk/form/speaker";
        this.PAGE_TITLE = "http://ukrainegaming.com.ua/uk/form/speaker";
    }

    public void formSubscr() throws Exception {
        loadPage();
        nF.testNForm(btn, acceptMsg, name, lastName, mail, phone, land, company, theme, comment, post);
        nF.testNForm(btn1,acceptMsg,Genname,Genmail);
    }

}
