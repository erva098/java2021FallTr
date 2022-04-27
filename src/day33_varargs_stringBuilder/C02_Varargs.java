package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int
        //ve istedigimiz kadar string olan
        //en uzun kelimenin harf sayisi ile int parametre degerini
        //carpip sonucu yazdiran bir method olusturun

        int sayi=5;
        String str1="zulal";
        String str2="Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);
        //eger bir methodda varargs disinda bir parametre varsa once o parametre yazilir, sonra varargs yazilir
        //bu sebeple bir method'da birden fazla varargs olamaz.

    }

    private static void carpim(int sayi, String... str) {

        String enUzun="";
        for (String each:str
        ) {
            if (each.length()>enUzun.length())
                enUzun=each;
        }
        System.out.println("istenen deger : "+sayi*enUzun.length());
    }
}
