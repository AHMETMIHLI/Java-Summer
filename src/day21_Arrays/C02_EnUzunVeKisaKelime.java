package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
      //  Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

     String [] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

     enUzunVeKisayiYazdir(isimler);

    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i <isimler.length ; i++) {
            if(isimler[i].length()>enUzunKelime.length()){  // Burda String'in uzunlugunu aldığımız için Length() parantez kullanıldı
                enUzunKelime=isimler[i];
            }
            if(isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }

        } System.out.println("Arrak'daki en uzun kelime : "+ enUzunKelime);
          System.out.println("Arrak'daki en kısa kelime : "+ enKisaKelime);
    }
}
