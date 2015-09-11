package com.inf.pages.iku;

import com.inf.BasePage;
import com.inf.NegativeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by v.stuparenko on 11.09.2015.
 */
public class Contacts extends BasePage{
    NegativeForm nF = new NegativeForm(driver);
    @FindBy(xpath = "//*[@id='contactform-name']")  private WebElement Genname;
    @FindBy(xpath = "//*[@id='contactform-email']") private WebElement Genmail;
    @FindBy(xpath = "//*[@id='contactform-comment']") private WebElement Comment;
    @FindBy(xpath = "//*[@class='vtop']/button") private WebElement btn1;
    private String acceptMsg = "http://ukrainegaming.com.ua/#subscribe";

    public Contacts(WebDriver driver) throws Exception {
        super(driver);
        this.PAGE_URL = "http://ukrainegaming.com.ua/uk/contacts";
        this.PAGE_TITLE = "Контакти | Ukrainian Gaming Congress";
    }
    public void formSubscr() throws Exception {
        loadPage();
        nF.testNForm(btn1,acceptMsg,Genname,Genmail,Comment);
    }
}





