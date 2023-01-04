import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        Scanner scanner = new Scanner (System.in);
        int age;
        int LOWER_BOUND = 14;
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("How old are you?");
            System.out.println("If you want to quit, type in 0");
            try {
                age = scanner.nextInt();
                if (age == 0) {
                    shouldContinue = false;
                } else if (age/2+7 < LOWER_BOUND) {
                    System.out.println(age+ " is too low!");
                } else {
                    getYoungerAge_getOlderAge(age);
                }
                
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter an integer");
            }
        }
    }

    public void getYoungerAge_getOlderAge (int age) {
        System.out.println(Math.ceil(age/2+7));
        System.out.println(Math.floor((age-7)*2));
    }
    
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
/**
 * The main method instantiates and runs the program
 */