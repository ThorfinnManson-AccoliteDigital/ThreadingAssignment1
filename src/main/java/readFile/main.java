package readFile;


import countTo100.evenOdd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\thorf\\Documents\\_Work\\Thorfinn_ThreadingAssignment1\\src\\main\\resources\\test.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            Thread t1 = new reader(br);
            Thread t2 = new reader(br);
            t1.start();
            t2.start();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
