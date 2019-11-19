package OOP.Access_Modifiers;
    // private --> sadece o sınıftan baska hiçbir sınıftan erişilmiyor.
    // public  --> Bütün sınıflar erişebiliyor.
    // protected --> Aynı pakettekiler erişebiliyor.
    // default(boş bırakırsak bir şey yazmazsak yani --> Aynı pakettekiler erişebiliyor.
public class SirtCantasi {

    public  int agirlik ;
    private String marka="adidas";
    public void cantayiAc(){
        System.out.println("Canta acildi.");
    }


}
