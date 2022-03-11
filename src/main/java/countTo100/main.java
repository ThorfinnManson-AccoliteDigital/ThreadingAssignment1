package countTo100;

public class main {
    public static void main(String[] args) {
        Thread t1 = new evenOdd(false);
        Thread t2 = new evenOdd(true);
        t1.start();
        t2.start();

    }


}
