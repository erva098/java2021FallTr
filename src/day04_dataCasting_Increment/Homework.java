package day04_dataCasting_Increment;

public class Homework {
    public static void main(String[] args) {

        //soru-1 byte veri tipinde bir degisken olusturun, short,int,long,float,double data tiplerinde
        // birer degisken olusturup adim adim widening yapin ve yazdirin


        byte sayi=14;
        System.out.println(sayi); //14
        short sayi2=sayi;
        System.out.println(sayi2); //14
        int sayi3=sayi2;
        System.out.println(sayi3); //14
        long sayi4=sayi3;
        System.out.println(sayi4); //14
        float sayi5=sayi4;
        System.out.println(sayi5); //14.0
        double sayi6=sayi5;
        System.out.println(sayi6); //14.0

        // soru-2 int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int sayi7=150;
        System.out.println(sayi7); // 150
        short sayi8=(short) sayi7;
        System.out.println(sayi8);//150
        byte sayi9=(byte) sayi8;
        System.out.println(sayi9); //-106


        //soru-3 float data turunde bir variable olusturun ve yazdirin

        float harf= 65.9f;
        System.out.println(harf); //65.9

        //soru-4 double 255.36 sayisini int'a ve sonra da olusturdugunuz int sayiyi byte'a cevirip yazdirin

        double harf2=255.36;
        int harf3= (int) harf2;
        System.out.println(harf3);//255
        byte harf4=(byte) harf3;
        System.out.println(harf4);//-1


        //soru-5 int iki sayiyi birbirine boldurun ve sonucu yazdirin

        int num1=34;
        int num2=3;
        System.out.println(num1/num2);

        //soru-6 int bir sayiyi double bir sayiya boldurun ve sonucu yazdirin

        int num3=65;
        double num4=7;
        System.out.println(num3/num4); //9.285714285714286

        //soru-7 farkli data tipleri islem yapip, sonuclarini yazdiralim

        byte num5=10;
        short num6=13;
        int num7=14;
        long num8=65;
        float num9=93;
        double num10=73;
        System.out.println(num5*num8);//650
        System.out.println(num6-num10);//-60.0
        System.out.println(num7+num9);//107.0
        System.out.println(num9/num7);//6.642857









    }
}
