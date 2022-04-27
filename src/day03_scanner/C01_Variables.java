package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

        //farkli uc data turunde variable olusturun ve bunlari yazdirin

        String okul="Yildiz Koleji";
        System.out.println(okul);

        char harf='a';
        System.out.println(harf);

        int sayi1, sayi;
        sayi1=10;
        sayi=2;
        System.out.println(sayi+sayi1);


        // isim ve soyisim olarak iki variable olusturun ve bunlari
        // isminiz : erva
        //soyisminiz : yildiz kaya seklinde yazdirin

        String isim="erva";
        String soyIsim="Yildiz kaya";
        System.out.println("isminiz : " + isim);
        System.out.println("soyIsminiz : " + soyIsim);

        //iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3=30;
        double sayi4=40;
        System.out.println("iki sayinin toplami : " + (sayi3+sayi4));//basina aciklama yapacaksak sayilari parantez icine almaliyiz

        //bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        double sayi5=45;
        int sayi6=4;
        System.out.println(sayi5+sayi6);

        //char data turunde variable olusturun ve yazdirin
        char harf3='a';
        System.out.println(harf3);

        //bir tamsayi ve bir char degisken olusturun ve bunlarin toplamini yazdirin
        int sayi8=10;
        char harf4='w';
        System.out.println(sayi8+harf4); //char data turundeki degiskenler matematiksel islemlerde kullanilirsa
        // o char degerinin ASCII karsiligi isleme alinir
























    }
}
