package day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        //verilen string'i tersten yazdiran bir kod yaziniz
        String str=" java cok zevkli";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
            System.out.println(str.charAt(i)); //iki sekilde de olur
        }



    }
}
