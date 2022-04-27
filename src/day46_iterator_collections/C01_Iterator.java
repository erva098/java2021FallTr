package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);//[5, 7, 8, 6, 9]

        Iterator itr= liste.iterator();//iterator method'u olusturdugumuz liste objesi
                                       //uzerinden arraylist class'indan calistiriyoruz
        /*

        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
        Iterator itr= liste.iterator();
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde calismak icin olusturmus olduk
        biz iterator objesini olusturdugumuzda iterator collection'in ilk elementinin oncesine gidip bekler

        [(itr)5, 7, 8, 6, 9]
        itr.hasNext() ====> iterator'a yaninda element var mi diye soruyor ve 5 var o yuzden true doner olmasaydi false donerdi

        itr.next();===> iterator bir sonraki elementin yanina gecer,
        ve uzerinden gectigi elementi bize dondurur
        ne kadar soylersek o kadar ileri gider
        next demedigin surece iterator yerini degistirmez

        [5,(itr)7, 8, 6, 9] ===> bize 5 dondurur

        itr.next(); ===>

        [5, 7 (itr)8, 6, 9] ===> bize 7 dondurur

        itr.remove(); iterator'in elinde olan elementi sildi
        dolayisiyla ust uste iki kere itr.remove(); KULLANILAMAZ

         once itr.next(); methodunu calistirip
         iterator'in bir element almasini saglamaliyiz

         */

        System.out.println(itr.hasNext());//true yaninda element var mi diye soruyor

        System.out.println(itr.next());//5 yaninda 5 var dedi

        System.out.println(itr.next());//7 yana gec dedik

        itr.remove();// 7'yi silmis
        System.out.println(liste);

        //itr.remove();//ikinci kez remove yapinca hata veriyor

    }
}
