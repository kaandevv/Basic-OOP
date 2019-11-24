//overloading
public class day3 {
    public static void main(String[] args) {
        int weatherCelcius=22;
        float weatherCelcius2=23.5f;
        func(weatherCelcius);
        func(weatherCelcius2);
    }
    private static void func(int weatherCelcius) {
        System.out.println("Now celcius:"+weatherCelcius);
    }
    //OVERLOADİNG
    private static void func(float weatherCelcius){
        System.out.println("Now celcius:"+weatherCelcius);
    }

}
