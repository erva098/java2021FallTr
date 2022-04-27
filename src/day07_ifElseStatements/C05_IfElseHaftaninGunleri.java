package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin
        //gun pazar veya cumartesi ===> haftasonu
        //gun pazartesi veya sali veya carsamba veya persembe veya cuma ===> hafta ici
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println("girdiginiz gun haftasonu");
        } else{
            System.out.println("girdiginiz gun hafta ici");
        }
        // else olursa 1 sart 2 sonuc




    }
}
