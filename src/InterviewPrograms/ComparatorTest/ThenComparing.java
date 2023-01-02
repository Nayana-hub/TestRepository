package InterviewPrograms.ComparatorTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    private  String fname;
    private String lname;
    private int age;
    private int id;
    public Student(String fname, String lname, int age, int id){
        this.age= age;
        this.id=id;
        this.fname=fname;
        this.lname=lname;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public int getAge(){
        return  age;
    }
    public int getId(){
        return id;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public  void setLname(String lname){
        this.lname=lname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setId(int id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "Student{" + "fname='" + fname + '\'' + ", lname='" + lname + '\'' + ", age=" + age +
                ", id=" + id + '}';
    }

    @Override
    public int compareTo(Student o) {
        int i=this.fname.compareTo(fname);
        if(i !=0)return i;
        i=this.lname.compareTo(lname);
        if (i !=0) return i;
        i=this.age-o.age;
        if(i !=0)return i;
        return Integer.compare(this.id,o.id);
    }
}
public class ThenComparing {
    public static void main(String[] args) {
        Student j= new Student("Rushikesh","Ghogare",28,5);
        Student j1= new Student("Shreya","Kanade",22,2);
        Student j2= new Student("Shraddha","Sonale",23,7);
        Student j3= new Student("Soham","Kulkarni",25,3);
        Student j4= new Student("Suvarna","Mokashe",20,1);
        Student j5= new Student("Anjali","Bharambe",13,2);
        Student j6= new Student("Sham","Soarse",43,2);
        Student j7= new Student("Sameer","Kale",29,1);
        Student j8= new Student("Rahul","Galve",20,9);
        List<Student> list=new ArrayList<>();
        list.add(j);
        list.add(j1);
        list.add(j2);
        list.add(j3);
        list.add(j4);
        list.add(j5);
        list.add(j6);
        list.add(j7);
        list.add(j8);



//
//        list.sort(Comparator.comparing((Student b)-> b.getFname()));
//        System.out.println( list);
//        list.sort(Comparator.comparing((Student :: getLname)));
//        System.out.println(list);
//        list.sort(Comparator.comparing((Student b)-> b.getId()));
//        System.out.println( list);
//        list.sort(Comparator.comparing((Student b)-> b.getAge()));
//        System.out.println();
        list.sort(
                Comparator.comparing(Student :: getId)
                        .thenComparing(Student :: getAge)
                        .thenComparing(Student :: getFname)
                        .thenComparing((Student b)-> b.getLname()));
        System.out.println(list);


    }

}




