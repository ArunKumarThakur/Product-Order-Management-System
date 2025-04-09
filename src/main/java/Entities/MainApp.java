package Entities;
import Services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("productOrder.xml");

        ProductServices productServices = context.getBean("productService", ProductServices.class);
        OrderServices orderServices = context.getBean("orderServices", OrderServices.class);
        CustomerService customerServices = context.getBean("customerServices", CustomerService.class);

        // Add products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 20000);
        Product p3 = new Product("Power Bank", 1999);
        productServices.addProduct(p1);
        productServices.addProduct(p2);
        productServices.addProduct(p3);

        // Add customer
        Customer c1 = new Customer("C101", "Arun", "arun@example.com");
        customerServices.addCustomer(c1);

        // Fetch and print all customers
        System.out.println("All Customers:");
        for (Customer c : customerServices.getAllCustomers()) {
            System.out.println(c);
        }

        // Create and place order
        Order order = new Order();
        order.setProductList(Arrays.asList(p1, p2, p3));
        orderServices.placeOrder(order);

        // View order
        orderServices.viewOrder(order);

        //((ClassPathXmlApplicationContext) context).close();
    }
}
