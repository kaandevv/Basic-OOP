package OOP.Kalıtım_Inheritance;

public class Matematik_ogretmeni extends ogretmen {
    //simdi ogretmen sınfıındaki degiskenleri ve metodları kalıtım yapmis olduk.

    /*peki "ogretmen" sınfıındaki metodu veya degiskenleri degistirmek istersek napıcaz?
     */
    //ders yazdıgımda direk zaten dersAnlat cıktı override ediyoruz ve super anahtar kelimesini kullanmak zorundayiz.
    @Override
    public void dersAnlat() {
        /* super ile eristik simdi ise asagida degistirelim.. eger asagidaki  super.dersAnlat(); ı silersek sadece alttaki sonradan yazılan calısır
        eger  super.dersAnlat(); ı silmezsek hem ogretmen sınıfındaki  dersAnlat fonksiyonu hemde alttaki degistirilmis halide calisir 2 tane system.out basar yani.  */
        // super.dersAnlat();

        System.out.println("Ders anlat fonksiyonunu degisti.");
    }
}
