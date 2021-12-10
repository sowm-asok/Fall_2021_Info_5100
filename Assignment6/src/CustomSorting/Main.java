package CustomSorting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Student darius = new Student(01, "Darius", 4.0, "11/04/2007");
        Student brooklyn = new Student(02, "Brooklyn", 3.4, "13/12/2005");
        Student yasmine = new Student(03, "Yasmine", 3.7, "04/07/2005");
        Student ben = new Student(04, "Ben", 3.9, "29/11/2002");
        Student kenji = new Student(05, "Kenji", 3.1, "18/06/2009");
        Student sammy = new Student(06, "Sammy", 3.2, "23/05/2001");

        List<Student> students = new ArrayList<>();
        students.add(darius);
        students.add(brooklyn);
        students.add(yasmine);
        students.add(ben);
        students.add(kenji);
        students.add(sammy);

        System.out.println("The current students are:\n");
        printStudents(students);
        System.out.println("***********************************************************");

        System.out.println("Students are sorted by ascending order of 'name':\n");
        students.sort(new NameComparator());
        printStudents(students);
        System.out.println("***********************************************************");

        System.out.println("Students are sorted by descending order of 'gpa':\n");
        students.sort(new GpaComparator());
        printStudents(students);
        System.out.println("***********************************************************");

        System.out.println("Students are sorted by ascending order of 'dateOfBirth':\n");
        students.sort(new DateOfBirthComparator());
        printStudents(students);
        System.out.println("***********************************************************");
    }

    private static void printStudents(List<Student> students) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName() + ", GPA: " + student.getGpa() + ", DOB: " + dateFormat.format(student.getDateOfBirth()));
        }
    }
}
