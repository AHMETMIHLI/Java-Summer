package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {
        // baslangic noktasindan sonra
        // bitis sartına yaklasmiyorsak sonsuz loop olusur

     /*  for (int i = 0; i >-10 ; i++) {
        System.out.println(i);
        }
*/
      // eger ilk deger icin bile bitis sartı saglanmıyorsa
      // for loop calisir
        // ama loop bady'si hicbir zaman devreye girmez(calismaz)

        for (int i = 0; i >5 ; i++) {
            System.out.println(i);;

        }
    }
}
