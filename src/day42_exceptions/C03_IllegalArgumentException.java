package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin
        Kullanici yas olarak negatif bir sayi,
        0 veya
        120'den buyuk sayi girerse illegalArgumentException olusacak sekilde bir program yaziniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<=0 || yas>120){
            //System.out.println("Lutfen gecerli bir yas giriniz ");
            // java bizim istedigimiz durumlarda exception firlatablir
            throw new IllegalArgumentException();
        }else {
            System.out.println("Uygun yas girdiniz,Tesekkurler.");
        }





    }
}
