package Tools;

import java.security.SecureRandom;

public class Radiology extends Analysis {
    private String sickness;

    public String getSickness() {
        return sickness;
    }

    private void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public Radiology(){
        SecureRandom sr = new SecureRandom();
        int randomnumber = sr.nextInt(3);
        if(randomnumber==0)
            setSickness("cancer");
        else if (randomnumber==1)
            setSickness("Brain Tumor");
        else if (randomnumber==2)
            setSickness("Healthy");
        else
            setSickness("Healthy");

    }
}
