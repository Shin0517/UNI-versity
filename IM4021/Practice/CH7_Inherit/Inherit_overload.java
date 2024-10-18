package Practice.CH7_Inherit;

class Ccar{
    private final int speed = 120; // constant
    public final void showBigSpeed(String s){
        System.out.println("The max speed of " + s + " is " + speed);
    }
}

class PiliCar extends Ccar{
    public void showBigSpeed(String s, int n){
        System.out.println("The max speed after refinement is " + n + ".");
    }
    // public final void showBigSpeed(String s){
    //     System.out.println("The max speed of " + s + " is " + speed);
    // }
}

public class Inherit_overload {
    public static void main(String[] args) {
        Ccar car1 = new Ccar();
        car1.showBigSpeed("car1");
        PiliCar car2 = new PiliCar();
        car2.showBigSpeed("car2");
        PiliCar car3 = new PiliCar();
        car3.showBigSpeed("car3", 180);
    }
}
