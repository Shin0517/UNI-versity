package Practice.CH7_Inherit;

abstract class Share{
    abstract double area(double x, double y);
}

class Triangle extends Share{
    public double area(double H, double B){
        return (H + B) / 2;
    }
}

class Rectangle extends Share{
    public double area(double H, double W){
        return H * W;
    }
}

public class Inherit_polymorphism {
    
}
