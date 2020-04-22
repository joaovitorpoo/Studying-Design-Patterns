package mediatordemo;

public class Cliente implements Runnable{
    private Mediator med;
    private int id;
    private static int num = 1;
    
    public Cliente (Mediator m) {
        med = m;
        id = num++;
    }
    
    @Override
    public void run(){
        while (true) {
            System.out.print("c" + id + "-" + med.retrieveMenssage() + "  ");
        }
    }
}