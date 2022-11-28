package Unit5.Example;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Bob",1234);
        Student s2 = new Student("Susie", 2222);
        Student s3;

        System.out.println(Student.getNumStudents());
    }
    public static void printNums()  {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
