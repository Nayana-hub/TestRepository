package InterviewPrograms.ComparatorTest;

import java.util.Comparator;

public class SortbyId implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId()-o2.getId();
    }
}
