public class exe11282 {
    public static void main(String[] args) {
        final int LIMIT = 100000; // 計算範圍
        final int THREADS = 4; // 使用的執行緒數量

        Thread[] threads = new Thread[THREADS];
        PrimeSumTask[] tasks = new PrimeSumTask[THREADS];

        int segmentSize = LIMIT / THREADS; // 每段範圍大小
        int start = 2;

        for (int i = 0; i < THREADS; i++) {
            int end = (i == THREADS - 1) ? LIMIT : start + segmentSize - 1; // 最後一段範圍包含 LIMIT
            tasks[i] = new PrimeSumTask(start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
            start = end + 1;
        }

        long totalSum = 0;

        // 等待所有執行緒完成並加總結果
        for (int i = 0; i < THREADS; i++) {
            try {
                threads[i].join(); // 等待執行緒完成
                totalSum += tasks[i].getSum(); // 彙總執行緒的計算結果
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + LIMIT + ": " + totalSum);
    }
}

class PrimeSumTask implements Runnable {
    private int start, end;
    private long sum = 0;

    public PrimeSumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
