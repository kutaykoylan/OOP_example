package ConsoleIO;

import Tools.*;
import java.text.*;
import java.util.*;


public class ExaminationDisplayer {
    public void displayExaminationProcess(Hospital hospital, Patient patient, Doctor doctor){
        Scanner in = new Scanner(System.in);
        Menus.menuForPatienExamination();
        int choice=ExceptionHandler.inputMismatch();
        switch (choice){
            case 1:
                System.out.println("Write a prescription for patients therapy(without space)");
                String prescriptionString=in.next();
                Prescription prescription = new Prescription(prescriptionString);
                Treatment treatment = new Therapy(prescription);
                patient.setTreatment(treatment);
                break;
            case 2:
                System.out.println("Are you sure that patient needs to a surgery(y or n)");
                String sure = in.next().toUpperCase();
                if(sure.equals("Y")){
                    System.out.println("Enter date for surgery:(dd/MM/yyyy)(After today's date)");
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
                    System.out.println("Default number of days set for patient after surgery");
                    SurgeryMaker surgeryMaker = new SurgeryMaker();
                    surgeryMaker.AppointmentSetter(patient,hospital,date2);
                    break;
                }else if(sure.equals("N")){
                    break;
                }else
                    System.err.println("Something went wrong!");
                break;
        }
    }
}
