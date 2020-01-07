package ConsoleIO;

import Tools.*;

public class CaseForExamination {
    public void casesForExamination(Hospital hospital, Patient patient, Doctor doctor){
                Examination examination = new Examination(doctor,patient);
                System.out.println("Blood test(1) or Radiology Test(2)");
                int examine = ExceptionHandler.inputMismatch();
                if(examine==1){
                    examination.askForBloodTest();
                    patient.setExamination(examination);
                    patient.setExaminated(true);
                }
                else if(examine==2){
                    examination.askForRadiologyTest();
                    patient.setExamination(examination);
                    patient.setExaminated(true);
                }else
                    System.out.println("Please enter 1 or 2 ");
        ExaminationDisplayer examinationDisplayer = new ExaminationDisplayer();
        examinationDisplayer.displayExaminationProcess(hospital, patient, doctor);
        examinationDisplayer=null;

    }

}
