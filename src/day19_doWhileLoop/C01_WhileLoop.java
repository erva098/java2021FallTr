package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
       // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin


       int input=20;
       //for loop ile de yapabiliriz ama biz while loop ile yapalim
        //islem yapmadan once kullanacagimiz variable'lari loop oncesi olustururuz.
        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.println(bolen+" ");
                sayac++;
            }
            bolen++;//biz for loop'da 3 sey yaziyorduk bunlardan biri de i'nin artisi yaza azalisiydi
            //eger bunu yazmazsak her seferinde bolen 1 kalir ve bolen 1 oldugu icin sonsuza kadar gider
        }

        System.out.println(" ");
        System.out.println(input+" sayisini bolen "+sayac+" adet vardir ");






    }
}
