package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //gun pazar veya cumartesi ===> haftasonu
        //gun pazartesi veya sali veya carsamba veya persembe veya cuma ===> hafta ici

        //String case sensitive'dir
        //yani pazar/Pazar/pAzar bunlar hep farkli kelimelerdir
        // bu durumda String method'larindan yardim aliriz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase();//kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba")
                || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");
        }

        //String ifadelerde == kullanilmasi tavsiye edilmez
        //cunku bekledigimizden farkli sonuc verebilir
        //if sartlarini tolowercase yaptigin icin kucuk harflerle yazdin.Buna dikkat et cunku hata yaptin:)
        //touppercase olsaydi gunleri buyuk yazacaktin :)
        //girisin tamamini kucuk harfe cevirdigin icin karsilastirmayi da kucuk harfle yapmalisin






















    }
}
