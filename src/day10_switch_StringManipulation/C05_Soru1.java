package day10_switch_StringManipulation;

import java.util.Scanner;

public class C05_Soru1 {
    public static void main(String[] args) {
       //kullaniciya haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen haftanin kacinci gununde oldugunuzu girin");
        int gun=scan.nextInt();

        switch (gun){

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("lutfen gecerli bir sayi giriniz");




        }










    }











    }

