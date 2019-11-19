package OOP.Constructor_ve_this;

public class Mantik {
    String konu;
    String konu_basligi;
    float sayfa_Sayisi;

    //Constructor olusturma
    public Mantik(String konu,String konu_basligi,float sayfa_Sayisi){
        //yukarıdaki  parametreleri girdik ama ileride olusturucağımız nesnelere nasıl bu parametreleri
        // o nesnenin değişkeni olarak atıcaz? bunu da this kavramı ile yapıyoruz.
        this.konu=konu; //bu ileride olusturucağım nesnenin konu değişkenini işaretlemis olucaz. aynı sekılde asagidakilerde öyle.
        this.konu_basligi=konu_basligi;
        this.sayfa_Sayisi=sayfa_Sayisi;
        // bu olusturdugumuz constructor u nasıl kullanıcaz? şöyle; mainone classa gidip orda NESNE olustururken parametre olarak bu değişkenleri giricez.
    }

    //bir tane daha constructor olusturalım fakat verdiğimiz parametreler farklı olmalı ! tamamen aynı olmamalı.Bu constructor da sadece 2 değişkeni alarak olusturduk.
    //bu constructor dan da gidip nesne olusturalım
    public  Mantik (String konu, String konu_basligi){
        this.konu=konu;
        this.konu_basligi=konu_basligi;

        }
    //boş constructor da olusturabilirdik hic parametre girmeden .
    public Mantik (){
        //bos constructor
    }
}

