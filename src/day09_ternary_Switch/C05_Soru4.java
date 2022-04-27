package day09_ternary_Switch;

import java.util.Scanner;

public class C05_Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi >= 0 ? "sayi pozitif" : sayi * sayi);


    }
}
