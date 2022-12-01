package U6_Arrays.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
        Course trig = new Course("Young", "Trigonometry", "A", 1);
        Course APUSH = new Course("Corcoran", "APUSH", "A", 2);
        Course honorsEnglish = new Course("Herriges", "Honors English", "A", 3);
        Course lunch = new Course("Lunch", 4);
        Course spanish = new Course("Yoshimura", "Spanish 3", "A", 5);
        Course chem = new Course("Teberg", "Honors Chemistry", "A", 6);
        Course gym = new Course("Dinham", "Sophomore Wellness", "A", 7);
        Course java = new Course("Denna", "AP Java", "A", 8);
        // Course[] myClasses = {trig, APUSH, honorsEnglish, lunch, spanish, chem, gym, java};
        // Student Sameer = new Student("Sameer", myClasses);
            // Need to create a File object to represent the text file we are gonna open

        // Want to read in one Student name and schedule
        // Create a File and Scanner var
        File oneStudent = new File("oneSchedule.txt");
        Scanner inStu = new Scanner(oneStudent);
        // Create a var for Student name and read it in
        String name  = inStu.nextLine();
        // Create a Course array and instantiate it for 8 periods
        Course [] myClasses = new Course[8];
        // Use a for loop to
        for(int i = 0; i < myClasses.length; i++) {
            // read in all the Course data
            String teacher = inStu.nextLine();
            String className = inStu.nextLine();
            String grade = inStu.nextLine();
            int per = inStu.nextInt();

            if(inStu.hasNextLine()) {
                inStu.nextLine();
            }
            // dummy read to "consume the EOL character"
            // Create a Course object
            Course c = new Course(teacher, className, grade, per);
            // adding this object to the array
            myClasses[i] = c;
        }
        Student s = new Student(name, myClasses);
        // Create our Student object with the name and Course[]
        System.out.println(s);



//       File oneClass = new File("oneCourse.txt");
//        Create a Scanner object to scan this file so we can read its data
//        add the throws exception line to the main method header
//       Scanner inF = new Scanner(oneClass);
//       use methods to read the data in txt file
//        nextLie(), next(), nextInt(), hasNextLine()
//       String teacher = inF.nextLine();
//       String course = inF.nextLine();
//       String grade = inF.nextLine();
//       int per = inF.nextInt();
//        Make a course object with this input and then print it
//       Course c = new Course(teacher, course, grade, per);
//       System.out.println(c);
    }
}
