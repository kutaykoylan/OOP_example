package ConsoleIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {
    public static int inputMismatch(){
        int choice=0;
        Scanner in = new Scanner(System.in);
        boolean loopcond = true;
        do {
            try {
                choice = in.nextInt();
                loopcond=false;
            } catch (InputMismatchException e){
                System.err.println("Input Mismatch!");
                in.next();
            }

        } while (loopcond);
        return choice;
    }
}
