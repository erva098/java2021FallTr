package day17_forLoop;

import java.util.Scanner;

public class C12_Soru4 {
    public static void main(String[] args) {
        //kullanicidan bir string isteyin ve string'i tersine ceviren bir program yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime girin");
        String kelime=scan.nextLine();

        tersKelimeKontrol(kelime);

    }

    private static void tersKelimeKontrol(String kelime) {
        for (int i =kelime.length()-1; i >=0 ; i--) {
            System.out.print(kelime.charAt(i));
        }
    }
}
