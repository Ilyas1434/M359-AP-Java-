package Unit5.Example;

public class Student {
    private String name;
    private int idNum;
    // static var will keep tack of how many students created
    // we need to give the initial value when we declare the var, NOT in constructer
    private static int numStudents = 0;

    // we use static for our constants so that we only create one copy of it
    // for ALL th objects of the class
    public static final String SCHOOL_ADDRESS = "1000 S. Quentin Rd, Palatine, IL 60067";
    public Student(String name, int idNum) {
        this.name = name;
        this.idNum = idNum;
        numStudents++; // increment the vale each time a student obj created
    }

    public String getName() {
        return name;
    }

    public static void setNumStudents(int numStudents) {
        Student.numStudents = numStudents;
    }

    public static int getNumStudents() {
        return numStudents;
    }

}
