package OOP.Arayuz_Interface;
        /* interface kendisini implemente eden sınıfların kullanmak zorunda olduğu metodları içeren bir yapıdır. */
    public class Aslan implements IHayvan{
            /* biz IHayvan interface inde 2 tane fonksiyon
            tanımladık boş ! bu metodları burda Aslan sınıfı IHayvan interface ini implement ettiğinden bu metodları burda yazmak zorundayız.
             */
            @Override
            public void yemek() {
                System.out.println("Aslan yemek yedi");
            }

            @Override
            public void uyumak() {
                System.out.println("Aslan uyudu");
            }


    }
