package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {
        Object[] o1=new Object[10];
        List<Integer>arraylist=new ArrayList<>();
        arraylist.add(4);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(1);
        arraylist.add(9);
        for(Integer i:arraylist){
            System.out.println(i);
        }
       o1= arraylist.toArray();
        for(Object obj :o1){
            System.out.println( obj);
        }

        if(arraylist.contains(300))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
