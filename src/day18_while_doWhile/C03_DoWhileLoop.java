package day18_while_doWhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        while loop'da önce kontrol edip sonra islem yaptigimiz icin
        islem bittikten sonra loop'un kırılması icin bir kez  daha basa donmemiz gerekiyor
        bu durumda fazladan bir islem yapılıyor .
         */

        int sayi=7;
        while (sayi<10){
            System.out.print(sayi);
            sayi++;
        }

        System.out.println("");
        // do-while loop ile calistigimizda bu dezavantaj ortadan kalkar

        sayi=7;
        do {
            System.out.print(sayi);
            sayi++;
        }while(sayi<10);
    }
}
