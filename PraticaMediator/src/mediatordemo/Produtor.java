package mediatordemo;

public class Produtor implements Runnable{
    private Mediator med;
    private int id;
    private static int num = 1;
    
    public Produtor(Mediator m){
        med = m;
        id = num++;
    }
    
    @Override
    public void run(){
        int run;
        while (true) {
            med.storeMessage(num = (int) (Math.random()*100));
            System.out.print("p" + id + "-" + num + "  ");
        }
    }
}