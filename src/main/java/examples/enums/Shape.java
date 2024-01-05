package examples.enums;

public enum Shape {
    CIRCLE(0) {

        @Override
        public double calculateArea(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }

        @Override
        public String toString() {
            return "Circle";
        }
    },
    SQUARE(4) {
        @Override
        public double calculateArea(double sideLength) {
            return Math.pow(sideLength, 2);
        }

        @Override
        public String toString() {
            return "Square";
        }
    },
    TRIANGLE(3) {
        @Override
        public double calculateArea(double radius) {
            return 0;
        }
//        @Override
//        public double calculateArea(double base, double height) {
//            return 0.5 * base * height;
//        }

        @Override
        public String toString() {
            return "Triangle";
        }
    };

    private final int numberOfSides;

    Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double calculateArea(double radius);

    //public abstract double calculateArea(double base, double height);
}
