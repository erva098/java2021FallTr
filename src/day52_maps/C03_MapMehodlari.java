package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMehodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);//kontrol edecek varsa dokunmayacak

        //bir ekleme yapmak istedigimiz de key daha once eklenmemisse map'e eklesin
        // daha once eklenmisse eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A", 6));//a'yi ekledi
        System.out.println(myMap.putIfAbsent("K",20)); //k vardi eski degerini getirdi 5

        if (myMap.putIfAbsent("K",20)!=null) {
            System.out.println("Girdiginiz key map'de zaten var");
        }
        System.out.println(myMap);

        myMap.put("A",10);//a'yi bulup degerini 10 yapacak sart gozetmeden
        System.out.println(myMap);

        //normal deger atamak istersen put kullan compute kullanamazsin
        //compute yapmak istersen formul olmali

        myMap.computeIfAbsent("A",v->20);//yoksa 20 yap dedik
        System.out.println(myMap);

        myMap.compute("A",(key,value) -> 20);//formullu degisim
        System.out.println(myMap);

        //H'nin degerini 2 katinin 5 fazlasi yapalim
        myMap.compute("H",(k,v) ->(2*v+5));//k,n ya da key value yazmanin bir onemi yok baska harfler de yazabilirsin
                                               //sadece genel kullanim bu sekilde
        System.out.println(myMap);


    }
}
