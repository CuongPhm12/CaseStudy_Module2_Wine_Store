package model.person;

import model.Bill;

import java.util.ArrayList;

public class Cashier extends Person{
    private String id;
    private String name;

    public Cashier() {
    }
    public Cashier(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Cashier{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
