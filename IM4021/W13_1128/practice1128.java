class Baseball {
    private boolean isThrow = false;

    public synchronized void pBall(int tNo) {
        while (isThrow) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("投出第 " + tNo + " 顆棒球");
        isThrow = true;
        notify();
    }

    public synchronized void hBall(int aNo) {
        while (!isThrow) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("第 " + aNo + " 次揮棒");
        isThrow = false;
        notify();
    }
}

class Pitching implements Runnable {
    Baseball baseball;

    Pitching(Baseball baseball) {
        this.baseball = baseball;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            baseball.pBall(i);
        }
    }
}

class Hit implements Runnable {
    Baseball baseball;

    Hit(Baseball baseball) {
        this.baseball = baseball;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            baseball.hBall(i);
        }
    }
}

public class practice1128{
    public static void main(String[] args) {
        Baseball baseball = new Baseball();
        Thread machine = new Thread(new Pitching(baseball), "Pitching-Thread");
        Thread hitter = new Thread(new Hit(baseball), "Hitter-Thread");
        machine.start();
        hitter.start();
    }
}
