package day48_linkedList;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //verilen bir array'in tekrar eden elementlerini
        //sadece bir kere yazdiran bir method olusturun

        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdirma(arr);
    }

    private static void arrayiTekrarsizYazdirma(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi=new HashSet<Integer>(); //setin ozelligi unique olmasi,siz ayni harf veya sayidan bir kac tane olsa bile
        for (Integer each:arr                                       //set 1 tanesini yazdirir
             ) {                                                    //siralama yapmaz index yapisi yoktur
            tekrarsizElementKumesi.add(each);
        }
        System.out.println(tekrarsizElementKumesi);
    }
}
