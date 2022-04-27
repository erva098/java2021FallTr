package day49_maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        //sinif listesini duzenli bir sekilde yazdirmak
     Map<Integer,String>sinif=MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("============================");

        //Map yapisinda yazdrdigimizda kullanicilar bir sey anlamayabilir
        //bunun icin once map yapisini kodlarla manipule edip
        //Map'deki datalari,istedigimiz formata sokmamiz gerekir
        //1.Adim key ve value'lari map'den alip
        //iki farkli collection uyesine atadik
        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet= sinif.values();

        System.out.println(keySet);//[101, 102, 103]
        System.out.println(valueSet);//[Ali,Can,Dev, Veli,Yan,QA, Ali,Yan,C#]
        System.out.println(valueSet.size());//3
        for (String each:valueSet
             ) {
            System.out.println(each);      /*
                                         Ali,Can,Dev
                                         Veli,Yan,QA
                                         Ali,Yan,C#
                                            */
        }


    }
}
