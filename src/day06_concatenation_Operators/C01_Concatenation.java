package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="java";
        String str2="guzel";
        int sayi1=5;
        int sayi2=3;

        //variable'larin degerlerini degistirmeden
        //asagidaki ifadeleri, bu variable'lari kullanarak yazdirin

        //java5Guzel
        System.out.println(str1+sayi1+str2);

        //2guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53guzel
        System.out.println(""+sayi1+sayi2+str2);
        System.out.println(sayi1+ (sayi2+str2));


        /*
        Eger tamamen sayilardan olusan bir string varsa ve biz bunu int'a cevirmek istersek
        Integer.valueoff(str)
        Bir sayiyi String'e cevirmek istersek ("" +sayi)
         */









    }
}
