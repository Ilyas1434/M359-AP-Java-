package Unit3.ExampleInClass;

public class Course {
    String classTitle;
    int numStudentsEnrolled;
    String teacherName;

    public Course(String classTitle, int numStudentsEnrolled, String teacherName) {
        this.classTitle = classTitle;
        this.numStudentsEnrolled = numStudentsEnrolled;
        this.teacherName = teacherName;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }

    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public boolean equals(Course other) {
        if(this.getClassTitle().equals(other.getClassTitle()))  (this.getNumStudentsEnrolled().equals(other.getNumStudentsEnrolled()));

        if(this.getClassTitle().equals(other.getClassTitle())) {
            if(this.getNumStudentsEnrolled() == other.getNumStudentsEnrolled()) {
                return true;
            }
        }
        return false;
    }
    public int compareTo(Course a) {
        if(this.getClassTitle().compareTo(a.getClassTitle()) < 0 || ((this.getClassTitle().equals(a.getClassTitle())) && this.getNumStudentsEnrolled() < a.getNumStudentsEnrolled())) {
            return -1;
        }
        if(this.getClassTitle().equals(a.getClassTitle()) && this.getNumStudentsEnrolled() == a.getNumStudentsEnrolled()) {
            return 0;
        }
        if(this.getClassTitle().compareTo(a.getClassTitle()) > 0 || ((this.getClassTitle().equals(a.getClassTitle())) && this.getNumStudentsEnrolled() > a.getNumStudentsEnrolled())) {
            return 1;
        }
        return 0;
    }
}
