package day17_forLoop;

import java.util.Scanner;

public class C11_Soru3 {
    public static void main(String[] args) {
        //kullanicidan bir string isteyin ve string'i tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime girin");
        String kelime=scan.nextLine();

        for (int i = kelime.length()-1; i >=0 ; i--) {
            System.out.println(kelime.charAt(i));
        }

    }
}
