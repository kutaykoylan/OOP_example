package Tools;

public class Surgery extends Treatment {
    private Surgeon surgeon;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public Surgeon getSurgeon() {
        return surgeon;
    }

    public Surgery(Surgeon surgeon,Patient patient){
        this.surgeon= surgeon;
        this.patient=patient;
    }
}
