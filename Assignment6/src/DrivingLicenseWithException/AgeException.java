package DrivingLicenseWithException;

public class AgeException extends Exception {
    public AgeException(int age) {
        super("The age of the applicant is " + age + " which is too early to apply for a driving license");
    }
}
