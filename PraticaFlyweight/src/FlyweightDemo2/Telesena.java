package FlyweightDemo2;

public class Telesena {
    private int row;
        
    public Telesena(int row){
        this.row = row;
        System.out.println("Setor: " + this.row);
    }
        
    void report(int col) {
        System.out.print(" " + row + col);
    }
}