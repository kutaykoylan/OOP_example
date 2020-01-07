package Tools;

import java.util.ArrayList;
import java.util.List;

public class MakeList {
    public List<Patient> listofPatientForDoctor(Hospital hospital,Doctor doctor){
        List<Patient> listforDoctor = new ArrayList<>();
        for(int i=0;i<hospital.getListOfPatients().size();i++){
            if(hospital.getListOfPatients().get(i).getDoctor().getName().equals(doctor.getName()))
                listforDoctor.add(hospital.getListOfPatients().get(i));
        }
        return listforDoctor;
    }
}
