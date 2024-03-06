package exercise1;


import java.util.Scanner;

import static exercise1.Rectangle.printTwoRectangles;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle width: ");
        int width = scanner.nextInt();
        System.out.println("Enter rectangle height: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        Rectangle.printRectangle(rectangle);
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        printTwoRectangles(new Rectangle(10, 20), new Rectangle(30, 40));
    }
}