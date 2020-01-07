package ConsoleIO;

import Tools.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Display {
    private Hospital hospital;
    public Display(){
        hospital = new Hospital();
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void start(){
        Date todaysDate = new Date();
        CasesForDoctor casesForDoctor = new CasesForDoctor();
        while(true){
        Menus.generalMenu(todaysDate);
        int choice=ExceptionHandler.inputMismatch();
        switch (choice) {
            case 1: {
                Login log = new Login();
                // displayNames(hospital.getListOfDoctors());
                boolean booleanForLog=log.docCheck(hospital);
                if (booleanForLog) {
                    boolean GeneralCond = true;
                    while (GeneralCond) {
                        Menus.DoctorMenu(todaysDate);
                        int choice2 = ExceptionHandler.inputMismatch();
                        switch (choice2) {
                            case 1:
                                casesForDoctor.case1(hospital);
                            break;
                            case 2:
                                casesForDoctor.case2(hospital,log.getDoctor());
                                break;
                            case 3:
                                casesForDoctor.case3(hospital,log.getDoctor());
                                break;
                            case 4:
                                casesForDoctor.case4(hospital,log.getDoctor());
                                break;
                            case 5:
                                casesForDoctor.case5(hospital);
                                break;
                            case 6:
                                casesForDoctor.case6(hospital);
                                break;
                            case 7:
                                if(log.getDoctor() instanceof Surgeon)
                                casesForDoctor.case7(hospital,log.getDoctor());
                                else
                                    System.err.println("This section is not available for you!");
                                break;
                            case 8:
                                System.out.println("Redirecting...");
                                GeneralCond = false;
                                break;
                            default:
                                break;


                        }
                    }
                }else
                    System.err.println("There is no receptionist with that name!");
            }
            break;
            case 2: {
                Login log = new Login();
                //displayNames(hospital.getListOfReceptionists());
                boolean booleanForLog=log.recepCheck(hospital);
                if (booleanForLog) {
                    boolean GeneralCond = true;
                    while (GeneralCond) {
                        Receptionist Recep = new Receptionist("default");
                        Menus.ReceptionistMenu(todaysDate);
                        int choice2 = ExceptionHandler.inputMismatch();
                        switch (choice2) {
                            case 1:
                                Recep.register(hospital,todaysDate);
                                break;
                            case 2:
                                System.out.println("Redirecting...");
                                GeneralCond = false;
                                break;
                            default:
                                break;

                        }
                    }
                }else
                    System.err.println("There is no receptionist with that name!");
            }
            break;
            case 3:
                System.out.println("Terminating...");
                System.exit(0);
                break;
        }
        }

    }

}
