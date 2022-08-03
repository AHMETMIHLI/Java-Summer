package day18_while_doWhile;

public class C01_WhileLoop {
    public static void main(String[] args) {
          /*
        Kullanicidan baslangic ve bitis harflerini alın ve baslangic harfinden baslayıp
        bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdırın.
        Kullanicinin hata yapmadıgini farz edin.
         */

        char ilkHarf='f';
        char sonHarf='t';
        String buyult="";

        char temp=ilkHarf;
        while(temp<=sonHarf){
            buyult=(temp+" ").toUpperCase();    // char'ı hiclikle toplarsak bu String olur.
            System.out.print(buyult+ " ");
            temp+=1;
        }

    }
}
