package model;

import model.product.Product;

public class Cart {
    private Product product;

    public Cart() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

