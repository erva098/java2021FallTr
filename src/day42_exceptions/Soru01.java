package day42_exceptions;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        /*
        Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi String sadece
sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
Kullanici sayilardan olusmayan bir String girerse “Girdiginiz String sayiya cevrilemez”
yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String kelime=scan.next();

        try {
            int sayi=Integer.parseInt(kelime);
            System.out.println(sayi*2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Girdiginiz String sayiya cevrilemez");
        }


    }
}
