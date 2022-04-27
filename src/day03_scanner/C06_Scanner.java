package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        //    Isim – soyisim : Mehmet Bulutluoz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi yaziniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Isim – soyisim : " + isim + " " + soyisim);







    }

}
