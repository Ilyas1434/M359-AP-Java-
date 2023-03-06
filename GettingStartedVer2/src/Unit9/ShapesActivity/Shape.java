package Unit9.ShapesActivity;

public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

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
        public String toString() {
            return super.toString() + " and a radius of " + radius;
        }
        public double findArea() {
            return Math.PI * Math.pow(radius,2);
        }
    }
    public class Rectangle extends Shape {
        private double width, length;
        public Rectangle(String color, double width, double length) {
            super(color, 4); // ALL rectangels have 4 sides, no need to create a parameter, just making user do extra work
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String toString() {
            return "This " + getColor() + " rectangle has dimensions " + width + " by " + length;
        }
        public void scaleSize(int scaleFactor) {
            length = length * scaleFactor;
            width = width * scaleFactor;
        }
        public double returnArea() {
            return length*width;
        }

    }
    public class Square extends Rectangle {
        private double size;
        public Square(String color, double size) {
            super(color, size, size);
        }
    }
    public String toString() {
        return "The" + color + " shape has " + numSides + " sides";
    }

}
