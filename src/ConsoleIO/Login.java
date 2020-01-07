package ConsoleIO;

import Tools.*;
import java.util.*;

public class Login {

//Doctor(String name, Hospital hospital)
private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    private void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean docCheck(Hospital hospital){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name to login:");
        String name =in.next();
        boolean booleanToReturn=false;
        for(int i=0;i<hospital.getListOfDoctors().size();i++){
            if(hospital.getListOfDoctors().get(i).getName().equals(name)) {
                booleanToReturn = true;
                setDoctor(hospital.getListOfDoctors().get(i));
                break;
            }
        }
        return booleanToReturn;
    }

    public boolean recepCheck(Hospital hospital){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name to login:");
        String name =in.next();
        boolean booleanToReturn=false;
        for(int i=0;i<hospital.getListOfReceptionists().size();i++){
            if(hospital.getListOfReceptionists().get(i).getName().equals(name)) {
                booleanToReturn = true;
                break;
            }
        }
        return booleanToReturn;
    }

}
