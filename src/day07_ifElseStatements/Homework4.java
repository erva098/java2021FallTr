package day07_ifElseStatements;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter girin");
        char karakter=scan.next().toUpperCase().charAt(0);

        if ((karakter>='A'&& karakter<='Z') || (karakter>='a' && karakter<='z')){
            System.out.println("girdiginiz karakter bir harftir");
        }else{
            System.out.println("girdiginiz karakter bir harf degildir");
        }










    }
}
