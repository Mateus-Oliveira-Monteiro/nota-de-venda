package model;

public interface InterSaleItem {
    InterProduct getProduct();
    int getQuantity();
    void setProduct(InterProduct product);
    void setQuantity(int quantity);

}
