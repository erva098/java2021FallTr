package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnorecase {
    public static void main(String[] args) {
        //kulllaniciya derse katilip katilmak istemedigini sorun evet derse,
        // cevabini ve derse katiliminiz alinmistir yazdirin
        //hayir derse cevabini ve sonraki derslerimize bekleriz yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("derse katilmak ister misiniz ? \nevet veya hayir yaziniz");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " sonraki derslerimize bekleriz");
        }else{
            System.out.println("lutfen evet veya hayir yaziniz");
        }













    }
}
