package U6_Arrays.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTesterChallenge {
    public static void main(String[] args) throws FileNotFoundException {

        File schedule = new File("studentScheduleData.txt");
        Scanner inStu = new Scanner(schedule);
        // Create a var for Student name and read it in
        int numStudents = inStu.nextInt();
        Student[] allStudents = new Student[numStudents];
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
    }
}
