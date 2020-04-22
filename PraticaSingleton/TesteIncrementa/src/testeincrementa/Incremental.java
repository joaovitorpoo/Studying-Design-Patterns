package testeincrementa;

class Incremental {
    
    private static int count = 0; 
    private int numero = 0;
    private static Incremental instancia = null;
    
    public Incremental() {
        numero = ++count;
    }
    
    public static Incremental getInstancia () {
        if (instancia == null){
            instancia = new Incremental();
        }
        return instancia;
    }
    @Override
    public String toString() {
        return "Incremental " + numero;
    }
}