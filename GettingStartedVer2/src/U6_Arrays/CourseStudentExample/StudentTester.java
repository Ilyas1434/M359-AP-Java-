package U6_Arrays.CourseStudentExample;

public class StudentTester {
    public static void main(String[] args) {
        Course trig = new Course("Young", "Trigonometry", "A", 1);
        Course APUSH = new Course("Corcoran", "APUSH", "A", 2);
        Course honorsEnglish = new Course("Herriges", "Honors English", "A", 3);
        Course lunch = new Course("Lunch", 4);
        Course spanish = new Course("Yoshimura", "Spanish 3", "A", 5);
        Course chem = new Course("Teberg", "Honors Chemistry", "A", 6);
        Course gym = new Course("Dinham", "Sophomore Wellness", "A", 7);
        Course java = new Course("Denna", "AP Java", "A+", 8);
        Course[] myClasses = {trig, APUSH, honorsEnglish, lunch, spanish, chem, gym, java};
        Student Sameer = new Student("Sameer", myClasses);
        Sameer.toString();
    }
}
