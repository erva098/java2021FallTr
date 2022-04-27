package day10_switch_StringManipulation;

import java.util.Scanner;

public class C05_Soru3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi girin");
        int sayi=scan.nextInt();

        switch (sayi){

            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
                default:
                    System.out.println("girdigin sayiyi degistir");






        }




















    }
}
