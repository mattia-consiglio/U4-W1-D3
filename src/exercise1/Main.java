package exercise1;

import static exercise1.Rectangle.printTwoRectangles;

public class Main {
    public static void main(String[] args) {
       new Rectangle(10, 20).printRectangle();
       printTwoRectangles(new Rectangle(10, 20), new Rectangle(30, 40));
    }
}