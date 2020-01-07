package Interfaces;

import Tools.Hospital;
import Tools.Patient;

import java.util.Date;

public interface IRegisterable {
    void register(Hospital hospital,Date todaysDate ,int choice);
}
