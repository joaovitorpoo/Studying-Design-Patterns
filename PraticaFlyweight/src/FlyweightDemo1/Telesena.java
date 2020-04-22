package FlyweightDemo1;

public class Telesena {
    private static int num = 0;
    private int row, col;
    
    public Telesena(int maxPerRow){
        row = num / maxPerRow;
        col = num % maxPerRow;
        num++;
    }
    
    void report() {
        System.out.print (" " + row + col);
    }
}