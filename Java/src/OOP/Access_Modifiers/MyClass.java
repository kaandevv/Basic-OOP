package OOP.Access_Modifiers;

public class MyClass {
    public static void main(String[] args){
        SirtCantasi sirtCantasi = new SirtCantasi();
        sirtCantasi.agirlik=40;
        sirtCantasi.cantayiAc();
        System.out.println(sirtCantasi.agirlik);
       // System.out.println(sirtCantasi.marka); buna erişemeyiz cunku private
    }

}
