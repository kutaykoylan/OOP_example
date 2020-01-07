package Tools;

import java.security.SecureRandom;

public class BloodTest extends Analysis {
    private String BloodType;
    private double theAmountOfGlucose;

    public double getTheAmountOfGlucose() {
        return theAmountOfGlucose;
    }

    private void setTheAmountOfGlucose() {
        SecureRandom sr = new SecureRandom();
        this.theAmountOfGlucose = sr.nextInt(1500);
    }

    public String getBloodType() {
        return BloodType;
    }

    private void setBloodType(String bloodType) {
        BloodType = bloodType;
    }

    public BloodTest(Patient p1) {
        setBloodType( p1.getBloodType());
       setTheAmountOfGlucose();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BloodTest{");
        sb.append("BloodType='").append(BloodType).append('\'');
        sb.append(", theAmountOfGlucose=").append(theAmountOfGlucose);
        sb.append('}');
        return sb.toString();
    }
}
