package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {

    public static void main(String[] args) {
        //verilen listede ki her elementi 3 artirin
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);//[5, 7, 8, 6, 9]

        /*
        Listenin tum elementlerini bize getirmesi icin
        iterator'in hasnext() ve next() methodlarini beraber kullanacagiz
         */

        ListIterator itr=liste.listIterator();//iterator child class'i

        while(itr.hasNext()) { // yaninda element oldugu muddetce calisacak
            //System.out.println(itr.next());//hem yazdiracak hem yandakine gececek

            Object sayi=itr.next();
            itr.set((Integer)sayi+3);

        }
        System.out.println(liste);
    }
}
