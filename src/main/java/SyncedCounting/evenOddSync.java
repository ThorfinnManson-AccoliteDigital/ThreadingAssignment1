package SyncedCounting;

public class evenOddSync extends Thread {

    public int MAX = 100;
    static int counter = 1;
    int number;
    static Object lock = new Object();

    evenOddSync(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (counter < MAX) {
            synchronized (lock) {
                while (counter % 2 != number) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " -->  " + counter);
                counter++;
                lock.notifyAll();
            }
        }
    }

}
