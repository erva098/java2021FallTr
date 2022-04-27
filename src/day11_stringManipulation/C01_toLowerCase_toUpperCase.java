package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="java Guzeldir";

        //biz String method'larini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        //str.charAt(5) ; boyle yazdigimizda sonuc artik string degil char olacaktir
        //dolayisiyla string'de yapmak istedigimiz tum degisiklikleri
        //once yapip sonra charAt() methodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GUZELDİR

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));//JAVA GUZELDIR





    }
}
