package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //kullanicidan karenin bir kenar uzunlugunu alin.karenin cevresini ve alanini hesaplayip yazdirin

        System.out.println("karenin kenar uzunlugunu giriniz..");

        int kenar= scan.nextInt();
        System.out.println("girdiginiz karenin cevresi: " + (4*kenar));
        System.out.println("girdiginiz karenin alani: " + (kenar*kenar));

    }
}
