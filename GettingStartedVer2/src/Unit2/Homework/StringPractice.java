package Unit2.Homework;

import javax.xml.transform.Source;
import java.util.Scanner;
public class StringPractice {

    public static void main(String[] args) {
        String course = "AP Java - CSA";
        String school = "Fremd High School";
        String teacherName;

        // find first occurrence of "a" in course and print out the result
        System.out.println(course.indexOf("a"));
        // find first occurrence of "a" in school and print out the result
        System.out.println(school.indexOf("a"));
        // how would you extract the string "md H" from school?
        System.out.println(school.substring(3,7));
        // how would you extract the string CSA from course?
        System.out.println(course.substring(10));
        // This can be done TWO ways - can you figure out both?
        System.out.println(course.substring(10,13));
        // how can we print out FREMD HIGH SCHOOL
        System.out.println(school.toUpperCase());
        //** BONUS **//

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        int space = name.indexOf(" ");
        System.out.println(name.substring(0,space) + name.substring(space + 1));
        // Read in the teacher name as two words with a space in between them
        // using TWO lines of code, display the teacher name as ONE word, without a space
    }
}
