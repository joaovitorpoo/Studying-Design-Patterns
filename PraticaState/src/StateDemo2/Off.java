package StateDemo2;

public class Off implements State{
    public void pull(VelocidadeFan wrapper){
        wrapper.set_state(new Low());
        System.out.println("low speed");
    }
}
