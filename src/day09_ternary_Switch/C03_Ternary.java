package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=-140;
        //verilen sayinin uc veya daha cok basamakli olup olmadiginiz kontrol eden
        //ve sonucu yazdiran bir ternary olusturun

        String sonuc=sayi>=100  ? "sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

        //ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        //ya da sonucun data turune uygun bir variable'a atama yazdirabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);



    }

}
