package countTo100Synced;

import java.util.concurrent.ThreadLocalRandom;

public class evenOddSync extends Thread{

    boolean odd = false;
    Counter counter;

    public evenOddSync(boolean odd, Counter counter) {
        this.counter = counter;
        this.odd = odd;
    }

    synchronized public void run(){
        for (int i = odd? 1:0; i < 100; i+=2) {
            if(i!=0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("printing " + counter.increment());
            notifyAll();
        }
    }
}
