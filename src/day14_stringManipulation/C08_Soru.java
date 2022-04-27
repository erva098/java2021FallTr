package day14_stringManipulation;

import java.util.Scanner;

public class C08_Soru {
    public static void main(String[] args) {
        //kullanicidan bir cumle bir harf isteyin, harfin cumlede var olup olmadigini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle girin");
        String cumle=scan.nextLine();
        System.out.println("lutfen bir harf girin");
        String harf= scan.next();

        if (cumle.contains(harf)){
            System.out.println("cumlede girdiginiz harf var");
        }else{
            System.out.println("cumlede giridiginiz harf yok");
        }





    }
}
