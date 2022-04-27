package day08_ifElseIfStatements;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre girin");
        char sifre=scan.next().charAt(0);


       if (sifre>='A'&& sifre<='Z'){
           if (sifre=='A'){
               System.out.println("gecerli sifre");
           }else{
               System.out.println("gecersiz sifre");
           }

       }else if (sifre>='a'&&sifre<='z'){
           if (sifre=='z'){
               System.out.println("gecerli sifre");
           }else{
               System.out.println("gecersiz sifre");
           }

       }







    }
}
