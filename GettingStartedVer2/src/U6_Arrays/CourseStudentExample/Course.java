package U6_Arrays.CourseStudentExample;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        teacherName = "";
        currentGrade = "";
    }
    public String toString() {
        return "Per: " + period + "\t" + subject + "\t" + teacherName;
    }
}
