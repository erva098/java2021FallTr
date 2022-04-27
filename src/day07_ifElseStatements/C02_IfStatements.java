package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a<b && b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }

        if (a>0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        System.out.println("2.satirda calisti");

        //bir if cumlesinin daha anlasilir olmasini istiyorsaniz if body'sini {} parantez icine yazmaliyiz
        //body'yi {} icine yazmazsak da if cumlesi calisir ancak ilk (;) gordugumuzde if cumlesi bitmis olur
        //15. satir kod 14. satirdaki if dogru olsada calisir false olsa da calisir. cunku ondan bagimsiz bir kod
        // if parantez icine sadece boolean kabul eder


























    }
}
