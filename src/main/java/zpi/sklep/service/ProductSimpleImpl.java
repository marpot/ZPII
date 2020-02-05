package zpi.sklep.service;

import zpi.sklep.model.Product;

public class ProductSimpleImpl implements ProductService {
    @Override
    public Product getProduct(int productId) {
        return new Product();
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

}
