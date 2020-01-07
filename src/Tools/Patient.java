package Tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Patient extends Person {
    private Date dateThatPatientRegistered;
    private int stayNumberofDay;
    private String BloodType;
    private Hospital hospital;
    private Doctor doctor;
    private Treatment treatment;
    private boolean Examinated;
    private Examination examination;

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    private void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean isExaminated() {
        return Examinated;
    }

    public void setExaminated(boolean examinated) {
        Examinated = examinated;
    }

    public Examination getExamination() {
        return examination;
    }

    public void setExamination(Examination examination) {
        this.examination = examination;
    }

    public Date getDateThatPatientRegistered() {
        return dateThatPatientRegistered;
    }

    public void setDateThatPatientRegistered(Date dateThatPatientRegistered) {
        this.dateThatPatientRegistered = dateThatPatientRegistered;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }
    public int getNumberofDay() {
        return stayNumberofDay;
    }

    private void setNumberofDay(int numberofDay) {
        this.stayNumberofDay = numberofDay;
    }

    public Hospital getHospital() {
        return hospital;
    }

    private void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Patient(String name, Date dateThatPatientRegistered, int numberofDay, String bloodType, Hospital hospital,Doctor Doctor) {
        super(name);
        this.dateThatPatientRegistered = dateThatPatientRegistered;
        this.stayNumberofDay = numberofDay;
        BloodType = bloodType;
        this.hospital = hospital;
        setDoctor(Doctor);
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append(" Name = ").append(getName());
        sb.append(", dateThatPatientRegistered = ").append(dateFormat.format(dateThatPatientRegistered));
        sb.append(", stayNumberofDay = ").append(stayNumberofDay);
        sb.append('}');
        return sb.toString();
    }
}
