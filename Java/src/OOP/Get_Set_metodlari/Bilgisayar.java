package OOP.Get_Set_metodlari;
/*
Olusturdugumuz sınıfımızın içerisindeki değişkenlerin olası aksaklıklardan,
hatalardan koruma amaçlı direk erişimi engelleyip Get ve Set metodlarını  yazıcaz ve  kullanıcaz.
*/
public class Bilgisayar {
     private String ram;
     private String ssd;
     private String isletim_sistemi;

    //Constructor olusturalım tum parametrelerimizi alan bir constructor.
    public Bilgisayar(String ram, String ssd, String isletim_sistemi) {
        this.ram = ram;
        this.ssd = ssd;
        this.isletim_sistemi = isletim_sistemi;
    }

    //burada mouse' a sağ tıklayıp generate ordan Getter_Setter ve ordan da ctrl a deyip tum degiskenleri secip direk tum hepsinin GET ve SET degiskenlerini olusturabiliriz.
    //bunları olusturduktan sonra gidip main classının ıcınde private olan bu degiskenlere get ve set metodları ile erisip kullanıcaz.!
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
}
