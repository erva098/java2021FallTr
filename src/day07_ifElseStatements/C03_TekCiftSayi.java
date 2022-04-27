package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        //if else ile cozumluyorum
        if (sayi%2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }
        if (sayi%2 != 0){
            System.out.println("girilen sayi tek sayi");
        }
        //normalde bir sayi ya tektir ya cifttir ,ucuncu bir durum yoktur
        //o zaman tek olmasini ve cift olmasini iki ayri if ile degil
        // if else ile tek statement'da yapsak guzel olur


        //=====if else ile cozum=======
        if (sayi%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        } else{
            System.out.println("girdiginiz sayi tek sayidir");
        }

    }
}
