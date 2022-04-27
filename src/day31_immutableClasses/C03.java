package day31_immutableClasses;

public class C03 {
    public static void main(String[] args) {
        String str1=("mehmet");
        String str2=("mehmet");

        System.out.println("new == " + (str1 ==str2));
        System.out.println("new equals " + (str1.equals(str2)));
    }
}
