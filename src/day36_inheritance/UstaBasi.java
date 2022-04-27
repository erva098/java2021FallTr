package day36_inheritance;

public class UstaBasi extends Isci {
    public static void main(String[] args) {
        UstaBasi ustabasi1=new UstaBasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Gokcek";
        ustabasi1.maas=ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="Ustabasi";
        System.out.println(ustabasi1);


    }
    public String toString() {
        return "UstaBasi{" +
                "\nisciStatu='" + isciStatu + '\'' +
                ", \nsaatUcreti=" + saatUcreti +
                ", \nstatu='" + statu + '\'' +
                ", \nmaas=" + maas +
                ", \npersNo=" + persNo +
                ", \nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nadres='" + adres + '\'' +
                ", \ntel='" + tel + '\'' +
                '}';
    }
}
