package Services;

import Entities.Order;
import Entities.Product;

import java.util.*;

public class OrderServicesImplementation implements OrderServices {

    private CustomerService customerServices;
    private ProductServices productServices;
    private Map<String, Order> orderMap = new HashMap<>();

    public void placeOrder(Order order) {
        double totalAmount = 0;
        for (Product p : order.getProductList()) {
            totalAmount += p.getPrice();
        }
        order.setAmount(totalAmount);
        orderMap.put(order.getOrderId(), order);
        System.out.println("Order placed with ID: " + order.getOrderId());
    }

    public boolean cancelOrder(String orderId) {
        if (orderMap.containsKey(orderId)) {
            orderMap.remove(orderId);
            System.out.println("Order " + orderId + " canceled.");
            return true;
        }
        return false;
    }

    public Order getOrderById(String orderId) {
        return orderMap.get(orderId);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }

    public void viewOrder(Order order) {
        System.out.println("Order Details: ");
        System.out.println(order);
    }

    public void setProductServices(ProductServices productServices) {
        this.productServices = productServices;
    }

    public void setCustomerServices(CustomerService customerServices) {
        this.customerServices = customerServices;
    }
}
