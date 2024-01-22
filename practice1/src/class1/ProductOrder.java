package class1;

public class ProductOrder {

    String name;
    int price;
    int quantity;

    public static void main(String[] args) {

        ProductOrder product1 = new ProductOrder();
        ProductOrder product2 = new ProductOrder();

        ProductOrder[] products = new ProductOrder[2];

        product1.name = "사과";
        product1.price = 1000;
        product1.quantity = 3;

        product2.name = "배";
        product2.price = 2000;
        product2.quantity = 5;

        products[0]=product1;
        products[1]=product2;

        for (ProductOrder s : products){
            System.out.println(s.name+s.quantity);
        }
    }
}
