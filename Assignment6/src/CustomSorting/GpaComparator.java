package CustomSorting;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {

    //Sort students in descending order of gpa
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare (student2.getGpa(), student1.getGpa());
    }

}
