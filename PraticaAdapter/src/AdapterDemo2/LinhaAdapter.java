package AdapterDemo2;

public class LinhaAdapter implements Shape{
    private Linha adaptee;
    
    public LinhaAdapter (Linha linha){
        this.adaptee = linha;
    }
    
    @Override
    public void draw (int x1 , int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}