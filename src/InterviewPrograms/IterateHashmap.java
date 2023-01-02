package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class IterateHashmap {
    public static void main(String[] args) {
        HashMap<String,String>hs=new HashMap<String,String>();
        hs.put("1","A");
        hs.put("2","B");
        hs.put("3","C");
        hs.put("4","D");
        hs.put("5","O");

//        for(Map.Entry e:linkhm.entrySet()){
//            System.out.print(e.getKey()+""+e.getValue());
//            System.out.print("\t");
//        }
        for(Map.Entry  entry:hs.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
