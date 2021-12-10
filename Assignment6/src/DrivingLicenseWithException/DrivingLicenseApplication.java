package DrivingLicenseWithException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date of birth in dd/MM/yyyy format: ");
        // Edge case scenarios tested
        // Dec 08, 2005 = 06/12/2005 = eligible to apply
        // Dec 09, 2005 = 07/12/2005 = eligible to apply
        // Dec 10, 2005 = 08/12/2005 = not eligible to apply

        String dobString = scanner.next();
        Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(dobString);

        int age;
        age = calculateAge(dob);

        try {
            checkApplicantEligible(age);
        }
        catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Thank you for using our application");
        }
    }

    private static int calculateAge(Date dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        //Convert Date to LocalDate format
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Instant instant = dateOfBirth.toInstant();
        LocalDate localDateDob = instant.atZone(defaultZoneId).toLocalDate();

        Period period = Period.between(localDateDob, currentDate);
        int age = period.getYears();
        System.out.println("Your age is: " + age);
        return age;
    }

    private static void checkApplicantEligible(int age) throws AgeException {
        if(age >= 16) {
            System.out.println("The age of the applicant is " + age + " and the applicant is eligible to apply for a driving license");
        } else {
            throw new AgeException(age);
        }
    }
}
