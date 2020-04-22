package AdapterDemo2;

public class AdapterDemo2 {
    public static void main (String[] args) {
        Shape[] shapes = { new RetanguloAdapter(new Retangulo()), 
            new LinhaAdapter(new Linha())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
