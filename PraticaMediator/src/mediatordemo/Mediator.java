package mediatordemo;

public class Mediator {
    private boolean slotFull = false;
    private int number;
    
    public synchronized void storeMessage(int num){
        while (slotFull == true) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = true;
        number = num;
        this.notifyAll();
    }

    String retrieveMenssage() {
        return "";
    }
}