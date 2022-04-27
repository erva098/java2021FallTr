package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin 
        // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)
        //faktoryel oldugu icin sifir degil 1 secmek daha mantikli 
        
        int input=9;
        int faktoryel=1;
        String faktoryelAcikYazim="";
        for (int i = input; i >=1; i--) { //input'dan baslayalim ve i>=1 olana kadar devam edelim demek

            faktoryel *=i;

            if (i==input){
                System.out.println();
                faktoryelAcikYazim=faktoryelAcikYazim+i;
            }else{
                faktoryelAcikYazim=faktoryelAcikYazim+"*"+i;
            }


        }

        System.out.println(input+"! ="+faktoryelAcikYazim+"="+faktoryel);//loop disinda yap.Cunku
        // tek tek yazdiriyor direk sonucu yazdirmiyor




    }
}
