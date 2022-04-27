package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=20;

        System.out.println(sayi+10);
        //bu satirda sayiyi 10 artirmadim sayinin 10 fazlasini yazdirdim

        System.out.println(sayi);
        //eger atama yapmazsak sayida yaptigimiz artirma ya da azaltma kalici olmaz

        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+=10);
        System.out.println(sayi);

        System.out.println(sayi+=10);

        //bir variable'in degerini kalici olarak artirmak veya azaltmak isterseniz assignment sarttir

        System.out.println( "23.satir : "+ sayi++);
        System.out.println( "24.satir : "+ sayi);
        System.out.println("25.satir : " + ++sayi);
        System.out.println("26.satir : "+ sayi );


    }
}
