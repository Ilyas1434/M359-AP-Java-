package Unit9.ShapesActivity;

public class Shape {
    private String color;
    private int numSides;
    public Shape(String color, int numSides) {
        this.color = color;
        this.numSides = numSides;

    }
    public class Circle extends Shape {
        private double radius;
        public Circle(String color, int radius) {
            super(color, 0);
            this.radius = radius;
        }
    }
    public class Rectangle extends Shape {
        private double width, length;
        public Rectangle(String color, double width, double length) {
            super(color, 4); // ALL rectangels have 4 sides, no need to create a parameter, just making user do extra work
            this.width = width;
            this.length = length;
        }
    }
    public class Square extends Rectangle {
        private double size;
        public Square(String color, double size) {
            super(color, size, size);
        }
    }
}
