class Product {
    int productId;
    String name;
    int reorderLevel;
    int supplierId;
    public Product(int productId, String name, int reorderLevel, int supplierId) {
        this.productId = productId;
        this.name = name;
        this.reorderLevel = reorderLevel;
        this.supplierId = supplierId;
    }
    public String getName(){
        return name;
    }
    public int getproductId(){
        return productId;
    }
    public String getproductname(){
        return name;
    }
    public int getreorder(){
        return reorderLevel;
    }
}