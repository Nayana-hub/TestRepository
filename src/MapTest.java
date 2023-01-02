import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> hashmap=new HashMap<>();
        Map<Integer,String> linkhm=new LinkedHashMap<>();
        Map<Integer,String> treemap=new TreeMap<>();
        hashmap.put(1,"A");
        hashmap.put(2,"Z");
        hashmap.put(3,"C");
        hashmap.put(4,"G");
        hashmap.put(7,"O");
        hashmap.put(9,"B");
        hashmap.put(1,"A");
        //for each loop
        for(Map.Entry<Integer,String> mp1:hashmap.entrySet()){
            System.out.print(mp1.getKey()+""+mp1.getValue());
            System.out.print("\t");
        }
        System.out.println();
        linkhm.put(1,"A");
        linkhm.put(2,"Z");
        linkhm.put(3,"C");
        linkhm.put(4,"G");
        linkhm.put(7,"O");
        linkhm.put(9,"B");
        linkhm.put(1,"A");

        for(Map.Entry e:linkhm.entrySet()){
            System.out.print(e.getKey()+""+e.getValue());
            System.out.print("\t");
        }
        treemap.put(4,"G");
        treemap.put(7,"O");
        treemap.put(9,"B");
        treemap.put(1,"A");
        treemap.put(1,"A");
        treemap.put(2,"Z");
        treemap.put(3,"C");

        //for each loop
        for(Map.Entry<Integer,String> mp1:treemap.entrySet()){
            System.out.print(mp1.getKey()+""+mp1.getValue());
            System.out.print("\t");
        }
        System.out.println( treemap.size());
    }

}
