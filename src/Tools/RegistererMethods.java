package Tools;
import java.util.List;
import java.util.Scanner;
public class RegistererMethods {
	public <T extends Person> void displayDoctor(List<T> doclist) {
    	for(int i=0;i<doclist.size();i++) {
    		System.out.println(i +" =>"+doclist.get(i));
    	}
    }
    public void bloodTypeChecker(String BloodType,boolean loopcond) {
    	Scanner in = new Scanner(System.in);
    	 do {
             if ((BloodType.equals("Arh+") || BloodType.equals("Arh-") || BloodType.equals("Brh+") || BloodType.equals("Brh-") || BloodType.equals("ABrh+") || BloodType.equals("ABrh-") || BloodType.equals("0rh+") || BloodType.equals("0rh-"))){
                 loopcond = false;
             }else {
                 System.err.println("Try valid blood type!");
                 BloodType = in.next();
             }

         }while (loopcond);
    }
}
