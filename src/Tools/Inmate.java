package Tools;

import java.util.Date;

public class Inmate extends Patient {
    public Inmate(String name, Date dateThatPatientRegistered, int numberofDay, String bloodType, Hospital hospital,Doctor doctor) {
        super(name, dateThatPatientRegistered, numberofDay, bloodType, hospital,doctor);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Inmate{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
