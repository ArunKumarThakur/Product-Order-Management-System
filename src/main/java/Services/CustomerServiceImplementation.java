package Services;
import Entities.Customer;
import java.util.*;

public class CustomerServiceImplementation implements CustomerService {

    private Map<String, Customer> customerMap = new HashMap<>();


    @Override
    public void addCustomer(Customer customer) {
        customerMap.put(customer.getCustomerId(), customer);
    }

    @Override
    public Customer getCustomerById(String id) {
        return customerMap.get(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public boolean removeCustomer(String id) {
        return customerMap.remove(id) != null;
    }



}
