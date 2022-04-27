package day14_stringManipulation;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {
  //kullanicidan isim ve soyisim isteyin.
  //hangisinin daha uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi girin");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi girin");
        String soyisim=scan.nextLine();

        if (isim.length()==soyisim.length()){
            System.out.println("isminiz ve soyisminizin uzunluklari esit");
        }else if (isim.length()>soyisim.length()){
            System.out.println("isminiz daha uzun");
        }else{
            System.out.println("soyisminiz daha uzun");
        }




    }
}
