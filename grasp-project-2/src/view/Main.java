package view;

//import model.Product;
import model.Sale;
//import model.SaleItem;

public class Main {
    public static void main(String[] args) {
        Product arroz = new Product();
        arroz.setDescription("arroz");
        arroz.setPrice(30);

        Product feijao = new Product();
        feijao.setDescription("feijao");
        feijao.setPrice(30);

        Product pasta = new Product();
        pasta.setDescription("pasta");
        pasta.setPrice(30);

        SaleItem itemRice = new SaleItem();
        itemRice.setProduct(arroz);
        itemRice.setQuantity(2);

        SaleItem itemBeans = new SaleItem();
        itemBeans.setProduct(feijao);
        itemBeans.setQuantity(1);

        SaleItem itemPasta = new SaleItem();
        itemPasta.setProduct(pasta);
        itemPasta.setQuantity(5);

        Sale sale = new Sale();
        sale.addSaleItem(itemRice);
        sale.addSaleItem(itemBeans);
        sale.addSaleItem(itemPasta);

        for(SaleItem item : sale.getItems()){
            System.out.println(item);
        }
        System.out.println(String.format("Total: %.2f", sale.getTotal()));
    }
}
