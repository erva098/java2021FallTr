package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str="  siz ne derseniz deyin java bildigini okur.  ";

        str.trim();
        System.out.println(str);//atama olmadigi icin bosluklar var
        System.out.println(str.length());//46

        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());//42





    }
}
