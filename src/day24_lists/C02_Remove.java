package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); //[aykut, Yusuf, Ilker, Oguzhan]


        //remove (istenenobject) method'u istenen elementi kaldirip
        //bize true/false doner
        //eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        //method'u boolean bir variable'a atayabiliriz
       boolean sonuc= isimler.remove("Oguzhan"); //true gittim oguzhani buldum ve oldurdum :D
        if (sonuc==true){
            System.out.println("istediginiz isim silindi ");
        }else{
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        System.out.println(isimler); //[aykut, Yusuf, Ilker]


        sonuc= isimler.remove("Berk");
        if (sonuc==true){
            System.out.println("istediginiz isim silindi ");
        }else{
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        } //istediginiz isim listede olmadigindan silinemedi


        //remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
        //bize remove edilen elementi doner

        System.out.println(isimler.remove(1)); //Yusuf

        //yazdirsak da yazdirmasak da liste degisti ve 1.index'deki element silindi

        System.out.println(isimler);//[aykut, Ilker]




    }
}
