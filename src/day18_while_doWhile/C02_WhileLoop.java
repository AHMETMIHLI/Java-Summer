package day18_while_doWhile;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi adın bu sayinin rakamları toplamını yazdırın.

        int input=5432;
        int rakamlarToplami=0;
        int birlerbasamagi=0;
        int temp=input;


        while (temp>0){
            birlerbasamagi=temp%10;
            rakamlarToplami+=birlerbasamagi;
            temp/=10;
        }
        System.out.println(input+" sayisinin rakamlar toplami: "+ rakamlarToplami);
    }
}
