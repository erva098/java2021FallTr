package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

        //verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        //Orn  : sayi1=10 ve sayi2=20;
        // kod calistiktan sonra  sayi1=20 ve sayi2=10



       int sayi1=10;
       int sayi2=20;
        System.out.println("kod calismadan once= " + "sayi1: " +sayi1 + ", sayi2: " + sayi2);
       int bos;
       bos=sayi2;
       sayi2=sayi1;
       sayi1=bos;

        System.out.println("kod calistiktan sonra= " + "sayi1: " + sayi1 + ", sayi2: " + sayi2);










    }



}
