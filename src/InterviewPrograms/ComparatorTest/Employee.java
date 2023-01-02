package InterviewPrograms.ComparatorTest;

import java.util.Comparator;

public class Employee  {
    private int id;
    private String Name;
    private int salary;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Employee(int id, String name, int salary, int age) {
        this.id = id;
        Name = name;
        this.salary = salary;
        this.age = age;
    }


}
