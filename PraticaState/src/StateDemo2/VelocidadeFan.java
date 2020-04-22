package StateDemo2;

public class VelocidadeFan {
    private State currentState;
    
    public VelocidadeFan() {
        currentState = new Off();
    }
    
    public void set_state(State s){
        currentState = s;
    }
    
    public void pull() {
        currentState.pull(this);
    }
}