package com.example.demo.shop.product;

import com.example.demo.shop.order.Order;
import com.example.demo.shop.order.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    public ProductService(
            ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product getProduct(int id) {
        return productRepo.getProduct(id);
    }

    public List<Product> listProducts() {
        return productRepo.listProducts();
    }
}
