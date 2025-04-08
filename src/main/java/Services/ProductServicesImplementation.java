package Services;

import Entities.Product;

import java.util.*;

public class ProductServicesImplementation implements ProductServices{

    Map<String, Product> idToProd = new HashMap<>();
    Set<Product> productList = new HashSet<>();
    @Override
    public void addProduct(Product product){
        productList.add(product);
        idToProd.put(product.getProductId(), product);
    }

    @Override
    public Set<Product> getAllProduct(){
        return productList;
    }

    @Override
    public Product getProductById(String id){
        return idToProd.get(id);
    }

    @Override
    public boolean removeProduct(String id){
        Product product = idToProd.get(id);
        productList.remove(product);
        return !productList.contains(product);
    }

    @Override
    public void updateProduct(Product p){

    }
}
