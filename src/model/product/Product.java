package model.product;

import model.person.Cashier;
import model.person.Customer;

import java.util.ArrayList;
import java.util.Comparator;

public class Product {
    private String id;
    private String name;
    private long price;
    private String description;
    private String type;
    private int count;
    private Cashier cashier;
    private Customer customer;



    public Product() {
    }

    public Product(String id, String name, long price, String description, String type, int count, Cashier cashier, Customer customer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
        this.count = count;
        this.cashier = cashier;
        this.customer = customer;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", count=" + count +
                ", cashier=" + cashier +
                ", customer=" + customer +
                '}';
    }


}

