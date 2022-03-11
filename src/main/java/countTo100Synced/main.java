package countTo100Synced;

import countTo100.evenOdd;

public class main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new evenOddSync(false, counter);
        Thread t2 = new evenOddSync(true, counter);
        t1.start();
        t2.start();

    }


}
