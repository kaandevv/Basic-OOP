import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class day2 {

    public static Scanner scan= new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<String> arraym2 =new ArrayList<>();
        ArrayList<Integer> arraym3 =new ArrayList<>();
        HashSet<Boolean> hash =new HashSet<>();
        // hashset i doldurma
        hash.add(true);
        hash.add(false);
        karsilama("sen söyle");


        arraym2.add("one");
        arraym2.add("two");
        arraym2.add("three");
        arraym2.add("four");
        // System.out.println(arraym2.get(1));
        // foreach döngüsü
        for (String s :arraym2) {
            System.out.println(s);
        }

        for(int i=0;i<3;i++){
            int argument =scan.nextInt();
            arraym3.add(argument);

        }
        for (Integer p :arraym3){
            System.out.println(p);
        }
        System.out.println("boolean hashset ");
        for (Boolean b :hash){
            if (b==false){
                continue;
            }
            System.out.println(b);
        }


    }

    public static void karsilama(String name){
        System.out.println("your name:"+name);
    }
}
