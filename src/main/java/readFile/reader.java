package readFile;

import java.io.*;

public class reader extends Thread{
    BufferedReader br;


    public reader(BufferedReader br) {
        this.br = br;
    }

    synchronized public void run(){
        try {
            String line = "";
            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
