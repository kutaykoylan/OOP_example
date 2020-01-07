package Tools;

import java.text.*;
import java.util.*;

public class Hospital {
    private List<Patient> listOfPatients;
    private List<Doctor> listOfDoctors;
    private List<Receptionist> listOfReceptionists;
    private  List<Appointment> listOfAppointments;

    public List<Appointment> getListOfAppointments() {
        return listOfAppointments;
    }

    public void setListOfAppointments(List<Appointment> listOfAppointments) {
        this.listOfAppointments = listOfAppointments;
    }

    public List<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public Hospital() {
        this.listOfPatients = new ArrayList<>();
        this.listOfAppointments= new ArrayList<>();
        doctorPopulate();
        receptionistPopulate();
        patientPopulate();
        appointmentPopulate();
    }

    public void setListOfPatients(List<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    public List<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(List<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }

    public List<Receptionist> getListOfReceptionists() {
        return listOfReceptionists;
    }

    public void setListOfReceptionists(List<Receptionist> listOfReceptionists) {
        this.listOfReceptionists = listOfReceptionists;
    }
    //public Doctor(String name, Hospital hospital)
    private void doctorPopulate(){
        List<Doctor> list = new ArrayList<>();
        list.add(new Surgeon("Kutay",this));
        list.add(new Doctor("Ali",this));
        list.add(new Doctor("Ahmet",this));
        list.add(new Doctor("David",this));
        setListOfDoctors(list);
    }
    private void receptionistPopulate(){
        List<Receptionist> list = new ArrayList<>();
        list.add(new Receptionist("Ayþe"));
        list.add(new Receptionist("Tolun"));
        setListOfReceptionists(list);
    }
   // Patient(String name, Date dateThatPatientRegistered, int numberofDay, String bloodType, Hospital hospital)
    private void patientPopulate(){
        List<Patient> list = new ArrayList<>();
        list.add(new Inmate("Ayþe",new Date((2018-1900),(11),25),2,"0rh+",this,getListOfDoctors().get(1)));
        Examination examination =new Examination(list.get(0).getDoctor(),list.get(0));
        list.add(new WalkingCase("Korcan",new Date((2018-1900),11,25),0,"ABrh+",this,getListOfDoctors().get(1)));
        list.add(new WalkingCase("Ali",new Date((2018-1900),11,24),0,"Arh-",this,getListOfDoctors().get(2)));
        list.add(new WalkingCase("Koray",new Date((2018-1900),11,23),0,"Brh+",this,getListOfDoctors().get(3)));
        list.add(new WalkingCase("Fadime",new Date((2018-1900),11,23),0,"0rh-",this,getListOfDoctors().get(3)));
        list.add(new Emergency("Cansu",new Date((2018-1900),11,28),7,"0rh-",this,8,getListOfDoctors().get(0)));
        setListOfPatients(list);
    }
    private void appointmentPopulate(){
        List<Appointment> appointmentList = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Appointment appointment=new Appointment();
        Surgery surgery = new Surgery((Surgeon)this.getListOfDoctors().get(0),this.getListOfPatients().get(5));
        try {
            //Parsing the String
             appointment= new Appointment(this.getListOfDoctors().get(0).getName(),dateFormat.parse("01/01/2019"));
             appointment.setSurgery(surgery);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        appointmentList.add(appointment);
        setListOfAppointments(appointmentList);
    }

}
