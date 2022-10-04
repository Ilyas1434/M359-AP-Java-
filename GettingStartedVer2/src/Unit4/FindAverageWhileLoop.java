package Unit4;
import java.util.Scanner;
public class FindAverageWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value; // value received from user
        double sum = 0;
        int count = 0;
        boolean keepGoing = true;  // start assuming they want to go at least once


        // have the while loop to check what they entered
        while(keepGoing) {
            // get int value
            value = input.nextDouble();
            // add to sum
            sum += value;
            // ask if they want to continue
            System.out.println("Press Y to continue Any other key to exit");
            String reply = input.nextLine();
            if(!reply.equalsIgnoreCase(y)) {
                String hello = "hello";
            }
        }

        // calculate avg
        // print the avg
    }

}
