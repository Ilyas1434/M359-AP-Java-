package U6_Arrays.CourseStudentExample;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StudentTesterChallenge {
    public static void main(String[] args) throws FileNotFoundException {
        File schedule = new File("C:\\Users\\ACH Lighting\\Desktop\\Sameer's stuff\\M359-AP-Java-\\GettingStartedVer2\\src\\U6_Arrays\\CourseStudentExample\\studentScheduleData.txt");
        Scanner inSch = new Scanner(schedule);
        int maxStudents = inSch.nextInt();
        inSch.nextLine();
        Student[] allStudents = new Student[maxStudents];
        boolean isMore = true;
        int count = 0;
        while(isMore) {
            Course[] myClasses = new Course[8];
            String name = inSch.nextLine();
            for(int i = 0; i < myClasses.length; i++) {
                String teacher = inSch.nextLine();
                String className = inSch.nextLine();
                String grade = inSch.nextLine();
                int per = inSch.nextInt();
                if(inSch.hasNextLine()) {
                    inSch.nextLine();
                }
                // dummy read to "consume the EOL character"
                Course c = new Course(teacher, className, grade, per);
                myClasses[i] = c;
            }
            allStudents[count] = new Student(name, myClasses);
            if(!inSch.hasNextLine()) {
                isMore = false;
            }
            count++;
        }
        for(Student c : allStudents) {
            if(c != null) {
                System.out.println(c);
            }
        }

    }
}
