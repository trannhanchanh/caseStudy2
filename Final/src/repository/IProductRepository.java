package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);
    List<Product> getList();
    void update(List<Product> productList);
}
