package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("D"); //[D]
        harfler.add("M"); //[M]
        harfler.add(1,"T");//[D,M,T]
        harfler.add(0,"T"); //[T, D, T, M]
        System.out.println(harfler);

        System.out.println(harfler.contains("T")); //true
        System.out.println(harfler.contains("F")); //false

        List<String> karakterler = new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");


        System.out.println(harfler.containsAll(karakterler)); //true
        //karakterler listesi harfler de var mi yok mu ona bakiyor

        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler)); //false




    }
}
