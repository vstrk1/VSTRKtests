package com.inf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
        public enum BrowserType{
            FIREFOX("firefox"),
            CHROME("chrome"),
            IE("internet_explorer");
            private String value;

            BrowserType(String value){
                this.value = value;
            }

            public String getBrowserName(){
                return this.value;
            }
        }

        public static WebDriver getDriver(BrowserType type){
            WebDriver driver = null;
            switch(type){
                case FIREFOX :
                    driver =  new FirefoxDriver(); //›“¿ Ã¿Õﬂ Õ≈ –¿¡Œ“¿≈“
                    break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case IE:
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    driver = new FirefoxDriver();
                    break;
            }
            return driver;
        }


    }
