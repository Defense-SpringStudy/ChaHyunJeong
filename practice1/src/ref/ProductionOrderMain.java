package ref;

public class ProductionOrderMain {
    String productionName;
    int price;
    int quantity;

    public static void main(String[] args) {
        ProductionOrderMain[] orders = new ProductionOrderMain[2];

        orders[0] = createOrder("product1", 1000, 1);
        orders[1] = createOrder("product2",2000,2);

        printOrders(orders);

        getTotalAmount(orders);

    }
    static ProductionOrderMain createOrder(String productName, int price, int quantity){
        ProductionOrderMain product = new ProductionOrderMain();

        product.productionName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printOrders(ProductionOrderMain[] orders){
        for (ProductionOrderMain order : orders){
            System.out.println(order.productionName+order.price+order.quantity);
        }
    }

    static void getTotalAmount(ProductionOrderMain[] orders){
        int totalAmount = 0;
        for (ProductionOrderMain order : orders){
            totalAmount += order.price * order.quantity;
        }
        System.out.println(totalAmount);
    }
}
