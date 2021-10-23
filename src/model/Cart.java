package model;

import model.product.Product;

public class Cart {
    private Product product;

    public Cart() {
    }

    public Cart(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "product=" + product +
                '}';
    }
}

