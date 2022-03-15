package SyncedCounting;


public class main {
    public static void main(String[] args) {
        Thread t1 = new evenOddSync(1);
        t1.setName("Odd");
        Thread t2 = new evenOddSync(0);
        t2.setName("Even");

        t1.start();
        t2.start();
    }


}
