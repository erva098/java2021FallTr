package day48_linkedList;

import java.util.HashSet;
import java.util.Set;

public class C2_Hash {
    public static void main(String[] args) {

        String str="Java Cok Guzel";

        System.out.println(str.hashCode());//1492827252

        String str1="Hava Cok Guzel";
        System.out.println(str1.hashCode());//-1791022794

        Set<Integer> sayiKumesi=new HashSet<Integer>();

        System.out.println(sayiKumesi.hashCode());//0 ici bos olunca 0 yazdirir
        sayiKumesi.add(40);
        System.out.println(sayiKumesi.hashCode());//40
        sayiKumesi.add(29);
        System.out.println(sayiKumesi.hashCode());//69


    }
}
