package day27_constructor;

public class Z {
    String isim;
    String Soyisim;
    int numara;
    boolean gercekMi;

    public Z(String ism, String soyism, int no, boolean grc) {
        isim = ism;
        Soyisim=soyism;
        numara = no;
        gercekMi = grc;

    }

    public Z(String isim, String soyisim, int numara) { //anlamli olmasini isteidigimiz icin ve bir daha bu isim mi
        //yoksa baska bir sey mi diye dusunmemize gerek kalmaz.Benim dokundugum class'daki instance olsun this.isim
        this.isim = isim;
        this.Soyisim = soyisim;
        this.numara = numara;
    }

    public String toString() {
        return ("Isim : "+isim+", Soyisim : "+Soyisim+", Numara : "+numara);
    }
    }
