package day23_multiDimensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        //verilen multi dimensional array'in tum elementlerinin toplamini bulun

        int arr[][]={{3,1,7,5},{6,10}};

        int toplam=0;

        //arr[0][1] 1'e ulasmak istersek. MDArray'de biz elementlere ulasmak istersek iki tane index'i olmali
        //biri outer array digeri inner array'deki sirasi ile ilgili

        for (int i = 0; i <arr.length ; i++) {
            for(int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }
        }
        System.out.println("array'deki elementlerin toplami : "+toplam);



    }
}
