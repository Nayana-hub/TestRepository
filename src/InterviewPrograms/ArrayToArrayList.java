package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String [] array=new String[]{"sd","sa","sasa"};
        List<String> arraylist=new ArrayList<>( Arrays.asList(array));

        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        arraylist.add("H");
        System.out.println(arraylist);
    }
}
