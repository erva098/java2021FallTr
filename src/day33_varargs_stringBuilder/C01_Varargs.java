package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        //kac tane string verilirse verilsin iclerinden en uzun olani yazdiran bir method olusturun
        String str1="Ali";
        String str2="Veli";
        String str3="Osman";
        String str4="Oguzhan";

        //yazilan argument sayisi sabitse her zamanki gibi bir method olusturabiliriz
        //ancak argument sayisinin degisme ihtimali varsa
        //o zaman varargs tercih edilir
        enUzunKelim(str1,str2,str3,str4);


    }

    private static void enUzunKelim(String... str) {//str varargs adi o yuzden str1 falan yazmadik bu bizim str1.. digerleriyle
        //arasinda baglanti kuruyor
        String enUzun="";
        for (String each:str
             ) {
            if (each.length()>enUzun.length())
                enUzun=each;
        }
        System.out.println("en uzun kelime : "+enUzun);
    }
}
