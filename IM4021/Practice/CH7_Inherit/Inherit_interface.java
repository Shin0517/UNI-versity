// package Practice.CH7_Inherit;

// interface IMove{
//     int ENGINE_NUM = 1;
//     public void addSpeed(int s);
// }

// class PiliCar implements IMove{
//     private int speed;
//     public void addSpeed(int s){
//         System.out.println("The original speed of PiliCar is: " + speed);
//         speed += s;
//         System.out.println("PiliCar speeded up: " + speed);
//     }
// }

// class BMXCar implements IMove{
//     private int speed;
//     public void addSpeed(int s){
//         System.out.println("The original speed of BMXCar is: " + speed);
//         speed += s;
//         if (speed <= 200)
//             System.out.println("BMXCar speeded up: " + speed);
//         else
//             System.out.println("The maximum speed of BMXCar is 200!");
//     }
// }

// public class Inherit_interface {
//     public static void main(String[] args) {
//         System.out.printf("Every car has %s engine.", IMove.ENGINE_NUM);
//         System.out.println("\n-----------------------------------------");
//         PiliCar car1 = new PiliCar();
//         car1.addSpeed(150);
//         car1.addSpeed(120);
//         System.out.printf("PiliCar has %s engine.", IMove.ENGINE_NUM);
//         System.out.println("\n-----------------------------------------");
//         BMXCar car2 = new BMXCar();
//         car2.addSpeed(150);
//         car2.addSpeed(120);
//         System.out.printf("BMXCar has %s engine.", IMove.ENGINE_NUM);
//     }
// }
