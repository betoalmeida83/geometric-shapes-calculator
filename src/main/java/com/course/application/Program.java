package com.course.application;

import com.course.entities.*;

import java.util.Locale;
import java.util.Scanner;

import static com.course.entities.Color.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Equilateral Triangle");
        System.out.println("5. Isosceles Triangle");
        System.out.println("6. Scalene Triangle");
        System.out.println("7. Rhombus ");
        System.out.println("8. Parallelogram");
        System.out.println("9. Trapezoid");
        System.out.print("Enter the desired option: ");
        int option = scanner.nextInt();

        switch (option){

            case 1:

                System.out.println();
                System.out.println("CIRCLE:");
                System.out.print("Enter with Radius: ");
                double radius = scanner.nextDouble();

                Circle circle = new Circle(BLACK, radius);

                System.out.println("AREA: " + String.format("%.2f", circle.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",circle.perimeter()));

                break;

            case 2:

                System.out.println();
                System.out.println("SQUARE:");
                System.out.print("Enter with Side: ");
                double side = scanner.nextDouble();

                Square square = new Square(WHITE, side);

                System.out.println("AREA: " + String.format("%.2f", square.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",square.perimeter()));

                break;

            case 3:

                System.out.println();
                System.out.println("RECTANGLE:");
                System.out.print("Enter with width: ");
                double width = scanner.nextDouble();
                System.out.print("Enter with height: ");
                double height = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(GREEN, width, height);

                System.out.println("AREA: " + String.format("%.2f", rectangle.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",rectangle.perimeter()));

                break;

            case 4:

                System.out.println();
                System.out.println("EQUILATERAL TRIANGULE:");
                System.out.print("Enter with first side: ");
                double equiSideA = scanner.nextDouble();
                System.out.print("Enter with second side: ");
                double equiSideB = scanner.nextDouble();
                System.out.print("Enter with third side: ");
                double equiSideC = scanner.nextDouble();

                Triangle equilateral = new EquilateralTriangle(YELLOW, equiSideA, equiSideB, equiSideC);

                System.out.println("AREA: " + String.format("%.2f", equilateral.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",equilateral.perimeter()));

                break;

            case 5:

                System.out.println();
                System.out.println("ISOSCELES TRIANGULE:");
                System.out.print("Enter with first side: ");
                double isoSideA = scanner.nextDouble();
                System.out.print("Enter with second side: ");
                double isoSideB = scanner.nextDouble();
                System.out.print("Enter with third side: ");
                double isoSideC = scanner.nextDouble();

                Triangle isosceles = new IsoscelesTriangle(BLUE, isoSideA, isoSideB, isoSideC);

                System.out.println("AREA: " + String.format("%.2f", isosceles.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",isosceles.perimeter()));

                break;

            case 6:

                System.out.println();
                System.out.println("SCALENE TRIANGULE:");
                System.out.print("Enter with first side: ");
                double scaSideA = scanner.nextDouble();
                System.out.print("Enter with second side: ");
                double scaSideB = scanner.nextDouble();
                System.out.print("Enter with third side: ");
                double scaSideC = scanner.nextDouble();

                Triangle scalene = new ScaleneTriangle(RED, scaSideA, scaSideB, scaSideC);

                System.out.println("AREA: " + String.format("%.2f", scalene.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",scalene.perimeter()));

                break;

            case 7:

                System.out.println();
                System.out.println("RHOMBUS:");
                System.out.print("Enter with Major Diagonal: ");
                double major = scanner.nextDouble();
                System.out.print("Enter with Minor Diagonal: ");
                double minor = scanner.nextDouble();
                System.out.print("Enter with Side: ");
                double rhoSide = scanner.nextDouble();

                Rhombus rhombus = new Rhombus(PINK, major, minor, rhoSide);

                System.out.println("AREA: " + String.format("%.2f", rhombus.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",rhombus.perimeter()));

                break;

            case 8:

                System.out.println();
                System.out.println("PARALLELOGRAM:");
                System.out.print("Enter with Base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter with Height: ");
                double paraHeight = scanner.nextDouble();
                System.out.print("Enter with Side: ");
                double paraSide = scanner.nextDouble();

                Parallelogram parallelogram = new Parallelogram(GRAY, base, paraHeight, paraSide);

                System.out.println("AREA: " + String.format("%.2f", parallelogram.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",parallelogram.perimeter()));

                break;

            case 9:

                System.out.println();
                System.out.println("TRAPEZOID:");
                System.out.print("Enter with first Base: ");
                double baseA = scanner.nextDouble();
                System.out.print("Enter with second Base: ");
                double baseB = scanner.nextDouble();
                System.out.print("Enter with Height: ");
                double trapHeight = scanner.nextDouble();
                System.out.print("Enter with first Side: ");
                double sideA = scanner.nextDouble();
                System.out.print("Enter with second Side: ");
                double sideB = scanner.nextDouble();

                Trapezoid trapezoid = new Trapezoid(BROWN, baseA, baseB, trapHeight, sideA, sideB);

                System.out.println("AREA: " + String.format("%.2f", trapezoid.area()));
                System.out.println("PERIMETER: " + String.format("%.2f",trapezoid.perimeter()));

                break;

        }

        scanner.close();

    }

}
