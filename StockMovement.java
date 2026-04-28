import java.time.*;

class StockMovement {
    int productId;
    String type;
    int quantity;
    String reason;
    LocalDateTime timestamp;
    public StockMovement(int productId, String type, int quantity) {
        this.productId = productId;
        this.type = type;
        this.quantity = quantity;
        this.timestamp = LocalDateTime.now();
    }

    public void display() {
        System.out.println("Product: " + productId +" Type: " + type +" Qty: " + quantity +" Time: " + timestamp);
    }
}