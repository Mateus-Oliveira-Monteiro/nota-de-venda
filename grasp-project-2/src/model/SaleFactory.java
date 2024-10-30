package model;

public class SaleFactory {

    public static InterProduct createProduct(String description, double price) {
        InterProduct product = new Product();
        product.setDescription(description);
        product.setPrice(price);
        return product;
    }

    public static InterSaleItem createSaleItem(InterProduct product, int quantity) {
        InterSaleItem saleItem = new SaleItem();
        saleItem.setProduct(product);
        saleItem.setQuantity(quantity);
        return saleItem;
    }
}
