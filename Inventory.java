class Inventory {
    int productId;
    int quantity;

    public Inventory(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
    public int getproductId(){
        return productId;
    }
    public int getquantity(){
        return quantity;
    }
    public void setquantity(int quantity){
        this.quantity=quantity;
    }
}