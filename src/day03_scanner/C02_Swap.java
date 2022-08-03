package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
       Verilen sayi1 ve sayi2 variable'larının değerini değiştiren (SWAP) bir program yazınız
       Orn: sayi1=10 ve Sayi=20;
       kod çalıştıktan sonra
       sayi1=20 ve sayi2=10
         */

        int sayi1=10;
        int sayi2=20;
        int sayi3=0;  // Geçiçi kovamız
        // adım1- sayi2'i boş kovaya koyalım
        sayi3=sayi2; // 10 20 20

        // adım2- 1.sayıyı 2.sayıya atayacağız
        sayi2=sayi1;  // 10  10  20

        // adım 3. boş kovodaki sayıya sayıyı atayalım
        sayi1=sayi3;  // 20 10 20


        System.out.println("Swap'dan sonra sayi1 : " + sayi1); // 20
        System.out.println("Swap'dan sonra sayi2 : "+ sayi2);  // 10

    }
}
