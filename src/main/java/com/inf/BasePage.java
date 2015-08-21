package com.inf;

import com.inf.data.DataPages;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
public class BasePage  extends DataPages{
    public  WebDriver driver;
    public WebDriverWait wait;
    public String PAGE_URL;
    public String PAGE_TITLE;
    public String eMail;
    public JavascriptExecutor js;

    public BasePage(WebDriver driver) throws Exception {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        this.js = (JavascriptExecutor) driver;
    }
    public void watchOnFcPopUp(WebElement element){

    }
    public void loadPage() {
        driver.get(getPageUrl());
        waitForPageLoaded(driver);
        long navigationStart = (Long) js.executeScript(("return window.performance.timing.navigationStart"));//начало загрузки страницы
        long loadEventEnd = (Long) js.executeScript("return window.performance.timing.loadEventEnd"); // окончание загрузки страницы
        wait.until(ExpectedConditions.titleContains(getPageTitle()));
        Assert.assertEquals(driver.getTitle(), getPageTitle());
        System.out.println("Page load time is :  " + (loadEventEnd - navigationStart) / 1000 + " second");
        // js.executeScript("$(\"script[src=//cdn.callbackhunter.com/widget/tracker.js]\").remove()");
        System.out.println("Title is verified");
    }
    public void waitForPageLoaded(WebDriver driver) {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }};
        Wait<WebDriver> wait = new WebDriverWait(driver,60);
        try {
            wait.until(expectation);
        } catch(Throwable error) {
            Assert.assertFalse(true, "Timeout waiting for Page Load Request to complete.");
        }
    }

    public String getPageUrl() {
        return PAGE_URL;
    }

    public String getPageTitle() {
        return PAGE_TITLE;
    }

    public void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

        element.click();
    }


    public void verifyElementIsPresent(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
        //  Assert.assertTrue(!element.getTagName().isEmpty());
        System.out.println(element + " is verified");
    }
    public boolean verifyElementIsHaveLink(WebElement element, String text) {
        verifyElementIsPresent(element);
        Assert.assertEquals(element.getAttribute("href"), text);
        //System.out.println("Element " + element + " have true link");

        return true;
    }

    public boolean verifyElementIsContainSmth(WebElement element, String attribute, String content) {
        verifyElementIsPresent(element);
        Assert.assertTrue(element.getAttribute(attribute).contains(content));

        return true;
    }

    public boolean verifyElementIsContainText(WebElement element, String content) {
        verifyElementIsPresent(element);
        //Assert.assertTrue(element.getText().contains(content));
        Assert.assertEquals(element.getText(), content);
        return true;
    }

    public void hoverElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Actions mouse = new Actions(driver);
        mouse.moveToElement(element).build().perform();
    }

    public void setElementText(WebElement element) {
        element.clear();
        String cnt = "TEST" + "QA " + new SimpleDateFormat("hhMMss").format(new Date());
        element.sendKeys(cnt);
        Assert.assertEquals(element.getAttribute("value"), cnt);
    }

    public void setEmailAdress(WebElement element) throws Exception {
        eMail = createEmail();
        verifyElementIsPresent(element);
        element.clear();
        System.out.println("Set email adress : " + eMail);
        element.sendKeys(eMail);
    }
    public void setMobileNumber(WebElement element) {
        element.clear();
        element.sendKeys("+" + RandomStringUtils.randomNumeric(12));
    }

    public String createEmail() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(                                                             //Создаем новый обьект типа BufferReader , считываем символы из потока , записываем в буфер
                new InputStreamReader(                                                                                  //Читает байты и преобразует их в символы, часть баффер риадера
                        new URL("http://api.temp-mail.ru/request/domains/format/xml/").openConnection().getInputStream()));     //Создаем урл, вызываем строку , считываем ее
        String xmlDomains = "";                                                                                         // Создали строку , ничего в ней нет
        while (bufferedReader.readLine() != null)                                                                       //ПОКА наша строка не равна нулу делать
            xmlDomains += bufferedReader.readLine();                                                                    //Наш стринг (!Пока пустой) складываем с строкой ту которую получили от баферридера
        NodeList domainsList = (NodeList) XPathFactory.newInstance().newXPath().evaluate("//item", new InputSource(new StringReader(xmlDomains)), XPathConstants.NODESET);
        //Создали нод лист,который равнятся обьект xpath, вызываем метод для создания нового екземпляра, ДОМ по дефолту, вызываем  метод , который дает нам xPath , лежащий в данном доме, и константу
        //вызываем метод оценки , которая возвращает нам стрингу, в метод засовываем сам XPath, источник , в котором будет XPath,
        String resultEmail = "testqa"                                                                                   //Создали стринг
                + new SimpleDateFormat("yyMMddHHmmssS").format(new Date())                                              //Прибавили к этой строке дату в формате юникс
                + domainsList.item(new Random().nextInt(domainsList.getLength() - 1)).getTextContent();                 //Прибавили рандомный узел из нодлиста(в нашем случае это наш домен),отобразили его содержание
        System.out.println(resultEmail);                                                                                //Выводим в консоль меил
        return resultEmail;                                                                                             //Возвращаем конечную строку почты
    }

    public void checkEmail() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");                                                 // Создаем переменную для хеширования , устанавливаем алгоритм md5
        messageDigest.update(StandardCharsets.UTF_8.encode(eMail));                                                     //засовываем наш меил в эту переменную
        String md5Email = String.format("%032x", new BigInteger(1, messageDigest.digest()));                            // создаем стрингу ,форматируем ее нужным нам образом , засовываем в нее
        //наш емеил , которым мы переделали в строку мд5
        StringBuilder xmlSource = new StringBuilder();                                                                  //создаем новый стринг билдер, без указания размера
        try{                                                                                                            //трай
            for (int times = 0; times < 40; times++) {                                                                      //крутим цикл 40 раз
                Thread.sleep(3000);                                                                                         //станавливаем поток на 3 секунды
                URLConnection urlConnection = new URL("http://api.temp-mail.ru/request/mail/id/" + md5Email + "/format/html").openConnection(); //создаем обьект типа урл, засповываем в него адрес запроса
                // в адресе запроса добавляем хеш адрес нашей почты которую мы создали. Затем открываем урл
                BufferedReader emailBufferedReader = null;                                                                  //создаем баф ридер , который считывает символы из потока
                try {                                                                                                       //трай
                    emailBufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));        //в новый баф ридер запихиваем контент , который лежит в нашем урле
                    System.out.println("Сообщение успешно пришло на почту");                                                //если там чтото есть (getInputStream не равен нул) то показываем месседж
                    System.out.println("Link for open mail : " + urlConnection);                                            //выводим адрес для доступа к почте
                } catch (java.io.FileNotFoundException e) {                                                                 //если сообщение не пришло
                    System.out.println(" Попытка № " + times + " - сообщение не пришло");                                   //выдаем месседж + номер цикла
                    continue;                                                                                               //ПРОДОЛЖАЕМ
                } catch (IOException e) {                                                                                   //еще ксепшн
                    e.printStackTrace();                                                                                    //принт
                }
                String line;                                                                                                //создали стринг
                while ((line = emailBufferedReader.readLine()) != null) {                                                   //пока  контент на по урлу не равен нул
                    xmlSource.append(line);                                                                                 //в стринг билдер суем контент по урлу
                }
                break;                                                                                                      //откнулись
            }}catch (Exception e){                                                                                          //кетч и сообще
            System.out.println("FAIL");
        }


    }

    public void negativeTestForm(WebElement fieldFill, WebElement button, WebElement acceptMessage, Boolean blanc) throws Exception {
        if (blanc) {
            verifyElementIsPresent(fieldFill);
            sendAndAssertNegativeTest(button, acceptMessage);
        } else {
            verifyElementIsPresent(fieldFill);
            if (fieldFill.getAttribute("name").contains("email")) {
                setEmailAdress(fieldFill);
                sendAndAssertNegativeTest(button, acceptMessage);
                fieldFill.clear();
            } else {
                setElementText(fieldFill);
                sendAndAssertNegativeTest(button, acceptMessage);
                fieldFill.clear();
            }
        }
    }
    public void sendAndAssertNegativeTest(WebElement button, WebElement acceptMessage)  {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        clickOnElement(button);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(!acceptMessage.isDisplayed());
        System.out.println("Negative test is passed");

    }
    public void checkSimpleBlockContent(String xpathLink){
        List<WebElement> elements = driver.findElements(By.xpath(xpathLink));
        System.out.println("Number of of elements found: "+ elements.size());
        for (int i=0; i<elements.size(); i++){
            Assert.assertTrue(elements.get(i).isDisplayed());
        }
    }

    public void selectFromDropdown (WebElement dropdown,String value) {                                                 //создаем метод выбора дня (ПРИНИМАЕТ ЗНАЧЕНИЕ VALUE)
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.valueOf(dropdown))));
        Select select = new Select(dropdown);                                                                           //создаем новый обьект типа селект , инициализируем его. (принимает значение элемента dropdown_хуемае)
        select.selectByVisibleText(value);                                                                                    //вызываем метод ВЫБОР ПО VALUE (принимает на себя тот валуе , который мы всунем)
    }
}







