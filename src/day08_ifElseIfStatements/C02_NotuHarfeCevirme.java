package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not=scan.nextDouble();



        if (not<0 || not>100){ // sistemi bozacak boyle sartlari en basta yazmalisin
            System.out.println("lutfen gecerli bir not giriniz");
        }
        else if (not<50){
            System.out.println("notunuz D");
        }else if (not<60){
            System.out.println("notunuz C");
        }else if (not<80){
            System.out.println("notunuz B");
        }else {
            System.out.println("notunuz A");
        }

        //sartlardan bir tanesi calisiyorsa durumlari elimine ede ede gideriz











    }
}
