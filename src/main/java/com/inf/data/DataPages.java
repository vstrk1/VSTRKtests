package com.inf.data;

import org.testng.annotations.DataProvider;

public class DataPages {
    @DataProvider(name = "pages")
    public static Object[][] pages() {
        return new Object[][]{
                {"http://ukrainegaming.com.ua/uk","Про конференцію | Ukrainian Gaming Congress"},
                {"http://ukrainegaming.com.ua/uk/program", "Програма | Ukrainian Gaming Congress"},
                {"http://ukrainegaming.com.ua/uk/speakers","Спикеры | Ukrainian Gaming Congress"},
                {"http://ukrainegaming.com.ua/uk/news","Новини | Ukrainian Gaming Congress"},
                {"http://ukrainegaming.com.ua/uk/registration","Реєстрація | Ukrainian Gaming Congress"},
                {"http://ukrainegaming.com.ua/uk/place","Місце проведення | Ukrainian Gaming Congress"},
                {"http://ukrainegaming.com.ua/uk/contacts","Контакти | Ukrainian Gaming Congress"},
                {"http://ukrainegaming.com.ua/uk/form/sponsor","http://ukrainegaming.com.ua/uk/form/sponsor"},
                {"http://ukrainegaming.com.ua/uk/form/partner","http://ukrainegaming.com.ua/uk/form/partner"},
                {"http://ukrainegaming.com.ua/uk/form/speaker","http://ukrainegaming.com.ua/uk/form/speaker"},
                {"http://ukrainegaming.com.ua/uk/form/media","http://ukrainegaming.com.ua/uk/form/media"},
        };
        }
    }

