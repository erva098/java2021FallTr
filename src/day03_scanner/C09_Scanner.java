package day03_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //kullanicidan dikdortgenler prizmasinin uzun,kisa kenarlarini ve yuksekligini isteyip prizmanin
        //hacmini yazdirin
        System.out.println("lutfen dikdortgenler prizmasinin uzun kenarini girin..");
        int uzunKenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin kisa kenarini girin..");
        int kisakenar= scan.nextInt();
        System.out.println("lutfen dikdortgenler prizmasinin yuksekligini girin..");
        int yukseklik= scan.nextInt();
        System.out.println("dikdortgen prizmanizin hacmi: " + (uzunKenar*kisakenar*yukseklik) );







    }
}
