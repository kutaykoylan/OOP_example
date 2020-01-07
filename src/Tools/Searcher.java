package Tools;
import ConsoleIO.ExceptionHandler;
import Exceptions.AnalysisNotFoundException;
import Exceptions.PatientNotFoundException;
import Interfaces.ISearchable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public  class Searcher implements ISearchable {
    @Override
    public List<Patient> searchForDate(Hospital hospital,Doctor doctor) throws PatientNotFoundException {
        List<Patient> patients = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Date(dd/MM/yyyy) ");
        String date = in.next();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date2=null;
        try {
            //Parsing the String
            date2 = dateFormat.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(dateFormat.format(date2));
        for(int i=0;i<hospital.getListOfPatients().size();i++){
            if(dateFormat.format(hospital.getListOfPatients().get(i).getDateThatPatientRegistered()).equals(dateFormat.format(date2))){
                if(hospital.getListOfPatients().get(i).getDoctor().getName().equals(doctor.getName()))
                    patients.add(hospital.getListOfPatients().get(i));
            }
        }
        if(patients.size()==0)
            throw new PatientNotFoundException();
        return patients;
    }
    @Override
    public List<Patient> searchForName(List<Patient> patients,String name) throws PatientNotFoundException {
        List<Patient> listToReturn = new ArrayList<>();
        for(int i=0;i<patients.size();i++){
                if(patients.get(i).getName().equals(name))
                    listToReturn.add(patients.get(i));

        }
        if(listToReturn.size()==0)
            throw new PatientNotFoundException();
        return listToReturn;
    }

    @Override
    public void searchForAnalysis(Hospital hospital, Doctor doctor) throws AnalysisNotFoundException {
        System.err.println("Unavailable");
    }
}
