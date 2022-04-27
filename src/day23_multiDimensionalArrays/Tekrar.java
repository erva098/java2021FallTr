package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        //Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini  ekrana yazdiran
        // bir program yaziniz { {1,2,3}, {4,5}, {6} }

        int arr[][]={ {1,2,3}, {4,5}, {6} };
        int carpim=1;

        for (int i = 0; i <arr.length-1 ; i++) {
            carpim*=arr[i][arr.length-1];
        }
        System.out.println(carpim);

    }

}
