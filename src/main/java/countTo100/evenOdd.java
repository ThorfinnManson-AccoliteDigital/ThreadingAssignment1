package countTo100;

public class evenOdd extends Thread{

    boolean odd = false;

    public evenOdd(boolean odd) {
        this.odd = odd;
    }

     public void run(){
        for (int i = odd? 1:0; i < 100; i+=2) {
            System.out.println("printing " + i);
        }
    }
}
