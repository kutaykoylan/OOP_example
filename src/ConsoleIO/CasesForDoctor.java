package ConsoleIO;

import Exceptions.AnalysisNotFoundException;
import Exceptions.PatientNotFoundException;
import Tools.*;

import java.util.*;
/*
 see the patients he/she will see that day,
 ask for blood test and/or radiology after the examination,
 write necessary prescription after the examination,
 decide on a surgery after the examination,
 list all patients under his/her care,
 search and/or see the results of analysis,
 list all the patients examined
 search any patient that examined in the past
 search any appointed surgery for him/her
 */
//System.out.println("Press 3 to ask for blood test and/or radiology after the examination");
//System.out.println("Press 4 to write necessary prescription after the examination");
//System.out.println("Press 5 to decide on a surgery after the examination");
public class CasesForDoctor {
    // see the patients he/she will see that day,
    public void case1(Hospital hospital){
        for(int i=0;i<hospital.getListOfPatients().size();i++)
        System.out.println(hospital.getListOfPatients().get(i));
    }
    public void case2(Hospital hospital, Doctor doctor){
        CaseForExamination caseForExamination = new CaseForExamination();
        Scanner in = new Scanner(System.in);
        Searcher searcher = new Searcher();
        List<Patient> list;
        try {
            list =searcher.searchForDate(hospital,doctor);
            for(Patient pat:list) {
                System.out.println(pat);
            }
                System.out.println("Enter name of the patient you want to examine");
                String name=in.next();
                try {
                    list=searcher.searchForName(list, name);
                }catch (PatientNotFoundException e) {
                    System.err.println(e.getMessage());
                }
                caseForExamination.casesForExamination(hospital,list.get(0),doctor);

        }catch (PatientNotFoundException e){
            System.err.println(e.getMessage());
        }
        searcher=null;

    }
    public void case3(Hospital hospital,Doctor doctor){
        MakeList makeList = new MakeList();
        List<Patient> list =makeList.listofPatientForDoctor(hospital,doctor);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    public void case4(Hospital hospital,Doctor doctor){
    Searcher searcher = new SearchForAnalysis();
        MakeList makeList = new MakeList();
        List<Patient> list =makeList.listofPatientForDoctor(hospital,doctor);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    try {
        searcher.searchForAnalysis(hospital, doctor);
    }catch (AnalysisNotFoundException e){
        System.err.println(e.getMessage());
    }
    }
    public void case5(Hospital hospital){
       F�ndExaminedPatient finder = new F�ndExaminedPatient();
       finder.findExaminedPatient(hospital);
       finder=null;

    }
    public void case6(Hospital hospital){
        F�ndExaminedPatient finder = new F�ndExaminedPatient();
        List<Patient> patients=finder.findExaminedPatientInThePast(finder.findExaminedPatient(hospital));
        if(patients.size()>1)
            System.out.println("There is more than one patient with that name");
        for(Patient patient: patients){
            System.out.println(patient);
            patient.getExamination().askForBloodTest();
            patient.getExamination().askForRadiologyTest();
        }
    }
    public void case7(Hospital hospital,Doctor doctor){
        for(int i=0;i<hospital.getListOfAppointments().size();i++){
        if(hospital.getListOfAppointments().get(i).getSurgery().getSurgeon().getName().equals(doctor.getName())){
            System.out.println(hospital.getListOfAppointments().get(i));
            }
        }

    }
}
