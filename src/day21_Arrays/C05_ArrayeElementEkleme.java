package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String [] sinifListe={"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsım="Murat Babayigit";

        sinifListe=elemanEkle(sinifListe, eklenecekIsım);
        System.out.println(Arrays.toString(sinifListe));
    }

    public static String[] elemanEkle(String[] sinifListe, String eklenecekIsım) {

        String [] yeniSinifListesi=new String[sinifListe.length+1]; // [null,null,null,null]
        // eski listeden 1 eleman fazla ucunlukta yeni bir arry olusturdum
        for (int i = 0; i <sinifListe.length ; i++) {
            yeniSinifListesi[i]=sinifListe[i];
        }
        // oncelikle eski listedeki tum elemanları, yeni listeye tasidim.
            yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsım;
        // son index'e ise eklenecek ismi atadım

        return yeniSinifListesi;
    }
}
