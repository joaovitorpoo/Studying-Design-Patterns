package statedemo;

public class VelocidadeFan {
    private int currentState;
    
    public VelocidadeFan() {
        currentState = 0;
    }
    
    public void pull() {
        if (currentState == 0) {
            currentState = 1;
            System.out.println("Low speed");
        } else if (currentState == 1) {
            currentState = 2;
            System.out.println("medium speed");
        } else if (currentState == 2) {
            currentState = 3;
            System.err.println("high speed");
        } else {
            currentState = 0;
            System.err.println("turning off");
        }
    }
}