package Tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
    private String doctorsName;
    private Date appointmentsDate;
    private Surgery surgery;

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public Date getAppointmentsDate() {
        return appointmentsDate;
    }

    public void setAppointmentsDate(Date appointmentsDate) {
        this.appointmentsDate = appointmentsDate;
    }

    public Appointment(String doctorsName, Date appointmentsDate) {
        this.doctorsName = doctorsName;
        this.appointmentsDate = appointmentsDate;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        final StringBuilder sb = new StringBuilder("Appointment{");
        sb.append("doctorsName='").append(doctorsName).append('\'');
        sb.append(", appointmentsDate=").append(dateFormat.format(appointmentsDate));
        sb.append(", patientName=").append(getSurgery().getPatient().getName());
        sb.append('}');
        return sb.toString();
    }

    public Appointment() {
    }
}
