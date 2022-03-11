package countTo100Synced;

public class Counter {
    private static int count = 0;


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
        count++;
//        notifyAll();
        return count;
    }
}
