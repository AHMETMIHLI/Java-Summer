package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        Verilen input'a gore *'lardan olusan bir ucgen olusturun
        Ornek input: 4 ise
                 *
                 * *
                 * * *
                 * * * *
         */

        int input=5;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
                
            }
            System.out.println("");
            
        }
    }
}
