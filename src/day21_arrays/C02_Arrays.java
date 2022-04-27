package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"ali","veli","ayse"};
        //array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]); //ali

        arr1[1]="esila";

        System.out.println(arr1[1]);//esila

        //array'in icindeki index'i kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]=new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        //System.out.println(arr2[5]);// hata verir sinirlarin disinda

        //Array'in tamamini yazdirmak istersek

        System.out.println(arr2);//[I@58372a00 yazdirdi, referans degeri
                                 //Array'ler non-primitive olduklarindan direk yazdiramayiz.yazdirmak istersek
                                 //java referans degerini yazdirir

        for (int i = 0; i <4 ; i++) {  // her seferinde for loop ile yazmak cok zahmetlidir
            System.out.print(arr2[i]);//0000
        }
        System.out.println(" ");
        //array'i yazdirmak icin javadaki arrays class'indan toString() kullanilir

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=22;

        System.out.println(Arrays.toString(arr2)); //[0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1)); //[ali, esila, ayse]




    }
}
