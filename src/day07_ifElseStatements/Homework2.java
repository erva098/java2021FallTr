package day07_ifElseStatements;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas + " " + "sene daha calisman gerekiyor,good luck");
        }














    }
}
