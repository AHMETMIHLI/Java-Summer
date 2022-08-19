package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {
        /*
        1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
        2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
        Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
        3) Functional Programming, Arrays ve Collections ile kullanılır.
        4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
 */
        //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
        // bir method oluşturun.(Structured)

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);


        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Functional");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKpununCarpimi(liste);
        getMaxEleman(liste);
        getMaxEleman02(liste);
        getMinEleman02(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin02(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);


    }
    public static void listElemanlariniYazdirStructured(List<Integer>list){

        for (Integer w:list) {
            System.out.print(w+" ");

        }
    }

    public static void listElemanlariniYazdirFunctional(List<Integer>list){
        list.stream().forEach(t-> System.out.print(t+" "));
        // stream() methodu collection'dan

    }

    ////2)Çift list elemanlarını  aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer>list) {

        for (Integer w:list
             ) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //2)Çift list elemanlarını  aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" ")); //8 10 10 2 8

    }

     //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer>list) {
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); //81 17161 81
          // elemanların degerleri değişcekse map methodu kullanılır.
    }

    //4) Ardışık tek list elemanlarin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list) {
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));  //729 2248091

    }

   //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){
        Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);  //168

    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKpununCarpimi(List<Integer>list){
       Integer carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim); //4096000

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

     public static void getMaxEleman(List<Integer>list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t :u );
      // yada  Integer max=list.stream().distinct().reduce(list.get(0),(t,u)-> t>u ? t :u );
         System.out.println(max); //131
     }
     // 2.yol
     public static void getMaxEleman02(List<Integer>list){
       Integer max= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
         System.out.println("max = " + max); //max = 131

     }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void getMinEleman02(List<Integer>list){
        Integer min=list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min = " + min); //min = 131
    }




    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void getYedidenBuyukCiftMin(List<Integer>list){
        Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println("min = " + min); //min = 8
    }

    // 2.yol
    public static void getYedidenBuyukCiftMin02(List<Integer>list){
        Integer min=list.stream().
                    distinct().
                    filter(t->t%2==0).
                    filter(t->t>7).
                    sorted(Comparator.reverseOrder()).
                    reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min = " + min); //min = 8
    }

    // 3.yol
    public static void getYedidenBuyukCiftMin3(List<Integer>list){
        Integer min=list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min); // 8
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu)
    // bulan bir method oluşturun.
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi (List<Integer>list){
       List<Double>sonuc= list.stream().distinct().filter(t-> t>5).map(t->t/2.0).
                          sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);  //[65.5, 5.0, 4.5, 4.0]
    }

}
