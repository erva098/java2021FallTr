package day18_nestedForLoop;

import java.util.Scanner;

public class Soru01 {
    public static <scanner> void main(String[] args) {
        //kullanicidan iki sayi isteyin.Girilen sayilar ve aralarindaki tum sayilari toplayip,
        // sonucu yazdiran bir program yazin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki pozitif tamsayi girin");
        int baslangic =scan.nextInt();
        int bitis =scan.nextInt();
        int toplam=0;
        for (int i = baslangic; i<=bitis ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);
        

    }
}
