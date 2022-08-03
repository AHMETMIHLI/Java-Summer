package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

         /*
   Kullanicidan toplanmak uzere sayilar alin
   sayilarin toplami 500'ü gecince (500 dahil) sayiların toplamini ve
   kac sayi toplantıgını su sekilde yazdırın.

   13 sayi girdiniz ve toplamları 567
     */

        int toplam=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);

        while(toplam<500){
            System.out.println("Lutfen toplamak için sayi girin:");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(sayac+ "sayi girdiniz toplamları : "+ toplam);
    }
}
