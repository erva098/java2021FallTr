package day07_ifElseStatements;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("100 uzerinden notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<50){
            System.out.println("D");
        }else if (not>=50 && not<60){
            System.out.println("C");
        }else if (not>=60 && not<80){
            System.out.println("B");
        }else if (not>=80){
            System.out.println("A");
        }



















    }
}
