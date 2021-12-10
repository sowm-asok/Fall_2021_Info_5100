package CustomSorting;

import java.util.Comparator;

public class DateOfBirthComparator implements Comparator<Student>  {

    //Sort students in ascending order of date of birth
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getDateOfBirth().compareTo(student2.getDateOfBirth());
    }
}
