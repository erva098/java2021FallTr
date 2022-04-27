package day07_ifElseStatements;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("maas icin teklif");
        double teklif= scan.nextDouble();

        if (teklif>=80000){
            System.out.println("Kabul ediyorum :)");
        }else if (teklif>=60000 && teklif<80000){
            System.out.println("konusabiliriz");
        }else if (teklif<60000){
            System.out.println("maalesef kabul edemem");
        }









    }
}
