package com.inf.data;

import org.testng.annotations.DataProvider;

public class SmileExpoData {
    @DataProvider(name = "exp")
    public static Object[][] race2012(){
        return new Object[][]{
                {"http://2012.race-expo.ru/ru"},
                {"http://2012.race-expo.ru/ru/spikery"},
                {"http://2012.race-expo.ru/ru/prezentacii-dokladov"},
                {"http://2012.race-expo.ru/ru/foto-race-2012"},
                {"http://2012.race-expo.ru/ru/video-race-2012-1"},
                {"http://2012.race-expo.ru/ru/katalog"},
                {"http://2012.race-expo.ru/ru/tags/news"},
                {"http://2012.race-expo.ru/ru/o-meropriyatii"},
                {"http://2012.race-expo.ru/ru/v-ramkah-vystavki-race-sostoitsya-ii-mezhdunarodnaya-konferenciya-po-affiliatnomu-marketingu"},
                {"http://2012.race-expo.ru/ru/nashi-sponsory-i-partnery"},
                {"http://2012.race-expo.ru/ru/dogovor-publichnoy-oferty-na-prodazhu-biletov-na-vystavki-i-konferencii"},
                {"http://2012.race-expo.ru/ru/pravila-oformleniya-zakaza-na-priobretenie-vhodnyh-biletov-na-vystavki-i-konferencii-na-sayte"},

        };
    }
}
