package Interfaces;
import Exceptions.AnalysisNotFoundException;
import Exceptions.PatientNotFoundException;
import Tools.*;
import java.util.List;

public interface ISearchable {
    List<Patient> searchForDate(Hospital hospital,Doctor doctor)throws PatientNotFoundException;
    List<Patient> searchForName(List<Patient> patients,String name) throws PatientNotFoundException;
    void searchForAnalysis(Hospital hospital,Doctor doctor) throws AnalysisNotFoundException;
}
