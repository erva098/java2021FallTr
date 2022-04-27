package day42_exceptions;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {
        /*
        String str[ ],Urun isimlerini tuttugumuz bir Array olsun. Kullanicidan istedigi urunun
sirasini isteyin ve istedigi urunu yazdirin.
Kullanici Array’de olan urun sayisindan buyuk bir sira no girerse “Girdiginiz sira urun
sayisindan buyuk” yazdirin.
         */

        String arr[]={"Patates","Sogan","Maydanoz","Havuc"};
        Scanner scan=new Scanner(System.in);
        System.out.println("istediginiz urunun sirasini girin");
        int sira=scan.nextInt();
        try {

            if (sira<arr.length){
                System.out.println(arr[sira]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Girdiginiz sira urun sira sayisindan buyuk");
        }


    }
}
