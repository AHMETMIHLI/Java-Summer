package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());
        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */

        ogr1.setBrans("Matematik");
        System.out.println(ogr1.getBrans());

        ogr1.setSoyisim("Kaya");
        System.out.println(ogr1.getSoyisim());
    }
}
