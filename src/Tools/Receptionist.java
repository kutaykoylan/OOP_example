package Tools;

import ConsoleIO.ExceptionHandler;
import ConsoleIO.Menus;
import Interfaces.IRegisterable;

import java.util.Date;
import java.util.Scanner;

public class Receptionist extends Person {
    public Receptionist(String name) {
        super(name);
    }
// Patient(String name, Date dateThatPatientRegistered, int numberofDay, String bloodType, Hospital hospital)
    public void register(Hospital hospital, Date todaysDate){
        Registerer reg = new Registerer();
        Menus.MenuForRegister();
        int choice= ExceptionHandler.inputMismatch();
        switch (choice){
            case 1:
                reg.register(hospital,todaysDate,choice);
                break;
            case 2:
                reg.register(hospital,todaysDate,choice);
                break;
            case 3:
                reg.register(hospital,todaysDate,choice);
                break;
        }

    }
}
