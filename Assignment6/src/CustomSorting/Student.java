package CustomSorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, String dob) throws ParseException {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
