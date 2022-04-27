package day17_forLoop;

public class C06_Forloop {
    public static void main(String[] args) {
        //verilen  iki harf ve aralarindaki harfleri yazdiran bir kod yaziniz
        //string alirsan harfler arasinda ilerleyemezsin ama char ascii kullandigi icin ilerleyebilirsin
        char ilkHarf='c';
        char sonHarf='s';

        //for icinde artirip azaltabilecegimiz seyler kullaniriz yani String ve boolean olmaz
        //for icine char yazmayi unutma int olarak kalirsa harflerin ascii degerleriyle sonuc veriyor
        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i+ " ");
        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;
        //baslangic ve bitis sayilari arasinda artis miktari ile olusacak tum sayilari yazdirin

        for (double i = baslangic; i <=bitis; i+=artis) {

            System.out.print(i + " ");
        }












    }
}
