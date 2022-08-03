package day37_overriding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private methodlar override edilemez. Eger chil classda parent classdaki
        private method ile aynı signutare de bir method olusturursanız
        bu overriding method olmaz.
         */
    }
    @Override
    void motor() {
        /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir
         */
    }
}
