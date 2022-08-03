package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enuzunKelimeyiYazdir("Ali","Ayse","İsmail","Babayigit");
    }

    public static void enuzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }
        System.out.println("Girilen kelimelerden en uzun : "+ enUzunKelime);

    }
}
