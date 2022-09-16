package Unit2.Examples;

public class Rectangle {
    /*
    These are the instance variables. They are created for every instance
    of the Rectangle class.

    These variables are declared at the top of the class file so that they
    have global scope and can be accessed in any method in this java file

    They are private, which means their values cannot be accessed directly
    OUTSIDE this class. This visibility modifier allows us to make these
    variables publicly accessible inside Rectangle.java and not accessible
    outside of Rectangle.java
     */
    private int width;
    private int height;

    /*
    The constructor is called when we want to create a new object of this class
    We have to use the new operator

    The constructor has a void return type, and the same name as the class
    You are allowed to have more than one constructor as long as the

    parameter list is different.
     */
    public Rectangle(int rectWidth, int rectHeight) {
        width = rectWidth;
        height = rectHeight;
    }

    // this is really a square. . .but rectangle code still applies!
    public Rectangle(int side) {
        width = side;
        height = side;
    }

    public void printArea() {
        System.out.println("The area is: " + width * height);
    }
    public void printPerimeter() {
        int p = 2 * width + 2 * height;
        System.out.print("The perimeter is: " + p);
    }
}

