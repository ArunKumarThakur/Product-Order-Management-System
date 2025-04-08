package Entities;

public class Customer {
    String customerId;
    String customerName;
    String customerMail;

    public Customer(String customerId, String customerName, String customerMail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerMail = customerMail;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerMail='" + customerMail + '\'' +
                '}';
    }
}
