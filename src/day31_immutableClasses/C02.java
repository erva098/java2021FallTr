package day31_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C02 {
    public static void main(String[] args) {
        int num[]={10,11,12};
        degistirArray(num);
        System.out.println(Arrays.toString(num));//[10, 11, 12]
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        degistirList(list);
        System.out.println(list);//[10,11,12]
    }
    private static void degistirList(List<Integer> list) {
        list= new ArrayList<>();
        list.add(40);
        System.out.println(list);//[40]
    }
    public static void degistirArray(int[] num) {
        num=new int[5];
        System.out.println(Arrays.toString(num));}//[0, 0, 0, 0, 0]
}