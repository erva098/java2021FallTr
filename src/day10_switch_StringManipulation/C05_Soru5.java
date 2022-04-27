package day10_switch_StringManipulation;

import java.util.Scanner;

public class C05_Soru5 {
    public static void main(String[] args) {
        //kullanicidan gun ismi alip haftaici ya da hafta sonu yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi girin");
        String gun=scan.next();

        switch(gun){

            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lutfen gecerli bir  gun ismi yaziniz");






        }






    }
}
