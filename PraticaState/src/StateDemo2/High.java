package StateDemo2;

public class High implements State {
    public void pull(VelocidadeFan wrapper){
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }

}