package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanici gun ismini yanlis girerse yanlis giris yazdirin
        //Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //gun pazar veya cumartesi ===> haftasonu
        //gun pazartesi veya sali veya carsamba veya persembe veya cuma ===> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toUpperCase();

        //hatali girisleri de yazdirmak icin olasiliklari uce cikardim
        //hafta sonu- hafta ici - yanlis giris

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println("girdiginiz gun hafta sonu");
        }else if (gunIsmi.equals("PAZARTESI") || gunIsmi.equals("SALI") || gunIsmi.equals("CARSAMBA")
                || gunIsmi.equals("PERSEMBE") || gunIsmi.equals("CUMA")){
            System.out.println("girdiginiz gun hafta ici");
        }else{
                System.out.println("yanlis giris");
        }

       //uppercase yaptigin icin gun isimlerini buyuk harf yazdin.Fakat kullanici sali gun ismini yazdiginda
        //yanlis giris uyarisi yapiyor cunku sen SALI yazmissin.Bu hata icin yapilabilecek bir sey var mi ogren
        // eger if else if ... statement else ile bitiyorsa
        //olasiliklardan sadece bir tanesi mutlaka calisir
        //java ilk buldugu true'a ait sonucu yazdirir
        //ve kalan sartlara bakmaz
        //if else if .... cumleleri else ile bitmese de calisir
        //ancak bu durumda sadece bir olasilik calisabilir veya hic bir islem yapilmayabilir




















    }
}
