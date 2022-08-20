package lambda_functional_programming01;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp03 {
    public static void main(String[] args) {
        //lambda_functional_programming

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);  //[Ali, Ali, Mark, Amanda, Christopher, Jackson, Mariano, Alberto, Tucker, Benjamin]

        buyukHarfleYazdir(liste);
        System.out.println();
        //  buyukHarfleYazdir02(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizYazdir(liste);
        System.out.println();
        uzunlugaGoreİlkHarfiSirala(liste);
        System.out.println();
        // bestenBuyukleriSil(liste);
        //baslangiciAYdaSonuNOlaniSil(liste);
        // baslangiciAYdaSonuNOlaniSil02(liste);
        uzunluguSekizileOnArasiVeOİleBiteniSil(liste);

    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN
    }

    /*2.yol
    public static void buyukHarfleYazdir02(List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);  //[ALİ, ALİ, MARK, AMANDA, CHRİSTOPHER, JACKSON, MARİANO, ALBERTO, TUCKER, BENJAMİN]

    }

     */
    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        // Comparator.comparing : sıralama koşulunu belirtmek için kullanır.
        //Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).
                reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //Christopher Benjamin Jackson Mariano Alberto Amanda Tucker Mark Ali Ali
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizYazdir(List<String> list) {
        list.stream().distinct().
                sorted(Comparator.comparing(Utils::sonKarakteriAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
        //Amanda Ali Mark Jackson Benjamin Mariano Alberto Christopher Tucker
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp
    // yazdıran bir method oluşturun.
    public static void uzunlugaGoreİlkHarfiSirala(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).
                thenComparing(Utils::ilkKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //Ali Ali Mark Amanda Tucker Alberto Jackson Mariano Benjamin Christopher
        ////thenComparing() :==>siralam icin bir kosul daha belirtir
    }

    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
    // public static void bestenBuyukleriSil(List<String>list){
    //     list.removeIf(t->t.length()>5);
    //     System.out.println(list);  //[Ali, Ali, Mark]
    // }
    // List , mutable olduğu için elemanları işlem sonrası kalıcı değiştiğinden comment-out yapıyorum .
    // removeIf(): koşul doğru ise onu sil


    // 7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
    // 1.yol
    // public static void baslangiciAYdaSonuNOlaniSil(List<String> list) {
    //    list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length() - 1) == 'N' || t.charAt(t.length() - 1) == 'n');
    //    System.out.println(list);
    //    //[Mark, Christopher, Mariano, Tucker]
    //}
    //  2.yol
    //  public static void baslangiciAYdaSonuNOlaniSil02(List<String> list) {
    //      list.removeIf(t -> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
    //      System.out.println(list);   //[Mark, Christopher, Mariano, Tucker]
    //
    //  }

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.
    public static void uzunluguSekizileOnArasiVeOİleBiteniSil(List<String> list) {
        list.removeIf(t->(t.length()>7 && t.length()<11) || t.endsWith("o"));
        System.out.println(list);
    }

}
