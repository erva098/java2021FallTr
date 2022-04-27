package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C04_UpDate {
    public static void main(String[] args) {
        //Verilen map'deki numarasi 102 olan kaydin branslarini java yapalim
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>> sinifEntrySet= sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet
        ) {
            Integer keyEntry=each.getKey();
           if (keyEntry==102){
               String valueEntry= each.getValue();
               String valuArr[]=valueEntry.split(", ");
               valuArr[2]="Java";

               String valueYeni=valuArr[0]+", "+valuArr[1]+", "+valuArr[2]+", "+valuArr[3];

               sinifListMap.put(keyEntry,valueYeni);

           }
        }

        System.out.println(sinifListMap);
    }
}
