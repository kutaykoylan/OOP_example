package Exceptions;

public class AnalysisNotFoundException extends Exception {
    public AnalysisNotFoundException() {
        super("Analysis not found!");
    }

    public AnalysisNotFoundException(String message) {
        super(message);
    }
}
