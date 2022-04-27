package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // Concatenation yapmak icin iki ihtimalimiz var
        // istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya String class'indan gelen concat method'unu kullanabiliriz


        String str1="Java";
        String str2="candir";

        //java candir yazdiralim

        System.out.println(str1+" " + str2);

        String cumle=str1.concat(str2); // Javacandir

        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

        //concat  icine string degil de sayi veya boolean deger yazsak?
        //concat method'u icine string parametre ister
        //string disinda bir data turu yazdiginizda onu string haline getirmelisiniz

        //cumle=str1.concat(5);
        //cumle=str1.concat(true);

        cumle=str1.concat(""+5);
         cumle=str1.concat(true+"");










    }
}
