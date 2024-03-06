package exercise1;

public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void printRectangle() {
        System.out.println("Width: " + this.width);        System.out.println("Height: " + this.height);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }

    public static void printTwoRectangles(Rectangle r1, Rectangle r2) {
        if (r1 == null || r2 == null ) {
            System.err.println("One or more of the rectangles are null");
        } else {
            new Rectangle(r1.width, r1.height).printRectangle();
            new Rectangle(r2.width, r2.height).printRectangle();
        }

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
