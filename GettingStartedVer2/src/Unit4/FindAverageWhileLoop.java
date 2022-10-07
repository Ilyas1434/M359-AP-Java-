package Unit4;
import java.util.Scanner;
public class FindAverageWhileLoop {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        double value; // value received from user
        double sum = 0;
        int count = 0;
        boolean keepGoing = true;  // start assuming they want to go at least once


        // have the while loop to check what they entered
        while(keepGoing) {
            count ++;
            // get int value
            value = input.nextDouble();
            // This is a "dummy read" to get the EOL
            // Reading in the return and throwing it away
            // This is required if you have a nextLine() to get String data
            // AFTER a nextInt(), nextDouble(), or next()
            input.nextLine();
            sum += value;
            // ask if they want to continue
            System.out.println("Press Y to continue, Any other key to exit");
            String reply = input.nextLine();

            if(!reply.equalsIgnoreCase("y")) {
                keepGoing = false;
            }
        }
        System.out.println("The average is " + sum/count);
    }

}
