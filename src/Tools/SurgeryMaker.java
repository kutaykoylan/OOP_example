package Tools;

import java.util.Date;

public class SurgeryMaker {
    public void setPatient(Hospital hospital,Patient patient){
        for(int i=0;i<hospital.getListOfPatients().size();i++){
            if(hospital.getListOfPatients().get(i).getName().equals(patient.getName())){
                hospital.getListOfPatients().set(i,patient);
                hospital.getListOfPatients().get(i).setExaminated(true);
                hospital.getListOfPatients().get(i).setExamination(patient.getExamination());
            }
        }

    }
    public void AppointmentSetter(Patient patient, Hospital hospital, Date date2){
        Examination examination=patient.getExamination();
        patient = new Inmate(patient.getName(),patient.getDateThatPatientRegistered(),7,patient.getBloodType(),hospital,hospital.getListOfDoctors().get(0));
        patient.setExamination(examination);
        setPatient(hospital,patient);
        Appointment appointment = new Appointment(patient.getDoctor().getName(),date2);
        Surgeon surgeon =(Surgeon)hospital.getListOfDoctors().get(0);
        appointment.setSurgery(new Surgery(surgeon,patient));
        patient.setTreatment(appointment.getSurgery());
        hospital.getListOfAppointments().add(appointment);
        System.out.println(appointment);

    }
}
