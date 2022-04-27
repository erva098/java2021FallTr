package day20_scope_Arrays;

public class C02_StaticVariables {

    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {


        /*instance variable'lar objeye bagimlidir ve her obje farkli degerler alabilir
          ogrenci notlari veya ogretmen branslari gibi
          bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

          static variabler ise class variable olarak tanimlanir
          ve tum class uyeleri icin aynidir. okul ismi, okul mudurunun adi gibi
          eger static variable'in degeri degistirilirse herkes icin degisir

         */


        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false

        staticMethod();//bunu buraya yazdigimiz da 200 yazdirdi!
        System.out.println(okulNo);//200



    }

    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200 bunu burada cagirdigimiz icin concal'da goremeyiz
    }




}
