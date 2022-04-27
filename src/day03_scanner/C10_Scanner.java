package day03_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //kullanicidan ismini ve soyismini alip asagidaki gibi yazdirin
        // isminiz : mehmet
        // soyisminiz : bulut
        // kursumuza katiliminiz alinmistir, tesekkur ederiz.

        System.out.println("lutfen isminizi giriniz..");
        String isim= scan.nextLine();
        System.out.println("lutfen soyIsminizi giriniz..");
        String soyIsim= scan.nextLine();
        System.out.println("isminiz : " + isim);
        System.out.println("soyIsminiz : " + soyIsim);
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz :) ");





    }
}
