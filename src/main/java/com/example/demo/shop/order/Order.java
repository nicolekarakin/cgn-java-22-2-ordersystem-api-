package com.example.demo.shop.order;

import com.example.demo.shop.product.Product;

import java.util.List;

public record Order(
        int id,
        List<Product> products
) {
}
