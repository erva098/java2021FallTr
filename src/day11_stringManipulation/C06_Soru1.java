package day11_stringManipulation;

import java.util.Scanner;

public class C06_Soru1 {
    public static void main(String[] args) {
     //kullanicidan bir cumle ve bir harf isteyin,harfin cumlede var olup olmadigini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz..");
        String cumle= scan.nextLine();
        System.out.println("lutfen bir harf giriiz..");
        String harf=scan.next();


        if (cumle.indexOf(harf)==-1){
            System.out.println("harf cumlede yok");
        }else {
            System.out.println("harf cumlede var");
        }














    }
}
