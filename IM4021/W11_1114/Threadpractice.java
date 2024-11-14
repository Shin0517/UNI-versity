public class Threadpractice {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread();
        Thread oddThread = new Thread(new OddRunnable()); 

        evenThread.start();
        oddThread.start();
    }
}
class EvenThread extends Thread{
    public void run() {
        for (int i = 2; i <= 10; i += 2){
            System.out.println("Even: " + i);
        }
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("There's an exception occured!");
        }
    }
}
class OddRunnable implements Runnable { 
    public void run() {
        for (int i = 1; i <= 9; i += 2){
            System.out.println("Odd: " + i);
        }
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("There's an exception occured!");
        }
    }
}