package day18_nestedForLoop;
public class C05_NestedForLoop {
    public static void main(String[] args) {
         /*
       A
       A B
       A B C
       A B C D
       A B C D E
       A B C D E F
       şeklini yazdırınız.
       */
        char input ='L';
        for (char i = 'A'; i <=input ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j + " ");
                /* j'yi yazdirdik cunku i'yi yazdirsaydik soyle olurdu
                   A
                   B B
                   C C C
                   D D D D
                   E E E E E
                   F F F F F F
                 */
            }
            System.out.println("");
        }
    }
}