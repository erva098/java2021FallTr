package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); //[aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin"); //yusuf gitti yerine Seckin geldi
        System.out.println(isimler); //[aykut, Seckin, Ilker, Oguzhan]

        //daha onceden listede var olanlari da arsiv gibi tutmak istersek
        List<String> logListesi=new ArrayList<>();

        logListesi.add( isimler.set(2,"Cosmos"));
        System.out.println(isimler); //[aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi); //[Ilker]







    }
}
