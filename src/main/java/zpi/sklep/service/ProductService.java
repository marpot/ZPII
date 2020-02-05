package zpi.sklep.service;

import zpi.sklep.model.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(int productId);
    List<Product> getAllProducts();
    void addProduct(Product product);
}
