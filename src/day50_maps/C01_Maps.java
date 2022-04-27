package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        //siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer,String> sinifLIstMap =MapOlustur.myMap();
        System.out.println(sinifLIstMap);//{101=Ali,Can,Dev, 102=Veli,Yan,QA, 103=Ali,Yan,C#}

        /*
        eger key'lere tek tek eklemek istersek index yapisina ihtiyac var
        ancak map index yapisini desteklemez
        bunun icin key'leri once bir set'e
        sonra da set'in tum elementlerini bir list'e ekledik
         */

        Set<Integer> sinifKeySeti=sinifLIstMap.keySet();
        //Integer keyArr[]=new Integer[sinifKeySeti.size()];index yapisini ayri bir variable olusturmak gerektigi icin list kullanmaya karar verdik
        List<Integer> keyList=new ArrayList<>();
        //foreach loop ile de ekleyebilirdik ama gerek kalmadi cunku list'de adAll method'u var
        keyList.addAll(sinifKeySeti);

        //simdi de value'lere index ile ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValueColl=sinifLIstMap.values();

        List<String> sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        //her bir value birden fazla bilgiyi iceriyor
        //onun icin valuleri multidimensional bir array'e atmak mantikli duruyor
        //ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var

        int outerArrayBoyut=sinifValueList.size();
        System.out.println(outerArrayBoyut);//3

        //inner array boyutunu bulmak biraz daha kompleks

        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);//Ali,Can,Dev
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {

                valueMDArr[i][j]=temp[j];

            }
        }
        //bu satira kadar key'leri index ile ulasabildigimiz keylist'e atadim
        //value'leri valueMDArr'e atadim
        //simdi bu key ve value'leri istedigim gibi manuple edebilirim

        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("============================");
        for (int i = 0; i <keyList.size() ; i++) {
            System.out.print(keyList.get(i)+"  ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+"  ")                          ;
            }
            System.out.println("");
        }

    }
}
