package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //kullanicidan aldiginiz dort basamakli bir sayinin basamaklar toplamini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dort basamakli bir tam sayi giriniz ");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        //1.adim r=0 rt=0 sayi=753
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        //2.adim r=2 rt=2 sayi=753
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        //3.adim r=3 rt=5 sayi=75
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        //4.adim r=7 rt=10 sayi=7
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        System.out.println("girdiginiz sayinin rakamlar toplami " + rakamlarToplami);



















    }










}
