package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicidan pozitif bir tamsayi alip while loop ile sayidan
        // kucuk pozitif sayilari yazdiralim

        int input=3;

        int sayi=1;


        while (sayi<input){ // burada 3 olunca loop devreye girmiyor ama 3 kez kontrol yapilmis oluyor
            System.out.println(sayi); //while loop once kontrol yapiyor sonra islem yapiyor
            sayi++;// bunu engellemek icin once islemi yapalim sonra kontrol edelim demisler bunu da do while ile yapcaz
        }


        //ayni soruyu do while loop ile yapalim
        sayi=1;

        do{ // burada 2 sayi yazdirip 2 kontrol yapiyor
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);






    }
}
