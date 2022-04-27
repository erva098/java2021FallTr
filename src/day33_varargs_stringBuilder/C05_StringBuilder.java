package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        //compare iki sb'i esit mi diye kontrol etmek icin ilk harften baslayarak tum karakterleri karsilastirir
        //ayni olan karakterler icin bir sey yazdirmaz
        //farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride oldugunu yazdirir
        //tamamen ayni ise bize 0 dondurur
        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("ali can");
        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));

        //bir StringBuilder ve string'i compare etmek istersek java cte verir
        //System.out.println(sb1.compareTo(str));


        //SB'da equalse method'u string'deki == gibi calisir
        System.out.println(sb1.equals(sb2));//false farkli iki obje oldugu icin
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.equals(str));//false

        //System.out.println(sb1==str);//farkli obje turleri oldugu icin java kiyas yapmaz

    }
}
