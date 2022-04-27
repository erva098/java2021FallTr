package day07_ifElseStatements;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
      //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
         //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
       //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        }else if (sayi1<0 && sayi2<0){
            System.out.println(sayi1*sayi2);
        }else if (sayi1>0 && sayi2<0 || sayi1<0 && sayi2>0){ //sayi1*sayi2<0
            System.out.println("farkli isaretli sayilarla islem yapamazsin");
        }else if (sayi1==0 || sayi2==0){ //bir sey yazmayabilirdin. karakter girince zaten hata veriyor
            System.out.println("sifir carpmaya gore yutan elemandir");
        }































    }
}
