package Services;
import Entities.Customer;
import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    Customer getCustomerById(String id);
    List<Customer> getAllCustomers();
    boolean removeCustomer(String id);
}
