package day14_stringManipulation;

import java.util.Scanner;

public class C07_Soru2 {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyin. Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        //"kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin.
        //iki kelimeyi de icermiyorsa "cumle buyuk ya da kucuk kelimesi icermiyor" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle girin");
        String cumle= scan.nextLine();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else {
            System.out.println("cumle buyuk ya da kucuk kelimesi icermiyor");
        }







    }
}
