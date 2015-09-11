package com.inf.pages.iku;

import com.inf.BasePage;
import com.inf.NegativeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 11.09.2015.
 */
public class tobeSponsor extends BasePage{
    NegativeForm nF = new NegativeForm(driver);
    @FindBy(xpath = "//*[@id='becomesponsor-name']")  private WebElement name;
    @FindBy(xpath = "//*[@id='becomesponsor-last_name']")  private WebElement lastName;
    @FindBy(xpath = "//*[@id='becomesponsor-email']")  private WebElement mail;
    @FindBy(xpath = "//*[@id='becomesponsor-phone']")  private WebElement phone;
    @FindBy(xpath = "//*[@id='becomesponsor-country']")  private WebElement land;
    @FindBy(xpath = "//*[@id='becomesponsor-city']")  private WebElement city;
    @FindBy(xpath = "//*[@id='becomesponsor-company']")  private WebElement company;
    @FindBy(xpath = "//*[@id='becomesponsor-site']")  private WebElement site;
    @FindBy(xpath = "//*[@id='becomesponsor-post']")  private WebElement post;
    @FindBy(xpath = "//*[@id='becomesponsor-address']")  private WebElement adres;
    @FindBy(xpath = "//*[@class=\"vtop\"]/button")private WebElement btn;
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-name.required>#formsubscribe-name")  private WebElement Genname;
    @FindBy(css = ".col-md-2.row>.form-group.field-formsubscribe-email.required>#formsubscribe-email") private WebElement Genmail;
    @FindBy(xpath = "//button[@class=\"btn btn-primary lg yellow_button\"]")private WebElement btn1;
    String  acceptMsg = "http://ukrainegaming.com.ua/#subscribe";
    public tobeSponsor(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_URL = "http://ukrainegaming.com.ua/uk/form/sponsor";
        this.PAGE_TITLE = "http://ukrainegaming.com.ua/uk/form/sponsor";
    }
    public void formSubscr() throws Exception {
        loadPage();
        nF.testNForm(btn, acceptMsg, name, lastName, mail, phone, land, company, city, site ,adres, post);
        nF.testNForm(btn1,acceptMsg,Genname,Genmail);
    }
}
