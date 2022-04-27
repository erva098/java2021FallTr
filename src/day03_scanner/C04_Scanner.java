package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //scanner kullanmak icin 3 adim takip ediyoruz
        //1.kendimize bir scanner olusturmak

        Scanner scan = new Scanner(System.in);
        //esitligin saginda yeni bir scanner olusturulur ve olusturulan bu
        //scanner scan variable'na assign edilir
        //scan variable'in ismidir istedigimiz ismi verebiliriz

        //2.adim kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin
        System.out.println("lutfen isminizi giriniz..");

        //3.adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin
        //String kullaniciIsmi=scan.next(); // SADECE ILK KELIMEYI ALIR (ILK SPACE'E KADAR OLAN BOLUMU ALIR)

        String KullaniciIsmi=scan.nextLine();//satir sonuna kadar girilen tum degerleri alir
        System.out.println("kullanicinin girdigi isim : " + KullaniciIsmi);




    }
}
