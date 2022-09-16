package Unit2.Examples;

public class RectangleDriver {
    // we need a main method to execute code!!!
    public static void main(String[] args) {
        // to create an object, use this structure:
        // className referenceVarName = new ClassName( .. params ..);
        Rectangle r1 = new Rectangle(3,5);
        Rectangle r2 = new Rectangle(6);

        // to call a method of the Rectangle class, I need this structure:
        // reference varName.methodName()
        r1.printArea();
    }
}
