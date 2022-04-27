package day10_switch_StringManipulation;

import java.util.Scanner;

public class C05_Soru4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen SDET kisaltmasindaki harflerden birini yazin");
        char harf=scan.next().toUpperCase().charAt(0);

        switch (harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
                default:
                    System.out.println("lutfen gecerli bir harf girin");







        }

















    }
}
