package model;

import model.person.Customer;
import model.product.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cart {
    Customer customer;
    ArrayList<Product> productsCart = new ArrayList<>();

    public Cart() {
    }

    public Cart(Customer customer, ArrayList<Product> productsCart) {
        this.customer = customer;
        this.productsCart = productsCart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProductsCart() {
        return productsCart;
    }

    public void setProductsCart(ArrayList<Product> productsCart) {
        this.productsCart = productsCart;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", productsCart=" + productsCart +
                '}';
    }
}
