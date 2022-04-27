package day03_scanner;

import java.util.Scanner;


public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //kullanicidan iki tamsayi alip bu sayilarin toplam,fark,carpimlarini yazdirin

        System.out.println("Lutfen bir tam sayi giriniz..");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci bir tamsayi giriniz..");
        int sayi2=scan.nextInt();

        System.out.println("girdiginiz sayilar: " + sayi1 +"," + sayi2);
        System.out.println("girdiginiz sayilarin toplami: " + (sayi1+sayi2));
        System.out.println("girdiginiz sayilarin farki: " + (sayi1-sayi2));
        System.out.println("girdiginiz sayilarin carpimi: " + (sayi1*sayi2));



    }
}
