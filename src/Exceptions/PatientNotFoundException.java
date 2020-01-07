package Exceptions;

public class PatientNotFoundException extends Exception {
    public PatientNotFoundException(String message) {
        super(message);
    }

    public PatientNotFoundException() {
        super("Patient not found!");
    }
}
