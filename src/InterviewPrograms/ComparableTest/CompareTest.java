package InterviewPrograms.ComparableTest;

import java.util.Arrays;

public class CompareTest {
    public static void main(String[] args) {
        Employee[] earray=new Employee[4];
        //int id, String name, int salary, int age
        earray[0]=new Employee(10,"Bhavika",32323,30);
        earray[1]=new Employee(1,"Parth",8000,20);
        earray[2]=new Employee(5,"Nitin",1000,40);
        earray[3]=new Employee(100,"Renu",54543,44);
        Arrays.sort(earray);
        System.out.println("Sorted Array"+Arrays.toString(earray));
    }
}
