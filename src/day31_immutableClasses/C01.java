package day31_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);
        degistir(list);
        System.out.println("13.satir"+list);
        degistir2(list);
        System.out.println("15.satir"+list);
    }




    private static void degistir(List<Integer> list) {

        for (Integer each:list) {
            each=each+3;
            System.out.println("25.satir"+each+" ");
        }
        System.out.println();
        System.out.println("28.satir"+list);

    }
    private static void degistir2(List<Integer> list) {
        for (int i = 0; i <list.size(); i++) {
            list.set(i,list.get(i)+3);
            System.out.println("34.satir"+list.get(i)+" ");
        }
        System.out.println();
        System.out.println("37.satir"+list);
    }
}
