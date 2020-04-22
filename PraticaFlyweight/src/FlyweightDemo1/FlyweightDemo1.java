package FlyweightDemo1;
public class FlyweightDemo1 {
    public static final int ROWS = 6, COLS = 10;
    public static void main(String[] args) {
        Telesena[][] matrix = new Telesena[ROWS][COLS];
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = new Telesena(COLS);
            }
        }
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLS; j++){
                matrix[i][j].report();
            }
            System.out.println();
        }
    }
}