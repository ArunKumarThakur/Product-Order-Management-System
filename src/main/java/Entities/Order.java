package Entities;
import java.util.ArrayList;
import java.util.List;
public class Order {
    static int orderKey = 100;
    String orderId;
    double amount;
    List<Product> productList = new ArrayList<>();

    public Order(){
        this.orderId = "ORD" + orderKey;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", productList=" + productList +
                '}';
    }
}
