package day09_ternary_Switch;

import java.util.Scanner;

public class C05_Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi % 2 == 0 ? "sayi cift " : "sayi tek");


    }
}
