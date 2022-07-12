package com.example.demo.shop.product;

import com.example.demo.shop.order.Order;
import com.example.demo.shop.order.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @GetMapping("/products")
    public List<Product> listProducts() {
        return productService.listProducts();
    }
}
