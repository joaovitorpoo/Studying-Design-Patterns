package StateDemo2;

public class Medium implements State{
    public void pull (VelocidadeFan wrapper){
        wrapper.set_state(new High());
        System.out.println("high speed");
    }
}