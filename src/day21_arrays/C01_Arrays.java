package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
       //array'i nasil declare ederiz
        //data turu, array'in ismi ve koseli parantez yazarak array declare edilir

        int arr1[]={1,3,5};
        int[] arr2={1,3,5};
        int [] arr3={1,3,5};

        double arr4[]={10.2,20.2,5};

        String arr5[]={"ali","veli","ayse"};

        //assign mecburi midir?
        int sayi;

        int arr6[];

        //kullanmadan once mutlaka deger atamasi yapmamiz gerekir

        //hem declare edip hem de atama yapacaksam nasil yapabilirim?
        //1- declare edip esitligin sagina suslu parantez icerisine degerleri yazabilirim
        String arr7[]={"ali","veli","ayse"};
        //2- olusturup icine deger atamadan olusturmak isterseniz, boyutunu belirlememiz gerekir

        int arr8[]=new int[5]; //java icinde 5 tane default deger olan bir array olusturur
                               //[0,0,0,0,0]

    }
}
