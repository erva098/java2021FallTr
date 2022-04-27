package day07_ifElseStatements;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ucgenin birinci kenarini girin");
        int sayi1= scan.nextInt();
        System.out.println("ucgenin ikinci kenarini girin ");
        int sayi2= scan.nextInt();
        System.out.println("ucgenin ucuncu kenarini girin");
        int sayi3= scan.nextInt();

        if (sayi1==sayi2 && sayi2==sayi3){
            System.out.println("eskanar ucgen");
        }else{
            System.out.println("eskenar degil");
        }


















    }
}
