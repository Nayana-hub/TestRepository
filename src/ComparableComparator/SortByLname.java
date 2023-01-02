package ComparableComparator;

import java.util.Comparator;

public class SortByLname implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLname().compareTo(o2.getLname());
    }
}
