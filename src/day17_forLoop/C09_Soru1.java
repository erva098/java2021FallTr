package day17_forLoop;

import java.util.Scanner;

public class C09_Soru1 {
    public static void main(String[] args) {
        //kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar
        // 3'un veya 5'in kati olan sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi girin");
        int num=scan.nextInt();

        for (int i = 1; i <=num ; i++) {
            if (i%5==0 || i%3==0) {
                System.out.print(i+" ");
            }




        }




















    }
}
