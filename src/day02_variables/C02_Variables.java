package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {


        //java calismaya main method'dan baslar
        //sonra yukaridan asagi,soldan saga dogru calisir

        // eger istersek bir variable'i once declare edip sonra deger atayabiliriz

        String okulIsmi;

        //java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        //ancak deger atamasi yapincaya kadar o variable'i kullanamiza izin vermez
        //System.out.println("okulIsmi");

        okulIsmi="yildiz koleji";
        System.out.println(okulIsmi);

        okulIsmi="star koleji";
        System.out.println(okulIsmi);

       okulIsmi="java koleji";

       //println dediginizde yazdirma isleminden sonra alt satira gecerken
       //sadece print dedigimizde yazdirma isleminden sonra alt satira gecmez

       System.out.print(okulIsmi);
       System.out.print(okulIsmi);





    }







}
