package StateDemo2;

public class Low implements State{
    public void pull(VelocidadeFan wrapper){
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}