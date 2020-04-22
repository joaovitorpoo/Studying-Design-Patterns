package statedemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateDemo {
    public static void main(String[] args) {
        VelocidadeFan chain = new VelocidadeFan();
        while (true) {
            System.out.print("Press ENTER");
            getLine();
            chain.pull();
        }
    }
    static String getLine() {
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}