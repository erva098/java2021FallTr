package day08_ifElseIfStatements;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dort basamakli bir sayi girin");
        int sayi= scan.nextInt();

        if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else{
                System.out.println("5'e bolunen tek sayi");
            }
        }else{
            System.out.println("tekrar deneyin");
        }




















    }
}
