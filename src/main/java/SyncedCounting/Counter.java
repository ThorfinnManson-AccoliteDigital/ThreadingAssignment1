package SyncedCounting;


public class Counter {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }

    public Counter(){

    }

    public int increment(){
//        if(count != 0) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        notifyAll();
        return ++count;
    }
}