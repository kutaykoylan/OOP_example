package Tools;
public  class Doctor extends Person {
    private Hospital hospital;

    public Doctor(String name, Hospital hospital) {
        super(name);
        this.hospital = hospital;
    }

    public Doctor() {
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
