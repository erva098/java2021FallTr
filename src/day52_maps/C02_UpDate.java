package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_UpDate {
    public static void main(String[] args) {
        //Verilen map'deki tum branslari java yapalim
        //Verilen map'deki numarasi 102 olan kaydin branslarini java yapalim

        /*
        Map'de value kompleks olabildigi icin
        value icerisinden bir bolumu degistirmek istersek
        once value'e ulasmak
        sonra onu manipule ederek istedigimiz degisikligi yapmak
        ve en son degismis halini yeniden map'e eklemek gerekir
         */
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

       Set<Map.Entry<Integer,String>> sinifEntrySet= sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            Integer keyEntry=each.getKey();
            String valueEntry= each.getValue();
            String valuArr[]=valueEntry.split(", ");
            valuArr[2]="Java";

            String valueYeni=valuArr[0]+", "+valuArr[1]+", "+valuArr[2]+", "+valuArr[3];

            sinifListMap.put(keyEntry,valueYeni);

        }

        System.out.println(sinifListMap);

    }
}
