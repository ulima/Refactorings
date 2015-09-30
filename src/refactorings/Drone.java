package refactorings;

public class Drone {
    private long id;
    private String fechaCompra;
    private int stock;

    public Drone(long id, String fechaCompra, int stock) {
        this.id = id;
        this.fechaCompra = fechaCompra;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
