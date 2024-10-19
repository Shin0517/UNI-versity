package Practice.CH7_Inherit;

class Ccar{
    private final int speed = 120; // constant
    public final void showBigSpeed(String s){
        System.out.println("The max speed of " + s + " is " + speed);
    }
}

class PiliCar extends Ccar{
    // public final void showBigSpeed(String s){
    //     System.out.println("The max speed of " + s + " is " + speed);
    // }
}
/*
This method cannot be overridden 
since the superclass of PiliCar, Ccar, use "final"
Only if the parameter is different with what is used in Ccar.showBigSpeed()
 */


public class Inherit_final {
    public static void main(String[] args) {
        Ccar car1 = new Ccar();
        car1.showBigSpeed("car1");
        PiliCar car2 = new PiliCar();
        car2.showBigSpeed("car2");
    }
}
