package OOP.Get_Set_metodlari;

public class Mainone {
    public static void main(String[] args){
        Bilgisayar bilgisayar = new Bilgisayar("4GB","512GB","linux");
        // biz burda bilgisayar. deyip degiskenlere direk erisip değiştirebiliriz. fakat bizim amacımız degiskenlere direk erismeyi engelleyip get ve set metodları ile o işi yapmalıyız.

        bilgisayar.setRam("8GB");    //burda "set" ile erisip degeri degistirebiliriz böyle.

        /* bu "getRam" ile de yukarıda "setRam" ile değiştirebildiğimiz ram değişkenini
        "getRam" ile de alıp ekrana yazdıralım "Get" almak için "Set" degistirmek icin */
      System.out.println(bilgisayar.getRam());


      /* diger nesneler ve ozellıkler içinde aynı seyler geçerli yapalım..
       bu seferde isletimsistemi degiskenini "setisletimsistemi" ile degistirelim.*/
        bilgisayar.setIsletim_sistemi("win10");
        //ve simdide "getİsletimsistemi" ile alıp ekrana yazdıralım.
        System.out.println("eskiden isletim sistemi linuxdu simdi set ile degistirip --> "+bilgisayar.getIsletim_sistemi()+" yaptik");

    }

}
