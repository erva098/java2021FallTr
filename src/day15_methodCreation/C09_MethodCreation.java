package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim="oguzhan";
        String soyisim="BALKAYA";
        String kKNo="1234567890987654";

        //eger sadece yazdiracaksaniz method'unuz void olabilir
        //eger bir method'dan bir islem yapmasini
        //ve yaptigi islemi bize getirmesini isterseniz
        //return type void degil,bize getirecegi sonucun data turunde olmalidir
        String gizlenmisIsimSoyism=isimSoyisimGizle(isim,soyisim);
        //bana isim ve soyismin gizlenmis halini getirmesini istiyorum
        //bekledigim donus String olur

        System.out.println(gizlenmisIsimSoyism);
        String gizlenmisKKNo = krediKartGizle(kKNo);
        System.out.println(gizlenmisKKNo);
    }

    public static String krediKartGizle(String kKNo) {
        String yeniKKNo="**** **** **** " + kKNo.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {

        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyIsim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        //method olusturmada 3. adim method calisinca sadece birsey mi yazdiracak
        //yoksa bize bir data mi dondurecek buna karar vermektir
        //bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        //return type'i void degil string sectik
        //ve method'un sonuna return edilecek datayi yazdik
        return yeniIsim+" "+yeniSoyIsim;
    }
}
