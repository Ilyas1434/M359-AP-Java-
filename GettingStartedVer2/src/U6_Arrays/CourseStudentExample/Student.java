package U6_Arrays.CourseStudentExample;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public Student(String name) {
        this.name = name;
        Course[] myClasses = new Course[8];

    }
    public String toString() {
        String ret = "";
        ret += "Student Name: " + name;
        ret += "\n";
        for(int i = 0; i < myClasses.length; i++) {
            Course current = myClasses[i];
            ret += current.toString() + "\n";
        }
        return ret;
    }
}
