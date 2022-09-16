package Unit2.Homework;
/*
Sameer Ilyas
Mrs. Denna
Per. 8
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class MathActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = input.nextInt();
        System.out.println("Enter y1:");
        int y1 = input.nextInt();
        System.out.println("Enter x2:");
        int x2 = input.nextInt();
        System.out.println("Enter y2:");
        int y2 = input.nextInt();
        double distanceX = (Math.pow(x2, 2) - Math.pow(x1, 2));
        double distanceY = (Math.pow(y2, 2) - Math.pow(y1, 2));
        double addedTogether = distanceX + distanceY;
        double finalDistance = Math.sqrt(addedTogether);
        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + finalDistance);
        System.out.println("Enter a max value");
        int max = input.nextInt();
        System.out.println("Enter a min value");
        int min = input.nextInt();
        int randNum = (int) (Math.random() * (max + 1)) + min;
        System.out.println(randNum);
        System.out.println("Enter a negative value");
    }


}
