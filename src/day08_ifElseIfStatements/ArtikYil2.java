package day08_ifElseIfStatements;

import java.util.Scanner;

public class ArtikYil2 {
    public static void main(String[] args) {
        //kullanicidan artik yil olup olmadigini kontrol etmek icin bir yil girmesini isteyin
        //kural 1: 4 ile bolunemeyen yillar artik yil degil
        //kural 2: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olanlar artik yil

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
        int yil= scan.nextInt();

        if (yil%100==0){
            if (yil%400==0){
                System.out.println("artik yil");
            }else {
                System.out.println("artik yil degil");
            }
        }else{
            if (yil%4==0){
                System.out.println("artik yil");
            }else{
                System.out.println("artik yil degil");
            }



        }







    }
}
