package Services;
import Entities.Product;
import java.util.Set;

public interface ProductServices {
    void addProduct(Product prod);
    Set<Product> getAllProduct();
    Product getProductById(String id);
    boolean removeProduct(String id);
    void updateProduct(Product p);

}
