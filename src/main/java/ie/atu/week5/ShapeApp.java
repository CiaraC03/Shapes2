package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {
        System.out.println("Please enter the length of the rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.print("You entered : " + shapeRect.getLength());


        System.out.println("Please enter the width of the rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.print("You entered : " + shapeRect.getWidth());

        Rectangle shapeRect2 = new Rectangle();
        System.out.println("Please enter the second length of the rectangle");
        double length2 = input.nextDouble();
        shapeRect2.setLength(length2);
        System.out.print("You entered : " + shapeRect2.getLength());


        System.out.println("Please enter the second width of the rectangle");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.print("You entered : " + shapeRect2.getWidth());

    }
}
