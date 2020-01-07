package ConsoleIO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Menus {
    public static void menuForPatienExamination(){
        System.out.println("Press 1 to write necessary prescription after the examination");
        System.out.println("Press 2 to decide on a surgery after the examination");
    }
    public static void DoctorMenu(Date todaysDate){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\t\t\t\t|Date:"+dateFormat.format(todaysDate)+"|");
        System.out.println("Press 1 to display all patients registered on hospitals system");
        System.out.println("Press 2 to see the patients he/she will see that day ");

        System.out.println("Press 3 to list all patients under his/her care");
        System.out.println("Press 4 to search and/or see the results of analysis");
        System.out.println("Press 5 to list all the patients examined");
        System.out.println("Press 6 to search any patient that examined in the past");
        System.out.println("Press 7 to search any appointed surgery for him/her");
        System.out.println("Press 8 to back ");

    }
    public static void ReceptionistMenu(Date todaysDate){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\t\t\t\t|"+dateFormat.format(todaysDate)+"|");
        System.out.println("Press 1 to register a patient");
        System.out.println("Press 2 to back");
    }
    public static void generalMenu(Date todaysDate){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Welcome to Hospital IS\t\t\t|"+dateFormat.format(todaysDate)+"|");
        System.out.println("Press 1 to login as Doctor ");
        System.out.println("Press 2 to login as Receptionist");
        System.out.println("Press 3 to terminate ");

    }
    public static void MenuForRegister(){
        System.out.println("Press 1 to register inmate patient");
        System.out.println("Press 2 to register emergency patient");
        System.out.println("Press 3 to register walking case patient");
    }
}
