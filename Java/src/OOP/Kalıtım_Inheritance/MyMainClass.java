package OOP.Kalıtım_Inheritance;

public class MyMainClass {
    public static void main(String[] args) {
        //simdi Matematik_ogretmeni sınıfından bir nesne olusturup o
        // nesneyi kullanarak kalıtım yaptıgımız ogretmen sınıfındaki degisken ve metodlara erisip kullanabilicez.

        Matematik_ogretmeni matematik_ogretmeni = new Matematik_ogretmeni();
        System.out.println(matematik_ogretmeni.lise);
        System.out.println(matematik_ogretmeni.dersSaati);
        matematik_ogretmeni.dersAnlat();

        //bunlara guzel bir sekilde eristik peki ogretmen sınfıındaki metodu veya degiskenleri degistirmek istersek napıcaz?
        //Matematik_ogretmeni sınıfında gidelim ve bakalım
    }
}
