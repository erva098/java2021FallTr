package day03_scanner;

import java.util.Scanner;

public class C11_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz..");
       char isim=scan.next().charAt(0);
        System.out.println("girdiginiz ismin bas harfi : " + isim);

        //String'de index 0'dan baslar
        //charAt(index) method'u parametre olarak yazdigimiz index'deki char'i bize getirir


    }
}
