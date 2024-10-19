package Practice.CH7_Inherit;

import java.util.Scanner;

interface Share{
    double area();
}

class Circle implements Share{
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public double area(){
        return 3.14 * radius * radius;
    }
}

class Trapezoid implements Share{
    private double upper, lower, height;

    public Trapezoid(double u, double l, double h){
        this.upper = u;
        this.lower = l;
        this.height = h;
    }

    @Override
    public double area(){
        return (upper + lower) * height / 2;
    }
}

public class Inherit_polymorphism_interface {
    public static void main(String[] args) {
        double radius, upper, lower, height;
        Share sha;
        Circle cir;
        Trapezoid tra;

        Scanner scn = new Scanner(System.in);
        while (true) { 
            System.out.println("\nChoose the shape - Circle(1)? Trapezoid(2)? Leave(0)?: ");
            int item = scn.nextInt();

            if (item == 1){
                System.out.println("Enter radius: ");
                radius = scn.nextDouble();
                cir = new Circle(radius);
                sha = cir;
                System.out.printf("Circle:\n\tThe radius is " + radius + ".");
            }else if (item == 2){
                System.out.println("Enter upper: ");
                upper = scn.nextDouble();
                System.out.println("Enter lower: ");
                lower = scn.nextDouble();
                System.out.println("Enter height: ");
                height = scn.nextDouble();
                tra = new Trapezoid(upper, lower, height);
                sha = tra;
                System.out.printf("Trapezoid:\n\tThe upper is " + upper + ". The lower is " + lower + ". The height is " + height);
            }else {
                scn.close();
                break;
            }
            System.out.println(". Its area is " + sha.area());
        }
    }
}
