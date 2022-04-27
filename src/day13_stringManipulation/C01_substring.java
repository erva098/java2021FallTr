package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="java ile IT cok guzel";

        System.out.println(str.substring(5));//ile IT cok guzel
        //yukaridaki string'i kullanarak mehmet hoca ile IT cok guzel yapalim

        System.out.println(str.replace("java", "mehmet hoca"));
        System.out.println("mehmet hoca "+str.substring(5));
        System.out.println(str.substring(9));//IT cok guzel. yazilan index inclusive(dahil)

        //eger bir index'den sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir str.substring(baslangicindexi,bitisindexi)
        //baslangic indexi ==> inclusive/dahil
        //bitis indexi ==> eclusive/haric

        System.out.println(str.substring(0,5));// java (boslugu unutma)

        System.out.println(str.substring(0,1));//J

        //bana 6. karakter string olarak bulun
        //String harf=str.charAt(4); //boyle yapamazsin
        String harf=str.substring(5,6);
        System.out.println(harf);//i

        str="java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//"" verir. Bir sey yazdirmaz

        //System.out.println(str.substring(5,2));//bitis index'i baslangic index'inden kucuk olamaz

        System.out.println(str.substring(str.length()-1));//son harfi verir

        System.out.println(str.substring(str.length()-5));//son 5 harfi yazdiralim

        System.out.println(str.substring(str.length()));// son harften sonraki kismi yani hiclik verir

        //UNUTMA! length sadece karakter sayisi veriyor.Basina substring yazinca String olarak sonuc gelir.




    }
}
