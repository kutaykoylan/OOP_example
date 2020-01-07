package Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FýndExaminedPatient {
    public List<Patient> findExaminedPatient(Hospital hospital){
        List<Patient> patients = new ArrayList<>();
        for(Patient pat : hospital.getListOfPatients()){
            if(pat.isExaminated()){
                patients.add(pat);
            }
        }
        if(patients.size()!=0) {
            for (Patient pat : patients) {
                System.out.println(pat);
            }
        }else
            System.out.println("There is no patient examined");
        return patients;
    }
    public List<Patient> findExaminedPatientInThePast(List<Patient> patientList){
        List<Patient> listToReturn = new ArrayList<>();
        System.out.println("Enter name:");
        Scanner in = new Scanner(System.in);
        String name =in.next();
        for(Patient pat : patientList){
            if(pat.getName().equals(name)){
                listToReturn.add(pat);
            }
        }
        return listToReturn;
      
    }
}
