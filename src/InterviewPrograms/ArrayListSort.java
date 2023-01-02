package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> arraylist=new ArrayList<>();
        arraylist.add(5);
        arraylist.add(4);
        arraylist.add(15);
        arraylist.add(50);
        arraylist.add(500);
        arraylist.add(3);
        arraylist.add(23);
        arraylist.add(11);
      //  Collections.sort(arraylist,Collections.reverseOrder());
       // Collections.reverse(arraylist);
        Collections.sort(arraylist);
        System.out.println(arraylist);
    }
}
