package Tools;

import Exceptions.AnalysisNotFoundException;
import Exceptions.PatientNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchForAnalysis extends Searcher {
    @Override
    public void searchForAnalysis(Hospital hospital,Doctor doctor) throws AnalysisNotFoundException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of the patient you want to look for his/her analysis:(You will able to see first patient that registered with that name)");
        List<Patient> patient=new ArrayList<>();
        boolean loopcond=true;
        do {
            String name =in.next();
            try {
               patient =super.searchForName(hospital.getListOfPatients(),name);
                loopcond=false;

            }catch (PatientNotFoundException e){
                System.err.println(e.getMessage());
            }
        }while(loopcond);
        if(patient.get(0).isExaminated()){
            patient.get(0).getExamination().askForRadiologyTest();
            patient.get(0).getExamination().askForBloodTest();


        }else
            throw  new AnalysisNotFoundException();

    }
}
