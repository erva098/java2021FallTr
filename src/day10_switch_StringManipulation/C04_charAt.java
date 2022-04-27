package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        //String'de herhangi bir karakteri almak istedigimizde o harfin index'ini kullanarak
        //str.charAt(istenen index) yazabiliriz
        //String de index sifirdan baslar

        String str="java cok guzel";
        //j yi yazdiralim
        //bosluk da bir karakterdir onu da say
        System.out.println(str.charAt(0));

        //g yi yazdiralim

        System.out.println(str.charAt(9));

        //va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(1));

        //cOK seklinde yazdirmak istersek

        System.out.println(str.toLowerCase().charAt(5)+"" + str.toUpperCase().charAt(6)+
               "" + str.toUpperCase().charAt(7));

        //son harfi yazdir
        //String de 14 harf var,son harfin index'i 14-1 dir
        System.out.println(str.charAt(14-1));  //uzunluk-1

        //eger uzunlugu index olarak girersek
        //java calistiktan sonra hata verir
        //System.out.println(str.charAt(14)); hata verdi

        System.out.println(""+str.toUpperCase().charAt(5)+str.toLowerCase().charAt(6)+str.toUpperCase().charAt(7));






    }
}
