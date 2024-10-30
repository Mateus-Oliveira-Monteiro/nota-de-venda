package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<InterSaleItem> items = new ArrayList<>();

    public void addSaleItem(InterSaleItem item) {
        items.add(item);
    }

    public List<InterSaleItem> getItems() {
        return items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity()).sum();
    }
}
