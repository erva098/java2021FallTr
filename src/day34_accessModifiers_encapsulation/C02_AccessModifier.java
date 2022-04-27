package day34_accessModifiers_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {
        C01 obj = new C01();

        obj.acikString="Bye";
        C01.acikSayi=50;

        //C01.sayi=15; privite access modifier'i oldugundan baska class'dan erisilemez

        //obj.method1; privite access modifier'i oldugundan baska class'dan erisilemez

        //C01 objParametreli=new C01(5); privite access modifier'i oldugundan baska class'dan erisilemez



    }
}
