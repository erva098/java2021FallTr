package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {

        Cons01 obj1=new Cons01();//default consturctor devrede
        /* Cons01 Class'inda Hic constructor olusturmazsak,
           java default constructor'i kullandigindan
           obj1'i uretebiliriz

           Ancak biz parametreli ve parametresiz ve constructor yazdigimizda
           java default constructor'i siler

           Dolayisiyla biz herhangi bir constructor olusturdugumuzda
           daha once baska class'lar veya kullanicilarin olusturmus
           olabilecegi objeleri kullanabilmeleri icin
           default consturctor'in islevini gerceklestirecek
           parametresiz bir consturctor olusturmakta fayda var!!!!!

        */

        //baskalarinin kodu calisiyorsa bozulmasin diye default cons yerine bir parametresiz cons olustururuz
        Cons01 obj2=new Cons01("java");

    }
}
