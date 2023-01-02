import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListPracticeTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<Integer> ls = new ArrayList<Integer>();
        List<Integer> linklist = new LinkedList<Integer>();
        String str;
        ls.add(6);
        ls.add(7);
        ls.add(8);
        ls.add(60);
        ls.add(6);
        ls.remove(2);
        System.out.println(ls);

        list.add("Nayana");
        list.add("Jyoti");
        list.add("Sonu");
        list.add("Manu");
        list.add("Tanu");
        list.add("Ranu");
        linklist.add(3);
        linklist.add(6);
        linklist.add(8);
        linklist.add(9);
        linklist.add(5);
        linklist.add(3);


        Iterator<String> IT = list.iterator();
        while (IT.hasNext()) {
            System.out.println(IT.next());
        }
        Iterator<Integer> I = linklist.iterator();
        while (I.hasNext()) {
            System.out.print(I.next());
        }
LinkedList l=new LinkedList<>();
        l= (LinkedList) ((LinkedList<Integer>) linklist).clone();
        System.out.println(l);

    }
}
