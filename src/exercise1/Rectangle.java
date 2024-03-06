package exercise1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            if (width <= 0) {

                System.err.println("Width cannot be negative");
            }
            if (height <= 0) {

                System.err.println("Height cannot be negative");
            }
            return;
        }

        this.width = width;
        this.height = height;
    }

    public static void printTwoRectangles(Rectangle r1, Rectangle r2) {
        if (r1 == null || r2 == null) {
            System.err.println("One or more of the rectangles are null");
        } else {
            printRectangle(r1);
            System.out.println();
            printRectangle(r2);
            System.out.println("Total area:" + (r1.getArea() + r2.getArea()));
            System.out.println("Total perimeter:" + (r1.getPerimeter() + r2.getPerimeter()));
        }

    }

    public static void printRectangle(Rectangle rectangle) {
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }


}
