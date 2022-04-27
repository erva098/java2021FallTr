package day18_nestedForLoop;
public class C03_NestedForLoop {
    public static void main(String[] args) {
        // Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //      *
        //      * *
        //      * * *
        //      * * * *

        int input = 5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                //ucgen olmasi icin for'u satir sayisina bagliyoruz. Onu da i kontrol ediyor
                // nested for loop ya diktorgen veya ucgen formatinda olabilir
                // diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz.Mesela int input2=8;
                //degiskeni olusturup 5'e 8 bir dikdortgen de elde edebiliriz.
                // ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}