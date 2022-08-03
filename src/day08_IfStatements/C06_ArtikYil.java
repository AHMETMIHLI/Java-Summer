package day08_IfStatements;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        int yil=scan.nextInt();

        if(yil%4!=0) {
            System.out.println("Artik yil değil");
        }else if(yil%100!=0){
            System.out.println("Artik yil");
        }else if(yil%400!=0){
            System.out.println("Artik Yil değil");
        }else {
            System.out.println("Artik yil");
        }


    }
}
