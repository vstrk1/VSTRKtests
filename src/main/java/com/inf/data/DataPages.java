package com.inf.data;

import org.testng.annotations.DataProvider;

public class DataPages {
    @DataProvider(name = "pages")
    public static Object[][] content() {
        return new Object[][]{
                {"http://gamingcongress.kz/ru","Главная | KZ Gaming Congress"},
                {"http://gamingcongress.kz/ru/program", "Программа | KZ Gaming Congress"},
                {"http://gamingcongress.kz/ru/Demoarea","Демо-зона | KZ Gaming Congress"}
               };
        }
    }

