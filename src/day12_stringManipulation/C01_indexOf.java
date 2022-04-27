package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak
        //asagidaki 3 cumleden uygun olani yazdirin
        // Girilen kelime cumlede kullanilmamis.
        //Girilen kelime cumlede 1 kere kullanilmis.
        // Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle="Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="program";

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index
        int ikincikKullanim=cumle.indexOf(kelime, ilkKullanim+1);


        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (ikincikKullanim==(-1)){
            System.out.println("istenen kelime cumlede bir kere kullanilmis");
        }else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }



















    }
}
