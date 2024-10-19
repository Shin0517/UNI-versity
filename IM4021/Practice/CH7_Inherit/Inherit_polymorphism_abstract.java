package Practice.CH7_Inherit;

import java.util.Scanner;

abstract class Share{
    abstract double area(double x, double y);
}

class Triangle extends Share{
    @Override
    public double area(double H, double B){
        return (H + B) / 2;
    }
}

class Rectangle extends Share{
    @Override
    public double area(double H, double W){
        return H * W;
    }
}

public class Inherit_polymorphism_abstract {
    public static void main(String[] args) {
        double height, base;
        Share sha;
        Triangle tri = new Triangle();
        Rectangle rec = new Rectangle();
        /* 
        abstract data type needs to be instantiated
        */

        Scanner scn = new Scanner(System.in);
        while (true) { 
            System.out.println("\nChoose the shape - Triangle(1)? Rectangle(2)? Leave(0)?: ");
            int item = scn.nextInt();

            if (item == 1){
                System.out.println("Enter height: ");
                height = scn.nextDouble();
                System.out.println("Enter base: ");
                base = scn.nextDouble();

                System.out.printf("Triangle:\n\tThe base is " + base + ". The height is " + height);
                sha = tri;
            }else if (item == 2){
                System.out.println("Enter height: ");
                height = scn.nextDouble();
                System.out.println("Enter base: ");
                base = scn.nextDouble();

                System.out.printf("Rectangle:\n\tThe base is " + base + ". The height is " + height);
                sha = rec;
            }else {
                scn.close();
                break;
            }
            System.out.println(". Its area is " + sha.area(height, base));
        }
    }
}
