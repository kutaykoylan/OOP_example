package Tools;

import Interfaces.IExaminatable;

public class Examination implements IExaminatable {
    private Doctor doctor;
    private Patient patient;
    private BloodTest bloodTest;
    private Radiology radiology;


    public Examination(Doctor doctor, Patient patient){
        this.doctor=doctor;
        this.patient =patient;
        this.bloodTest= new BloodTest(patient);
        this.radiology= new Radiology();
        patient.setExamination(this);
        patient.setExaminated(true);
    }

    @Override
    public void askForBloodTest() {
        System.out.println("Blood Type : "+bloodTest.getBloodType());
        System.out.println("Amount of Glucose: "+bloodTest.getTheAmountOfGlucose());
    }

    @Override
    public void askForRadiologyTest() {
        System.out.println("Radiological sickness : "+radiology.getSickness());
    }
}
