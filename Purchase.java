import java.util.*;

class PurchaseOrder {
    int poId;
    int supplierId;
    Map<Integer, Integer> items;
    String status;

    public PurchaseOrder(int poId, int supplierId) {
        this.poId = poId;
        this.supplierId = supplierId;
        this.items = new HashMap<>();
        this.status = "Sucess";
    }

    public void addItem(int productId, int quantity) {
        items.put(productId, quantity);
    }
}