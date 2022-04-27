package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exceptions/dosya";

         /*
        Alti kirmizi cizili her kod cte degildir.
        java syntax hatalarini derleme esnasinda (compile) fark eder ve altini cizer
        biz bu gune kadar tamamina cte diyorduk ancak
        Exception konusu ile birlikte
        Compile time exception kavrami da hayatimiza girdi
         */

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read()) !=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

       /*
       Exception'lar icin de parent child iliskisi mevcuttur
       eger bir kod icin birden fazla exception olusma ihtimali varsa
       oncelikle olasi exception'lar parent-child iliskisi tasiyor mu bakmamiz gerekir
       eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz

       Eger parent-child iliskisi varsa
       Sadece parent exception'i yazabiliriz
       veya ikisini de yazmak istersek
       child'i once parent'i sonra yazmaliyiz
        */




    }
}
