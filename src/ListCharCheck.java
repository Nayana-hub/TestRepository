import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCharCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("nayana");
        list.add("Test");
        list.add("moon");
        list.add("sun");
        list.add("earth");
        list.add("dummy");
        list.add("parth");
        list.add("shiv");
        System.out.println(list);
//        Iterator<String> it=list.iterator();

        for (String str : list) {
            if (str.contains("A") || str.contains("a")) {
                list1.add(str);
            }

        }
        System.out.println(list1);


    }
}
