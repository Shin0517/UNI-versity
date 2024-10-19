package Practice.CH7_Inherit;

interface IMove{
    public void addSpeed(int s);
}

interface IStop{
    public void stop();
}

interface IHuman extends IMove, IStop{
    public void laugh();
}

class PiliCar implements IMove, IStop{
    private int speed;
    @Override
    public void addSpeed(int s){
        System.out.println("The original speed of PiliCar is: " + speed);
        speed += s;
        System.out.println("PiliCar speeded up: " + speed);
    }

    @Override
    public void stop(){
        System.out.println("Car stopped!");
    }
}

class Humankind implements IHuman{
    private int speed;
    @Override
    public void addSpeed(int s){
        System.out.println("The original speed of Human is: " + speed);
        speed += s;
        System.out.println("Human speeded up: " + speed);
    }

    @Override
    public void stop(){
        System.out.println("Human stopped!");
    }

    @Override
    public void laugh(){
        System.out.println("Seems like something nice happened!");
    }
}

public class Inherit_interface_inherit{
    public static void main(String[] args) {
        PiliCar car = new PiliCar();
        car.addSpeed(50);
        car.stop();
        System.out.println("---------------------------------------------");
        Humankind Mathew = new Humankind();
        Mathew.addSpeed(20);
        Mathew.stop();
        Mathew.laugh();
    }
}