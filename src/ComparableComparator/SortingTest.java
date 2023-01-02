package ComparableComparator;

import java.util.*;
import java.util.stream.Collectors;

class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private String mname;
    private String lname;
    private int marks;


    public Student(int id, String fname, String mname, String lname, int marks) {
        this.id = id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }


    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    @Override
    public int compareTo(Student o) {
        return this.getMarks() - o.getMarks();
    }
}

class SortbyFname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}

public class SortingTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Nayana", "V", "Jamale", 70));
        list.add(new Student(1, "abc", "V", "Jamale", 10));
        list.add(new Student(1, "xyz", "V", "Jamale", 30));
        list.add(new Student(10, "Anjali", "T", "Bharambe", 98));
        list.add(new Student(9, "Gita", "R", "Jagdale", 40));
        list.add(new Student(8, "Somu", "M", "Sane", 20));
        list.add(new Student(7, "Kundlik", "M", "Mane", 60));
        list.add(new Student(6, "Nilkant", "R", "patil", 30));
        list.add(new Student(5, "Vivan", "V", "Raje", 67));
        list.add(new Student(4, "Nil", "B", "Kale", 55));
        list.add(new Student(2, "Sharyu", "T", "Sathe", 76));
        list.add(new Student(3, "Vaibhav", "M", "More", 98));

//        ListIterator<Student> I = list.listIterator();
//        while (I.hasNext()) {
//            System.out.println(I.next());
//        }
        //     Collections.sort(list);
//        ListIterator<Student> I= list.listIterator();
//        while (I.hasNext()){
//            System.out.println(I.next().toString());
//        }

//        Collections.sort(list, new SortbyFname());
//
        //  System.out.println(list);
//        Collections.sort(list, new SortByLname());
//
//        System.out.println(list);
//
//        Collections.sort(list, new SortbyMname());
//        System.out.println(list);
//        Collections.sort(list, new SortById());
//        System.out.println(list);

//        list.sort(Comparator.comparing(Student::getId)
//                .thenComparing(Student::getMarks)
//                .thenComparing(Student::getFname));
//        System.out.println(list);

//      Map<Boolean,List<Student>> smarks=list.stream()
//        .collect(Collectors.partitioningBy(student->student.getMarks()>40));
//        System.out.println(smarks);
    }
}
