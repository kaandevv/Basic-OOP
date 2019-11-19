package OOP.Static_ve_Final_kavramlari;

public class MyClass {
    public static void main(String[] args){
        /* biz normalde bilgisayar class ını ve değişkenlerini kullanmak için napıyoduk "Bilgisayar" dan bir nesne üretiyoduk daha sonra bu nesne üzerinden
        bu nesnenin değişkenlerini giriyoduk veya metodunu kullanabiliyoduk simdi bir de Bilgisayar classında bir static değişken tanımlayalım nesne olusturmadan erişebilicez mi bakalım.
         */

        //farkli degiskenini Bilgisayar classından nesne olusturmadan da erisebiliyoruz asagida gördüğümüz gibi.
        Bilgisayar.farkli="nesne olmadan erisilen degiskenin degistirilmis hali";
        System.out.println(Bilgisayar.farkli);

        /* simdi ise bir de Bilgisayar class ında static bir metod tanımlayalım. Normalde
        * yine bir nesne olusturuyoduk o sınıftan sonra nesne.  deyip o nesne ile o class ın metodlarına erisebiliyorduk.
        * suan direk class adı. deyip eristik static olan metoda*/
        Bilgisayar.nesnesiz_fonk();

        /*Simdi ise bir de "final" anahtar kelimesine bakalım.
        * Herhangi bir sınıfın degiskenine eger final yazılırsa sadece birkere deger ataması yapılır. Daha sonra o deger degistirilemiyor.*/
    }
}