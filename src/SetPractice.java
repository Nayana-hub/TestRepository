import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> hashset=new HashSet<>();
        Set<String> linkhashset=new LinkedHashSet<>();
        Set<String> treeset=new TreeSet<>();
        Object[] array=new Object[0];
        hashset.add("Nayana");
        hashset.add("Suvarna");
        hashset.add("Shreya");
        hashset.add("Shradha");
        hashset.add("Anjali");
        hashset.add("Nayana");

        for(String str:hashset){
            System.out.print(str);
        }
        System.out.println(hashset.contains("Anjali"));

        array=hashset.toArray();
        for(Object a:array){
            System.out.println(a);
        }
        System.out.println();
        linkhashset.add("Rushi");
        linkhashset.add("Nayana");
        linkhashset.add("Suvarna");
        linkhashset.add("Shreya");
        linkhashset.add("Rahul");
        linkhashset.add("Shradha");
        linkhashset.add("Anjali");
        linkhashset.add("Nayana");
        linkhashset.add("Soham");

        for(String str:linkhashset){
            System.out.println(str);
        }

        System.out.println();
        treeset.add("Rushi");
        treeset.add("Nayana");
        treeset.add("Suvarna");
        treeset.add("Shreya");
        treeset.add("Rahul");
        treeset.add("Shradha");
        treeset.add("Anjali");
        treeset.add("Nayana");
        treeset.add("Soham");

        for(String str:treeset){
            System.out.println(str);
        }
    }
}
