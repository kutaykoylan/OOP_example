package Tools;

public class Prescription {
    private String prescription;

    public Prescription(String prescription) {
        setPrescription(prescription);
    }

    public String getPrescription() {
        return prescription;
    }

    private void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
