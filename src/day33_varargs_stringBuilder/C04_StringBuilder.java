package day33_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("yasasin java");

        System.out.println(sb1.indexOf("java"));//8

        System.out.println(sb1.lastIndexOf("s"));//4
        System.out.println(sb1.indexOf("s"));//2

        System.out.println(sb1.replace(0,7,"Ne guzel"));//Ne guzel java
        //stringBuilder muatable oldugu icin kalici olarak deger degisti

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA
        System.out.println(sb1);//Ne guzel java oldu. toString string methodlarini kullandigi icin tekrar aynisini yazdirdi

        System.out.println(sb1.delete(0,3));//guzel java
        System.out.println(sb1.deleteCharAt(5));//guzeljava

    }
}
