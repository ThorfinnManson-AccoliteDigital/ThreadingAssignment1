package countTo100Synced;

import java.util.concurrent.ThreadLocalRandom;

public class evenOddSync extends Thread{

    boolean odd = false;
    static boolean flip = false;
    Counter counter;

    public evenOddSync(boolean odd, Counter counter) {
        System.out.println("Thread: " + Thread.currentThread().getName());
        this.counter = counter;
        this.odd = odd;
    }

    synchronized public void runOdd(){
        while (!flip) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + counter.increment());
        flip = false;
        try {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", sleeping");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", notify");
        notifyAll();
    }

    synchronized public void runEven(){
        System.out.println("Thread: " + Thread.currentThread().getName() + ", RanEven");
        while (flip) {
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + ", waiting");
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted.");
            }
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + counter.increment());
        flip = true;
        try {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", sleeping");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", notify");
        notifyAll();
    }

    synchronized public void run(){
        System.out.println("Thread: " + Thread.currentThread().getName() + ", Triggered");
        while(true){
            if(odd){
                runOdd();
            }
            else{
                runEven();
            }
        }
    }
}
