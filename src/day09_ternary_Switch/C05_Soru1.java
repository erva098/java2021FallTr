package day09_ternary_Switch;

import java.util.Scanner;

public class C05_Soru1 {
    public static <sayi2> void main(String[] args) {
        //kullanicidan iki tamsayi alin buyuk olmayan sayiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);


    }
}
