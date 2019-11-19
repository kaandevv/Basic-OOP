package OOP.Static_ve_Final_kavramlari;
    /* --> Static ve Final anahtar kelimeleri <--
    Normalde bir sınıfın değişkenlerine metodlarına erişmek için o sınıfın nesnesi kullanılmalıydı.
    Fakat static özelliği sahip bir değişken ya da metod sınıfının içerisnde tanımlanmış olsada o sınıfın nesnesiyle var olmaz.
    Bu özelliği sahip yani static özelliğe sahip yapılar bellekte 1 kere oluşturulur ve bulunduğu sınıftan bir nesne üretilmeden de ulaşılabiliyor.
     */
public class Bilgisayar {
    public String ssd;
    public String ram;

    public static String farkli ="nesne olmadan erisilen degisken";

    public void calistir(){
        System.out.println("bilgisayar calisti.");
    }

    public static void nesnesiz_fonk(){
        System.out.println("nesne olusturulmadan erisilen  fonksiyon cagrildi.");
    }

    /*                          simdi ise final anahtar kelimesine bakalım
    simdi bir final degisken tanımlayalım  bu degiskene sadece bir kere deger ataması yapılabiliyor daha sonra bu deger degistirilemiyor. */

    public final String isletimsistemi="IOS";


}
