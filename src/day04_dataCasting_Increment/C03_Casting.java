package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2);

        sayi2=3;
        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);
        //java iki int sayiyi birbirine bolerse sonucu da int olarak verir
        //eger virgulden sonra kusurat varsa siler

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);


        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=4895;
        double sayi3=10;

        // sayi1=sayi1/sayi3; // iki farkli data turunun isleme koydugumuzda
        // java kucuk olan data turu icin autowidening yapar
        // bu islemi dusunursek sayi1/sayi3= isleminin sonucunu double kabul eder
        //sayi bolunur ama atama yapamayiz


        System.out.println(sayi1/sayi3);
        System.out.println(sayi3/sayi1);

    }


}
