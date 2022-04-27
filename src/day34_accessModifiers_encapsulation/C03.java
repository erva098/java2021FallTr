package day34_accessModifiers_encapsulation;

public class C03 {
    //encapsule edecegimiz 2 variable olsun

    private int sayi;
    private String str;

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                ", str=" + str ;
    }

    public int getSayi() {//sadece gorur degistirme yapamaz
        return sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {//degistirme yapilir

        this.str = str;
    }
}
