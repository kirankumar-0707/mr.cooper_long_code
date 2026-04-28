import java.util.*;

class InventoryService {

    Map<Integer, Product> products = new HashMap<>();
    Map<Integer, Inventory> inventoryMap = new HashMap<>();
    Map<Integer, Supplier> suppliers = new HashMap<>();
    List<StockMovement> movements = new ArrayList<>();

    public void addProduct(Product product) {
        products.put(product.productId, product);
        inventoryMap.put(product.productId, new Inventory(product.productId, 0));
    }

  
    public void addSupplier(Supplier supplier) {
        suppliers.put(supplier.supplierId, supplier);
    }

    public void stockIn(int productId, int quantity) {
        Inventory inv = inventoryMap.get(productId);
        inv.quantity += quantity;

        movements.add(new StockMovement(productId, "IN", quantity));
        System.out.println("Stock added successfully");

        checkReorder(productId);
    }
    public void stockOut(int productId, int quantity) {
        Inventory inv = inventoryMap.get(productId);

        if (inv.quantity < quantity) {
            System.out.println("Not enough stock!");
            return;
        }

        inv.quantity -= quantity;
        movements.add(new StockMovement(productId, "OUT", quantity));

        System.out.println("Stock deducted successfully");

        checkReorder(productId);
    }

    
    private void checkReorder(int productId) {
        Product p = products.get(productId);
        Inventory inv = inventoryMap.get(productId);

        if (inv.quantity <= p.reorderLevel) {
            System.out.println(" Reorder Alert for Product: " + p.getName());
        }
    }

    
    public void displayInventory() {
        for (Inventory inv : inventoryMap.values()) {
            System.out.println("Product ID: " + inv.productId + " | Quantity: " + inv.quantity);
        }
    }

    
    public void showMovements() {
        for (StockMovement sm : movements) {
            sm.display();
        }
    }
}