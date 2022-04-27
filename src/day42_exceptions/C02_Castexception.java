package day42_exceptions;

public class C02_Castexception {
    public static void main(String[] args) {
        int sayi1=10;
        //String str=sayi; CTE java asla mumkun olmadigini bilir



        Object str3="Java cok guzel";
        String str4=(String) str3;
        System.out.println(str4);

        Object sayi2=20; ///obje daha buyuk

        String str2=(String) sayi2; // Explicit Narrowing
                                    //ClassCastException

    }
}
