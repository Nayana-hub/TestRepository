import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
       LinkedList<Integer> linklist=new LinkedList<Integer>();
        linklist.add(12);
        linklist.add(20);
        linklist.add(45);
        linklist.add(55);
        linklist.add(58);
        linklist.add(85);
        linklist.add(45);
//        Iterator IT=linklist.listIterator();
//        while (IT.hasNext()){
//            System.out.println(IT.next());
//        }
        Iterator I=linklist.descendingIterator();
        while (I.hasNext()){
            System.out.print(I.next());
        }

    }
}

