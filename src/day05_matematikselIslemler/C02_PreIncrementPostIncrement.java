package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++; //burada iki islem var sayi1=artirilacak,sayi2=deger atanacak
                       //post var
        System.out.println(sayi1 + " ," + sayi2 + "," + sayi3);//11,10,30

        sayi3=++sayi1;//sayi3=deger atanacak sayi1=artirilacak
                      //pre var

        System.out.println(sayi1 + " ," + sayi2 + "," + sayi3); //12,10,12

        System.out.println(sayi3++); //once yazdiracak sonra artiracak //12

        System.out.println(sayi3);//13

        System.out.println(--sayi2); //once azalt,sonra yazdir. 9 yazdirir



















    }
}
