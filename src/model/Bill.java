package model;

import model.person.Cashier;
import model.person.Customer;
import model.product.Product;

import java.time.LocalDate;

public class Bill {
    private String id;
    private Customer customer;
    private Cashier cashier;
    private Product product;
    private int quantity;
    private long price;
    private LocalDate dateOfBill;

    public Bill() {
    }

    public Bill(String id, Customer customer, Cashier cashier, Product product, int quantity, long price, LocalDate dateOfBill) {
        this.id = id;
        this.customer = customer;
        this.cashier = cashier;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.dateOfBill = dateOfBill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public LocalDate getDateOfBill() {
        return dateOfBill;
    }

    public void setDateOfBill(LocalDate dateOfBill) {
        this.dateOfBill = dateOfBill;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", cashier=" + cashier +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                ", dateOfBill=" + dateOfBill +
                '}';
    }
}
