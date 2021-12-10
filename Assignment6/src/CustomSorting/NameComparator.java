package CustomSorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    //Sort students in ascending order of name
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
