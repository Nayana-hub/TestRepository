package ComparableComparator;

import java.util.Comparator;

public class SortbyMname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMname().compareTo(o2.getMname());
    }
}
