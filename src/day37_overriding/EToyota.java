package day37_overriding;

public class EToyota extends DAraba {

    @Override
    void marka() {
       /* super.marka();
        eger hem overridden hemde overreiding method'un calismasini istersek
        ilk satıra super.marka(); yazabiliriz

        */
    }


    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
