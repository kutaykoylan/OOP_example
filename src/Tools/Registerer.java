package Tools;

import ConsoleIO.ExceptionHandler;
import Interfaces.IRegisterable;

import java.util.*;
// Patient(String name, Date dateThatPatientRegistered, int numberofDay, String bloodType, Hospital hospital)
public class Registerer  implements IRegisterable {
    @Override
    public void register(Hospital hospital,Date todaysDate ,int choice){
    	RegistererMethods registererMethods = new RegistererMethods();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=in.next();
        System.out.println("Enter blood type:");
        String BloodType=in.next();
        boolean loopcond=true;
        registererMethods.bloodTypeChecker(BloodType, loopcond);
        registererMethods.displayDoctor(hospital.getListOfDoctors());
        System.out.println("Enter index of doctor that patient wants to register:(0,1,2,3)");
        boolean loopconde=true;
        int index;
        do {
             index= ExceptionHandler.inputMismatch();
            if(index==0||index==1||index==2||index==3)
                loopconde=false;
            else{
                System.err.println("Try a valid index!");
            }
        }while (loopconde);
        if(choice==1)
        hospital.getListOfPatients().add(new Inmate(name,todaysDate,0,BloodType,hospital,hospital.getListOfDoctors().get(index)));
        if(choice==2) {
            System.out.println("Enter EmergencyState(0 to 10)(10 for the most urgent)");
            int emergencyState= ExceptionHandler.inputMismatch();
            hospital.getListOfPatients().add(new Emergency(name, todaysDate, 0, BloodType, hospital,emergencyState,hospital.getListOfDoctors().get(index)));
        }
        if(choice==3)
        hospital.getListOfPatients().add(new WalkingCase(name,todaysDate,0,BloodType,hospital,hospital.getListOfDoctors().get(index)));
    }
    

}
