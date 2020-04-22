package mediatordemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediatorDemo {
    public static void main(String[] args) {
        List<Thread> produtorList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter for exit");
        Mediator mb = new Mediator();
        produtorList.add(new Thread (new Produtor(mb)));
        produtorList.add(new Thread (new Produtor(mb)));
        produtorList.add(new Thread (new Cliente(mb)));
        produtorList.add(new Thread (new Cliente(mb)));
        produtorList.add(new Thread (new Cliente(mb)));
        produtorList.add(new Thread (new Cliente(mb)));
        for (Thread p : produtorList){
            p.start();
        }
        boolean stop = false;
        String exit = scanner.nextLine();
        while (!stop){
            if (exit.equals("")) {
                stop = true;
                for (Thread p : produtorList){
                    p.stop();
                }
            }
        }
    }  
}