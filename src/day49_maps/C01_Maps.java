package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        //java'da collection uyesi bir yapida
        //data turu object secilirse, her data turunden deger ekleyebiliriz
        //ancak bu durumda surekli casting problemleri ile karsilasabiliriz

        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);//[Ergin, 15, 10.2]
        list.set(1,(Integer)(list.get(1))+10);

        Map<Integer,String> sinifList=new HashMap<>();
        //bir sinifte ogrenci no,isim, soyisim ve brans olarak map olusturmak istiyoruz
        //key tek bir unique degerdir
        //ama value/deger birden fazla bilginin birlesiminden olusabilir
        //bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        //tum elementler icin value ayni bicimde olusturulmalidir
        //(veri siralamasi ve sekilsel acidan) bosluk,vurgul anlaminda
        sinifList.put(101,"Ali,Can,Dev");
        sinifList.put(102,"Veli,Yan,QA");
        sinifList.put(103,"Ali,Yan,C#");

        System.out.println(sinifList);
        System.out.println(sinifList.values());//[Ali,Can,Dev, Veli,Yan,QA, Ali,Yan,C#]
        System.out.println(sinifList.keySet());//[101, 102, 103]



    }
}
