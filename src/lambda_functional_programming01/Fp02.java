package lambda_functional_programming01;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1)  t-> "Logic" , (t, u)-> "Logic"
    Bu yapıya "Lambda Expession"
    2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
    3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
 */
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);  //[8, 9, 131, 10, 9, 10, 2, 8]

        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami01(liste);
        tekrarsizCiftElemanlarinKareToplami02(liste);
        tekrarsizCiftElemanlarinKareToplami03(liste);
        tekrarsizCiftElemanlarinKuplerinCarpimi(liste);
        getMaxEleman(liste);
        enKucukEleman(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);


    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer>list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir); //8 9 131 10 9 10 2 8

    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir); //8 10 10 2 8
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer>list){
        list.stream().filter(Utils::tekElemaniSec).
                     map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);//81 17161 81
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){
        list.stream().distinct().filter(Utils::tekElemaniSec).
                map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);// 729 2248091

    }
    // 1.yol
    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer>list){
       Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).
               map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println("toplam = " + toplam);  //toplam = 168

    }
    // get() kullanarak 2.yol
    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer>list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).
                map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println("toplam = " + toplam);  //toplam = 168

    }

    // 3.yol
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer>list){
        Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).
                map(Utils::karesiniAl).reduce(0,Integer::sum);
        System.out.println("toplam = " + toplam);  //toplam = 168

    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKuplerinCarpimi(List<Integer>list){
        Integer carpim= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println("carpim = " + carpim); //carpim = 4096000
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer>list){
       Integer max= list.stream().distinct().reduce(Math::max).get();
        System.out.println("max = " + max);  //max = 131
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void enKucukEleman(List<Integer>list){
        Integer min=list.stream().distinct().reduce(Math::min).get();
        System.out.println("min = " + min); //min = 2
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer>list){
        Integer min=list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println("min = " + min);  //min = 8
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini
    // (elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
        List<Double>sonuc = list.stream(). // gerekli methodları kullanmamızı sağlar
                distinct().     // tekrarlı olanları almaz
                filter(t->t>5).  // koşula göre filtreleme yapar
                map(Utils::yarisiniAl). // her bir elemanın değerini değiştirmeye yarar
               sorted(Comparator.reverseOrder()). //Ters sıralama yapar
                collect(Collectors.toList()); // Elemanları Collection'a çevirir
        System.out.println("sonuc = " + sonuc);  // sonuc = [65.5, 5.0, 4.5, 4.0]

    }

}
