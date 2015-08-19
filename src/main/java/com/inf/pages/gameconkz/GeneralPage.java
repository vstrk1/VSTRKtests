package com.inf.pages.gameconkz;

import com.inf.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by v.stuparenko on 27.07.2015.
 */
public class GeneralPage extends BasePage {
    public GeneralPage(WebDriver driver) throws Exception{
        super(driver);
        this.PAGE_URL = "http://gamingcongress.kz/";
        this.PAGE_TITLE = "Главная | KZ Gaming Congress";
    }
    public void lp(){
        loadPage();
    }


}
