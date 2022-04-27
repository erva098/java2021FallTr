package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //string'i yazdiran method olusturalim
        //hosgeldiniz diyen bir method olusturun
        //kapanma mesaji yazan bir method olusturalim

        hosgeldinYazdir();

    }
    public static void kapanmaMethodu() {
        System.out.println("Bizi tercih etiiginiz icin tesekkur ederiz :-) ");
    }
    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldiniz");
        stringYazdir("boyle de olur");
    }
    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
