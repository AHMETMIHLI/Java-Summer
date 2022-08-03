package day18_while_doWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan tam sayi alın
        Kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin.
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;

        // while ile yapalım
        /*
        Loop'larda kullanacagimiz variable'lari Lopp'tan once olusturmalıyiz
        While Loop'da, Loop'dan önce olusturdugumuz bu variable'a atayacagimiz
         degeri iyi dusunmemiz gerekiyor.
         */

        while(sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz:");
            sayi= scan.nextInt();
            if(sayi%2==0){
                System.out.println("Girilen sayi cift: "+ sayi);
            }else {
                System.out.println("Girilen sayi tek,benden bu kadar");
            }


        }
        // do while loop ile yapalım.
        // do while loop da önceden olusturulan variable'a hangi değer atandığının hiçbir önemi yok
        // kodumuz her durumda calısır
        /*
        do-while'in dezavantajı ilk calıstirma kontrol yapılmadan oldugu icin loop'un
        bady'sinde yanlıs bir islem yapılmamasına dikkat etmek gerekir.
         */

        do {
            System.out.println("Lutfen bir sayi giriniz:");
            sayi= scan.nextInt();
            if(sayi%2==0){
                System.out.println("Girilen sayi cift: "+ sayi);
            }else {
                System.out.println("Girilen sayi tek,benden bu kadar");
            }
        }while(sayi%2==0);
    }
}
