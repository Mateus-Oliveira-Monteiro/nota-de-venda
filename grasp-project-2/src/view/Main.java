package view;
import model.InterProduct;
import model.InterSaleItem;
import model.Sale;
import model.SaleFactory;


public class Main {
    public static void main(String[] args) {
        InterProduct arroz = SaleFactory.createProduct("arroz", 30);
        InterProduct feijao = SaleFactory.createProduct("feijao", 30);
        InterProduct pasta = SaleFactory.createProduct("pasta", 30);

        InterSaleItem itemRice = SaleFactory.createSaleItem(arroz, 2);
        InterSaleItem itemBeans = SaleFactory.createSaleItem(feijao, 1);
        InterSaleItem itemPasta = SaleFactory.createSaleItem(pasta, 5);

        Sale sale = new Sale();
        sale.addSaleItem(itemRice);
        sale.addSaleItem(itemBeans);
        sale.addSaleItem(itemPasta);

        for (InterSaleItem item : sale.getItems()) {
            System.out.println(item);
        }
        System.out.println(String.format("Total: %.2f", sale.getTotal()));
    }
}
