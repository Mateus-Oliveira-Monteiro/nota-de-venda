package model;

public class SaleItem implements InterSaleItem{
    private InterProduct product;
    private int quantity;

    public SaleItem() {
    }


    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        String itemStr = String.format("%s %d %.2f",
                this.getProduct().getDescription(), this.getQuantity(), this.getSubtotal());
        return itemStr;
    }

    @Override
    public InterProduct getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setProduct(InterProduct product) {
        this.product = product;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
