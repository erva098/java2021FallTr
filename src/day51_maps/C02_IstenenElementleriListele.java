package day51_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElementleriListele {
    public static <list> void main(String[] args) {
        /*
        Verilen bir map'te istenen programlama dilini bilen kisileri
        list olarak donduren bir method yaziniz
        map==> {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
        istenen dil==> Java
        sonuc {Ali,Veli}
         */
        Map<Integer,String> sinifMap=MapOlustur.myMap();
        String istenendil="Java";
        List<String> istenenDiliBilenler=istenenDiliBilenlerListesiOlustur(sinifMap,istenendil);
        System.out.println(istenenDiliBilenler);

    }

    private static List<String> istenenDiliBilenlerListesiOlustur(Map<Integer, String> sinifMap, String istenendil) {
        List<String> istenenDiliBilenler=new ArrayList<>();
        Collection<String> sinifValueColl=sinifMap.values();
        List<String> sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        int outerArrayBoyut=sinifValueList.size();
        String ilkValue=sinifValueList.get(0);

        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {

                valueMDArr[i][j]=temp[j];

            }
        }


        for (int i = 0; i <outerArrayBoyut ; i++) {
                if (valueMDArr[i][2].equals(istenendil)){
                    istenenDiliBilenler.add(valueMDArr[i][0]);
                }

        }





        return istenenDiliBilenler;
    }


}
