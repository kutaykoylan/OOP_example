package Tools;

public class Therapy extends Treatment {
    private Prescription prescription;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Therapy(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Therapy{");
        sb.append("prescription=").append(prescription);
        sb.append('}');
        return sb.toString();
    }
}
