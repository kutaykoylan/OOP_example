package Tools;

import java.util.Date;

public class Emergency extends Patient {
    private int EmergencyState;

    public int getEmergencyState() {
        return EmergencyState;
    }

    public void setEmergencyState(int emergencyState) {
        EmergencyState = emergencyState;
    }

    public Emergency(String name, Date dateThatPatientRegistered, int numberofDay, String bloodType, Hospital hospital, int emergencyState, Doctor doc) {
        super(name, dateThatPatientRegistered, numberofDay, bloodType, hospital,doc);
        setEmergencyState(emergencyState);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emergency{");
        sb.append(super.toString());
        sb.append("EmergencyState=").append(EmergencyState);
        sb.append('}');
        return sb.toString();
    }
}
