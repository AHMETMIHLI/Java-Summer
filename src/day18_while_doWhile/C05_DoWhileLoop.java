package day18_while_doWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru1) 9 dan 190 a kadar 7 nin katı olan tum tamsayilari ekrana yazdırınız.
         */

        int bas=9;
        int bitis=190;

        int temp=bas;

        //while loop ile

        while (temp<bitis){
            if(temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }

        // do while loop ile yapalım

        System.out.println("");
        temp=bas;
        do {
            if(temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }while(temp<bitis);

    }
}
