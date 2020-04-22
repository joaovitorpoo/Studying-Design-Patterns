package FlyweightDemo2;

public class Factory {
    private Telesena[] pool;
    
    public Factory (int maxRows){
        pool = new Telesena[maxRows];
    }
    
    public Telesena getFlyweight(int  row) {
        if (pool[row] == null) {
            pool[row] = new Telesena (row);
        }
        return pool[row];
    }
} 