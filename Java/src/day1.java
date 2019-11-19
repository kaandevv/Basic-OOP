import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class day1 {
   /* public Map<String, String> hh(HashMap2<String, Integer>){
        return H;
    } */
    public static Scanner scan= new Scanner(System.in);
    public static void main(String[] args){
        /* System.out.println("hello");
        System.out.println("hello" +"\n"+"world");
        int a=5;
        System.out.println("a:"+a);
        float f=4.1f;
        double d=1.2;
        System.out.println("f:"+f+"\n"+"d:"+d);
        char c='f';
        System.out.println("char value c:"+c);
*/
        System.out.println("*");
        int[] marray=new int[3];
        int i;
        int j=0;
        marray[0]=1;
        marray[1]=12;
        marray[2]=123;

        /* while (j<marray.length){
            System.out.println(marray[j]);
            j++;
            if (j==marray[2]){
                break;
            }
        }*/
        ArrayList<String> arraym= new ArrayList<>();
        for(i=0;i<=5;i++){
            String element = scan.nextLine();
            arraym.add(element);
        }
        for (i=0;i<arraym.size();i++){
            System.out.println("element"+i+":"+arraym.get(i));
        }
        System.out.println("finish");

        // foreach döngüsü
        for (String s :arraym) {
            System.out.println(s);
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("element1",2);
        hashMap.put("element2",3);
        hashMap.put("element3",4);
        int size =hashMap.size();

        System.out.println("hashmap s}ize:"+size);
        HashMap<String,HashMap> hashMap1 =new HashMap<>();
        hashMap1.put("elements",hashMap);

        System.out.println(hashMap1.size());
        HashMap s = hashMap1.get("elements");
        System.out.println("s :"+s);




    }
}
