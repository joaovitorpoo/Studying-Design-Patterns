package AdapterDemo1;

public class AdapterDemo1 {
    public static void main(String[] args) {
        Object[] shapes = {new Linha(), new Retangulo()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int width = 40, height = 40;
        for (Object shape : shapes) {
            if (shape.getClass().getSimpleName().equals("Linha")){
                ((Linha)shape).draw(x1,y1,x2,y2);
            } else if (shape.getClass().getSimpleName().equals("Retangulo")){
                ((Retangulo)shape).draw(x2, y2, width, height);
            }
        }
    }
}