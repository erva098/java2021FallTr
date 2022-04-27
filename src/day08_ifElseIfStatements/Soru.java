package day08_ifElseIfStatements;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
       // isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        //gecerli degilse "Gecerli gun ismi giriniz" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String gun=scan.next().toUpperCase();

        if (gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("CARSAMBA")
                || gun.equals("PERSEMBE")|| gun.equals("CUMA") || gun.equals("CUMARTESI") || gun.equals("PAZAR")){
            System.out.println(gun.toUpperCase().charAt(0)+ "" + gun.toLowerCase().charAt(1) + "" +
                    gun.toLowerCase().charAt(2));
        }else{
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }















    }
}
