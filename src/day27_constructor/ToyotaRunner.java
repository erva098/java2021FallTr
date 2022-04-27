package day27_constructor;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1=new Toyota();
        System.out.println(t1.marka);//Toyota
        System.out.println(t1.tekerAdedi);//4
        System.out.println(t1.model);//null
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2022;
        System.out.println("T1 model: "+t1.model+", yakit : "+t1.yakit + ", yil : "+t1.yil);
        t1.maxHiz();

        //instance obje variable'i oldugu icin t1 icin atadigimiz degerler
        // t2 icin gecerli degildir yeni degerler atariz
        Toyota t2=new Toyota();
        System.out.println(t2.model);//null
        System.out.println(t2.marka);//Toyota
        t2.model="Yaris";
        t2.yakit="Benzin";
        t2.yil=2021;
        System.out.println("T1 model: "+t2.model+", yakit : "+t2.yakit + ", yil : "+t2.yil);
        t1.renkTercihleri();
    }
}
