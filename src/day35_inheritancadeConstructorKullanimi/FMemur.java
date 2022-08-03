package day35_inheritancadeConstructorKullanimi;

public class FMemur extends EMuhasebe {

    FMemur(){
        System.out.println("Memur Parametresiz cons");
    }

    FMemur(String isim){
        System.out.println("Memur Parametreli cons");
    }

    public static void main(String[] args) {

        FMemur mmr1=new FMemur();
    }
}
