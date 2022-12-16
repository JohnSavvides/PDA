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
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age/2+7 < LOWER_BOUND) {
                    System.out.println(age+ " is too low!");
                } else {
                    getYoungerAge(age); getOlderAge(age);
                }
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter an integer");
            }
        }
    }

    public void getYoungerAge () {
        Scanner scanner = new Scanner (System.in);
        age = scanner.nextInt();
        System.out.println(age/2+7);
    }

    public void getOlderAge () {
        Scanner scanner = new Scanner (System.in);
        age = scanner.nextInt();
        System.out.println((age-7)*2);
    }
}
/**
 * The main method instantiates and runs the program
 */