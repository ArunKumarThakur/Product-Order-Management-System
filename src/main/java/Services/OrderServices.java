package Services;
import Entities.Order;
import java.util.List;
public interface OrderServices {

    void placeOrder(Order order);
    boolean cancelOrder(String orderId);
    Order getOrderById(String orderId);
    List<Order> getAllOrders();
    void viewOrder(Order order);
}

